
package Poli;

public class Principal {
    public static void main(String[] args) {
    Vehiculo micarro[] = new Vehiculo[4];
    
    micarro[0] = new Vehiculo("24SOP","Chevrolet","Bocho");
    micarro[1] = new VehiculoTurismo(7,"67RX","Ford","Centra");
    micarro[2] = new VehiculoDeportivo(8,"H6L09","Ferrari","99");
    micarro[3] = new Furgoneta(500,"0PO9","Toyota","97");
    
    for(Vehiculo carros: micarro){
        System.out.println(carros.mostrarDatos());
        System.out.println("");
    }
    }
    
    
    
}
