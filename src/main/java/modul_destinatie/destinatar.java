/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_destinatie;

import fis.*;
import modul_inreg_colet.Pachet;
import java.sql.*;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.crypto.Data;
/**
 *
 * @author alinb
 */
public class destinatar extends javax.swing.JFrame {
    
Destinatie des=new Destinatie();
Pachet pachet=new Pachet();
            
    public destinatar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtStare = new javax.swing.JTextField();
        txtLocatie = new javax.swing.JTextField();
        lblStare = new javax.swing.JLabel();
        lblLocatie = new javax.swing.JLabel();
        txtZile = new javax.swing.JTextField();
        lblZile = new javax.swing.JLabel();
        txtNume = new javax.swing.JTextField();
        btnCauta = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 294));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel19.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 210, 53));
        jLabel19.setText("Status colet");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        txtStare.setEnabled(false);

        txtLocatie.setEnabled(false);

        lblStare.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lblStare.setForeground(new java.awt.Color(255, 255, 255));
        lblStare.setText("Stare colet");

        lblLocatie.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lblLocatie.setForeground(new java.awt.Color(255, 255, 255));
        lblLocatie.setText("Locatie");

        txtZile.setEnabled(false);

        lblZile.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        lblZile.setForeground(new java.awt.Color(255, 255, 255));
        lblZile.setText("zile in sediul destinatiei");

        btnCauta.setBackground(new java.awt.Color(255, 210, 53));
        btnCauta.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        btnCauta.setText("Cauta");
        btnCauta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCautaActionPerformed(evt);
            }
        });

        btnAdmin.setBackground(new java.awt.Color(255, 210, 53));
        btnAdmin.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        btnAdmin.setText("Portal Administrator");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numele destinatarului");

        btnPrev.setBackground(new java.awt.Color(0, 0, 0));
        btnPrev.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("Inapoi");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtNume, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(btnCauta))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblStare)
                        .addGap(120, 120, 120)
                        .addComponent(txtStare, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(btnPrev)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdmin))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(lblZile)
                            .addGap(67, 67, 67)
                            .addComponent(txtZile))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(lblLocatie)
                            .addGap(138, 138, 138)
                            .addComponent(txtLocatie, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCauta))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblStare))
                    .addComponent(txtStare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblLocatie))
                    .addComponent(txtLocatie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblZile))
                    .addComponent(txtZile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 210, 53));
        jLabel20.setText("Curier");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)))
                .addGap(33, 33, 33))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
            dispose();
        Administrator_parola ap= new Administrator_parola();
        ap.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnCautaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCautaActionPerformed
        // TODO add your handling code here:
     try{
         String url = "jdbc:mysql://localhost:3306/registration_details";
	Statement sql;
	ResultSet rs;
	Connection con1 = DriverManager.getConnection(url, "root", "anglia");
	sql = (Statement) con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	rs = sql.executeQuery("select * from packages");

        rs.next();
        String nume= new String();
        nume= txtNume.getText();
        
        boolean found = false;
		do {
			if (nume.equals(rs.getString("nume_dest"))) {
                                //Date date;
                               // date = rs.getDate("data_destinatie");
                               // Format dateFormat = new SimpleDateFormat("dd-MM-yy");
                               // String strDate= dateFormat.format(date);
                               pachet.setStare(rs.getString("stare"));
                                pachet.setData(rs.getString("data_destinatie"));
				txtStare.setText(rs.getString("stare"));
				txtLocatie.setText(rs.getString("locatie_curenta"));
                                
                                if(pachet.getStare().equals("in asteptare"))
                                txtZile.setText(Long.toString(des.pornireTimer(pachet)));
                                else
                                    txtZile.setText("coletul inca nu a ajuns la destinatie");
                                
                                
				found = true;
			} else
                            rs.next();
                    } while (!found);
        
     }
     catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ParseException ex) {
        Logger.getLogger(destinatar.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        
    }//GEN-LAST:event_btnCautaActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
             dispose();
        NewJFrame njf= new NewJFrame();
        njf.setVisible(true);
    }//GEN-LAST:event_btnPrevActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws SQLException{    
      
                  
	     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new destinatar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    public javax.swing.JButton btnCauta;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblLocatie;
    private javax.swing.JLabel lblStare;
    private javax.swing.JLabel lblZile;
    private javax.swing.JTextField txtLocatie;
    private javax.swing.JTextField txtNume;
    private javax.swing.JTextField txtStare;
    private javax.swing.JTextField txtZile;
    // End of variables declaration//GEN-END:variables

  
}