package librarymanagement;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Shushank
 */
public class LibrarianPassword extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /**
     * Creates new form LibrarianPassword
     */
    public LibrarianPassword() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        try{
            ImageIcon imicon = new ImageIcon(ClassLoader.getSystemResource("anne.png"));
            Image icon = imicon.getImage();
            setIconImage(icon);
            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","root");
        //JOptionPane.showMessageDialog(this,"Connecton Successfull");
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JPasswordField();
        t1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JPasswordField();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Create Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 430, 47));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Librarian Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 300, 30));

        t2.setBackground(new java.awt.Color(193, 150, 90));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 400, 30));

        t1.setBackground(new java.awt.Color(193, 150, 90));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 400, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 300, 30));

        t3.setBackground(new java.awt.Color(193, 150, 90));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 400, 30));

        b2.setBackground(new java.awt.Color(193, 150, 90));
        b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b2.setText("Reset");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 130, 40));

        b1.setBackground(new java.awt.Color(193, 150, 90));
        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b1.setText("Submit");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, 140, 40));

        b3.setBackground(new java.awt.Color(193, 150, 90));
        b3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b3.setText("HOME");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 140, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/LibrarianPassword.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Fill All Boxes");
        }
        else{
                int stuid,stuid2=0;
                String pass1;
                String pass2;
                
                stuid=Integer.parseInt(t1.getText());
                pass1=t2.getText();
                pass2=t3.getText();
               if(pass1.equals(pass2)){
                try{
                ps=con.prepareStatement("select max(ID) from addlibrarian");
                rs=ps.executeQuery();
                if(rs.next()){
                    stuid2=rs.getInt(1);
                
                }
                if(stuid2==stuid){
                    
                    ps=con.prepareStatement("insert into librarianpassword values(?,?)");
                    
                    ps.setInt(1,stuid2);
                    ps.setString(2,pass1);
                    int result=ps.executeUpdate();
                    if(result>0){
                        JOptionPane.showMessageDialog(this,"Password Created Successful");
                        new AdminstrationSection().setVisible(true);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Password Created Canceled");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this,"Wrong username or id");
                }
                }
                catch(HeadlessException | SQLException e){
                    e.printStackTrace();
                }
                }
                else{
                    JOptionPane.showMessageDialog(this,"Password MisMatch");                   
                }       
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
            t1.setText("");
            t2.setText("");
            t3.setText("");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        new LibraryMgt().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b3ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LibrarianPassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    private javax.swing.JPasswordField t3;
    // End of variables declaration//GEN-END:variables
}
