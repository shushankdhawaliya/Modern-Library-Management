package librarymanagement;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shushank
 */
public class AddStudent extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    private int stuid;
    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        try{
            setSize(Toolkit.getDefaultToolkit().getScreenSize());
            ImageIcon imicon = new ImageIcon(ClassLoader.getSystemResource("anne.png"));
            Image icon = imicon.getImage();
            setIconImage(icon);
               
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","root");
            ps=con.prepareStatement("select max(stuid) from addstudent");
            rs=ps.executeQuery();
        if(rs.next()){
            stuid=rs.getInt(1);
            }
           if(stuid==0){
                stuid=1000;
            }
            else{
                stuid+=1;
                        
            } 
            t1.setText(String.valueOf(stuid));
        t1.setEditable(false);
        t2.requestFocus();
        }
        
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this,e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setBackground(new java.awt.Color(255, 204, 255));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 480, 40));

        t2.setBackground(new java.awt.Color(255, 204, 255));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 480, 40));

        t3.setBackground(new java.awt.Color(255, 204, 255));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 480, 40));

        t4.setBackground(new java.awt.Color(255, 204, 255));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 480, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 48)); // NOI18N
        jLabel1.setText("Student Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        t5.setBackground(new java.awt.Color(255, 204, 255));
        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t5KeyTyped(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 480, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 60, 20));

        t6.setBackground(new java.awt.Color(255, 204, 255));
        t6.setText("yyyy-MM-dd");
        t6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t6FocusLost(evt);
            }
        });
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
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 480, 40));

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel3.setText("Father's Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 130, 20));

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 70, 20));

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel5.setText("Contact No");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 110, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel6.setText("Join Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 90, 20));

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel7.setText("Student Id");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 100, 30));

        b1.setBackground(new java.awt.Color(204, 255, 255));
        b1.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        b1.setText("Next");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 650, 110, 50));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 650, 110, 50));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 650, 110, 50));

        jLabel9.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel9.setText("5:00-2:00 ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, 90, 20));

        t8.setBackground(new java.awt.Color(255, 204, 255));
        t8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t8KeyTyped(evt);
            }
        });
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 480, 40));

        jLabel10.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel10.setText("Fees");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 90, 20));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel11.setText("2:00-10:00");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, 90, 20));

        jLabel12.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel12.setText("Full Day");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 580, 90, 20));

        jLabel13.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel13.setText("Timing");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 90, 20));

        cb1.setBackground(new java.awt.Color(255, 204, 255));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, -1, -1));

        cb2.setBackground(new java.awt.Color(255, 204, 255));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, -1, -1));

        cb3.setBackground(new java.awt.Color(255, 204, 255));
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/Ori.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1430, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

       long cont;
       String name,fname,date,address;
       int fees;
       if(t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t8.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Fill All Data");
            }
       else if(t6.getText().equals("yyyy-MM-dd")){
        name=t2.getText();
        fname=t3.getText();
        address=t4.getText();
        cont=Long.parseLong(t5.getText());       
        fees=Integer.parseInt(t8.getText());   
        try {
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String formattedDate = currentDate.format(formatter);           
                
            ps=con.prepareStatement("insert into addstudent values(?,?,?,?,?,?,?,?)");
            ps.setInt(1,stuid);
            ps.setString(2,name);
            ps.setString(3,fname);
            ps.setString(4,address);
            ps.setLong(5, cont);
            ps.setString(6,formattedDate);
            ps.setInt(7, fees);            
            ps.setInt(8, fees);            
            int res=ps.executeUpdate();
            if(res<0){
                JOptionPane.showMessageDialog(this,"Failed to Add student");
            }
                         
        } catch (HeadlessException | SQLException ex) {
           JOptionPane.showMessageDialog(this,ex);
        }
        
       }
            else{
        name=t2.getText();
        fname=t3.getText();
        address=t4.getText();
        cont=Long.parseLong(t5.getText());
        date=t6.getText();
        fees=Integer.parseInt(t8.getText());
     
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            // Parse the string to obtain a Date object
            Date date2 = dateFormat.parse(date);
           java.sql.Date sqlDate = new java.sql.Date(date2.getTime());          
            ps=con.prepareStatement("insert into addstudent values(?,?,?,?,?,?,?,?)");
            ps.setInt(1,stuid);
            ps.setString(2,name);
            ps.setString(3,fname);
            ps.setString(4,address);
            ps.setLong(5, cont);
            ps.setDate(6,sqlDate);
            ps.setInt(7, fees);
            ps.setInt(8, fees);
//            ps.setDate(9, tdate);
            int res=ps.executeUpdate();
            if(res<0){
                JOptionPane.showMessageDialog(this,"Failed to Add student");
            }
                         
        } catch (HeadlessException | SQLException | ParseException ex) {
           JOptionPane.showMessageDialog(this,ex);
        }
       }
                int timing;
        int bookseat=-1;
        if(cb1.isSelected()==true)timing=5;
        else if(cb2.isSelected()==true)timing= 2;
        else timing=100;
        try{
            ps=con.prepareStatement("insert into bookseat values(?,?,?)");
            ps.setInt(1,stuid);
            ps.setInt(2,bookseat);
            ps.setInt(3, timing);
            int res=ps.executeUpdate();
            if(res<0)JOptionPane.showMessageDialog(this,"Timeing don't Add");
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this,e);
        }
        new BookSeat2().setVisible(true);
           this.dispose();
           new AddStudent().dispose();     
    }//GEN-LAST:event_b1ActionPerformed

    private void t6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t6FocusGained
         if(t6.getText().equals("yyyy-MM-dd")){
            t6.setText("");
            t6.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_t6FocusGained

    private void t6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t6FocusLost
        if(t6.getText().equals("")){
            t6.setText("yyyy-MM-dd");
            t6.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_t6FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t8.setText("");
            cb1.removeAll();
            cb2.removeAll();
            cb3.removeAll();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          new LibrarySection().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
             if(cb2.isSelected()==true||cb3.isSelected()==true){
            cb1.setSelected(false);
             }
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        if(cb1.isSelected()==true||cb3.isSelected()==true){
            cb2.setSelected(false);
        }
    }//GEN-LAST:event_cb2ActionPerformed

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

    private void t5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyTyped
if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_t5KeyTyped

    private void t8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t8KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_t8KeyTyped

    private void t6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t6KeyTyped
if(!(Character.isDigit(evt.getKeyChar())||(int)evt.getKeyChar()==45)){
            evt.consume();
        }
    }//GEN-LAST:event_t6KeyTyped

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t8;
    // End of variables declaration//GEN-END:variables
}
