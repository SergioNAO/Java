
package graficos;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class HojaSprites {
    private final int ancho;
    private final int alto;
    public final int [] pixeles;
    
    //coleccion de hojas de sprites
    public static HojaSprites castillo = new HojaSprites("/texturas/Sprites Nuevos.png",160,160);
    public static HojaSprites jugador = new HojaSprites("/texturas/Janko1.png",64,64);
    
    
    //fin de la coleccion
    
    
    public HojaSprites(final String ruta,final int ancho, final int alto){
    this.ancho=ancho;
    this.alto=alto;
    
    pixeles = new int [ancho*alto];
    
    BufferedImage imagen;
        try {
            imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
            imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
        } catch (IOException ex) {
            Logger.getLogger(HojaSprites.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int obtenAncho(){
    return ancho;
    
    }
}
