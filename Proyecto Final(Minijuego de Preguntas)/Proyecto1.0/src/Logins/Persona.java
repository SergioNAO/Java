package Logins;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre; // cada caracter ocupa 2 bytes
    private String contra; // ocupa 4 bytes
    private boolean activo;

    public Persona() {
        nombre = "NN";
        contra = "0";
        activo = true;
    }

    public Persona(String nombre, String contra, boolean activo) {
        this.nombre = nombre;
        this.contra = contra;
        this.activo = activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getContra() {
        return contra;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + 
                "\nContraseña: " + contra;
    }   
    
    public int getTamaño() {
        return getNombre().length()*2 + 2 + 4 + 1;
    }

  
}