
package Poli;

public class Furgoneta extends Vehiculo {
    private int carga;
    
    public Furgoneta(int carga,String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    @Override
    public String mostrarDatos(){
    return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
            "\nCarga: "+carga;
    
    }
    
}
