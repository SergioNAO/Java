package Logins;

import java.io.Serializable;

public class Preguntas implements Serializable {
    private String tema;
    private String SubTema;
    private String num;
    private String unidad;
    private String pregunta; // cada caracter ocupa 2 bytes
    private String res1, res2, res3, res;
    private boolean activo;

    public Preguntas() {
       unidad = "NN";
        tema="NN";
        SubTema="NN";
        num = "NN";
        pregunta = "NN";
        res1 = "NN";
        res2 = "NN";
        res3 = "NN";

        res = "NN";

        activo = true;
    }

    public Preguntas( String unidad,String tema,String SubTema,String num, String pregunta, String res1, String res2, String res3, String res) {
       this.unidad = unidad;
        this.tema=tema;
        this.SubTema=SubTema;
        this.num = num;
        this.pregunta = pregunta;
        this.res1 = res1;
        this.res2 = res2;
        this.res3 = res3;
        this.res = res;

    }

    Preguntas(String U, String T/*,String S*/, String N, String P, String R1, String R2, String R3, String R) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getSubTema(){
    return SubTema;
    }
    public void setSubTema(){
    this.SubTema=SubTema;
    }
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }



    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    public void setRes1(String res1) {
        this.res1 = res1;
    }


    public String getRes1() {
        return res1;
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

    public  void setRes3(String res3) {
        this.res3 = res3;
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
    public String getPregunta() {
        return pregunta;
    }

    public String toString() {

        return ("\n" + unidad +
                "\n" + tema +
                "\n"+SubTema+
                "\n" + num +
            "\n" + pregunta +
            "\n" + res1 +
            "\n" + res2 +
            "\n" + res3 +
            "\n" + res + "");
    }

    public int getTamaño() {
        return (getUnidad().length()*2+2+ getTema().length() * 2 + 2 +getSubTema().length()*2+2+ getNum().length() * 2 + 2 + getPregunta().length() * 2 + 2 + getRes1().length() * 2 + 2 + getRes2().length() * 2 + 2 + getRes3().length() * 2 + 2 + getRes().length() * 2);
    }
}