
package principal.maquinaestado;

import java.awt.Graphics;
import principal.maquinaestado.estados.juego.GestorJuego;

public class GestorEstados {
    private EstadoJuego[] estados;
    private EstadoJuego estadoActual;

public GestorEstados(){
iniciarEstados();
iniciarEstadoActual();

}

    private void iniciarEstados() {
        estados = new EstadoJuego[1];
        estados[0] = new GestorJuego();
        //Añadir e iniciar los demas estados que se inicien
        
    }

    private void iniciarEstadoActual() {
       estadoActual= estados[0];
    }
 public void actualizar(){
 estadoActual.actualizar();
 }
 private void dibujar(final Graphics g){
 estadoActual.dibujar(g);
 
  }
 
 
}

