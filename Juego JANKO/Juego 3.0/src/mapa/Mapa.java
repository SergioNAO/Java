package mapa;

import graficos.Pantalla;
import mapa.cuadro.Cuadro;

public abstract class Mapa {
    protected int ancho;
    protected int alto;
    
    protected int[]cuadros;
    protected Cuadro[]cuadrosCatalogo;
    
    public Mapa(int ancho, int alto){
        this.ancho=ancho;
        this.alto=alto;
        cuadros = new int[ancho*alto];
        generarMapa();
        
    }
    public Mapa(String ruta){
        cargarMapa(ruta);
        generarMapa();
    }
    protected void generarMapa(){  }
    
    protected void cargarMapa(String ruta){   }
    
    public void actualizar(){  }
    
    public void mostrar(int compensacionX,int compensacionY,Pantalla pantalla){
        
        pantalla.estableceDiferencia(compensacionX, compensacionY);
        
        int o=compensacionX >>4;// es =/16
        int e=(compensacionX+pantalla.obtenAncho()+ Cuadro.LADO) >>4;
        int n=compensacionY >>4;
        int s=(compensacionY+pantalla.obtenAlto()+ Cuadro.LADO) >>4;
        
        for(int y =n; y<s ;y++){
           for(int x=o; x<e ;x++){
            // obtenCuadro(x,y).mostrar(x, y, pantalla);
        if(x<0||y<0||x>=ancho||y>=alto){
            Cuadro.Vacio.mostrar(x, y, pantalla);
        }else{
            cuadrosCatalogo[x+y*ancho].mostrar(x, y, pantalla);
        }
             } 
        }
    }
    public Cuadro obtenCuadro(final int x, final int y){
       if(x < 0 ||y < 0 || x >= ancho|| y >= alto){ return Cuadro.Vacio; }
        switch(cuadros[x+y*ancho]){
            case 0:  return Cuadro.ASFALTO;
            case 1:  return Cuadro.ESQUINA_INFERIOR_DERECHA;
            case 2:  return Cuadro.ESQUINA_INFERIOR_IZQUIERDA;
            case 3:  return Cuadro.ESQUINA_SUPERIOR_DERECHA;
            case 4:  return Cuadro.ESQUINA_SUPERIOR_IZQUIERDA;
            case 5:  return Cuadro.HORIZONTAL_ABAJO;
            case 6:  return Cuadro.HORIZONTAL_ARRIBA;
            case 7:  return Cuadro.LADO_DERECHO;
            case 8:  return Cuadro.LADO_IZQUIERDO;
            case 9:  return Cuadro.PUERTA;
            default: 
                return Cuadro.Vacio;
            
            
        
        
        }
        
        
        
    }
    
    
}
