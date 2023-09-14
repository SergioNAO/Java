package entes;

import mapa.Mapa;

public  abstract class Ente {
    protected int x;
    protected int y;
    
    private boolean eliminado=false;
    
    protected Mapa mapa;
    
    public void actualizar(){
        
    }
    public void mostrar(){
        
    }
    public void eliminar(){
        eliminado=true;
    }

    public int obtenerPosicionx(){
        return x;
    }
    public int obtenerPosiciony(){
        return y;
    } 
    public void modificarPosicionx(int desplazamientoX){
        x +=desplazamientoX;
    }
    public void modificarPosiciony(int desplazamientoY){
        y +=desplazamientoY;
    }
    public boolean estaEliminado(){
        return eliminado;
    }
}
