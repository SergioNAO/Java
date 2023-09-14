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
    public static Cuadro ESQUINA_SUPERIOR_IZQUIERDA = new Cuadro(Sprite.ESQUINA_SUPERIOR_IZQUIERDA);
    public static Cuadro ESQUINA_SUPERIOR_DERECHA = new Cuadro(Sprite.ESQUINA_SUPERIOR_DERECHA);
    public static Cuadro ESQUINA_INFERIOR_IZQUIERDA = new Cuadro(Sprite.ESQUINA_INFERIOR_IZQUIERDA);
    public static Cuadro ESQUINA_INFERIOR_DERECHA = new Cuadro(Sprite.ESQUINA_INFERIOR_DERECHA);
    public static Cuadro LADO_IZQUIERDO1 = new Cuadro(Sprite.LADO_IZQUIERDO1);
    public static Cuadro LADO_IZQUIERDO2 = new Cuadro(Sprite.LADO_IZQUIERDO2);
    public static Cuadro LADO_IZQUIERDO3 = new Cuadro(Sprite.LADO_IZQUIERDO3);
    public static Cuadro PUERTA = new Cuadro(Sprite.PUERTA);
    public static Cuadro ANTORCHA = new Cuadro (Sprite.ANTORCHA);
    public static Cuadro HORIZONTAL_LIMPIO_ABAJO = new Cuadro (Sprite.HORIZONTAL_LIMPIO_ABAJO);
    public static Cuadro HORIZONTAL_LIMPIO_ABAJO1 = new Cuadro (Sprite.HORIZONTAL_LIMPIO_ABAJO1);
    public static Cuadro HORIZONTAL_LIMPIO_ABAJO2 = new Cuadro (Sprite.HORIZONTAL_LIMPIO_ABAJO2);
    public static Cuadro HORIZONTAL_LIMPIO_ARRIBA = new Cuadro (Sprite.HORIZONTAL_LIMPIO_ARRIBA);
    public static Cuadro HORIZONTAL_LIMPIO_ARRIBA1 = new Cuadro (Sprite.HORIZONTAL_LIMPIO_ARRIBA1);
    public static Cuadro HORIZONTAL_LIMPIO_ARRIBA2 = new Cuadro (Sprite.HORIZONTAL_LIMPIO_ARRIBA2);
    public static Cuadro BARDA_BORDE_ARRIBA = new Cuadro (Sprite.BARDA_BORDE_ARRIBA);
    public static Cuadro BARDA_VERTICAL = new Cuadro (Sprite.BARDA_VERTICAL);
    public static Cuadro BARDA_BORDE_ABAJO = new Cuadro (Sprite.BARDA_BORDE_ABAJO);
    public static Cuadro BARDA_BORDE_DERECHA = new Cuadro (Sprite.BARDA_BORDE_DERECHA);
    public static Cuadro BARDA_BORDE_IZQUIERDA = new Cuadro (Sprite.BARDA_BORDE_IZQUIERDA);
    public static Cuadro BARDA_HORIZONTAL = new Cuadro (Sprite.BARDA_HORIZONTAL);
    public static Cuadro LADO_DERECHO = new Cuadro(Sprite.LADO_DERECHO);
    public static Cuadro LADO_DERECHO1 = new Cuadro(Sprite.LADO_DERECHO1);
    public static Cuadro LADO_DERECHO2 = new Cuadro(Sprite.LADO_DERECHO2);

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
