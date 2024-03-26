package librarymanagement;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
public class LibraryMgt extends javax.swing.JFrame {             
    public LibraryMgt() {         
         try{
            Class.forName("com.mysql.jdbc.Driver"); 
             int stuid=0;
             LocalDate ldToday = LocalDate.now();
                int todayDate = ldToday.getDayOfMonth();                
                int mon = ldToday.getMonthValue();       
                int year = ldToday.getYear();                            
           Connection con;
           PreparedStatement ps;
           ResultSet rs;         
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","root");
           ps = con.prepareStatement("select flag from flagtable");
           rs= ps.executeQuery();
           int data = -1;
           if(rs.next())
               data = rs.getInt(1);           
           while(data<=todayDate){
//               JOptionPane.showMessageDialog(this, data);
//               JOptionPane.showMessageDialog(this,"Mission Imposible Start");                   
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","root");
           ps = con.prepareStatement("select stuid,joindate from addstudent"); 
           rs= ps.executeQuery();
           while(rs.next()){
               stuid = rs.getInt(1);;
               String ddate = rs.getString(2);                                                         ;
//                JOptionPane.showMessageDialog(this,"Databases's "+stuid+" "+ddate);                                
                    LocalDate ld = LocalDate.parse(ddate);
                    int dday = ld.getDayOfMonth();
                    int dmont = ld.getMonthValue();
                    int dyear2 = ld.getYear();
                    if((dday==data&&mon!=dmont)||(dday==data&&mon==dmont&&year!=dyear2)){
//                       JOptionPane.showMessageDialog(this,"Mission Imposible Part 1");
                         ps = con.prepareStatement("select TotalFees,PerMonthFees from addstudent where joindate =? and stuid = ?");                               
                         ps.setString(1,ddate);                         
                         ps.setInt(2, stuid);                         
                         ResultSet rrs= ps.executeQuery();
                         int totalFees=0;
                         int perMonthFees=0;
                         if(rrs.next()){                                                                         
                             totalFees=rrs.getInt(1);
                             perMonthFees = rrs.getInt(2);
                             rrs.close();
                         }
//                         JOptionPane.showMessageDialog(this,"Databases's "+stuid+" "+ddate+" "+totalFees+" "+perMonthFees);                                
                         totalFees +=perMonthFees;
//                         JOptionPane.showMessageDialog(this,"Databases's "+stuid+" "+ddate+" "+totalFees+" "+perMonthFees);                                
                         ps = con.prepareStatement("update addstudent set totalfees =? where joindate =? and stuid = ?");
                         ps.setInt(1,totalFees);                                                
                         ps.setString(2,ddate);
                         ps.setInt(3, stuid);
                         ps.executeUpdate();                                                
                    }                   
                    }                                   
            data = data+1;           
           }          
                LocalDate tomorrow = ldToday.plusDays(1);
                int datetommorw = tomorrow.getDayOfMonth();
                ps = con.prepareStatement("update flagtable set flag = ?");
                ps.setInt(1,datetommorw);
                ps.executeUpdate();                                    
                setSize(Toolkit.getDefaultToolkit().getScreenSize());
                ImageIcon imicon = new ImageIcon(ClassLoader.getSystemResource("anne.png"));
                Image icon = imicon.getImage();
                setIconImage(icon);                                                    
         }
               catch(HeadlessException | ClassNotFoundException | SQLException e){
                   JOptionPane.showMessageDialog(this,e);
               }
               
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setBackground(new java.awt.Color(193, 150, 90));
        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t1.setText("Adminstrator Mode");
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 291, 78));

        jButton2.setBackground(new java.awt.Color(193, 150, 90));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Librarian Mode");
        jButton2.setMaximumSize(new java.awt.Dimension(151, 31));
        jButton2.setMinimumSize(new java.awt.Dimension(151, 31));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 291, 78));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        jLabel3.setText("LIBRARY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 410, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/Logo.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        jLabel2.setText("SWAMI VIVEKANANDA ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 880, 110));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/LibraryMgt.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        new AdminstrationLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new LibrarianLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new LibraryMgt().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton t1;
    // End of variables declaration//GEN-END:variables
}
