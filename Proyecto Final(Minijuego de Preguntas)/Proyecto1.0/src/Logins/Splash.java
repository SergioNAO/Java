/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author liond
 */
public class Splash extends JWindow {
    private int duracion = 0;
    public Splash(int duracion){
        this.duracion = duracion;
        
        JPanel panel=(JPanel) getContentPane();
       
        ImageIcon img=new ImageIcon("src/imagesp/nave.jpg");
        panel.add(new JLabel(img),BorderLayout.CENTER);
        setSize(img.getIconWidth(),img.getIconHeight());
        setSize(912,856);
        setLocationRelativeTo(null);
        setVisible(true);
        
        try{
            Thread.sleep(duracion );
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        setVisible(false);
        app();
        
    }

   public Splash() {
        
    }
    public void app(){
     
        Login ventana = new Login();
        
        ventana.setSize(812,556);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    public static void main(String[] args){
        
        new Splash(2000);
    }
}
