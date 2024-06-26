package librarymanagement;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Shushank
 */
public class DeleteStudent extends javax.swing.JFrame {
Connection con;
PreparedStatement ps;
ResultSet rs;
    /**
     * Creates new form DeleteLibrarian
     */
    public DeleteStudent() {
        
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        try{
            setSize(Toolkit.getDefaultToolkit().getScreenSize());
            ImageIcon imicon = new ImageIcon(ClassLoader.getSystemResource("anne.png"));
        Image icon = imicon.getImage();
        setIconImage(icon);            
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","root");
        
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this,e);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        t2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 48)); // NOI18N
        jLabel1.setText("Delete Student");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        t1.setBackground(new java.awt.Color(255, 204, 255));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 480, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel2.setText("Student Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 140, 50));

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel3.setText("Librarian Pass.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 180, 50));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 110, 50));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 110, 50));

        b3.setBackground(new java.awt.Color(204, 255, 255));
        b3.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        b3.setText("Submit");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 510, 110, 50));

        t2.setBackground(new java.awt.Color(255, 204, 255));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 480, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/Ori.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            t1.setText("");
            t2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new LibrarySection().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(t1.getText().equals("")||t2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter All Fields");
        }
        else{
        int num;
        String str;
        str = t2.getText();
        num=Integer.parseInt(t1.getText());       
        ArrayList al=new ArrayList();
        ArrayList<Integer> al2=new ArrayList<>();       
        try{           
        ps=con.prepareStatement("select pass from librarianpassword");
        rs=ps.executeQuery();
        while(rs.next()){
         al.add(rs.getString(1));         
        }
        ps=con.prepareStatement("select stuid from addstudent");
        rs=ps.executeQuery();
        while(rs.next()){
         al2.add(rs.getInt(1));         
        }        
        if(al2.contains(num)==false){
            JOptionPane.showMessageDialog(this,"Invalid Id");
        }
        else if(al.contains(str)==false){
            JOptionPane.showMessageDialog(this,"Invalid Password");
        }
        else{
            ps=con.prepareStatement("delete from bookseat where stuid =?");      
            ps.setInt(1, num);
            ps.executeUpdate();                     
                ps=con.prepareStatement("delete from feestable where stuid =?");      
                ps.setInt(1, num);
                ps.executeUpdate();                                    
                    ps=con.prepareStatement("delete from addstudent where stuid=?");
                    ps.setInt(1, num);
                    int resu=ps.executeUpdate();
                    if(resu>0){                        
                        JOptionPane.showMessageDialog(this,"Deleted Successfull");
                    }                                                        
        }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this,e);
        }
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_t1KeyTyped

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
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DeleteStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}
