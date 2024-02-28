package loginform;
import db.userConnection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import student.Home;

public class login extends javax.swing.JFrame {
        String login;
        String login_pwd;
        ResultSet rs = null;
     
    public login() {
        initComponents();
        
        Border borderLabel = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.white);
        jLabel2.setBorder(borderLabel);
        lblminimize.setBorder(borderLabel);
        Border borderTextField = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        login_id.setBorder(borderTextField);
        login_password.setBorder(borderTextField);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        login_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        login_password = new javax.swing.JPasswordField();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        LOGIN = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblminimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Created By EMSI students");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 500, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo-pigier-tanger-min.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 500, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440));

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 0, 40, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Connexion");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 400, 41));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("Identifiant");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 123, 341, -1));

        login_id.setBackground(new java.awt.Color(204, 204, 204));
        login_id.setFont(login_id.getFont().deriveFont(login_id.getFont().getSize()+2f));
        login_id.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        login_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_idActionPerformed(evt);
            }
        });
        jPanel2.add(login_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 240, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 40, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(199, 226, 255));
        jLabel8.setText("Mot de passe");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 192, 341, -1));

        login_password.setBackground(new java.awt.Color(204, 204, 204));
        login_password.setFont(login_password.getFont().deriveFont(login_password.getFont().getSize()+2f));
        login_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        login_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_passwordActionPerformed(evt);
            }
        });
        jPanel2.add(login_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 240, 30));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 40, 30));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 40, 30));

        LOGIN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(0, 51, 153));
        LOGIN.setText("SE CONNECTER");
        LOGIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        jPanel2.add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 341, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Créer un compte");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 100, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(199, 226, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Vous n'avez pas de compte ? ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        lblminimize.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblminimize.setForeground(new java.awt.Color(255, 255, 255));
        lblminimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblminimize.setText("-");
        lblminimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblminimize.setMaximumSize(new java.awt.Dimension(11, 25));
        lblminimize.setMinimumSize(new java.awt.Dimension(11, 25));
        lblminimize.setPreferredSize(new java.awt.Dimension(20, 20));
        lblminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblminimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblminimizeMouseExited(evt);
            }
        });
        jPanel2.add(lblminimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 0, 40, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 420, 440));

        setSize(new java.awt.Dimension(916, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        login_password.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        login_password.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        userConnection.connect();
        login = login_id.getText();
        login_pwd = login_password.getText();
        try {
            String verificationQuery = "SELECT id, mot_de_passe FROM users WHERE id = '" + login + "' AND mot_de_passe = '" + login_pwd + "'";
            rs = userConnection.selectFromDB(verificationQuery);

            if (rs.next()) {
                String id = rs.getString("id");
                String password = rs.getString("mot_de_passe");

                if (id.equals(login) && password.equals(login_pwd)) {
                    userConnection.closeConnection();
                    Home home = new Home();
                    home.setVisible(true);
                    home.setLocationRelativeTo(null);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Informations non correctes. Réessayer!", "Authentication Failed", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Informations non correctes. Réessayer!", "Authentication Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LOGINActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        Border borderLabel = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK);
        jLabel2.setBorder(borderLabel);
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setOpaque(true);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void lblminimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMouseEntered
         Border borderLabel = BorderFactory.createMatteBorder(0,0,0,0, Color.BLACK);
        lblminimize.setBorder(borderLabel);
        lblminimize.setForeground(Color.WHITE);
        lblminimize.setBackground(new Color(192,192,192));
        lblminimize.setOpaque(true);
       
    }//GEN-LAST:event_lblminimizeMouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
         Border borderLabel = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK);
        jLabel2.setBorder(borderLabel);
        jLabel2.setForeground(Color.WHITE);
         jLabel2.setOpaque(false);
    }//GEN-LAST:event_jLabel2MouseExited

    private void lblminimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMouseExited
         Border borderLabel = BorderFactory.createMatteBorder(0,0,0,0, Color.BLACK);
        lblminimize.setBorder(borderLabel);
        lblminimize.setForeground(Color.WHITE);
        lblminimize.setOpaque(false);
    }//GEN-LAST:event_lblminimizeMouseExited

    private void lblminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminimizeMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Register register = new Register();
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked


    private void login_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_idActionPerformed
        
    }//GEN-LAST:event_login_idActionPerformed

    private void login_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_passwordActionPerformed
        
    }//GEN-LAST:event_login_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblminimize;
    private javax.swing.JTextField login_id;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
