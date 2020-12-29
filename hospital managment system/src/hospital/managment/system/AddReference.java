/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment.system;

import hospital.managment.system.controllers.DashboardController;
import hospital.managment.system.controllers.ReferenceController;
import hospital.managment.system.models.FileService;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author sajath
 */
public class AddReference extends javax.swing.JFrame {
    private int selectionType;//selection type 1 is for complain refference and selection type 2 is for speciality reference
     private Dashboard dashboard;
     private ReferenceController controller;
    /**
     * Creates new form AddReference
     * @param type
     */
    public AddReference(int type,DashboardController controller) {
        initComponents();
        this.setVisible(true);
        // setDashboard(dash);
        setController(new ReferenceController( this,null,controller));
        getController().initController();
        
        
       if(type==1){
        //setSelectionType(1);
        //setSpecialityOption();
        }
       else if(type==2){
           editData();
           
       }
       
    }

    private AddReference() {
        
    }
   
    
    public void setSelectionType(int value){
        this.selectionType=value;
    }
    public void setDashboard(Dashboard dash){
        this.dashboard=dash;
    }
    public void setReferenceTextField(String name){
        this.referenceField.setText(name);
    }
    public void setController(ReferenceController controller){
        this.controller=controller;
    } 
    public ReferenceController getController(){
        return this.controller;
    }
    public int getSelectionType(){
        return this.selectionType;
    }
    public Dashboard getDashboard(){
        return dashboard;
    }
    public JTextField getReferenceTextField(){
        return this.referenceField;
    }
    public JButton getEnterReferenceBtn(){
        return this.enterReferenceBtn;
    }
    public JLabel getReferenceLabel(){
        return this.refferenceLabel;
    }
    public JButton getCancelBtn(){
        return this.cancelBtn;
    }
    
    public void editData(){
        
        
    }
    public JPanel getJpanel4(){
        return this.jPanel4;
    }
    public JPanel getJpanel5(){
        return this.jPanel5;
    }
    public JLabel getJlabel4(){
        return this.jLabel4;
    }
    public JLabel getJlabel5(){
        return this.jLabel5;
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
        specialityPanel = new javax.swing.JPanel();
        referenceField = new javax.swing.JTextField();
        refferenceLabel = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        enterReferenceBtn = new javax.swing.JButton();
        optionsPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(85, 65, 118));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Reference");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        refferenceLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        refferenceLabel.setText("Enter New Speaciality Reference");

        javax.swing.GroupLayout specialityPanelLayout = new javax.swing.GroupLayout(specialityPanel);
        specialityPanel.setLayout(specialityPanelLayout);
        specialityPanelLayout.setHorizontalGroup(
            specialityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(specialityPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(specialityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refferenceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(referenceField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        specialityPanelLayout.setVerticalGroup(
            specialityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, specialityPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refferenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(referenceField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanel1.add(specialityPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 87, 557, 110));

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 110, 40));

        enterReferenceBtn.setText("Enter");
        enterReferenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterReferenceBtnActionPerformed(evt);
            }
        });
        jPanel1.add(enterReferenceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, 40));

        optionsPanel.setBackground(new java.awt.Color(39, 55, 130));
        optionsPanel.setForeground(new java.awt.Color(39, 55, 130));
        optionsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(102, 0, 102));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Complani Reference");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(47, 47, 47))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        optionsPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 280, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(102, 0, 102));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Speciality Reference");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel5)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        optionsPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        jPanel1.add(optionsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 560, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel4MouseExited

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        //setComplainOption();

    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
       // setSpecialityOption();
    }//GEN-LAST:event_jPanel5MousePressed

    private void enterReferenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterReferenceBtnActionPerformed
        // TODO add your handling code here:
       // addSpeciality();
    }//GEN-LAST:event_enterReferenceBtnActionPerformed
    
   /* public void addSpeciality(){
        if(getSelectionType()==1){
             if(!FileService.isRecordExist(FileService.getSpecialityRefferenceFilePath(), getReferenceTextField().getText().toLowerCase())){
            FileService.addLine(FileService.getSpecialityRefferenceFilePath(), getReferenceTextField().getText());
            getDashboard().setTables();
            this.dispose();
             }
            else{
                JOptionPane.showMessageDialog(null, "Refference Alread Exist!");

            }
        }
        else if(getSelectionType()==2){
            if(!FileService.isRecordExist(FileService.getComplainRefferenceFilePath(), getReferenceTextField().getText().toLowerCase())){
             FileService.addLine(FileService.getComplainRefferenceFilePath(), getReferenceTextField().getText());
             getDashboard().setTables();
             this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Refference Alread Exist!");

            }
        }
        
        
    }*/
    
    /* public void setSpecialityOption(){
        resetHoverColor(jPanel4,jLabel4);
        setHoverColor(jPanel5,jLabel5);      
        setSelectionType(1);
        getReferenceLabel().setText("Enter New Speciality Refference");
                   
        
    }
    public void setComplainOption(){
        resetHoverColor(jPanel5,jLabel5);
        setHoverColor(jPanel4,jLabel4);
        setSelectionType(2);
        getReferenceLabel().setText("Enter New Complain Refference");
       
        
    }
     public void setHoverColor(JPanel panel,JLabel label){
                panel.setBackground(new Color(85,65,118));
                label.setForeground(Color.white);

    }
    
    public void resetHoverColor(JPanel panel,JLabel label){
                panel.setBackground(new Color(255,255,255));
                label.setForeground(new Color(102,0,102));

    }*/
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(AddReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReference().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton enterReferenceBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JTextField referenceField;
    private javax.swing.JLabel refferenceLabel;
    private javax.swing.JPanel specialityPanel;
    // End of variables declaration//GEN-END:variables
}
