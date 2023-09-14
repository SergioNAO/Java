
package graficos;

public class Sprite {
    private final int lado;
    
    private int x;
    private int y;
    
    public int [] pixeles;
    private  HojaSprites hoja;
    
    //coleccion de sprites del personaje
    public static final Sprite ABAJO0 =new Sprite(16,0,16,0,HojaSprites.jugador);  

    public static final Sprite IZQUIERDA0 =new Sprite(16,1,16,0,HojaSprites.jugador); 

    
    public static final Sprite DERECHA0 =new Sprite(16,2,16,0,HojaSprites.jugador); 
  
    
    public static final Sprite ARRIBA0 =new Sprite(16,3,16,0,HojaSprites.jugador);
   
    //fin de la coleccion
    
    //coleccion de sprites primer mapa
    public static final Sprite  VACIO = new Sprite(16,0);
    public static final Sprite ASFALTO =new Sprite(16,0,0,0,HojaSprites.castillo);
    public static final Sprite  ESQUINA_SUPERIOR_IZQUIERDA = new Sprite(16,1,0,0,HojaSprites.castillo);
    public static final Sprite ESQUINA_SUPERIOR_DERECHA = new Sprite(16,2,0,0, HojaSprites.castillo);
    public static final Sprite ESQUINA_INFERIOR_IZQUIERDA = new Sprite(16,3,0,0, HojaSprites.castillo);
    public static final Sprite ESQUINA_INFERIOR_DERECHA = new Sprite(16,4,0,0, HojaSprites.castillo);
    public static final Sprite LADO_IZQUIERDO = new Sprite(16,5,0,0, HojaSprites.castillo);
    public static final Sprite PUERTA = new Sprite (16,6,0,0, HojaSprites.castillo);
    public static final Sprite HORIZONTAL_ARRIBA = new Sprite (16,7,0,0, HojaSprites.castillo);
    public static final Sprite HORIZONTAL_ABAJO = new Sprite (16,8,0,0, HojaSprites.castillo);
    public static final Sprite LADO_DERECHO = new Sprite(16,9,0,0, HojaSprites.castillo);
    
    public static final Sprite LIM_SUP_BARDA= new Sprite(16,0,1,0,HojaSprites.castillo);
    public static final Sprite BARDA_VERTICAL= new Sprite(16,1,1,0,HojaSprites.castillo);
    public static final Sprite LIM_INF_BARDA= new Sprite(16,2,1,0,HojaSprites.castillo);
    public static final Sprite LIM_DER_BARDA= new Sprite(16,3,1,0,HojaSprites.castillo);
    public static final Sprite LIM_IZQ_BARDA= new Sprite(16,4,1,0,HojaSprites.castillo);
    public static final Sprite BARDA_HORIZONTAL=new Sprite(16,5,1,0,HojaSprites.castillo);
   public static final Sprite ESPADACHIN_NEGRO= new Sprite(16,6,1,0,HojaSprites.castillo);
    public static final Sprite ZED= new Sprite(16,7,1,0,HojaSprites.castillo);
    public static final Sprite GUERRERO_OSCURO= new Sprite(16,8,1,0,HojaSprites.castillo);
    public static final Sprite COFRE= new Sprite(16,9,1,0,HojaSprites.castillo);
    

    //fin de la coleccion
    
    public Sprite(final int lado, final int columna, final int fila,final int version, final HojaSprites hoja){
    this.lado = lado;
    
    pixeles=new int[lado *lado];
    
    this.x= columna*lado;
    this.y= columna*fila;
    this.hoja=hoja;
    
    cargarSprite(version);
    
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
    private void cargarSprite(int version){
    if(version == 0){
    cargaNormal();
    }else{
    cargaManipulada(version);
    
    }
    
    }
    private void cargaNormal(){
        for(int y=0; y<lado;y++){
      for(int x=0;x<lado;x++){
      pixeles[x+y*lado]=hoja.pixeles[(x+this.x)+(y+this.y)*hoja.obtenAncho()];
         }
       }
    }
    private void cargaManipulada(int version){
    int [] pixelesTemporales = iniciarPixelesTemporales();
    
    switch(version){
        case 1: invertirX(pixelesTemporales);
            break;
        case 2:invertirY(pixelesTemporales);
            break;
        case 3:invertirXY(pixelesTemporales);
            break;
        case 4:rotar90Izq(pixelesTemporales);
            break;
        case 5:rotar90Der(pixelesTemporales);
            break;
        case 6:rotar90IzqInvertirY(pixelesTemporales);
            break;
        case 7:rotar90DerInvertirY(pixelesTemporales);
            break;
        default: 
            cargaNormal();
    }
    
  }
    private int [] iniciarPixelesTemporales(){
        int [] pixelesTemporales = new int[lado*lado];
     for(int y=0; y<lado;y++){
      for(int x=0;x<lado;x++){
      pixelesTemporales[x+y*lado]=hoja.pixeles[(x+this.x)+(y+this.y)*hoja.obtenAncho()];
         }
       }
      return pixelesTemporales;
    }
    
    //1
    private void invertirX(int [] pixelesTemporales){
    int i=0;
    for(int y =0; y<lado;y++){
      for(int x= lado-1;x > -1;x--){
          pixeles[i]=pixelesTemporales[x + y *lado];
           i++;
          }
      }
    }
    //2
    private void invertirY(int [] pixelesTemporales){
    int i=0;
    for(int y =lado; y > -1 ;y--){
      for(int x=0;x<lado;x++){
          pixeles[i]=pixelesTemporales[x + y *lado];
           i++;
          }
      }
    }
    //3
    private void invertirXY(int [] pixelesTemporales){
        for(int i = 0;i< pixeles.length;i++){
        pixeles[i]= pixelesTemporales[pixelesTemporales.length - 1 - i];
        
        }
    }
    //4
    private void rotar90Izq(int [] pixelesTemporales){
    int i=0;
    for(int x= lado-1;x > -1;x--) {
      for(int y =0; y<lado;y++){
          pixeles[i]=pixelesTemporales[x + y *lado];
           i++;
          }
      }
    }
    //5
    private void rotar90Der(int [] pixelesTemporales){
    int i=0;
    for(int x =0; x<lado;x++){
      for(int y= lado-1;y > -1;y--){
          pixeles[i]=pixelesTemporales[x + y *lado];
           i++;
          }
      }
    }
    //6
    private void rotar90IzqInvertirY(int [] pixelesTemporales){
    int i=0;
    for(int x =0; x<lado; x++){
      for(int y= 0; y<lado; y++){
          pixeles[i]=pixelesTemporales[x + y *lado];
           i++;
          }
      }
    }
    //7
    private void rotar90DerInvertirY(int [] pixelesTemporales){
    int i=0;
    for(int x =lado-1; x> -1;x--){
      for(int y= lado-1;y > -1;y--){
          pixeles[i]=pixelesTemporales[x + y *lado];
           i++;
          }
      }
    }
    
}
