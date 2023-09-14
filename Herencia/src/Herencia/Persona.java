
package Herencia;

public class Persona {
    //Si uso protected el atributo puede ser usado por la clase y las clases hijas
   protected String Nombre;
   private String apellido;
   private int edad;

    public Persona(String Nombre, String apellido, int edad) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
   
}
