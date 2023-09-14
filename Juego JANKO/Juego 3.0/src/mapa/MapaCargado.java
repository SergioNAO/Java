package mapa;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import mapa.cuadro.Cuadro;

public class MapaCargado extends Mapa {
    
    private int[] pixeles;
    
    
    public MapaCargado(String ruta) {
        super(ruta);
    }
    
    
    protected void cargarMapa(String ruta){
        try {
            BufferedImage imagen = ImageIO.read(MapaCargado.class.getResource(ruta));
            ancho=imagen.getWidth();
            alto=imagen.getHeight();
            
            cuadrosCatalogo= new Cuadro[ancho*alto];
            pixeles = new int[ancho*alto];
            imagen.getRGB(0, 0,ancho, alto, pixeles, 0, ancho);
        } catch (IOException ex) {
            Logger.getLogger(MapaCargado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected void generarMapa(){
        for(int i=0;i<pixeles.length;i++){
            switch(pixeles[i]){
                case 0xFF424143:
                    cuadrosCatalogo[i]=Cuadro.ASFALTO;
                    continue;
                case 0xFF2d842d:
                    cuadrosCatalogo[i]=Cuadro.ESQUINA_SUPERIOR_DERECHA;
                    continue;
                case 0xFF9beab0:
                    cuadrosCatalogo[i]=Cuadro.ESQUINA_SUPERIOR_IZQUIERDA;
                    continue;
                case 0xFF8397c0://0xFFFF7CC6
                    cuadrosCatalogo[i]=Cuadro.ESQUINA_INFERIOR_IZQUIERDA;
                    continue;
                case 0xFF9520df://0xFFFFE53F
                    cuadrosCatalogo[i]=Cuadro.ESQUINA_INFERIOR_DERECHA;
                    continue;
                case 0xFFfa152a:
                    cuadrosCatalogo[i]=Cuadro.HORIZONTAL_ARRIBA;
                    continue;
                case 0xFF35fa15:
                    cuadrosCatalogo[i]=Cuadro.HORIZONTAL_ABAJO;
                    continue;
                case 0xFF6e0a45:
                    cuadrosCatalogo[i]=Cuadro.LADO_IZQUIERDO;
                    continue;
                case 0xFF28b6ff:
                    cuadrosCatalogo[i]=Cuadro.LADO_DERECHO;
                    continue;
                case 0xFFb8da50:
                    cuadrosCatalogo[i]=Cuadro.PUERTA;
                    continue;
                default:
                    cuadrosCatalogo[i]=Cuadro.Vacio;
                    
            }
        }
    }
}
