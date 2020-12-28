/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment.system;

import hospital.managment.system.models.FileService;
import hospital.managment.system.models.SpecialityRefference;
import hospital.managment.system.models.MedicalOfficer;
import hospital.managment.system.models.Patient;
import hospital.managment.system.models.Appointment;
import hospital.managment.system.models.CurrentUser;
import hospital.managment.system.models.PipeService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sajath
 */
public class AppointmentController implements ActionListener  {
    private AppointmentView view;
    private Appointment model;
    private DashboardController dashboard;

    
    public AppointmentController(Appointment model,AppointmentView view,DashboardController dashboard){
        setModel(model);
        setView(view);
        setDashboardController(dashboard);
    }
    
    public void setModel(Appointment model){
        this.model=model;
    }
    public void setView(AppointmentView view){
        this.view=view;
    }
     public void setDashboardController(DashboardController dash){
        this.dashboard=dash;
    }
    public AppointmentView getView(){
        return this.view;
    }
    public Appointment getModel(){
        return this.model;
    }
     public DashboardController getDashboardController(){
        return dashboard;
    }
    public void initController(){
        createSpecialityComboBox();
        //createDoctorComboBox("cardio");
        createPatientComboBox();
        getView().getSpecialityComboBox().addActionListener ((ActionEvent e) -> {
            System.out.println(e.getActionCommand());
            this.createDoctorComboBox(getView().getSpecialityComboBox().getSelectedItem().toString());
        });
     
    }
    
      
    private void createSpecialityComboBox(){
        SpecialityRefference refference=new SpecialityRefference();
        DefaultComboBoxModel newModel = new DefaultComboBoxModel(refference.getSpecialityTypes().toArray());
         getView().getSpecialityComboBox().setModel( newModel );
         this.createDoctorComboBox(getView().getSpecialityComboBox().getSelectedItem().toString());
         
    }
    private void createPatientComboBox(){
        Object[] items= FileService.getAllPatients().toArray();
         DefaultComboBoxModel newModel = new DefaultComboBoxModel(items);
         getView().getPatientComboBox().setModel( newModel );     
        
        
    }
    private void  createDoctorComboBox(String speciality){
        if(!"".equals(speciality)){
        Object[] items= FileService.getMoBySpeciality(speciality).toArray();     
               getView().getMedicalOfficerComboBox().setModel( new DefaultComboBoxModel(items) );
        }
        
    }
    
    
    public void addAppoinment(){
        getModel().setAppointmentNumber(getView().getAppointmentNumber());
         getModel().setAppointmentDate(PipeService.getDateSimpleFormat(getView().getDateChooser().getDate()));
         getModel().setPatient((Patient) getView().getPatientComboBox().getSelectedItem());
         getModel().setMedicalOfficer((MedicalOfficer) getView().getMedicalOfficerComboBox().getSelectedItem());
         String time=Integer.toString((Integer) getView().getTimeHourChooser().getValue())+ " "+Integer.toString((Integer) getView().getTimeMinuteChooser().getValue())+" "+ getView().getTimeSegmentChooser().getSelectedItem().toString();
         getModel().setAppointmentTime(time);
         getModel().setSpeciality(getView().getSpecialityComboBox().getSelectedItem().toString());
         getModel().setStatus(getView().getAppoinmentStatus());
         getModel().setSymtomps(getView().getSysmtompsTextField().getText());
        FileService.addLine(FileService.getAppointmentsFilePath(),getModel().toString());
      
         this.closeView();
    }
    public  void deleteAppoinment(){
      if(AlertService.optionalPlane("Would you like to Delete the Appoinment Record?", "Warning!")==JOptionPane.YES_NO_OPTION){
        FileService.deleteRecord(FileService.getAppointmentsFilePath(),getModel().toString());     
        
                    
      }
       this.closeView();              
    
    }
    public void approveAppointment(){
        FileService.deleteRecord(FileService.getAppointmentsFilePath(),getModel().toString());     
        getModel().setStatus("Approved");
        FileService.addLine(FileService.getAppointmentsFilePath(),getModel().toString());
                    
      
       this.closeView();
        
        
    }
    public void editAppointment(){
        if(AlertService.optionalPlane("Would you like to Edit the Appointment Record?", "Warning!")==JOptionPane.YES_NO_OPTION){
        FileService.deleteRecord(FileService.getAppointmentsFilePath(),getModel().toString());     
        
                addAppoinment();    
      }
        closeView();
        
    }
    
    public void closeView(){
         if(CurrentUser.getUserRole().equalsIgnoreCase("Patient")){
            getDashboardController().getPatientAppointmentTable(CurrentUser.getUser().getIdCardNo());
        }
         else if(CurrentUser.getUserRole().equalsIgnoreCase("Receptionist")){
             getDashboardController().getAllAppointment();
            
        }
          else if(CurrentUser.getUserRole().equalsIgnoreCase("MedicalOfficer")){
             getDashboardController().getMOAppointmentTable(CurrentUser.getUser().getIdCardNo());
            
        }
         else if(CurrentUser.getUserRole().equalsIgnoreCase("Admin")){
              getDashboardController().getAllAppointment();
            
        }
        
        this.getView().dispose();
        
        
    }
    
      @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print(e.getActionCommand());
        if(e.getActionCommand().equalsIgnoreCase("add")){
            addAppoinment();
        }
        else if(e.getActionCommand().equalsIgnoreCase("Save")){
            editAppointment();
        }
        
          
         }
    
    
}
