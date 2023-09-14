
package Poli;

public class VehiculoTurismo extends Vehiculo{
    private int np;
    
    public VehiculoTurismo(int np, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.np = np;
    }

    public int getNp() {
        return np;
    }
    @Override
    public String mostrarDatos(){
    return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
            "\nNumero de Puertas: "+np;
    
    }
    
}
