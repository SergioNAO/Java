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
        if(desplazamientoX > 0){
            direccion='e';//este
        }
        if(desplazamientoX < 0){
            direccion='o';// si hay problema podemos cambiarlo a w de west(en ingles)
        }
        if(desplazamientoY > 0){
            direccion='s'; //la direcion aqui es contraria, en lugar de ir arriba seria hacia abajo
        }
        if(desplazamientoY < 0){
            direccion='n';
        }
        
        if(!estaEliminado()){
            if(!enColision(desplazamientoX,0)){
                modificarPosicionx(desplazamientoX);
            }
            if(!enColision(0,desplazamientoY)){
                modificarPosiciony(desplazamientoY);
            }
            
            
        }
    }
    
    private boolean enColision(int desplazamientoX, int desplazamientoY){
        
        boolean colision=false;
        int posicionX=x+desplazamientoX;
        int posicionY=y+desplazamientoY;
        
        int margenIzq= 10;
        int margenDer=5;
        
        int margenSup=11;
        int margenInf=-5;
        
        int bordeIzquierdo=(posicionX+margenInf)/sprite.obtenLado();
        int bordeDerecho=(posicionX+margenDer+margenIzq)/sprite.obtenLado();
        
        int bordeSuperior=(posicionY+margenSup)/sprite.obtenLado();
        int bordeInferior=(posicionY+margenSup+margenInf)/sprite.obtenLado();
        
        if(mapa.obtenerCuadroCatalogo(bordeIzquierdo + bordeSuperior * mapa.obtenerAncho()).esSolido()){
         colision=true;   
        }
        if(mapa.obtenerCuadroCatalogo(bordeIzquierdo + bordeInferior * mapa.obtenerAncho()).esSolido()){
         colision=true;   
        }
        if(mapa.obtenerCuadroCatalogo(bordeDerecho + bordeSuperior * mapa.obtenerAncho()).esSolido()){
         colision=true;   
        }
        if(mapa.obtenerCuadroCatalogo(bordeDerecho + bordeInferior * mapa.obtenerAncho()).esSolido()){
         colision=true;   
        }
        return colision;
    }
    
    public Sprite obtenSprite(){
    
    return sprite;
    }
    
    
}
