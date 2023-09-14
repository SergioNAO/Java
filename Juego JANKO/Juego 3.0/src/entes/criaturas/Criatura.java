package entes.criaturas;

import entes.Ente;
import graficos.Sprite;

public abstract class Criatura extends Ente {
    protected Sprite sprite;
    protected char direccion='n';
    protected boolean enMovimiento=false;
    
    public void actualizar(){
        
    }
    public void mostrar(){
        
    }
    
    public void mover(int desplazamientoX, int desplazamientoY){
        if(desplazamientoX>0){
            direccion='e';//este
        }
        if(desplazamientoX<0){
            direccion='o';// si hay problema podemos cambiarlo a w de west(en ingles)
        }
        if(desplazamientoY>0){
            direccion='s'; //la direcion aqui es contraria, en lugar de ir arriba seria hacia abajo
        }
        if(desplazamientoY<0){
            direccion='n';
        }
        
        if(!estaEliminado()){
            modificarPosicionx(desplazamientoX);
            modificarPosiciony(desplazamientoY);
        }
    }
    
    private boolean enColision(){
        return false;
    }
    
    public Sprite obtenSprite(){
    
    return sprite;
    }
    
    
}
