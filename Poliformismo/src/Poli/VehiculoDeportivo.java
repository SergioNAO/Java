
package Poli;

public class VehiculoDeportivo extends Vehiculo{
    private int cilindro;
    
    public VehiculoDeportivo(int cilindro,String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindro = cilindro;
    }

    public int getCilindro() {
        return cilindro;
    }
   public String motrarDatos (){
   
   return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
           "\nCilindro: "+cilindro;
   }
    
    
}
