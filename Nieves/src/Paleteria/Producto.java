
package Paleteria;


public abstract class Producto {
    String clave;
    String nombre;
    float precio;
    String sabor;
    

    public Producto(String clave, String nombre, float precio, String sabor) {
        this.clave = clave;
        this.nombre = nombre;
        this.precio = precio;
        this.sabor = sabor;
    }
    public Producto(){}
    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    public abstract String Venta();
    
}
