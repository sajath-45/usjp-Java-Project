/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment.system;

import hospital.managment.system.controllers.DashboardController;
import hospital.managment.system.controllers.VisitorController;
import com.toedter.calendar.JDateChooser;
import hospital.managment.system.models.PipeService;
import hospital.managment.system.models.Visitor;
import java.io.File;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sangeerthana
 */
public class AddVisitors extends javax.swing.JFrame {
    private JFileChooser openFileChooser;
    private File attachment;
    private Dashboard dashboard;
    private Visitor visitor;
    private VisitorController controller;

    /**
     * Creates new form addVisitors
     */
    public AddVisitors(Dashboard dash,Visitor visitor,DashboardController controller,int type) {
        initComponents();
        setDashboard(dash);
        setVisitor(visitor);
        setController(new VisitorController( getVisitor(),this,controller));
        getController().initController();
        getAddVisitorBtn().addActionListener(getController());
        if(type==1){
            getAddVisitorBtn().setText("Add");
            getDateChooser().setDate(new Date());
        }
        else if(type==2){
            getAddVisitorBtn().setText("Save");
            setEditData();
        }
         
        
    }

    public AddVisitors() {
    }
    
    public void setDashboard(Dashboard dash){
        this.dashboard=dash;
    }
    public void setController(VisitorController controller){
        this.controller=controller;
    }
    public void setVisitor(Visitor visitor){
         this.visitor=visitor;
     }
    public void setFileChooser(){
        this.openFileChooser =new JFileChooser();
        
    }
    public void setAttachment(File file){
        this.attachment=file;
    }
    public void setPurposeField(String purpose){
         this.purposeField.setText(purpose);
    }
    public void setIdCardField(String id){
         this.idField.setText(id);
    }
    public void setNoteField(String note){
         this.noteField.setText(note);
    }
    public void setPhoneNumberField(String number){
         this.phoneNumberField.setText(number);
    }
    public void setNameField(String name){
         this.nameField.setText(name);
    }
    public void setInTimeField(String time){
         this.inTimeField.setText(time);
    }
    public void setOutTimeField(String time){
         this.outTimeField.setText(time);
    }
    public void setDateChooser(String date){
         this.dateField.setDate(PipeService.getStringToDateFormat(date));
    }
    public void setFileLabel(String name){
         this.fileNameLable.setText(name);
    } 
    public void setEditData(){
        setNameField(getVisitor().getStrName());
        setNoteField(getVisitor().getStrNote());
        setIdCardField(getVisitor().getId());
        setDateChooser(getVisitor().getStrDate());
        setPhoneNumberField(getVisitor().getPhoneNo());
        setPurposeField(getVisitor().getStrPurpose());
        setFileLabel(getVisitor().getAttachment().getName());
        setAttachment(getVisitor().getAttachment());
        setOutTimeField(getVisitor().getStrOutTime());
        setInTimeField(getVisitor().getStrInTime());
        
        
        
    }
    
     
     
     
     
