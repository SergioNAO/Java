/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author liond
 */
public class Ventanap extends javax.swing.JDialog {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Ventanap
     */
    
    public Ventanap(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ImageIcon imagen= new ImageIcon("src/imagesp/re.png");
        Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(jLoop.getWidth(),jLoop.getHeight(),Image.SCALE_DEFAULT));
        jLoop.setIcon(icono);
        ImageIcon imagen1= new ImageIcon("src/imagesp/re12.png");
        Icon icono1=new ImageIcon(imagen1.getImage().getScaledInstance(jres.getWidth(),jres.getHeight(),Image.SCALE_DEFAULT));
        jres.setIcon(icono1);
       
    }

    public Ventanap() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        passContra = new javax.swing.JPasswordField();
        btnAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jres = new javax.swing.JLabel();
        jLoop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");
        getContentPane().setLayout(null);

        txtNombre.setBackground(java.awt.Color.lightGray);
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(290, 190, 161, 62);

        passContra.setBackground(java.awt.Color.lightGray);
        passContra.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));
        passContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraActionPerformed(evt);
            }
        });
        getContentPane().add(passContra);
        passContra.setBounds(290, 270, 161, 60);

        btnAdd.setBackground(new java.awt.Color(0, 153, 0));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Completar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(310, 350, 110, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<--  Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 420, 110, 30);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 10, 140, 50);

        jres.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        getContentPane().add(jres);
        jres.setBounds(280, 60, 180, 130);
        getContentPane().add(jLoop);
        jLoop.setBounds(0, 0, 800, 480);

        setBounds(0, 0, 815, 511);
    }// </editor-fold>//GEN-END:initComponents

    private void passContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passContraActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String nombre = txtNombre.getText().trim();
         if(nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el Usuario!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }    
        String _contra = passContra.getText().trim();
        if(_contra.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso la contraseña!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }   
        String contra;
        try {
            contra = _contra;
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número entero para la Contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            AccesoAleatorio.crearFileAlumno( new File("personas.dat") );
            AccesoAleatorio.añadirPersona( new Persona(nombre, contra, true) );
            AccesoAleatorio.cerrar();
            JOptionPane.showMessageDialog(this, "El registro se realizó correctamente.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error en la escritura de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }                  
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Login prin;
       prin=new Login();
       this.dispose();
       prin.setVisible(true);
       prin.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventanap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventanap dialog = new Ventanap(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLoop;
    private javax.swing.JLabel jres;
    private javax.swing.JPasswordField passContra;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}