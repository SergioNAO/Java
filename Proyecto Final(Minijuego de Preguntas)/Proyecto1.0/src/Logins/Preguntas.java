package Logins;

import java.io.Serializable;

public class Preguntas implements Serializable {
    private String pregunta; // cada caracter ocupa 2 bytes
   private String unidad;
   private String res1,res2,res3,res;
    private boolean activo;

    public Preguntas() {
        pregunta = "NN";
       res1 = "NN";
       res2 = "NN";
       res3 = "NN";
       unidad ="NN";
       res = "NN";
        activo = true;
    }

    public Preguntas(String pregunta, String unidad, String res1, String res2, String res3,String res) {
        this.pregunta = pregunta;
        this.unidad = unidad;
        this.res1 = res1;
        this.res2 = res2;
        this.res3 = res3;
        this.res = res;
    }

    

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getRes1() {
        return res1;
    }

    public void setRes1(String res1) {
        this.res1 = res1;
    }

    public String getRes2() {
        return res2;
    }

    public void setRes2(String res2) {
        this.res2 = res2;
    }

    public String getRes3() {
        return res3;
    }

    public void setRes3(String res3) {
        this.res3 = res3;
    }

    public Preguntas(String pregunta) {
        this.pregunta = pregunta;
      
       
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

     

   

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    public String getPregunta(){
        return pregunta;
    }
    
  

    
   
    public String toString() {
        return "\nPREGUNTA: " + pregunta  ;
                
    }   
    
    public int getTamaño() {
        return (getUnidad().length()*2+ 2 + getPregunta().length()*2+ 2 + getRes1().length()*2+ 2 + getRes2().length()*2+ 2 + getRes3().length()*2+ 2 + getRes().length()*2) ;
    }
}