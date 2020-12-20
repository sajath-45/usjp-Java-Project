/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment.system;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author sajath
 */
public class EditComplaint extends javax.swing.JFrame {
    private JFileChooser openFileChooser;
    private File attachment;
    private String userRole;
    private Dashboard dashboard;
    private Complaint complaint;
    /**
     * Creates new form EditComplaint
     * @param complaint
     * @param dash
     */
    public EditComplaint(Complaint complaint,Dashboard dash) {
        try {
            System.out.println(complaint.toString());
            initComponents();
            setDashboard(dash);
            this.setVisible(true);
            setComplaint(complaint);
            setComplainTypeComboBox();
            setEditData();
       
            setFileChooser();
        } catch (ParseException ex) {
            Logger.getLogger(EditComplaint.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }

    private EditComplaint() {
    }
      public void setDashboard(Dashboard dash){
        this.dashboard=dash;
    }
     public Dashboard getDashboard(){
        return dashboard;
    }
     private void setComplaint(Complaint complain){
         this.complaint=complain;
     }
      public void setAttachment(File file){
         this.attachment=file;
     }
     private Complaint getComplaint(){
         return this.complaint;
     }
     private void setFileChooser(){
        openFileChooser =new JFileChooser();
    }
      private JFileChooser getFileChooser(){
        return new JFileChooser();
    }
     public File getAttachment(){
        return this.attachment;
    }
      
      
    private void setEditData() throws ParseException{
        
        actionTakenField.setEditable(true);  
        complainByText.setText(getComplaint().getStrComplaintBy());
        phoneNumber.setText(getComplaint().getPhoneNumber());
        descriptionField.setText(getComplaint().getStrDescription());
        actionTakenField.setText(getComplaint().getStrActionTaken());
        noteField.setText(getComplaint().getStrNote());
        complainTypeComboBox.setSelectedItem(getComplaint().getStrType());
        java.util.Date date=new SimpleDateFormat("dd/MM/yyyy").parse(getComplaint().getStrDate());
        complainDate.setDate(date);
        setAttachment(getComplaint().getAttachment());
        if(getAttachment().equals(null)){
        fileNameLabel.setText("no file choosen");
        }
        else{
             fileNameLabel.setText(getAttachment().getName());
        }
        
        }
    private void setComplainTypeComboBox(){
        ComplainRefference refference = new ComplainRefference();
        DefaultComboBoxModel newModel = new DefaultComboBoxModel(refference.getComplainTypes().toArray());
        complainTypeComboBox.setModel( newModel );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        complainTypeComboBox = new javax.swing.JComboBox<>();
        complainByText = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        descriptionField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        actionTakenField = new javax.swing.JTextField();
        noteField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        complainDate = new com.toedter.calendar.JDateChooser();
        openFIleBtn = new javax.swing.JButton();
        fileNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(85, 65, 118));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Complaint");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 0, 168, -1));

        jPanel7.setBackground(new java.awt.Color(85, 65, 118));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/icons8_delete1_32.png"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, -1, -1));

        jPanel8.setBackground(new java.awt.Color(85, 65, 118));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/icons8_minus1_32.png"))); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Back");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(85, 65, 118));
        jLabel2.setText("Complaint type");
        jPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 150, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(85, 65, 118));
        jLabel3.setText("Complaint By");
        jPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(85, 65, 118));
        jLabel4.setText("Phone No");
        jPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(85, 65, 118));
        jLabel5.setText("Description");
        jPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 120, 30));

        jPanel.add(complainTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 210, 30));
        jPanel.add(complainByText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 210, 30));

        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });
        jPanel.add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 210, 30));

        descriptionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionFieldActionPerformed(evt);
            }
        });
        jPanel.add(descriptionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 210, 110));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(85, 65, 118));
        jLabel6.setText("Date");
        jPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 80, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(85, 65, 118));
        jLabel7.setText("Action taken");
        jPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 120, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(85, 65, 118));
        jLabel8.setText("Note");
        jPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 100, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(85, 65, 118));
        jLabel9.setText("Attachment");
        jPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 120, 30));
        jPanel.add(actionTakenField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 200, 80));
        jPanel.add(noteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 200, 80));

        saveBtn.setBackground(new java.awt.Color(255, 255, 255));
        saveBtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(85, 65, 118));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, -1, 40));
        jPanel.add(complainDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 190, 30));

        openFIleBtn.setText("open File");
        openFIleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFIleBtnActionPerformed(evt);
            }
        });
        jPanel.add(openFIleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));
        jPanel.add(fileNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 200, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        this.dispose();
    }//GEN-LAST:event_jLabel10MousePressed

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
    }//GEN-LAST:event_jPanel8MouseExited

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void descriptionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionFieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
                    if(AlertService.optionalPlane("Would you like to edit the Complaint Record?", "Warning")==JOptionPane.YES_NO_OPTION){

        FileService.deleteRecord(FileService.getComplaintsFilePath(), getComplaint().toString());
        String complainType=complainTypeComboBox.getSelectedItem().toString();
        String complainBy=complainByText.getText();
        String mobile=phoneNumber.getText();
        String description=descriptionField.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String date=formatter.format(complainDate.getDate());
        String actionTaken=actionTakenField.getText();
        String note=noteField.getText();
        File file=this.attachment;

        //validate needed
        Complaint complain =new Complaint(complainType,date,complainBy,mobile,description,actionTaken,note,file);
        FileService.addLine(FileService.getComplaintsFilePath(),complain.toString());
                    }
        getDashboard().setTables();
        this.dispose();

    }//GEN-LAST:event_saveBtnActionPerformed

    private void openFIleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFIleBtnActionPerformed
        // TODO add your handling code here:
        int returnValue =openFileChooser.showOpenDialog(this);
        if(returnValue==JFileChooser.APPROVE_OPTION){
            attachment = openFileChooser.getSelectedFile();
            fileNameLabel.setText(attachment.getName());
        }
        else{
            attachment = null;
            fileNameLabel.setText("no file choosen");
        }
    }//GEN-LAST:event_openFIleBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EditComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditComplaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actionTakenField;
    private javax.swing.JTextField complainByText;
    private com.toedter.calendar.JDateChooser complainDate;
    private javax.swing.JComboBox<String> complainTypeComboBox;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField noteField;
    private javax.swing.JButton openFIleBtn;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}