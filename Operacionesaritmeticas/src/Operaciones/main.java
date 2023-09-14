
package Operaciones;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args){
    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    
    Operacion op = new Operacion();
    
    op.sumar(n1, n2);
    op.restar(n1, n2);
    op.mult(n1, n2);
    op.divi(n1, n2);
    op.mostrar();
    }
}