    public Dashboard getDashboard(){
        return dashboard;
    }
    public VisitorController getController(){
        return this.controller;
    }
    public Visitor getVisitor(){
        return this.visitor;
    }
    public JTextField getPurposeField(){
        return this.purposeField;
    }
    public JTextField getIdCardField(){
        return this.idField;
    }
    public JTextField getNoteField(){
        return this.noteField;
    }
    public JTextField getPhoneNumberField(){
        return this.phoneNumberField;
    }
    public JTextField getNameField(){
        return this.nameField;
    }
    public JTextField getInTimeField(){
        return this.inTimeField;
    }
    public JTextField getOutTimeField(){
        return this.outTimeField;
    }
    public JDateChooser getDateChooser(){
        return this.dateField;
    }
    public File getAttachment(){
        return attachment;
    }
    public JLabel getFileLabel(){
        return this.fileNameLable;
    }
    public JFileChooser getFileChooser(){
        return this.openFileChooser;
    }
    public JButton getAddVisitorBtn(){
        return this.addVisitorBtn;
    }
    public JButton getOpenFileChooserBtn(){
        return this.openFileChooserBtn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        purposeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        inTimeField = new javax.swing.JTextField();
        outTimeField = new javax.swing.JTextField();
        noteField = new javax.swing.JTextField();
        addVisitorBtn = new javax.swing.JButton();
        openFileChooserBtn = new javax.swing.JButton();
        fileNameLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setForeground(new java.awt.Color(85, 65, 118));
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(890, 635));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(85, 65, 118));
        jPanel2.setPreferredSize(new java.awt.Dimension(890, 43));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add  Visitors");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 0, 151, 41));

        jPanel3.setBackground(new java.awt.Color(85, 65, 118));
        jPanel3.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/icons8_delete1_32.png"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(85, 65, 118));
        jPanel4.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(85, 65, 118));
        jLabel2.setText("Purpose");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, -1));
        jPanel1.add(purposeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(85, 65, 118));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 80, 20));
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 200, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(85, 65, 118));
        jLabel4.setText("Id");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, 20));
        jPanel1.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(85, 65, 118));
        jLabel5.setText("Phone No");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 100, 20));
        jPanel1.add(dateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 200, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(85, 65, 118));
        jLabel6.setText("Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 90, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(85, 65, 118));
        jLabel7.setText("In Time");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 90, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(85, 65, 118));
        jLabel8.setText("Out Time");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 90, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(85, 65, 118));
        jLabel9.setText("Note");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 90, 20));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(85, 65, 118));
        jLabel10.setText("Attachment");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 110, 20));
        jPanel1.add(phoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 200, 30));
        jPanel1.add(inTimeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 200, 30));
        jPanel1.add(outTimeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 200, 30));
        jPanel1.add(noteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 200, 90));

        addVisitorBtn.setBackground(new java.awt.Color(255, 255, 255));
        addVisitorBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        addVisitorBtn.setForeground(new java.awt.Color(85, 65, 118));
        addVisitorBtn.setText("Add");
        addVisitorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVisitorBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addVisitorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, 40));

        openFileChooserBtn.setText("choose");
        openFileChooserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileChooserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(openFileChooserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));
        jPanel1.add(fileNameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void openFileChooserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileChooserBtnActionPerformed
        // TODO add your handling code here:
       /* int returnValue =openFileChooser.showOpenDialog(this);
            if(returnValue==JFileChooser.APPROVE_OPTION){
                attachment = openFileChooser.getSelectedFile();
                fileNameLable.setText(attachment.getName());
            }
            else{
                 attachment = null;
                 fileNameLable.setText("no file choosen");
            }*/
    }//GEN-LAST:event_openFileChooserBtnActionPerformed

    private void addVisitorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVisitorBtnActionPerformed
        // TODO add your handling code here:
        
     /*   String purpose=getPurposeField().getText();
        String idCard=getIdCardField().getText();
        String name=getNameField().getText();
        String mobile=getPhoneNumberField().getText();
        String note=getNoteField().getText();
        String inTime=getInTimeField().getText();
        String outTime=getOutTimeField().getText();
        String date=PipeService.getDateSimpleFormat(getDateChooser().getDate()); 
        File file=this.attachment;
        Visitor newVisitor= new Visitor(purpose,name,date,idCard,mobile,inTime,outTime,note,file);            
        FileService.addLine(FileService.getVisitorsFilePath(),newVisitor.toString());
        getDashboard().setTables();
        this.dispose();
           */
        
        
    }//GEN-LAST:event_addVisitorBtnActionPerformed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
       
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
    }//GEN-LAST:event_jPanel4MouseExited

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
           this.dispose();
    }//GEN-LAST:event_jLabel12MousePressed

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
            java.util.logging.Logger.getLogger(AddVisitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVisitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVisitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVisitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVisitors().setVisible(true);
            }
        });
    }
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVisitorBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel fileNameLable;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField inTimeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField noteField;
    private javax.swing.JButton openFileChooserBtn;
    private javax.swing.JTextField outTimeField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField purposeField;
    // End of variables declaration//GEN-END:variables
}
