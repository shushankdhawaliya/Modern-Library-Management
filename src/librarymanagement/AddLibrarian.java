package librarymanagement;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
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
public class AddLibrarian extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    private int stuid;
    /**
     * Creates new form AddStudent
     */
    public AddLibrarian() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        try{
           setSize(Toolkit.getDefaultToolkit().getScreenSize()); 
        ImageIcon imicon = new ImageIcon(ClassLoader.getSystemResource("anne.png"));
        Image icon = imicon.getImage();
        setIconImage(icon);
               
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","root");
            ps=con.prepareStatement("select max(id) from addlibrarian");
            rs=ps.executeQuery();
            if(rs.next()){
            stuid=rs.getInt(1);
            }
            if(stuid==0){
                stuid=100;
            }
            else{
                stuid+=1;
            }
            
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this,e);
        }
        t2.requestFocus();
        t1.setEditable(false);
        t1.setText(String.valueOf(stuid));       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 40, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel3.setText("Father's Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel4.setText("Ph. Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 100, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        t1.setBackground(new java.awt.Color(255, 204, 255));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 480, 40));

        t2.setBackground(new java.awt.Color(255, 204, 255));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 480, 40));

        t3.setBackground(new java.awt.Color(255, 204, 255));
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 480, 40));

        t4.setBackground(new java.awt.Color(255, 204, 255));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 480, 40));

        t5.setBackground(new java.awt.Color(255, 204, 255));
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 480, 40));

        t6.setBackground(new java.awt.Color(255, 204, 255));
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t6KeyTyped(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 480, 40));

        b1.setBackground(new java.awt.Color(204, 255, 255));
        b1.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        b1.setText("Next");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 610, 110, 50));

        b2.setBackground(new java.awt.Color(204, 255, 255));
        b2.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        b2.setText("Back");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 110, 50));

        b3.setBackground(new java.awt.Color(204, 255, 255));
        b3.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        b3.setText("Reset");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, 110, 50));

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 1, 48)); // NOI18N
        jLabel7.setText("Add Librarian");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 490, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/Ori.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1560, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
 
    }//GEN-LAST:event_t2ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       new AdminstrationSection().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
            String name,fname,address,email;
            long phonenum;
            if(t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Fill All Data");
            }
            else{
            name=t2.getText();
            fname=t3.getText();
            address=t4.getText();
            email=t5.getText();
            phonenum=Long.parseLong(t6.getText());
            
            try{
            ps=con.prepareStatement("insert into addlibrarian values(?,?,?,?,?,?)");
            ps.setInt(1,stuid);
            ps.setString(2,name);
            ps.setString(3,fname);
            ps.setString(4,address);
            ps.setString(5,email);
            ps.setLong(6,phonenum);
            
            int result=ps.executeUpdate();
            if(result<0){
                JOptionPane.showMessageDialog(this,"Failed to Added");
            }
            con.close();
             new LibrarianPassword(stuid).setVisible(true);
             this.dispose();
            
            }
            catch(HeadlessException | SQLException e){
              JOptionPane.showMessageDialog(this,e);
            }
            }
    }//GEN-LAST:event_b1ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
                   
    }//GEN-LAST:event_t2KeyPressed

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
        char ch = evt.getKeyChar();
        if(!((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(int)ch==32||(int)ch==8)){
            evt.consume();
        }
    }//GEN-LAST:event_t2KeyTyped

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
    char ch = evt.getKeyChar();
        if(!((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(int)ch==32||(int)ch==8)){
            evt.consume();
        }
    }//GEN-LAST:event_t3KeyTyped

    private void t6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t6KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_t6KeyTyped

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t2.requestFocus();
    }//GEN-LAST:event_b3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddLibrarian().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
