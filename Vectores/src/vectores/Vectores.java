/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores;
import java.util.Scanner;
/**
 *
 * @author sergi
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] Nombres = new String [3];
        
        Nombres [0] ="Victor";
        Nombres [1] ="Carlos";
        Nombres [2] ="Juan";
        
        for(int i = 0; i <= 2; i++){
        System.out.println(Nombres[i]);
        }
        
        Scanner Entrada = new Scanner(System.in);
        int nCantNotas=0;
        
        System.out.println("Ingrese la cantidad de Notas/Calificaciones");
        nCantNotas = Entrada.nextInt();
        
        int [] Notas = new int[nCantNotas];
        
        for (int i = 0;i < nCantNotas;i++){
        System.out.print("Ingresa la nota para la posicion #"+i+" = ");
        Notas [i] = Entrada.nextInt();
        }
        
        System.out.println("Impresion de Notas Ingresadas");
        for(int a = 0;a < nCantNotas;a++){
            System.out.println(Notas[a]);
        }
        
        
    }
    
}
