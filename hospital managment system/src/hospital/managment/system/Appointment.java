/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment.system;

/**
 *
 * @author sajath
 */
public class Appointment {
    private Patient patient;
    private MedicalOfficer officer;
    private String appointmentDate;
    private String appointmentTime;
    private String status;
    private int appointmentNumber;
    private String symtomps;
    
    
    
    public Appointment(Patient patient,MedicalOfficer officer,String appointmentDate,String appointmentTime,String status,int appointmentNumber,String symtomps)
    {
        this.setPatient(patient);
        this.setMedicalOfficer(officer);
        this.setAppointmentDate(appointmentDate);
        this.setAppointmentTime(appointmentTime);
        this.setAppointmentNumber(appointmentNumber);
        this.setStatus(status);
        this.setSymtomps(symtomps);
    }
    
    public void setPatient(Patient patient){
        this.patient=patient;
        
    }
    public void setMedicalOfficer(MedicalOfficer officer){
        this.officer=officer;
        
    }
    public void setAppointmentDate(String appointmentDate){
        this.appointmentDate=appointmentDate;
        
    }
    public void setAppointmentTime(String appointmentTime){
        this.appointmentTime=appointmentTime;
        
    }
    public void setStatus(String status){
        this.status=status;  
    }
    public void setAppointmentNumber(int appointmentNumber){
        this.appointmentNumber=appointmentNumber;
        
    }
    public void setSymtomps(String symtomps){
        this.symtomps=symtomps;
        
    }
    public Patient getPatient(){
        return this.patient;
    }
      public MedicalOfficer getMedicalOfficer(){
        return this.officer;
    }
      public String getAppointmentDate(){
        return this.appointmentDate;
    }
      public String getAppointmentTime(){
        return this.appointmentTime;
    }
      public String getStatus(){
        return this.status;
    }
      public int getAppointmentNumber(){
        return this.appointmentNumber;
    }      
     public String getSymtomps(){
        return this.symtomps;
    }
     
}
