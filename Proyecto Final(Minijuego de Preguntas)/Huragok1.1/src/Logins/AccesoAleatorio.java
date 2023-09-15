package Logins;

import java.io.*;

public class AccesoAleatorio {

    private static RandomAccessFile flujo;
    private static int numeroRegistros;
    private static int tamañoRegistro = 80;

    public static void crearFileAlumno(java.io.File archivo) throws IOException {
        if (archivo.exists() && !archivo.isFile()) {
            throw new IOException(archivo.getName() + " no es un archivo");
        }
        flujo = new RandomAccessFile(archivo, "rw");
        numeroRegistros = (int) Math.ceil(
                (double) flujo.length() / (double) tamañoRegistro);
    }

    public static void cerrar() throws IOException {
        flujo.close();
    }

    public static boolean setPersona(int i, Persona persona) throws IOException {
        if(i >= 0 && i <= getNumeroRegistros()) {
            if(persona.getTamaño() > tamañoRegistro) {
                System.out.println("\nTamaño de registro excedido.");
            } else {
                flujo.seek(i*tamañoRegistro);
                flujo.writeUTF(persona.getNombre());
                flujo.writeUTF(persona.getContra());
                flujo.writeBoolean(persona.isActivo());
                return true;
            }
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
        }
        return false;
    }

    private static int buscarRegistroInactivo() throws IOException {
        String nombre;
        for(int i=0; i<getNumeroRegistros(); i++) 
        {
            flujo.seek(i * tamañoRegistro);
            if(!getPersona(i).isActivo()) 
                return i;
        }
        return -1;        
    }
    

    public static void compactarArchivo(java.io.File archivo) throws IOException {
        crearFileAlumno(archivo); // Abrimos el flujo.
        Persona[] listado = new Persona[numeroRegistros];
        for(int i=0; i<numeroRegistros; ++i)
            listado[i] = getPersona(i);
        cerrar(); // Cerramos el flujo.
        archivo.delete(); // Borramos el archivo.

        java.io.File tempo = new java.io.File("temporal.dat");
        crearFileAlumno(tempo); // Como no existe se crea.
        for(Persona p : listado)
            if(p.isActivo())
                añadirPersona(p);
        cerrar();
        
        tempo.renameTo(archivo); // Renombramos.
    }
    
    public static void añadirPersona(Persona persona) throws IOException {
        int inactivo = buscarRegistroInactivo();
        if(setPersona(inactivo==-1?numeroRegistros:inactivo, persona)) 
            numeroRegistros++;        
    }

    public static int getNumeroRegistros() {
        return numeroRegistros;
    }

    public static Persona getPersona(int i) throws IOException {
        if(i >= 0 && i <= getNumeroRegistros()) {
            flujo.seek(i * tamañoRegistro);
            return new Persona(flujo.readUTF(), flujo.readUTF(), flujo.readBoolean());
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
            return null;
        }
    }

    public static int buscarRegistro(String buscado,String contra) throws IOException {
        Persona p,c;
        if (buscado == null) {
            return -1;
        }
        if(contra == null){
            return -1;
        }
        for(int i=0; i<getNumeroRegistros(); i++) {
            flujo.seek(i * tamañoRegistro);
            p = getPersona(i);
           
            if(p.getNombre().equals(buscado)&& p.getContra().equals(contra) && p.isActivo()) {
                return i;
            }
        }
        return -1;
    }

  
    
}