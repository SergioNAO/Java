
package Operaciones;

import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
    int suma;
    int resta;
    int multi;
    int div;
   //Metodos
    //Metodo para sumar
    public void sumar(int num1,int num2){
    suma = num1 + num2;
   }
    public void restar(int num1, int num2){
    resta = num1 - num2; 
    }
    public void mult(int num1, int num2){
    multi = num1 * num2;
    }
    public void divi(int num1, int num2){
    div = num1 / num2;
    }
    public void mostrar(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La Multiplicacion es: "+multi);
        System.out.println("La Divicion es "+div);
    }
}
