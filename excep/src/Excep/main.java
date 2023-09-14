package Excep;

import javax.swing.JOptionPane;

public class main {
    public static void main (String[] args){
    //Creacion de la matriz y mostrar sus valores
        int [] ma= new int[5];
        ma[0] = 5;
        ma[1] = 10;
        ma[2] = 15;
        ma[3] = 20;
        ma[4] = 25;
    
        for(int i=0;i<5;i++){
            System.out.println("La Posicion:"+i+"="+ma[i]);
            
        }
        //Peticion de Datos
        String nombre=JOptionPane.showInputDialog("Ingresa tu Nombre:");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));
        System.out.println("\nHola "+nombre+" Tu edad es:"+edad+"\nCodigo Terminado...");
         
    }
}
