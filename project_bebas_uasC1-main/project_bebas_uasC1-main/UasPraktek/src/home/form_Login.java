package home;
/**
 *
 * @author asril
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.KoneksiDatabase;
import home.jframregist;
public class form_Login extends javax.swing.JFrame {
    

    int xx, xy;
    /**
     * Creates new form form_Login
     */
    public form_Login() {
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

        jPanel1 = new javax.swing.JPanel();
        btnexit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        bt_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btndaftar = new javax.swing.JLabel();
        t_pasword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img x.png"))); // NOI18N
        btnexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexitMouseClicked(evt);
            }
        });
        jPanel1.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 136, 58));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imglgn.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 440, 510));

        t_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_username.setText("username");
        t_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        t_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_usernameFocusLost(evt);
            }
        });
        jPanel1.add(t_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 306, 250, 50));

        bt_login.setBackground(new java.awt.Color(51, 51, 255));
        bt_login.setText("LOGIN");
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });
        jPanel1.add(bt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 250, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgicon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 190, 150));

        btndaftar.setForeground(new java.awt.Color(0, 51, 255));
        btndaftar.setText("Daftar akun");
        btndaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndaftarMouseClicked(evt);
            }
        });
        jPanel1.add(btndaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        t_pasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_pasword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jPanel1.add(t_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 376, 250, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y -  xy);
    }//GEN-LAST:event_formMouseDragged

    private void btnexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexitMouseClicked
        dispose();
    }//GEN-LAST:event_btnexitMouseClicked

    private void t_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusGained
        String username=t_username.getText();
        if(username.equals("username")){
            t_username.setText("");
        }
    }//GEN-LAST:event_t_usernameFocusGained

    private void t_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusLost
       String username=t_username.getText();
       if(username.equals("")||username.equals("username")){
           t_username.setText("username");
       }
    }//GEN-LAST:event_t_usernameFocusLost

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        String username = t_username.getText();
        String pass = t_pasword.getText();
        Connection connection = KoneksiDatabase.BukaKoneksi();

        try {
            String query = "SELECT * FROM user WHERE username=? AND password=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, pass);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        JOptionPane.showMessageDialog(this, "Login successful!");
                        frammenuhome home = new frammenuhome();
                        home.show();
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database connection error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_loginActionPerformed

    private void btndaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndaftarMouseClicked
        jframregist regis = new jframregist();
        regis.show();
        this.dispose();
    }//GEN-LAST:event_btndaftarMouseClicked

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
            java.util.logging.Logger.getLogger(form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel btndaftar;
    private javax.swing.JLabel btnexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField t_pasword;
    private javax.swing.JTextField t_username;
    // End of variables declaration//GEN-END:variables
}
