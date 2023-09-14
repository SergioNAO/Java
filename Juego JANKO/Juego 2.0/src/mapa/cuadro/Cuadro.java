package mapa.cuadro;

import graficos.Pantalla;
import graficos.Sprite;

public class Cuadro {
    public int x;
    public int y;
    
    public Sprite sprite;
    public static final int LADO=32;
    
    
    //coleccion de Cuadros
    public static final Cuadro Vacio = new Cuadro(Sprite.VACIO);
    public static final Cuadro ASFALTO = new Cuadro(Sprite.ASFALTO);
    public static final Cuadro  ESQUINA_SUPERIOR_DERECHA = new Cuadro(Sprite.ESQUINA_SUPERIOR_DERECHA);
    public static final Cuadro ESQUINA_SUPERIOR_IZQUIERDA = new Cuadro(Sprite.ESQUINA_SUPERIOR_IZQUIERDA);
    public static final Cuadro ESQUINA_INFERIOR_IZQUIERDA = new Cuadro(Sprite.ESQUINA_INFERIOR_IZQUIERDA);
    public static final Cuadro ESQUINA_INFERIOR_DERECHA = new Cuadro(Sprite.ESQUINA_INFERIOR_DERECHA);
    public static final Cuadro LADO_IZQUIERDO = new Cuadro(Sprite.LADO_IZQUIERDO);
    public static final Cuadro LADO_DERECHO = new Cuadro(Sprite.LADO_DERECHO);
    public static final Cuadro HORIZONTAL_ARRIBA = new Cuadro (Sprite.HORIZONTAL_ARRIBA);
    public static final Cuadro HORIZONTAL_ABAJO = new Cuadro (Sprite.HORIZONTAL_ABAJO);
    public static final Cuadro PUERTA = new Cuadro(Sprite.PUERTA);
   

//fin de la coleccion
    
    
    
    
    
    
    
    
    
    public Cuadro(Sprite sprite){
        this.sprite=sprite;
    }
    public void mostrar(int x, int y, Pantalla pantalla){
        pantalla.mostrarCuadro(x << 4, y << 4, this);
        
    }
    public boolean solido(){
        return false;
    }
}
