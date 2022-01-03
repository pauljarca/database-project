/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_inreg_colet;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author paulv
 */
public class Confirmation extends javax.swing.JFrame {
    
    Persoana pD1;
    Persoana pE1;
    Pachet pK1;
    /**
     * Creates new form Confirmation
     */
    public Confirmation() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public Confirmation(String s, Persoana pD, Persoana pE, Pachet pK) throws SQLException{
        initComponents();
        setLocationRelativeTo(null);
        jTextArea1.append(s);
        pE1=pE;
        pD1=pD;
        pK1=pK;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        confirmation = new javax.swing.JButton();
        confirmation1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 102));
        setName("Confirmation"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 210, 53));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 380, 370));

        jPanel1.setBackground(new java.awt.Color(255, 210, 53));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmation.setBackground(new java.awt.Color(54, 255, 245));
        confirmation.setText("Confirm Order");
        confirmation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmationMouseClicked(evt);
            }
        });
        confirmation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmationActionPerformed(evt);
            }
        });
        jPanel1.add(confirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 130, -1));

        confirmation1.setBackground(new java.awt.Color(54, 255, 245));
        confirmation1.setText("Renunta");
        confirmation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmation1ActionPerformed(evt);
            }
        });
        jPanel1.add(confirmation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 74, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmationActionPerformed
        if(confirmation.isSelected())
        {
            try {
                pD1.addToDestDB(pD1);
                pE1.addToExpDB(pE1);
                pK1.addToOrderDB(pK1);
                JOptionPane.showMessageDialog(rootPane, "Date incarcate in DB!");
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Confirmation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_confirmationActionPerformed

    private void confirmationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmationMouseClicked
        try {
                pD1.addToDestDB(pD1);
                pE1.addToExpDB(pE1);
                pK1.addToOrderDB(pK1);
                JOptionPane.showMessageDialog(rootPane, "Date incarcate in DB!");
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Confirmation.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_confirmationMouseClicked

    private void confirmation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmation1ActionPerformed
        dispose();
        formInreg fI=new formInreg();
        fI.setVisible(true);
    }//GEN-LAST:event_confirmation1ActionPerformed

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
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmation;
    private javax.swing.JButton confirmation1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
