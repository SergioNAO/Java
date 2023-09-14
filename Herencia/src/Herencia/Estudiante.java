
package Herencia;

public class Estudiante extends Persona {
    private int codest;
    private float notafinal;
    
    //Constructor de una clase heredada
    public Estudiante(String Nombre,String apellido,int edad,int codest,int notafinal){
    super(Nombre,apellido,edad);
    this.codest= codest;
    this.notafinal=notafinal;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+Nombre+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+ 
              "\nCodigo de Estudiante: "+codest+
                "\nNota Final: "+notafinal);
    
    }
}
