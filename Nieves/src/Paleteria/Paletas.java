
package Paleteria;

public class Paletas extends Producto {
    String tam;
    String cubierta;

    public Paletas(String clave, String nombre, float precio, String sabor) {
        super(clave, nombre, precio, sabor);
    }

    
    public  Paletas() {
        
    }

    public String getTam() {
        return tam;
    }

    public String getCubierta() {
        return cubierta;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public void setCubierta(String cubierta) {
        this.cubierta = cubierta;
    }

    
    public String Venta() {
        return "Clave:"+clave+"";
       
    }
    
}
