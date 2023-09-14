package mapa.cuadro;

import graficos.Pantalla;
import graficos.Sprite;

public class Cuadro {
    public int x;
    public int y;
    
    public Sprite sprite;
    
    private boolean solido;
    public static final int LADO=32;
    
    
    //coleccion de Cuadros
    public static final Cuadro Vacio = new Cuadro(Sprite.VACIO,true);
    public static final Cuadro ASFALTO = new Cuadro(Sprite.ASFALTO);
    public static final Cuadro  ESQUINA_SUPERIOR_DERECHA = new Cuadro(Sprite.ESQUINA_SUPERIOR_DERECHA,true);
    public static final Cuadro ESQUINA_SUPERIOR_IZQUIERDA = new Cuadro(Sprite.ESQUINA_SUPERIOR_IZQUIERDA,true);
    public static final Cuadro ESQUINA_INFERIOR_IZQUIERDA = new Cuadro(Sprite.ESQUINA_INFERIOR_IZQUIERDA,true);
    public static final Cuadro ESQUINA_INFERIOR_DERECHA = new Cuadro(Sprite.ESQUINA_INFERIOR_DERECHA,true);
    public static final Cuadro LADO_IZQUIERDO = new Cuadro(Sprite.LADO_IZQUIERDO,true);
    public static final Cuadro LADO_DERECHO = new Cuadro(Sprite.LADO_DERECHO,true);
    public static final Cuadro HORIZONTAL_ARRIBA = new Cuadro (Sprite.HORIZONTAL_ARRIBA,true);
    public static final Cuadro HORIZONTAL_ABAJO = new Cuadro (Sprite.HORIZONTAL_ABAJO,true);
    public static final Cuadro PUERTA = new Cuadro(Sprite.PUERTA,true);
    
    public static final Cuadro LIM_SUP_BARDA= new Cuadro(Sprite.LIM_SUP_BARDA,true);
    public static final Cuadro BARDA_VERTICAL= new Cuadro(Sprite.BARDA_VERTICAL,true);
    public static final Cuadro LIM_INF_BARDA= new Cuadro(Sprite.LIM_INF_BARDA,true);
    public static final Cuadro LIM_DER_BARDA= new Cuadro(Sprite.LIM_DER_BARDA,true);
    public static final Cuadro LIM_IZQ_BARDA= new Cuadro(Sprite.LIM_IZQ_BARDA,true);
    public static final Cuadro BARDA_HORIZONTAL= new Cuadro(Sprite.BARDA_HORIZONTAL,true);
    public static final Cuadro ESPADACHIN_NEGRO=new Cuadro(Sprite.ESPADACHIN_NEGRO,true);
    public static final Cuadro ZED=new Cuadro(Sprite.ZED,true);
    public static final Cuadro GUERRERO_OSCURO=new Cuadro(Sprite.GUERRERO_OSCURO,true);
    public static final Cuadro COFRE= new Cuadro(Sprite.COFRE,true);
   

//fin de la coleccion
    
    
    
    
    
    
    
    
    
    public Cuadro(Sprite sprite){
        this.sprite=sprite;
        solido=false;
    }
    public Cuadro(Sprite sprite, boolean solido){
        this.sprite=sprite;
        this.solido=solido;
    }
    public void mostrar(int x, int y, Pantalla pantalla){
        pantalla.mostrarCuadro(x << 4, y << 4, this);
        
    }
    public boolean esSolido(){
        return solido;
    }
}
