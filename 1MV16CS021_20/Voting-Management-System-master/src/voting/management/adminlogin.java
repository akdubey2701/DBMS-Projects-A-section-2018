
package voting.management;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.*;


public class adminlogin extends javax.swing.JFrame {

    
    public adminlogin() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        jlogin = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jvoterid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jvoterpassword = new javax.swing.JPasswordField();
        jvlogin = new javax.swing.JButton();
        jvreset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting/management/ic_person_white_48dp.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 187, 221));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Voting Management System ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 265, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting/management/help.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 40, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 470));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Voter Login");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel2.setText("User Name");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 10));

        jusername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 1, true));
        jusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusernameActionPerformed(evt);
            }
        });
        jPanel4.add(jusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 208, 30));

        jLabel3.setText("PassWord");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 68, -1));

        jpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51)));
        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });
        jPanel4.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 208, 30));

        jlogin.setBackground(new java.awt.Color(255, 245, 124));
        jlogin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jlogin.setForeground(new java.awt.Color(0, 0, 204));
        jlogin.setText("Login");
        jlogin.setActionCommand("");
        jlogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlogin.setBorderPainted(false);
        jlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });
        jPanel4.add(jlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 84, 30));

        jreset.setBackground(new java.awt.Color(255, 245, 124));
        jreset.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jreset.setForeground(new java.awt.Color(0, 0, 204));
        jreset.setText("Reset");
        jreset.setActionCommand("");
        jreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jreset.setBorderPainted(false);
        jreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        jPanel4.add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 80, 30));

        jLabel6.setText("Voter Id");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 281, 623, -1));

        jvoterid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51)));
        jPanel4.add(jvoterid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 209, 30));

        jLabel7.setText("Password");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 339, -1, -1));

        jvoterpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51)));
        jvoterpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvoterpasswordActionPerformed(evt);
            }
        });
        jPanel4.add(jvoterpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 209, 30));

        jvlogin.setBackground(new java.awt.Color(255, 245, 124));
        jvlogin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jvlogin.setForeground(new java.awt.Color(0, 0, 204));
        jvlogin.setText("Login");
        jvlogin.setActionCommand("");
        jvlogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jvlogin.setBorderPainted(false);
        jvlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jvlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvloginActionPerformed(evt);
            }
        });
        jPanel4.add(jvlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 80, 30));

        jvreset.setBackground(new java.awt.Color(255, 245, 124));
        jvreset.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jvreset.setForeground(new java.awt.Color(0, 0, 204));
        jvreset.setText("Reset");
        jvreset.setActionCommand("");
        jvreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jvreset.setBorderPainted(false);
        jvreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jvreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 80, 30));

        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 5, 42, 19));

        jLabel4.setText("jLabel4");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 0, -1, 28));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Admin login");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting/management/clear.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 40, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 300, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusernameActionPerformed

    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed
        
            Connection  con=null;
        try {
            
              
        
           // String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    String DB_URL = "jdbc:mysql://localhost/dbms";

   //  Database credentials
    String USER = "root";
   String PASS = "root";
   Statement stmt = null;
   
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      con = DriverManager.getConnection(DB_URL,USER,PASS);
      String sql="select*from admin where name=? and password=?";
            PreparedStatement ps=con.prepareStatement(sql);
             ps.setString(1, jusername.getText());
            ps.setString(2, String.valueOf(jpassword.getPassword()));
            ResultSet result = ps.executeQuery();
            if(result.next()){
                JOptionPane.showMessageDialog(null, "Username and Password correct");
                
                Home v=new Home();
                v.setVisible(true);
                
                dispose();
              
            }
            else{
                JOptionPane.showMessageDialog(null, "invalid username or password");
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(adminlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adminlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jloginActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
                                jusername.setText(null);
				jpassword.setText(null);
    }//GEN-LAST:event_jresetActionPerformed

    private void jvoterpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvoterpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvoterpasswordActionPerformed

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordActionPerformed

    private void jvloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvloginActionPerformed
       
         try {
                      String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    String DB_URL = "jdbc:mysql://localhost/dbms";

   //  Database credentials
    String USER = "root";
   String PASS = "root";
   Statement stmt = null;
   
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
String sql2="select voterid,password from addvoter1 where voterid=? and password=?";
            PreparedStatement ps1=con.prepareStatement(sql2);
             ps1.setString(1, jvoterid.getText());
            ps1.setString(2, String.valueOf(jvoterpassword.getPassword()));
            ResultSet result = ps1.executeQuery();
            if(result.next()){
                JOptionPane.showMessageDialog(null, "Username and Password correct");
                //String S=jvoterid.getText();
                PreparedStatement ps3=con.prepareStatement("select voted from vote_c where voterid='"+jvoterid.getText()+"' and voted='y';");
                ResultSet r=ps3.executeQuery();
                if(r.next()==false)
                {
                    
                    PreparedStatement ps2=con.prepareStatement("update vote_c set voted='y' where voterid='"+jvoterid.getText()+"';");
                    ps2.execute();
                Startelection s=new Startelection();
                s.setVisible(true);
                
                dispose();
                }
                else
                    JOptionPane.showMessageDialog(null, "you have already voted");
            }
            else{
                JOptionPane.showMessageDialog(null, "invalid username or password");
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(adminlogin.class.getName()).log(Level.SEVERE, null, ex);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adminlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jvloginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // TODO add your handling code here:
         Help H=new Help();
        H.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jlogin;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JButton jreset;
    private javax.swing.JTextField jusername;
    private javax.swing.JButton jvlogin;
    private javax.swing.JTextField jvoterid;
    private javax.swing.JPasswordField jvoterpassword;
    private javax.swing.JButton jvreset;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */
    
}