
package graficos;

public class Sprite {
    private final int lado;
    
    private int x;
    private int y;
    
    public int [] pixeles;
    private  HojaSprites hoja;
    
    //coleccion de sprites
    public static Sprite VACIO = new Sprite(16,0);
    public static Sprite ASFALTO =new Sprite(16,0,0,HojaSprites.desierto);
    public static Sprite ESQUINA_SUPERIOR_IZQUIERDA = new Sprite(16,1,0,HojaSprites.desierto);
    public static Sprite ESQUINA_SUPERIOR_DERECHA = new Sprite(16,2,0, HojaSprites.desierto);
    public static Sprite ESQUINA_INFERIOR_IZQUIERDA = new Sprite(16,3,0, HojaSprites.desierto);
    public static Sprite ESQUINA_INFERIOR_DERECHA = new Sprite(16,4,0, HojaSprites.desierto);
    public static Sprite LADO_IZQUIERDO1 = new Sprite(16,5,0, HojaSprites.desierto);
    public static Sprite LADO_IZQUIERDO2 = new Sprite(16,6,0, HojaSprites.desierto);
    public static Sprite LADO_IZQUIERDO3 = new Sprite(16,7,0, HojaSprites.desierto);
    public static Sprite PUERTA = new Sprite (16,8,0, HojaSprites.desierto);
    public static Sprite ANTORCHA = new Sprite (16,9,0, HojaSprites.desierto);
    public static Sprite HORIZONTAL_LIMPIO_ABAJO = new Sprite (16,0,1, HojaSprites.desierto);
    public static Sprite HORIZONTAL_LIMPIO_ABAJO1 = new Sprite (16,1,1, HojaSprites.desierto);
    public static Sprite HORIZONTAL_LIMPIO_ABAJO2 = new Sprite (16,2,1, HojaSprites.desierto);
    public static Sprite HORIZONTAL_LIMPIO_ARRIBA = new Sprite (16,3,1, HojaSprites.desierto);
    public static Sprite HORIZONTAL_LIMPIO_ARRIBA1 = new Sprite (16,4,1, HojaSprites.desierto);
    public static Sprite HORIZONTAL_LIMPIO_ARRIBA2 = new Sprite (16,5,1, HojaSprites.desierto);
    public static Sprite BARDA_BORDE_ARRIBA = new Sprite (16,6,1, HojaSprites.desierto);
    public static Sprite BARDA_VERTICAL = new Sprite (16,7,1, HojaSprites.desierto);
    public static Sprite BARDA_BORDE_ABAJO = new Sprite (16,8,1, HojaSprites.desierto);
    public static Sprite BARDA_BORDE_DERECHA = new Sprite (16,9,1, HojaSprites.desierto);
    public static Sprite BARDA_BORDE_IZQUIERDA = new Sprite (16,0,2, HojaSprites.desierto);
    public static Sprite BARDA_HORIZONTAL = new Sprite (16,1,2, HojaSprites.desierto);
    public static Sprite LADO_DERECHO = new Sprite(16,2,2, HojaSprites.desierto);
    public static Sprite LADO_DERECHO1 = new Sprite(16,3,2, HojaSprites.desierto);
    public static Sprite LADO_DERECHO2 = new Sprite(16,4,2, HojaSprites.desierto);

    //fin de la coleccion
    
    public Sprite(final int lado, final int columna, final int fila, final HojaSprites hoja){
    this.lado = lado;
    
    pixeles=new int[lado *lado];
    
    this.x= columna*lado;
    this.y= columna*fila;
    this.hoja=hoja;
    
    for(int y=0; y<lado;y++){
      for(int x=0;x<lado;x++){
      pixeles[x+y*lado]=hoja.pixeles[(x+this.x)+(y+this.y)*hoja.obtenAncho()];
         }
       }
     }
    public Sprite(final int lado, final int color){
    this.lado=lado;
    pixeles = new int [lado*lado];
    
    for(int i =0; i< pixeles.length ; i++){
    pixeles[i] = color;
    
    }
    
    }
    
    public int obtenLado(){
        return lado;
    }
}
