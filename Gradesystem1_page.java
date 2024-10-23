/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mycompany_pinnacle;

/**
 *
 * @author admin
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Gradesystem1_page extends javax.swing.JFrame {

    /**
     * Creates new form Gradesystem1_page
     */
    public Gradesystem1_page() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FnameTF = new javax.swing.JTextField();
        LnameTF = new javax.swing.JTextField();
        StudentnoTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        prelimgrade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        midtermgrade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        finalgrade = new javax.swing.JTextField();
        YlevelTF = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        yearlevel = new javax.swing.JLabel();
        studentnumber = new javax.swing.JLabel();
        firstname1 = new javax.swing.JLabel();
        lastname1 = new javax.swing.JLabel();
        yearlevel1 = new javax.swing.JLabel();
        studentnumber1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        gpaTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        remarksTF = new javax.swing.JTextField();
        SubCalcbtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        getStudentid = new javax.swing.JTextField();
        Updatebtn = new javax.swing.JButton();

        jLabel13.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel13.setText("GPA:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Constantia", 1, 48)); // NOI18N
        jLabel1.setText("UNIVERSITY GRADING SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(114, 114, 114))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jSeparator1.setForeground(new java.awt.Color(51, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel4.setText("Profile");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel5.setText("First Name:");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel6.setText("Last Name:");

        jLabel7.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel7.setText("Year Level:");

        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel8.setText("Student No. :");

        FnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameTFActionPerformed(evt);
            }
        });

        LnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameTFActionPerformed(evt);
            }
        });

        StudentnoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentnoTFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel2.setText("Prelim grade:");

        prelimgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prelimgradeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel3.setText("Midterm grade:");

        jLabel10.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel10.setText("Final grade:");

        YlevelTF.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        YlevelTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st year BSCpE", "2nd year BSCpE", "3rd year BSCpE", "4th year BSCpE" }));
        YlevelTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YlevelTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YlevelTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(finalgrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(midtermgrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(prelimgrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(FnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(YlevelTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(StudentnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prelimgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(midtermgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(66, 66, 66))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jSeparator2.setForeground(new java.awt.Color(51, 255, 255));

        firstname.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        firstname.setText("First Name:");

        lastname.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lastname.setText("Last Name:");

        yearlevel.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        yearlevel.setText("Year Level:");

        studentnumber.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        studentnumber.setText("Student No. :");

        firstname1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        firstname1.setText("____________");

        lastname1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        lastname1.setText("____________");

        yearlevel1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        yearlevel1.setText("___________");

        studentnumber1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        studentnumber1.setText("___________");

        jLabel12.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel12.setText("GPA:");

        gpaTF.setEditable(false);
        gpaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaTFActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel14.setText("Remarks:");

        remarksTF.setEditable(false);
        remarksTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remarksTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(studentnumber)
                            .addComponent(lastname)
                            .addComponent(yearlevel)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstname)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstname1)
                            .addComponent(lastname1)
                            .addComponent(yearlevel1)
                            .addComponent(studentnumber1)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remarksTF, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname)
                    .addComponent(firstname1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastname)
                    .addComponent(lastname1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearlevel)
                    .addComponent(yearlevel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentnumber)
                    .addComponent(studentnumber1))
                .addGap(73, 73, 73)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remarksTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        SubCalcbtn.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        SubCalcbtn.setText("Submit and Calculate");
        SubCalcbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubCalcbtnActionPerformed(evt);
            }
        });

        Clearbtn.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Clearbtn.setText("Clear");
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });

        Deletebtn.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel11.setText("Search Student ID:");

        Updatebtn.setText("Update");
        Updatebtn.setMaximumSize(new java.awt.Dimension(72, 24));
        Updatebtn.setMinimumSize(new java.awt.Dimension(72, 24));
        Updatebtn.setPreferredSize(new java.awt.Dimension(72, 24));
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getStudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SubCalcbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(Clearbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(getStudentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(SubCalcbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameTFActionPerformed

    private void LnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameTFActionPerformed

    private void StudentnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentnoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentnoTFActionPerformed

    private void gpaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaTFActionPerformed

    private void prelimgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prelimgradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prelimgradeActionPerformed

    private void remarksTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remarksTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remarksTFActionPerformed

    private void SubCalcbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubCalcbtnActionPerformed

        String Firstname = FnameTF.getText();
        String Lastname = LnameTF.getText();
        String Studentnumber = StudentnoTF.getText();
        String Yearlevel = YlevelTF.getSelectedItem().toString();

        // Set the retrieved data to the respective labelZs
        firstname1.setText(Firstname);
        lastname1.setText(Lastname);
        studentnumber1.setText(Studentnumber);
        yearlevel1.setText(Yearlevel);

        String Prelim = prelimgrade.getText();
        String Midterm = midtermgrade.getText();
        String Final = finalgrade.getText();
        
        if (Firstname.isEmpty() && Lastname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input student info.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }if (Studentnumber.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please input student number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }

        //Declare remarks and gpa as variables
        String remarks = "";
        double gpa = 0;
        
        try {
            // Check if student number is numeric
            if (!Studentnumber.matches("\\d+")) {
                throw new NumberFormatException("Student number must be numeric.");

            }
            
            
            double Prelimgrade = Double.parseDouble(Prelim);
            double Midtermgrade = Double.parseDouble(Midterm);
            double Finalgrade = Double.parseDouble(Final);
            
            double average;
            
            
            //Error check for if input grade exceeding to 100 or less than 0
            if (Prelimgrade < 0 || Prelimgrade > 100) {
                throw new IllegalArgumentException("Prelim grade must be between 0 and 100.");
            }
            if (Midtermgrade < 0 || Midtermgrade > 100) {
                throw new IllegalArgumentException("Midterm grade must be between 0 and 100.");
            }
            if (Finalgrade < 0 || Finalgrade > 100) {
                throw new IllegalArgumentException("Final grade must be between 0 and 100.");
            }
            
            //Calculate Prelimgrade, Midterm and Final grade
            average = ((Prelimgrade + Midtermgrade + Finalgrade) / 3);

            
            //Check the condition of average to get gpa
            if (average >= 96 && average <= 100) {
                gpa = 1.0;
            } else if (average >= 92 && average < 96) {
                gpa = 1.25;
            } else if (average >= 88 && average < 92) {
                gpa = 1.50;
            } else if (average >= 84 && average < 88) {
                gpa = 1.75;
            } else if (average >= 80 && average < 84) {
                gpa = 2.0;
            } else if (average >= 75 && average < 80) {
                gpa = 2.25;
            } else if (average >= 70 && average < 75) {
                gpa = 2.50;
            } else if (average >= 65 && average < 70) {
                gpa = 2.75;
            } else if (average >= 60 && average < 65) {
                gpa = 3.0;
            } else {
                gpa = 5.0;
            }
            
            //Check the condition of gpa to get remarks
             if (gpa > 3.0) {
                remarks = "Failed";
            } else if (gpa >= 1.0 && gpa <= 3.0) {
                remarks = "Passed";
            } else {
                remarks = "Invalid";
            }

            // Format the average and gpa to 2 decimal places
            String formattedGPA = String.format("%.2f", gpa);

            // Set the formatted values to the text fields
            gpaTF.setText(formattedGPA);
            remarksTF.setText(remarks);
            
            try (FileWriter Writer = new FileWriter("gradingmanagementsystem.txt", true)) {
                Writer.write("First Name:" + " " + Firstname + " " + "Last Name:" + " " + 
                            Lastname + " " + "Student Number:" + " " + Studentnumber + " " + 
                            "Year Level:" + " " + Yearlevel + " " + "Prelim:" + " " + Prelimgrade + " " + "Midterm:" + " " 
                            + Midtermgrade + " " + "Final:" + " "+ Finalgrade + " " + 
                            "GPA:" + formattedGPA + " " + "Remarks:" + remarks);
                
                Writer.write(System.lineSeparator()); 
                JOptionPane.showMessageDialog(null, "Successfully Submitted!");
                
                setVisible(false);
                new Gradesystem1_page().setVisible(true);
                
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error writing to file!");
            }

        }catch (NumberFormatException e) {
            // Notify the user of invalid input
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
        }catch (IllegalArgumentException e) {
        // Notify the user of invalid grade range input
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Grade Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_SubCalcbtnActionPerformed

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        
        
        FnameTF.setText("");
        LnameTF.setText("");
        StudentnoTF.setText("");
        yearlevel1.setText("");

        // Set the retrieved data to the respective labelZs
        firstname1.setText("");
        lastname1.setText("");
        studentnumber1.setText("");

        prelimgrade.setText("");
        midtermgrade.setText("");
        finalgrade.setText("");
        
        gpaTF.setText("");
        remarksTF.setText("");
        
    }//GEN-LAST:event_ClearbtnActionPerformed

    private void YlevelTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YlevelTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YlevelTFActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        
        String StudenttoDelete = getStudentid.getText();
    
        // Check if student number is entered
        if (StudenttoDelete.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a student number to delete.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }if (!StudenttoDelete.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Student number must be numeric value to delete .", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;

        }

        File inputFile = new File("gradingmanagementsystem.txt"); // Original file
        File tempFile = new File("temp.txt"); // Temporary file for writing updated content

        boolean recordFound = false; // To check if the student number was found

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

        String currentLine;

        // Loop through each line in the file
        while ((currentLine = reader.readLine()) != null) {
            // Check if the line contains the student number to delete
            if (currentLine.contains("Student Number: " + StudenttoDelete)) {
                recordFound = true;
                continue; // Skip this line (i.e., delete it)
            }
            // Write all other lines to the temporary file
            writer.write(currentLine);
            writer.newLine();
            }

        // Show message based on whether the record was found or not
            if (recordFound) {
                JOptionPane.showMessageDialog(this, "Student record deleted successfully!");
            }else {
                JOptionPane.showMessageDialog(this, "Student number not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading/writing to file!", "File Error", JOptionPane.ERROR_MESSAGE);
        }

        // After processing, delete the original file and rename temp file
        if (recordFound) {
            // Delete original file
            if (inputFile.delete()) {
                // Rename temp file to original filename
                if (!tempFile.renameTo(inputFile)) {
                    JOptionPane.showMessageDialog(this, "Error renaming the file!", "File Error", JOptionPane.ERROR_MESSAGE);
                }
            }else {
            JOptionPane.showMessageDialog(this, "Error deleting the original file!", "File Error", JOptionPane.ERROR_MESSAGE);
        }
        }else {
        // If no record was found, delete the temp file to clean up
        tempFile.delete();  
    }
        
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        
        String StudenttoUpdate = getStudentid.getText();
    
        // Check if student number is entered
        if (StudenttoUpdate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a student number to update.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }if (!StudenttoUpdate.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Student number must be numeric value to delete .", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;

        }
        
        String updatedPrelimGrade = prelimgrade.getText();
        String updatedMidtermGrade = midtermgrade.getText();
        String updatedFinalGrade = finalgrade.getText();
        
        try {
            double prelimGrade = Double.parseDouble(updatedPrelimGrade);
            double midtermGrade = Double.parseDouble(updatedMidtermGrade);
            double finalGrade = Double.parseDouble(updatedFinalGrade);
        
            if (prelimGrade < 0 || prelimGrade > 100) {
                throw new IllegalArgumentException("Prelim grade must be between 0 and 100.");
            }
            if (midtermGrade < 0 || midtermGrade > 100) {
                throw new IllegalArgumentException("Midterm grade must be between 0 and 100.");
            }
            if (finalGrade < 0 || finalGrade > 100) {
                    throw new IllegalArgumentException("Final grade must be between 0 and 100.");
            }
        
                
        
            File inputFile = new File("gradingmanagementsystem.txt"); // Original file
            File tempFile = new File("temp.txt");
        
            boolean recordFound = false; // To check if the student number was found
        
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

                String currentLine;

                // Loop through each line in the file
                while ((currentLine = reader.readLine()) != null) {
                    // Check if the line contains the student number to delete
                    if (currentLine.contains("Student Number: " + StudenttoUpdate)) {
                        recordFound = true;
                
                    String[] studentData = currentLine.split(" ");
                    String firstName = studentData[2];
                    String lastName = studentData[5];
                    String studentNumber = studentData[8];
                
                    double average;
                    double gpa;
                    String remarks;

                    // Calculate GPA based on the updated grades    
                
                    average = ((prelimGrade + midtermGrade + finalGrade) / 3);

                    // GPA calculation logic (same as in your previous code)
                    if (average >= 96) gpa = 1.0;
                    else if (average >= 92) gpa = 1.25;
                    else if (average >= 88) gpa = 1.50;
                    else if (average >= 84) gpa = 1.75;
                    else if (average >= 80) gpa = 2.0;
                    else if (average >= 75) gpa = 2.25;
                    else if (average >= 70) gpa = 2.50;
                    else if (average >= 65) gpa = 2.75;
                    else if (average >= 60) gpa = 3.0;
                    else gpa = 5.0;

                    if (gpa > 3.0) {
                        remarks = "Failed";
                    }else if (gpa >= 1.0 && gpa <= 3.0) {
                        remarks = "Passed";
                    }else {
                        remarks = "Invalid";
                    }
                
                    String updatedRecord = String.format(
                        "First Name: %s Last Name: %s Student Number: %s Prelim: %.2f Midterm: %.2f "
                        + "Final: %.2f GPA: %.2f Remarks: %s",firstName, lastName, studentNumber, prelimGrade, 
                        midtermGrade, finalGrade, gpa, remarks
                    );

                    writer.write(updatedRecord);
                    writer.newLine();
                } else {

                // Write all other lines to the temporary file
                    writer.write(currentLine);
                    writer.newLine();
                    
                    recordFound = true;
                }
            }
        

                // Show message based on whether the record was found or not
                if (recordFound) {
                    JOptionPane.showMessageDialog(this, "Student grade updated successfully!");
                }else {
                    JOptionPane.showMessageDialog(this, "Student number not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error reading/writing to file!", "File Error", JOptionPane.ERROR_MESSAGE);
            }

            // After processing, delete the original file and rename the temp file
            if (recordFound) {
                if (inputFile.delete()) {
                    if (!tempFile.renameTo(inputFile)) {
                        JOptionPane.showMessageDialog(this, "Error renaming the file!", "File Error", JOptionPane.ERROR_MESSAGE);
                    }
                }else {
                    JOptionPane.showMessageDialog(this, "Error deleting the original file!", "File Error", JOptionPane.ERROR_MESSAGE);
                }
            }else {
                // If no record was found, delete the temp file to clean up
                tempFile.delete();
            }

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input: Please enter valid numeric grades.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
    }
        
        
        
    }//GEN-LAST:event_UpdatebtnActionPerformed

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
            java.util.logging.Logger.getLogger(Gradesystem1_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gradesystem1_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gradesystem1_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gradesystem1_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gradesystem1_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clearbtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTextField FnameTF;
    private javax.swing.JTextField LnameTF;
    private javax.swing.JTextField StudentnoTF;
    private javax.swing.JButton SubCalcbtn;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JComboBox<String> YlevelTF;
    private javax.swing.JTextField finalgrade;
    private javax.swing.JLabel firstname;
    private javax.swing.JLabel firstname1;
    private javax.swing.JTextField getStudentid;
    private javax.swing.JTextField gpaTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lastname;
    private javax.swing.JLabel lastname1;
    private javax.swing.JTextField midtermgrade;
    private javax.swing.JTextField prelimgrade;
    private javax.swing.JTextField remarksTF;
    private javax.swing.JLabel studentnumber;
    private javax.swing.JLabel studentnumber1;
    private javax.swing.JLabel yearlevel;
    private javax.swing.JLabel yearlevel1;
    // End of variables declaration//GEN-END:variables
}
