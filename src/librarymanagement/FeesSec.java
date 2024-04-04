package librarymanagement;

import java.awt.Color;
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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shushank
 */
public class FeesSec extends javax.swing.JFrame {
        Connection con;
        PreparedStatement st;
        ResultSet rs;
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<String> al2=new ArrayList<>();

        /**
     * Creates new form BookSeat
     */
    public FeesSec() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        try{
            setSize(Toolkit.getDefaultToolkit().getScreenSize());
            ImageIcon imicon = new ImageIcon(ClassLoader.getSystemResource("anne.png"));
            Image icon = imicon.getImage();
            setIconImage(icon);
               
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement","root","root");
        JButton[] buttons= {jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9,jButton10,jButton11,jButton12,jButton13,jButton14,jButton15,jButton16,jButton17,jButton18,jButton19,jButton20,jButton21,jButton22,jButton23,jButton24,jButton25,jButton26,jButton27,jButton28,jButton29,jButton30,jButton31,jButton32,jButton33,jButton34,jButton35,jButton36,jButton37,jButton38,jButton39,jButton40,jButton41,jButton42,jButton43,jButton44,jButton45,jButton46,jButton47,jButton48,jButton49,jButton50,jButton52,jButton53,jButton54,jButton55,jButton56,jButton57,jButton58,jButton59,jButton60,jButton61,jButton62,jButton63,jButton64,jButton65,jButton66,jButton67,jButton68,jButton69,jButton69,jButton70,jButton71,jButton72,jButton73,jButton74,jButton75,jButton76,jButton77,jButton78,jButton79,jButton80,jButton81,jButton82,jButton83,jButton84,jButton85,jButton86,jButton87,jButton88,jButton89,jButton90,jButton91,jButton92,jButton93,jButton94,jButton95,jButton96,jButton97,jButton98,jButton99,jButton100,jButton101,jButton102,jButton103,jButton104};
        //Filling Color in button which has fees for paying
        st=con.prepareStatement("select bookseat.seatnum from bookseat inner join addstudent on addstudent.stuid  = bookseat.stuid and addstudent.TotalFees > 0");
        rs=st.executeQuery();
        while(rs.next()){
            al2.add(rs.getString(1));           
        }
        
        for(JButton button :buttons){
            if(al2.contains(button.getText())){
                button.setBackground(Color.red);
            }
        }
        //jButton1.setBackground(Color.red);                      
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this,e);
        }
    }
   public void checkDetails(int num){
        try{
            al.clear();
             st=con.prepareStatement("select seatnum from bookseat");
        rs=st.executeQuery();
        while(rs.next()){
            al.add(rs.getInt(1));           
        }      
        if(al.contains(num)){           
        int passnum=0;    
           st=con.prepareStatement("select stuid from bookseat where seatnum=?");
           st.setInt(1, num);
           rs=st.executeQuery();
           while(rs.next()){
               passnum=rs.getInt(1); 
               ShowStudentDetailForFees ssd=new ShowStudentDetailForFees(passnum);
               ssd.setVisible(true);
           }           
        }
        else{
               JOptionPane.showMessageDialog(this,"This Seat is Blank");
            }           
       }
       catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(this,e);
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        bookseat = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        viewbtn = new javax.swing.JButton();
        viewbtn1 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 20, 50, -1));

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 20, 50, -1));

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 50, -1));

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 50, -1));

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 20, 50, -1));

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 20, 50, -1));

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 20, 50, -1));

        jButton8.setText("11");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 20, -1, -1));

        jButton9.setText("8");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 20, 50, -1));

        jButton10.setText("9");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 20, 50, -1));

        jButton11.setText("10");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 20, -1, -1));

        jButton12.setText("12");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 20, -1, -1));

        jButton13.setText("13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 74, -1, -1));

        jButton14.setText("14");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 74, -1, -1));

        jButton15.setText("15");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 74, -1, -1));

        jButton16.setText("16");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 74, -1, -1));

        jButton17.setText("18");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 74, -1, -1));

        jButton18.setText("17");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 74, -1, -1));

        jButton19.setText("19");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 74, -1, -1));

        jButton20.setText("20");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 74, -1, -1));

        jButton23.setText("23");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 74, -1, -1));

        jButton21.setText("21");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 74, -1, -1));

        jButton22.setText("22");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 74, -1, -1));

        jButton24.setText("24");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 74, -1, -1));

        jButton25.setText("25");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 146, -1, -1));

        jButton26.setText("26");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 146, -1, -1));

        jButton27.setText("27");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 146, -1, -1));

        jButton28.setText("29");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 146, -1, -1));

        jButton29.setText("31");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 146, -1, -1));

        jButton30.setText("32");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 146, -1, -1));

        jButton31.setText("35");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 146, -1, -1));

        jButton32.setText("28");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 146, -1, -1));

        jButton33.setText("36");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 146, -1, -1));

        jButton34.setText("34");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 146, -1, -1));

        jButton35.setText("37");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 224, -1, -1));

        jButton36.setText("33");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 146, -1, -1));

        jButton37.setText("30");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 146, -1, -1));

        jButton38.setText("38");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 224, -1, -1));

        jButton39.setText("39");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 224, -1, -1));

        jButton40.setText("40");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 224, -1, -1));

        jButton41.setText("41");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 224, -1, -1));

        jButton42.setText("42");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 224, -1, -1));

        jButton43.setText("44");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 224, -1, -1));

        jButton44.setText("43");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 224, -1, -1));

        jButton45.setText("45");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 224, -1, -1));

        jButton46.setText("46");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 224, -1, -1));

        jButton47.setText("47");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 224, -1, -1));

        jButton48.setText("48");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 224, -1, -1));

        jButton49.setText("49");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 299, -1, -1));

        jButton50.setText("50");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 299, -1, -1));

        jButton51.setText("51");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 299, -1, -1));

        jButton52.setText("52");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 299, -1, -1));

        jButton53.setText("53");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 299, -1, -1));

        jButton54.setText("54");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 299, -1, -1));

        jButton55.setText("55");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 299, -1, -1));

        jButton56.setText("56");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 299, -1, -1));

        jButton57.setText("57");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 299, -1, -1));

        jButton58.setText("58");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 299, -1, -1));

        jButton59.setText("59");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton59, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 299, -1, -1));

        jButton60.setText("60");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton60, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 299, -1, -1));

        jButton61.setText("61");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 374, -1, -1));

        jButton62.setText("62");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 374, -1, -1));

        jButton63.setText("63");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton63, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 374, -1, -1));

        jButton64.setText("64");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 374, -1, -1));

        jButton65.setText("65");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton65, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 374, -1, -1));

        jButton66.setText("66");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 374, -1, -1));

        jButton67.setText("67");
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 374, -1, -1));

        jButton68.setText("68");
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 374, -1, -1));

        jButton69.setText("69");
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 374, -1, -1));

        jButton70.setText("70");
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 374, -1, -1));

        jButton71.setText("71");
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 374, -1, -1));

        jButton72.setText("72");
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton72, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 374, -1, -1));

        jButton73.setText("73");
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton73, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 434, -1, -1));

        jButton74.setText("74");
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 434, -1, -1));

        jButton75.setText("75");
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 434, -1, -1));

        jButton76.setText("76");
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton76, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 434, -1, -1));

        jButton77.setText("77");
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 434, -1, -1));

        jButton78.setText("78");
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 434, -1, -1));

        jButton79.setText("79");
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton79, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 434, -1, -1));

        jButton80.setText("80");
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton80, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 434, -1, -1));

        jButton81.setText("81");
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 434, -1, -1));

        jButton82.setText("82");
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton82, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 434, -1, -1));

        jButton83.setText("83");
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton83, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 434, -1, -1));

        jButton84.setText("84");
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton84, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 434, -1, -1));

        jButton85.setText("85");
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 500, -1, -1));

        jButton86.setText("86");
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton86, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        jButton87.setText("87");
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton87, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 500, -1, -1));

        jButton88.setText("88");
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton88, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 500, -1, -1));

        jButton89.setText("89");
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton89, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 500, -1, -1));

        jButton90.setText("90");
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton90, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 500, -1, -1));

        jButton91.setText("91");
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton91, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 500, -1, -1));

        jButton92.setText("92");
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton92, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 500, -1, -1));

        jButton93.setText("93");
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton93, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 500, -1, -1));

        jButton94.setText("94");
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton94, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 500, -1, -1));

        jButton95.setText("95");
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton95, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 500, -1, -1));

        jButton96.setText("96");
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton96, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 500, -1, -1));

        jButton97.setText("98");
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton97, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, -1, -1));

        jButton98.setText("97");
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton98, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 578, -1, -1));

        jButton99.setText("99");
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton99, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 578, -1, -1));

        jButton100.setText("100");
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 578, -1, -1));

        jButton101.setText("101");
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton101, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 578, -1, -1));

        jButton102.setText("102");
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton102, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 578, -1, -1));

        jButton104.setText("104");
        jButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton104ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton104, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 578, -1, -1));

        jButton103.setText("103");
        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton103, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 578, -1, -1));

        jButton107.setBackground(new java.awt.Color(204, 255, 255));
        jButton107.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jButton107.setText("Home");
        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton107, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 380, 250, 40));

        bookseat.setBackground(new java.awt.Color(204, 255, 255));
        bookseat.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        bookseat.setText("Add Fees");
        bookseat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookseatActionPerformed(evt);
            }
        });
        getContentPane().add(bookseat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 90, 250, 40));

        tf1.setBackground(new java.awt.Color(255, 204, 255));
        tf1.setForeground(new java.awt.Color(153, 153, 153));
        tf1.setText("Enter StudentId");
        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf1FocusLost(evt);
            }
        });
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
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 250, 50));

        viewbtn.setBackground(new java.awt.Color(204, 255, 255));
        viewbtn.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        viewbtn.setText("View Fees History");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 230, 250, 40));

        viewbtn1.setBackground(new java.awt.Color(204, 255, 255));
        viewbtn1.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        viewbtn1.setText("View All Student Fees");
        viewbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(viewbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 160, 250, 40));

        jButton105.setBackground(new java.awt.Color(204, 255, 255));
        jButton105.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jButton105.setText("Manually Update");
        jButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton105ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton105, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 300, 250, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/Ori.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int num=Integer.parseInt(jButton1.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int num=Integer.parseInt(jButton2.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int num=Integer.parseInt(jButton3.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int num=Integer.parseInt(jButton4.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int num=Integer.parseInt(jButton5.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int num=Integer.parseInt(jButton6.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int num=Integer.parseInt(jButton7.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int num=Integer.parseInt(jButton8.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int num=Integer.parseInt(jButton9.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int num=Integer.parseInt(jButton10.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int num=Integer.parseInt(jButton11.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int num=Integer.parseInt(jButton12.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int num=Integer.parseInt(jButton13.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
                int num=Integer.parseInt(jButton14.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
                int num=Integer.parseInt(jButton15.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
                int num=Integer.parseInt(jButton16.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
                int num=Integer.parseInt(jButton17.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
                int num=Integer.parseInt(jButton18.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
                int num=Integer.parseInt(jButton19.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
                int num=Integer.parseInt(jButton20.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
                int num=Integer.parseInt(jButton23.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
                int num=Integer.parseInt(jButton21.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
                int num=Integer.parseInt(jButton22.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
                int num=Integer.parseInt(jButton24.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
                int num=Integer.parseInt(jButton25.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
                int num=Integer.parseInt(jButton26.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
                int num=Integer.parseInt(jButton27.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        int num=Integer.parseInt(jButton28.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        int num=Integer.parseInt(jButton29.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        int num=Integer.parseInt(jButton30.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        int num=Integer.parseInt(jButton31.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        int num=Integer.parseInt(jButton32.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        int num=Integer.parseInt(jButton33.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        int num=Integer.parseInt(jButton34.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        int num=Integer.parseInt(jButton35.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        int num=Integer.parseInt(jButton36.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        int num=Integer.parseInt(jButton37.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        int num=Integer.parseInt(jButton38.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        int num=Integer.parseInt(jButton39.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        int num=Integer.parseInt(jButton40.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        int num=Integer.parseInt(jButton41.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        int num=Integer.parseInt(jButton42.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        int num=Integer.parseInt(jButton43.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        int num=Integer.parseInt(jButton44.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        int num=Integer.parseInt(jButton45.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        int num=Integer.parseInt(jButton46.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        int num=Integer.parseInt(jButton47.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        int num=Integer.parseInt(jButton48.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        int num=Integer.parseInt(jButton49.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        int num=Integer.parseInt(jButton50.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        int num=Integer.parseInt(jButton51.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        int num=Integer.parseInt(jButton52.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        int num=Integer.parseInt(jButton53.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        int num=Integer.parseInt(jButton54.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        int num=Integer.parseInt(jButton55.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        int num=Integer.parseInt(jButton56.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        int num=Integer.parseInt(jButton57.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        int num=Integer.parseInt(jButton58.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        int num=Integer.parseInt(jButton59.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        int num=Integer.parseInt(jButton60.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        int num=Integer.parseInt(jButton61.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        int num=Integer.parseInt(jButton62.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        int num=Integer.parseInt(jButton63.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        int num=Integer.parseInt(jButton64.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        int num=Integer.parseInt(jButton65.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        int num=Integer.parseInt(jButton66.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        int num=Integer.parseInt(jButton67.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        int num=Integer.parseInt(jButton68.getActionCommand());
        this.checkDetails(num);

    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        int num=Integer.parseInt(jButton69.getActionCommand());
        this.checkDetails(num);

    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        int num=Integer.parseInt(jButton70.getActionCommand());
        this.checkDetails(num);

    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        int num=Integer.parseInt(jButton71.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        int num=Integer.parseInt(jButton72.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        int num=Integer.parseInt(jButton73.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        int num=Integer.parseInt(jButton74.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        int num=Integer.parseInt(jButton75.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        int num=Integer.parseInt(jButton76.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        int num=Integer.parseInt(jButton77.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        int num=Integer.parseInt(jButton78.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        int num=Integer.parseInt(jButton79.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        int num=Integer.parseInt(jButton80.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        int num=Integer.parseInt(jButton81.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        int num=Integer.parseInt(jButton82.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        int num=Integer.parseInt(jButton83.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        int num=Integer.parseInt(jButton84.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        int num=Integer.parseInt(jButton85.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        int num=Integer.parseInt(jButton86.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        int num=Integer.parseInt(jButton87.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        int num=Integer.parseInt(jButton88.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        int num=Integer.parseInt(jButton89.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        int num=Integer.parseInt(jButton90.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        int num=Integer.parseInt(jButton91.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        int num=Integer.parseInt(jButton92.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        int num=Integer.parseInt(jButton93.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        int num=Integer.parseInt(jButton94.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        int num=Integer.parseInt(jButton95.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        int num=Integer.parseInt(jButton96.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        int num=Integer.parseInt(jButton97.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        int num=Integer.parseInt(jButton98.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        int num=Integer.parseInt(jButton99.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        int num=Integer.parseInt(jButton100.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        int num=Integer.parseInt(jButton101.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
        int num=Integer.parseInt(jButton102.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton104ActionPerformed
        int num=Integer.parseInt(jButton104.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton104ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
        int num=Integer.parseInt(jButton103.getActionCommand());
        this.checkDetails(num);
    }//GEN-LAST:event_jButton103ActionPerformed

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton107ActionPerformed
        new ModifySection().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton107ActionPerformed

    private void bookseatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookseatActionPerformed
        int num = Integer.parseInt(tf1.getText());
        if(tf1.getText().equals("Enter StudentId")){
            JOptionPane.showMessageDialog(this,"Please Enter StudentId or SeatNum");
        }
        else{
            if(num>104&&num<1000||num>2000){
                JOptionPane.showMessageDialog(this,"Data not found");
            }
            else{
            num = Integer.parseInt(tf1.getText());
                new FeesSubmit(num).setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_bookseatActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained
            if(tf1.getText().equals("Enter StudentId")){
            tf1.setText("");
            tf1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tf1FocusGained

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
            if(tf1.getText().equals("")){
            tf1.setText("Enter StudentId");
            tf1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tf1FocusLost

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        if(tf1.getText().equals("Enter StudentId")){
            JOptionPane.showMessageDialog(this," Please Enter StudentId or SeatNum ");
        }
        else{
            int num = Integer.parseInt(tf1.getText());            
            new ViewFeesHistoryStudent(num).setVisible(true);            
        }
    }//GEN-LAST:event_viewbtnActionPerformed

    private void viewbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn1ActionPerformed
                new ViewAllStudentFees().setVisible(true);
    }//GEN-LAST:event_viewbtn1ActionPerformed

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped
if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_tf1KeyTyped

    private void jButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton105ActionPerformed
         if(tf1.getText().equals("Enter StudentId")){
            JOptionPane.showMessageDialog(this," Please Enter StudentId or SeatNum ");
        }
        else{            
            new ManuallyFeesSubmit(Integer.parseInt(tf1.getText())).setVisible(true);            
        }    
        
            
    }//GEN-LAST:event_jButton105ActionPerformed

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(() -> {
            new FeesSec().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookseat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tf1;
    private javax.swing.JButton viewbtn;
    private javax.swing.JButton viewbtn1;
    // End of variables declaration//GEN-END:variables
}
