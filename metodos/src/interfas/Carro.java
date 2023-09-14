
package interfas;

public class Carro implements Rueda,Silla{
    
    public Carro(){}

    
    public void avanzar() {
        System.out.println("El Carro Avanza");
    }

    
    public void parar() {
        System.out.println("El Carro se Detuvo");
    }

   
    public void asiento() {
        System.out.println("El Carro Tiene 4 Asientos");   
    }
    
}
