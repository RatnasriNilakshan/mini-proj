
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nilak
 */
public class adminaccount extends javax.swing.JFrame {

    /**
     * Creates new form adminaccount
     */

    public adminaccount(logineduser user) {
        initComponents();
        show_lecturer(user);
    }
    




    private void show_lecturer(logineduser user) 
    {
        
          
                
                jTextField1.setText(user.getuser_name());
                jTextField2.setText(user.getdepartment());
                jTextField3.setText(user.getuser_type());
                jPasswordField1.setText(user.getpassword());
        
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
                jTextField3.setEditable(false);
                jPasswordField1.setEditable(false);
                
    }



       
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 200, 70, 21);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Confirm Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 350, 128, 21);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Department");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 100, 85, 21);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("User Type");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 150, 70, 21);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(340, 50, 220, 29);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(340, 100, 220, 29);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(340, 150, 220, 29);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(340, 200, 220, 29);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(70, 380, 170, 29);
        getContentPane().add(jPasswordField3);
        jPasswordField3.setBounds(280, 380, 170, 29);

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Reset password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 300, 160, 21);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 320, 640, 10);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 50, 42, 21);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("New Password");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 350, 110, 21);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 380, 94, 29);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 470, 90, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\UOC FOT\\3rd-Semester\\IA 2015 Computer Programming (Mini-Project)\\PROJ\\ExamsResultMonitoring\\src\\main\\java\\Admin.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String newpassword= EncryptionUtil.endcrypt(jPasswordField2.getText());
        String confirmpassword= EncryptionUtil.endcrypt(jPasswordField3.getText());
        String username = jTextField1.getText();
        if (newpassword.isEmpty() ||  confirmpassword.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Entities should be filled");
        }
        else
        {
            if (newpassword.equals(confirmpassword)) {
                try{
                ConnectToMySQL conClass =  new ConnectToMySQL();
                Connection con = conClass.makeConnect();
                Statement st=con.createStatement();
                st.executeUpdate("UPDATE users SET password = ('"+newpassword+"') WHERE user_name = ('"+username+"') ");
                JOptionPane.showMessageDialog(null,"Successfully Updated");
                
                setVisible(false);
                new adminindex().setVisible(true);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                } 
            } 
            else {
                JOptionPane.showMessageDialog(null, "Password miss-match");
            }
   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
