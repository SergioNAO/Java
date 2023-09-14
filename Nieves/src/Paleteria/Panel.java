/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paleteria;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class Panel extends javax.swing.JFrame {
Paletas p;
Nieves n;
 

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
        Grupo1.add(RBnieve);
        Grupo1.add(RBpaleta);
        
        Grupo2.add(RBbola2);
        Grupo2.add(RBbola1);
        Grupo2.add(RBbola3);
        
        Grupo3.add(RBchica);
        Grupo3.add(RBmediana);
        Grupo3.add(RBgrande);
        
        Grupo4.add(RBCchocolate);
        Grupo4.add(RBCfresa);
        Grupo4.add(RBsincubierta);
        
        Grupo5.add(RBmiel);
        Grupo5.add(RBchispas);
        
    p=new Paletas();  
    n=new Nieves();
    }
    int bola1=5,bola2=10,bola3=15;
    int chispas=4,miel=3;
    int total= 0;
    int paleta=10,nieve=5;
    int chocolate=7,fresa=8,vainilla=6;
    int chica = 5,mediana=10,grande=15;
    int sincub=0,cubcho=10,cubfre=8;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        Grupo2 = new javax.swing.ButtonGroup();
        Grupo3 = new javax.swing.ButtonGroup();
        Grupo4 = new javax.swing.ButtonGroup();
        Grupo5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        RBnieve = new javax.swing.JRadioButton();
        RBpaleta = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RBbola1 = new javax.swing.JRadioButton();
        RBbola2 = new javax.swing.JRadioButton();
        RBbola3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RBchica = new javax.swing.JRadioButton();
        RBmediana = new javax.swing.JRadioButton();
        RBgrande = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RBCchocolate = new javax.swing.JRadioButton();
        RBCfresa = new javax.swing.JRadioButton();
        RBsincubierta = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        BTNterminar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        RBchispas = new javax.swing.JRadioButton();
        RBmiel = new javax.swing.JRadioButton();
        TFnombre = new javax.swing.JTextField();
        TFclave = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Neveria \"ISC\"");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Seleccione que desea Comprar:");

        Grupo1.add(RBnieve);
        RBnieve.setText("Nieve");
        RBnieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBnieveActionPerformed(evt);
            }
        });

        Grupo1.add(RBpaleta);
        RBpaleta.setText("Paleta");
        RBpaleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBpaletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBnieve)
                    .addComponent(RBpaleta)
                    .addComponent(jLabel4))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RBnieve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RBpaleta)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(340, 50, 200, 126);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Medida");

        Grupo2.add(RBbola1);
        RBbola1.setText("1 Bola");
        RBbola1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBbola1ActionPerformed(evt);
            }
        });

        Grupo2.add(RBbola2);
        RBbola2.setText("2 Bolas");
        RBbola2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBbola2ActionPerformed(evt);
            }
        });

        Grupo2.add(RBbola3);
        RBbola3.setText("3 Bolas");
        RBbola3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBbola3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBbola3)
                    .addComponent(RBbola2)
                    .addComponent(jLabel1)
                    .addComponent(RBbola1))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBbola1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBbola2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RBbola3)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(340, 190, 211, 130);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Tamaño:");

        Grupo3.add(RBchica);
        RBchica.setText("Chica");
        RBchica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBchicaActionPerformed(evt);
            }
        });

        Grupo3.add(RBmediana);
        RBmediana.setText("Mediana");
        RBmediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBmedianaActionPerformed(evt);
            }
        });

        Grupo3.add(RBgrande);
        RBgrande.setText("Grande");
        RBgrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBgrandeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBgrande)
                    .addComponent(RBmediana)
                    .addComponent(jLabel2)
                    .addComponent(RBchica))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBchica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBmediana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RBgrande)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(50, 180, 200, 132);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Cubierta:");

        Grupo4.add(RBCchocolate);
        RBCchocolate.setText("Chocolate");
        RBCchocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBCchocolateActionPerformed(evt);
            }
        });

        Grupo4.add(RBCfresa);
        RBCfresa.setText("Fresa");
        RBCfresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBCfresaActionPerformed(evt);
            }
        });

        Grupo4.add(RBsincubierta);
        RBsincubierta.setText("Sin Cubierta");
        RBsincubierta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBsincubiertaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBsincubierta)
                    .addComponent(RBCfresa)
                    .addComponent(jLabel3)
                    .addComponent(RBCchocolate))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBCchocolate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBCfresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBsincubierta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(50, 330, 211, 132);

        jLabel5.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jLabel5.setText("Neveria \"ISC\"");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 10, 123, 26);

        BTNterminar.setText("Aceptar");
        BTNterminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNterminarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNterminar);
        BTNterminar.setBounds(260, 470, 80, 30);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Topics:");

        Grupo5.add(RBchispas);
        RBchispas.setText("Chispas de Chocolate");
        RBchispas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBchispasActionPerformed(evt);
            }
        });

        Grupo5.add(RBmiel);
        RBmiel.setText("Con Miel");
        RBmiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBmielActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBmiel)
                    .addComponent(RBchispas)
                    .addComponent(jLabel6))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RBchispas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RBmiel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(340, 330, 200, 121);

        TFnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        TFnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombreActionPerformed(evt);
            }
        });
        getContentPane().add(TFnombre);
        TFnombre.setBounds(70, 50, 210, 40);

        TFclave.setBorder(null);
        getContentPane().add(TFclave);
        TFclave.setBounds(70, 100, 210, 40);

        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 60, 70, 20);

        jLabel8.setText("Clave:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 110, 34, 16);

        setSize(new java.awt.Dimension(641, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RBnieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBnieveActionPerformed
        // TODO add your handling code here:
        if(RBnieve.isSelected()){
        total= total+nieve;}
        String nom=TFnombre.getText();
        n.setNombre(nom);
        String clave=TFclave.getText();
        n.setClave(clave);
        
    }//GEN-LAST:event_RBnieveActionPerformed

    private void RBpaletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBpaletaActionPerformed
        // TODO add your handling code here:
        if(RBpaleta.isSelected()){
        total = total+paleta;}
        
    }//GEN-LAST:event_RBpaletaActionPerformed
 
  
  
    private void BTNterminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNterminarActionPerformed
        // TODO add your handling code here: 
        
       JOptionPane.showMessageDialog(null,"Compra Realizada\nEl total es:"+total+"\nNombre:"+n.getNombre()+
       "\nClave:"+n.getClave());
       
       total=0;
       Grupo1.clearSelection();
       Grupo2.clearSelection();
       Grupo3.clearSelection();
       Grupo4.clearSelection();
       Grupo5.clearSelection();
    }//GEN-LAST:event_BTNterminarActionPerformed

    private void RBchicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBchicaActionPerformed
        // TODO add your handling code here:
        if(RBchica.isSelected()){
        total=total+chica;}
        
    }//GEN-LAST:event_RBchicaActionPerformed

    private void RBmedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBmedianaActionPerformed
        // TODO add your handling code here:
        if(RBmediana.isSelected()){
        total=total+mediana;}
       
    }//GEN-LAST:event_RBmedianaActionPerformed

    private void RBgrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBgrandeActionPerformed
        // TODO add your handling code here:
        if(RBgrande.isSelected()){
        total=total+grande;}
       
    }//GEN-LAST:event_RBgrandeActionPerformed

    private void RBbola1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBbola1ActionPerformed
        // TODO add your handling code here:
        if(RBbola1.isSelected()){total=total+bola1;}
    }//GEN-LAST:event_RBbola1ActionPerformed

    private void RBbola2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBbola2ActionPerformed
        // TODO add your handling code here:
        if(RBbola2.isSelected()){total=total+bola2;}
    }//GEN-LAST:event_RBbola2ActionPerformed

    private void RBbola3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBbola3ActionPerformed
        // TODO add your handling code here:
      if(RBbola3.isSelected()){total=total+bola3;}
    }//GEN-LAST:event_RBbola3ActionPerformed

    private void RBCchocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBCchocolateActionPerformed
        // TODO add your handling code here:
        if(RBCchocolate.isSelected()){
        total= total+cubcho;}
        
    }//GEN-LAST:event_RBCchocolateActionPerformed

    private void RBCfresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBCfresaActionPerformed
        // TODO add your handling code here:
        if(RBCfresa.isSelected()){
        total= total+cubfre;}
        
    }//GEN-LAST:event_RBCfresaActionPerformed

    private void RBsincubiertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBsincubiertaActionPerformed
        // TODO add your handling code here:
        if(RBsincubierta.isSelected()){
        total= total+0;}
    }//GEN-LAST:event_RBsincubiertaActionPerformed

    private void RBchispasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBchispasActionPerformed
        // TODO add your handling code here:
        if(RBchispas.isSelected()){total=total+chispas;}
    }//GEN-LAST:event_RBchispasActionPerformed

    private void RBmielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBmielActionPerformed
        // TODO add your handling code here:
        if(RBmiel.isSelected()){total=total+miel;}
    }//GEN-LAST:event_RBmielActionPerformed

    private void TFnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnombreActionPerformed
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_TFnombreActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNterminar;
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.ButtonGroup Grupo2;
    private javax.swing.ButtonGroup Grupo3;
    private javax.swing.ButtonGroup Grupo4;
    private javax.swing.ButtonGroup Grupo5;
    private javax.swing.JRadioButton RBCchocolate;
    private javax.swing.JRadioButton RBCfresa;
    private javax.swing.JRadioButton RBbola1;
    private javax.swing.JRadioButton RBbola2;
    private javax.swing.JRadioButton RBbola3;
    private javax.swing.JRadioButton RBchica;
    private javax.swing.JRadioButton RBchispas;
    private javax.swing.JRadioButton RBgrande;
    private javax.swing.JRadioButton RBmediana;
    private javax.swing.JRadioButton RBmiel;
    private javax.swing.JRadioButton RBnieve;
    private javax.swing.JRadioButton RBpaleta;
    private javax.swing.JRadioButton RBsincubierta;
    private javax.swing.JTextField TFclave;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
