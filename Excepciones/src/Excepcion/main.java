
package Excepcion;
import java.util.Scanner;
import java.util.InputMismatchException;
public class main {
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
     
    int x;  
     
    System.out.println("Dame un Numero");    
    try{
        x = scanner.nextInt();
        System.out.println("El numero es:"+x);
    }
    catch(Exception e){
     
        System.out.println("No me diste un Valor numerico");
    }
    finally{
        System.out.println("Codigo Terminado...");
    } 
   }
    
}
