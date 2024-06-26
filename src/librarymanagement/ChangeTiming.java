package librarymanagement;

import java.awt.Color;
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
public class ChangeTiming extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList al=new ArrayList();
    ArrayList al2=new ArrayList();
    /*
     * Creates new form ChangeTiming
     */
     
    public ChangeTiming() {
       // setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        try{
            setSize(Toolkit.getDefaultToolkit().getScreenSize());
            ImageIcon imicon = new ImageIcon(ClassLoader.getSystemResource("anne.png"));
        Image icon = imicon.getImage();
        setIconImage(icon);
            tf2.setForeground(new Color(153,153,153));
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","root");
        ps=con.prepareStatement("select stuid from addstudent");
        rs=ps.executeQuery();
        while(rs.next()){
            al.add(rs.getInt(1));
        }
        ps=con.prepareStatement("select pass from librarianpassword");
        rs=ps.executeQuery();
        while(rs.next()){
            al2.add(rs.getString(1));
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        resetbtn = new javax.swing.JButton();
        submitbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        tf3 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 48)); // NOI18N
        jLabel1.setText("Change Timing/Seat");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 640, 70));

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel2.setText("Enter Student Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 190, 40));

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel3.setText("Enter Lib. Pass.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 220, 40));

        tf1.setBackground(new java.awt.Color(255, 204, 255));
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf1KeyTyped(evt);
            }
        });
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 480, 40));

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel4.setText("Enter New Time");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 190, 40));

        tf2.setBackground(new java.awt.Color(255, 204, 255));
        tf2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tf2.setText("like M, E or Full");
        tf2.setToolTipText("");
        tf2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf2FocusLost(evt);
            }
        });
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        getContentPane().add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 480, 40));

        resetbtn.setBackground(new java.awt.Color(204, 255, 255));
        resetbtn.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 110, 50));

        submitbtn.setBackground(new java.awt.Color(204, 255, 255));
        submitbtn.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 520, 110, 50));

        backbtn.setBackground(new java.awt.Color(204, 255, 255));
        backbtn.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 110, 50));

        tf3.setBackground(new java.awt.Color(255, 204, 255));
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });
        getContentPane().add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 480, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/Ori.png"))); // NOI18N
        jLabel5.setText("SSS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        
    }//GEN-LAST:event_tf2ActionPerformed

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained
        if(tf2.getText().equals("like M, E or Full")){
            tf2.setText("");
            tf2.setForeground(new Color(0,0,0));
            
        }
    }//GEN-LAST:event_tf2FocusGained

    private void tf2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusLost
        if(tf2.getText().equals("")){
            tf2.setText("like M, E or Full");
     
        }
    }//GEN-LAST:event_tf2FocusLost

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        tf1.setText("");
        tf2.setText("like M, E or Full");
        tf3.setText("");
    }//GEN-LAST:event_resetbtnActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        if(tf1.getText().equals("")||tf2.getText().equals("like M, E or Full")||tf3.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter All Fields");
        }
        else{
            int stid=Integer.parseInt(tf1.getText());
            String st2=tf2.getText();
            String st3=tf3.getText();
            if(al.contains(stid)){               
                if(al2.contains(st3)){
                    int res=0;
                    if(st2.equals("M")){
                        int time=5;
                        try{
                            ps=con.prepareStatement("update bookseat set timing=?,seatnum=? where stuid=?");
                            ps.setInt(1, time);
                            ps.setInt(2,-1);
                            ps.setInt(3, stid);
                            res=ps.executeUpdate();

                        }
                        catch(SQLException e){
                            JOptionPane.showMessageDialog(this,e);
                        }

                    }
                    else if(st2.equals("E")){
                        int time=2;
                        try{
                            ps=con.prepareStatement("update bookseat set timing=?,seatnum=? where stuid=?");
                            ps.setInt(1, time);
                            ps.setInt(2,-1);
                            ps.setInt(3, stid);
                            res=ps.executeUpdate();
                        }
                        catch(SQLException e){
                            JOptionPane.showMessageDialog(this,e);
                        }

                    }
                    else{
                        int time=100;
                        try{
                            ps=con.prepareStatement("update bookseat set timing=?,seatnum=? where stuid=?");
                            ps.setInt(1, time);
                            ps.setInt(2, -1);
                            ps.setInt(3, stid);
                            res=ps.executeUpdate();
                        }
                        catch(SQLException e){
                            JOptionPane.showMessageDialog(this,e);
                        }

                    }
                    if(res<0)JOptionPane.showMessageDialog(this,"Don't Updated");
                    else {
                        new BookSeat2().setVisible(true);
                        this.dispose();
                    }

                }
                else{
                    JOptionPane.showMessageDialog(this,"Wrong Password");
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Invalid Student Id");
            }
        }
    }//GEN-LAST:event_submitbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        new ModifySection().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped
if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_tf1KeyTyped

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeTiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeTiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeTiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeTiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ChangeTiming().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JPasswordField tf3;
    // End of variables declaration//GEN-END:variables
}
