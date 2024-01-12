
package librarymanagement;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shushank
 */
public class LibraryMgt extends javax.swing.JFrame {
    public LibraryMgt() {
               try{
                    ImageIcon imicon = new ImageIcon(ClassLoader.getSystemResource("anne.png"));
        Image icon = imicon.getImage();
        setIconImage(icon);
               }
               catch(NullPointerException e){
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
