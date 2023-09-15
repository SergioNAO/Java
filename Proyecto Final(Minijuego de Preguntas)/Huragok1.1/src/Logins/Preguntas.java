package Logins;

import java.io.Serializable;

public class Preguntas implements Serializable {
  static private String num;
  static private String unidad;
    static  private String pregunta; // cada caracter ocupa 2 bytes
    static private String res1,res2,res3,res;
    static private boolean activo;
   
    public Preguntas() {
         num="NN";
         unidad ="NN";
        pregunta = "NN";
       res1 = "NN";
       res2 = "NN";
       res3 = "NN";
       
       res = "NN";
      
        activo = true;
    }

    public Preguntas(String num,String pregunta, String unidad,String res1, String res2, String res3,String res) {
        this.num =num;
        this.unidad = unidad;
        this.pregunta = pregunta;
        this.res1 = res1;
        this.res2 = res2;
        this.res3 = res3;
        this.res = res;
       
    } 

    public static String getNum() {
        return num;
    }

    public static void setNum(String num) {
        Preguntas.num = num;
    }
     
   

    public static String getUnidad() {
        return unidad;
    }

    public static void setUnidad(String unidad) {
        Preguntas.unidad = unidad;
    }  
    public static void setRes1(String res1) {
        Preguntas.res1 = res1;
    }


    public static String getRes1() {
        return res1;
    }

  
    public static String getRes2() {
        return res2;
    }

    public static void setRes2(String res2) {
        Preguntas.res2 = res2;
    }

    public static String getRes3() {
        return res3;
    }

    public static void setRes3(String res3) {
        Preguntas.res3 = res3;
    }

    

    public static String getRes() {
        return res;
    }

    public static void setRes(String res) {
        Preguntas.res = res;
    }

    public static void setPregunta(String pregunta) {
        Preguntas.pregunta = pregunta;
    }
    public static String getPregunta(){
        return pregunta;
    }
   
    public String toString() {
        return ("\nUNIDAD: " + unidad +
                "\nPREGUNTA" + pregunta +
                "\nRES1"+res1+ 
                "\nRES2"+res2+ 
                "\nRES3"+res3+
                "\nRES"+res+"" );
    }   
    
    public int getTamaño() {
        return (getNum().length()*2 + 2 + getUnidad().length()*2+ 2 + getPregunta().length()*2+ 2 + getRes1().length()*2+ 2 + getRes2().length()*2+ 2 + getRes3().length()*2+ 2 + getRes().length()*2) ;
    } 
}