
import java.sql.Connection;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilakshan
 */
public class insertnewresults extends javax.swing.JFrame {

    /**
     * Creates new form insertnewresults
     */
    public insertnewresults() {
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

        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        jComboBox19 = new javax.swing.JComboBox<>();
        jComboBox20 = new javax.swing.JComboBox<>();
        jComboBox21 = new javax.swing.JComboBox<>();
        jComboBox22 = new javax.swing.JComboBox<>();
        jComboBox23 = new javax.swing.JComboBox<>();
        jComboBox24 = new javax.swing.JComboBox<>();
        jComboBox25 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert New Results");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Registration NO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 40, 220, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(460, 40, 166, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Level");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 90, 220, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Semester");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 130, 220, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Earned Credits");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 410, 210, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level-1", "Level-2", "Level-3", "Level-4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(460, 80, 166, 29);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seme-1", "Seme-2" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(460, 130, 166, 29);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(450, 400, 166, 29);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Enter");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(360, 470, 112, 39);

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "ab" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox11);
        jComboBox11.setBounds(380, 200, 90, 29);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "IA 1001", "IA 1002", "IA 1003", "IA 1004", "IA 1005", "IA 1006", "IA 1007", "IA 1008", "IA 1009", "FT 1001", "FT 1002", "FT 1003", "FT 1004", "AT 1001", "AT 1002", "AT 1003", "AT 1004", "AT 1005", "AT 1006", "AT 1007", "ET 1001", "ET 1002", "ET 1003", "ET 1004", "ET 1005", "ET 1006", "ET 1007" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(200, 200, 88, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Course IDs");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 170, 116, 26);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Grade");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 170, 116, 26);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("GPV");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(510, 170, 90, 26);

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "IA 1001", "IA 1002", "IA 1003", "IA 1004", "IA 1005", "IA 1006", "IA 1007", "IA 1008", "IA 1009", "FT 1001", "FT 1002", "FT 1003", "FT 1004", "AT 1001", "AT 1002", "AT 1003", "AT 1004", "AT 1005", "AT 1006", "AT 1007", "ET 1001", "ET 1002", "ET 1003", "ET 1004", "ET 1005", "ET 1006", "ET 1007" }));
        getContentPane().add(jComboBox18);
        jComboBox18.setBounds(200, 280, 88, 29);

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "IA 1001", "IA 1002", "IA 1003", "IA 1004", "IA 1005", "IA 1006", "IA 1007", "IA 1008", "IA 1009", "FT 1001", "FT 1002", "FT 1003", "FT 1004", "AT 1001", "AT 1002", "AT 1003", "AT 1004", "AT 1005", "AT 1006", "AT 1007", "ET 1001", "ET 1002", "ET 1003", "ET 1004", "ET 1005", "ET 1006", "ET 1007" }));
        getContentPane().add(jComboBox19);
        jComboBox19.setBounds(200, 240, 88, 29);

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "IA 1001", "IA 1002", "IA 1003", "IA 1004", "IA 1005", "IA 1006", "IA 1007", "IA 1008", "IA 1009", "FT 1001", "FT 1002", "FT 1003", "FT 1004", "AT 1001", "AT 1002", "AT 1003", "AT 1004", "AT 1005", "AT 1006", "AT 1007", "ET 1001", "ET 1002", "ET 1003", "ET 1004", "ET 1005", "ET 1006", "ET 1007" }));
        getContentPane().add(jComboBox20);
        jComboBox20.setBounds(200, 320, 88, 29);

        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "IA 1001", "IA 1002", "IA 1003", "IA 1004", "IA 1005", "IA 1006", "IA 1007", "IA 1008", "IA 1009", "FT 1001", "FT 1002", "FT 1003", "FT 1004", "AT 1001", "AT 1002", "AT 1003", "AT 1004", "AT 1005", "AT 1006", "AT 1007", "ET 1001", "ET 1002", "ET 1003", "ET 1004", "ET 1005", "ET 1006", "ET 1007" }));
        getContentPane().add(jComboBox21);
        jComboBox21.setBounds(200, 360, 88, 29);

        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "ab" }));
        jComboBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox22ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox22);
        jComboBox22.setBounds(380, 240, 90, 29);

        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "ab" }));
        jComboBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox23ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox23);
        jComboBox23.setBounds(380, 320, 90, 29);

        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "ab" }));
        jComboBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox24ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox24);
        jComboBox24.setBounds(380, 280, 90, 29);

        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "ab" }));
        jComboBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox25ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox25);
        jComboBox25.setBounds(380, 360, 90, 29);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(520, 200, 90, 29);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(520, 280, 90, 29);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(520, 240, 90, 29);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(520, 320, 90, 29);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(520, 360, 90, 29);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(40, 500, 90, 34);

        jLabel9.setBackground(new java.awt.Color(255, 204, 255,100));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(138, 11, 530, 520);

        jLabel5.setIcon(new javax.swing.ImageIcon("G:\\UOC FOT\\3rd-Semester\\IA 2015 Computer Programming (Mini-Project)\\PROJ\\ExamsResultMonitoring\\src\\main\\java\\Results.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-2, 1, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String registration_no=(String)jTextField3.getText();
        String level=(String)jComboBox1.getSelectedItem();
        String semester=(String)jComboBox2.getSelectedItem();
        String course_01=(String)jComboBox4.getSelectedItem();
        String course_02=(String)jComboBox19.getSelectedItem();
        String course_03=(String)jComboBox18.getSelectedItem();
        String course_04=(String)jComboBox20.getSelectedItem();
        String course_05=(String)jComboBox21.getSelectedItem();
        String grade_01=(String)jComboBox11.getSelectedItem();
        String grade_02=(String)jComboBox22.getSelectedItem();
        String grade_03=(String)jComboBox24.getSelectedItem();
        String grade_04=(String)jComboBox23.getSelectedItem();
        String grade_05=(String)jComboBox25.getSelectedItem();
        String gpv_01=(String)jTextField2.getText();
        String gpv_02=(String)jTextField5.getText();
        String gpv_03=(String)jTextField4.getText();
        String gpv_04=(String)jTextField6.getText();
        String gpv_05=(String)jTextField7.getText();
        
        String earned_credits=(String)jTextField1.getText();
        
        if (registration_no.isEmpty() ||  earned_credits.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Entities should be filled");
        }
        else if (course_01 == "None" || grade_01 == "None" || gpv_01 == "None")
        {
            JOptionPane.showMessageDialog(null, "Entities should be filled");
        }
        else if (course_02 == "None" || grade_02 == "None" || gpv_02 == "None")
        {
            JOptionPane.showMessageDialog(null, "Entities should be filled");
        }
        else if (course_03 == "None" || grade_03 == "None" || gpv_03 == "None")
        {
            JOptionPane.showMessageDialog(null, "Entities should be filled");
        }
        else if (course_04 == "None" || grade_04 == "None" || gpv_04 == "None")
        {
            JOptionPane.showMessageDialog(null, "Entities should be filled");
        }
        else if (course_05 == "None" || grade_05 == "None" || gpv_05 == "None")
        {
            JOptionPane.showMessageDialog(null, "Entities should be filled");
        }
        
        else
        {
            try
            {
                ConnectToMySQL conClass =  new ConnectToMySQL();
                Connection con = conClass.makeConnect();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select *from student where registration_no='"+registration_no+"'");
                if(rs.next())
                    {
                        st.executeUpdate("insert into results(registration_no,level,semester,course_01,course_02,course_03,course_04,course_05,grade_01,grade_02,grade_03,grade_04,grade_05,gpv_01,gpv_02,gpv_03,gpv_04,gpv_05,earned_credits) values('"+registration_no+"','"+level+"','"+semester+"','"+course_01+"','"+course_02+"','"+course_03+"','"+course_04+"','"+course_05+"','"+grade_01+"','"+grade_02+"','"+grade_03+"','"+grade_04+"','"+grade_05+"','"+gpv_01+"','"+gpv_02+"','"+gpv_03+"','"+gpv_04+"','"+gpv_05+"','"+earned_credits+"')");
                        JOptionPane.showMessageDialog(null,"Successfully Updated");
                        setVisible(false);
                        new insertnewresults().setVisible(true);
                    }
                 else
                    {
                        JOptionPane.showMessageDialog(null, "Registeration Number does not exist in our database");
                        //setVisible(false);
                        //new insertnewresults().setVisible(true);
                    }
            }
            catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
        //new adminindex().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    String gpv_Aplus = "4.0";
    String gpv_A = "4.0";
    String gpv_Aminus = "3.7";
    String gpv_Bplus = "3.3";
    String gpv_B = "3.0";
    String gpv_Bminus = "2.7";
    String gpv_Cplus = "2.3";
    String gpv_C = "2.0";
    String gpv_Cminus = "1.7";
    String gpv_Dplus = "1.3";
    String gpv_D = "1.0";
    String gpv_E = "0.0";
    String gpv_ab = "0.0";
    
    
    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
        String grade_01=(String)jComboBox11.getSelectedItem();
        if (grade_01.equals ("A+"))
            jTextField2.setText(gpv_Aplus);
        else if (grade_01.equals("A"))
            jTextField2.setText(gpv_A);
        else if (grade_01.equals("A-"))
            jTextField2.setText(gpv_Aminus);
        else if (grade_01.equals("B+"))
            jTextField2.setText(gpv_Bplus);
        else if (grade_01.equals("B"))
            jTextField2.setText(gpv_B);
        else if (grade_01.equals ("B-"))
            jTextField2.setText(gpv_Bminus);
        else if (grade_01.equals("C+"))
            jTextField2.setText(gpv_Cplus);
        else if (grade_01.equals("C"))
            jTextField2.setText(gpv_C);
        else if (grade_01.equals("C-"))
            jTextField2.setText(gpv_Cminus);
        else if (grade_01.equals ("D+"))
            jTextField2.setText(gpv_Dplus);
        else if (grade_01.equals ("D"))
            jTextField2.setText(gpv_D);
        else if (grade_01.equals ("E"))
            jTextField2.setText(gpv_E);
        else if (grade_01.equals ("ab"))
            jTextField2.setText(gpv_ab);
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox22ActionPerformed
        // TODO add your handling code here:
        String grade_02=(String)jComboBox22.getSelectedItem();
        if (grade_02.equals ("A+"))
            jTextField5.setText(gpv_Aplus);
        else if (grade_02.equals("A"))
            jTextField5.setText(gpv_A);
        else if (grade_02.equals("A-"))
            jTextField5.setText(gpv_Aminus);
        else if (grade_02.equals("B+"))
            jTextField5.setText(gpv_Bplus);
        else if (grade_02.equals("B"))
            jTextField5.setText(gpv_B);
        else if (grade_02.equals ("B-"))
            jTextField5.setText(gpv_Bminus);
        else if (grade_02.equals("C+"))
            jTextField5.setText(gpv_Cplus);
        else if (grade_02.equals("C"))
            jTextField5.setText(gpv_C);
        else if (grade_02.equals("C-"))
            jTextField5.setText(gpv_Cminus);
        else if (grade_02.equals ("D+"))
            jTextField5.setText(gpv_Dplus);
        else if (grade_02.equals ("D"))
            jTextField5.setText(gpv_D);
        else if (grade_02.equals ("E"))
            jTextField5.setText(gpv_E);
        else if (grade_02.equals ("ab"))
            jTextField5.setText(gpv_ab);
    }//GEN-LAST:event_jComboBox22ActionPerformed

    private void jComboBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox24ActionPerformed
        // TODO add your handling code here:
        String grade_03=(String)jComboBox24.getSelectedItem();
        if (grade_03.equals ("A+"))
            jTextField4.setText(gpv_Aplus);
        else if (grade_03.equals("A"))
            jTextField4.setText(gpv_A);
        else if (grade_03.equals("A-"))
            jTextField4.setText(gpv_Aminus);
        else if (grade_03.equals("B+"))
            jTextField4.setText(gpv_Bplus);
        else if (grade_03.equals("B"))
            jTextField4.setText(gpv_B);
        else if (grade_03.equals ("B-"))
            jTextField4.setText(gpv_Bminus);
        else if (grade_03.equals("C+"))
            jTextField4.setText(gpv_Cplus);
        else if (grade_03.equals("C"))
            jTextField4.setText(gpv_C);
        else if (grade_03.equals("C-"))
            jTextField4.setText(gpv_Cminus);
        else if (grade_03.equals ("D+"))
            jTextField4.setText(gpv_Dplus);
        else if (grade_03.equals ("D"))
            jTextField4.setText(gpv_D);
        else if (grade_03.equals ("E"))
            jTextField4.setText(gpv_E);
        else if (grade_03.equals ("ab"))
            jTextField4.setText(gpv_ab);
    }//GEN-LAST:event_jComboBox24ActionPerformed

    private void jComboBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox23ActionPerformed
        // TODO add your handling code here:
        String grade_04=(String)jComboBox23.getSelectedItem();
        if (grade_04.equals ("A+"))
            jTextField6.setText(gpv_Aplus);
        else if (grade_04.equals("A"))
            jTextField6.setText(gpv_A);
        else if (grade_04.equals("A-"))
            jTextField6.setText(gpv_Aminus);
        else if (grade_04.equals("B+"))
            jTextField6.setText(gpv_Bplus);
        else if (grade_04.equals("B"))
            jTextField6.setText(gpv_B);
        else if (grade_04.equals ("B-"))
            jTextField6.setText(gpv_Bminus);
        else if (grade_04.equals("C+"))
            jTextField6.setText(gpv_Cplus);
        else if (grade_04.equals("C"))
            jTextField6.setText(gpv_C);
        else if (grade_04.equals("C-"))
            jTextField6.setText(gpv_Cminus);
        else if (grade_04.equals ("D+"))
            jTextField6.setText(gpv_Dplus);
        else if (grade_04.equals ("D"))
            jTextField6.setText(gpv_D);
        else if (grade_04.equals ("E"))
            jTextField6.setText(gpv_E);
        else if (grade_04.equals ("ab"))
            jTextField6.setText(gpv_ab);
    }//GEN-LAST:event_jComboBox23ActionPerformed

    private void jComboBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox25ActionPerformed
        // TODO add your handling code here:
        String grade_05=(String)jComboBox25.getSelectedItem();
        if (grade_05.equals ("A+"))
            jTextField7.setText(gpv_Aplus);
        else if (grade_05.equals("A"))
            jTextField7.setText(gpv_A);
        else if (grade_05.equals("A-"))
            jTextField7.setText(gpv_Aminus);
        else if (grade_05.equals("B+"))
            jTextField7.setText(gpv_Bplus);
        else if (grade_05.equals("B"))
            jTextField7.setText(gpv_B);
        else if (grade_05.equals ("B-"))
            jTextField7.setText(gpv_Bminus);
        else if (grade_05.equals("C+"))
            jTextField7.setText(gpv_Cplus);
        else if (grade_05.equals("C"))
            jTextField7.setText(gpv_C);
        else if (grade_05.equals("C-"))
            jTextField7.setText(gpv_Cminus);
        else if (grade_05.equals ("D+"))
            jTextField7.setText(gpv_Dplus);
        else if (grade_05.equals ("D"))
            jTextField7.setText(gpv_D);
        else if (grade_05.equals ("E"))
            jTextField7.setText(gpv_E);
        else if (grade_05.equals ("ab"))
            jTextField7.setText(gpv_ab);
    }//GEN-LAST:event_jComboBox25ActionPerformed
    
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
            java.util.logging.Logger.getLogger(insertnewresults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertnewresults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertnewresults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertnewresults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertnewresults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}