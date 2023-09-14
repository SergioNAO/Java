
package Paleteria;

public class Nieves extends Producto{
    String medida;
    String topics;

    public Nieves(String clave, String nombre, float precio, String sabor) {
        super(clave, nombre, precio, sabor);
    }

    Nieves() {
        
    }

    public String getMedida() {
        return medida;
    }

    public String getTopics() {
        return topics;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    @Override
    public String Venta() {
        return null;
        
    }

    void setClave(int nieve) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
