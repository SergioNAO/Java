/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coversion.de.tipo.de.datos;

/**
 *
 * @author sergi
 */
public class CoversionDeTipoDeDatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(120+16);
        System.out.println(Integer.parseInt("120")+ Integer.parseInt("16"));
        
        int NumeroEntero=15;
        Integer NumeroEntero2=10;
        System.out.println(NumeroEntero2);
        
        double Variabledouble=10.21d;
        Double Variabledouble2=12.37d;
        System.out.println(Variabledouble);
        
        boolean Verdad=true;
        boolean Falso=false;
        System.out.println(Verdad);
        
        String Numero="80";
        byte bNumero= Byte.parseByte(Numero);
        System.out.println(bNumero);
        
        int iNumero = Integer.parseInt(Numero);
        System.out.println(iNumero);
        
        float fNumero = Float.parseFloat(Numero);
        System.out.println(fNumero);  
        
        double dNumero = Double.parseDouble(Numero);
        System.out.println(dNumero);
        
        String cTexto="Contenido de texto: ";
        byte bNumero2=10;
        int iNumero3=120;
        float fNumero3=15f;
        double dNumero3=16d;
        char cadena='a';
        boolean Verdad3=true;
        
        cTexto+=bNumero2;
        
        System.out.println(cTexto);
        
        
        
    }
    
}
