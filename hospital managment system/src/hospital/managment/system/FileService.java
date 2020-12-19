/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment.system;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sajath
 */
public class FileService {
      private static ArrayList<Patient> patientList=new ArrayList<Patient>();
      private static ArrayList<MedicalOfficer> officerList= new ArrayList<MedicalOfficer>();
       private static ArrayList<Receptionist> receptionistList=new ArrayList<Receptionist>();
        
       
    private static final String ADMIN_FILE_PATH = "files/admins.txt";
    private static final File ADMIN_FILE = new File(ADMIN_FILE_PATH);
       
    private static final String PATIENT_FILE_PATH = "files/patients.txt";
    private static final File PATIENTS_FILE = new File(PATIENT_FILE_PATH);
         
    private static final String MO_FILE_PATH = "files/medicalofficers.txt";
    private static final File MO_FILE = new File(MO_FILE_PATH);
         
    private static final String RECEPTIONIST_FILE_PATH = "files/receptionists.txt";
    private static  final File RECEPTIONIST_FILE = new File(RECEPTIONIST_FILE_PATH);
         
    private  static final String APPOINTMENTS_FILE_PATH="files/appointments.txt";
    private static final File APPOINTMENTS_FILE = new File(APPOINTMENTS_FILE_PATH);
         
    private static final String USER_FILE_PATH = "files/users.txt";
    private static final File USER_FILE = new File(USER_FILE_PATH);
        
    private static final String VISITOR_FILE_PATH = "files/visitors.txt";
    private static final File VISITOR_FILE = new File(VISITOR_FILE_PATH);
        
    private static final String COMPLAINT_FILE_PATH = "files/complaints.txt";
    private static final File COMPLAINT_FILE = new File(COMPLAINT_FILE_PATH);

    private static final String MAIL_FILE_PATH = "files/dispatchedMail.txt";
    private static final File MAIL_FILE = new File(MAIL_FILE_PATH);

    private static final String IMAGEPATH="src/resources/new/";

    private static final String LOGIN_FILE_PATH = "files/userLogin.txt";
    private static final File LOGIN_FILE = new File(LOGIN_FILE_PATH);

    private static final String SPECIALITY_REFFERENCE_FILE_PATH = "files/specialityRefference.txt";
    private static final File SPECIALITY_REFFERENCE_FILE = new File(SPECIALITY_REFFERENCE_FILE_PATH);
    private static final String COMPLAIN_REFFERENCE_FILE_PATH = "files/complainRefference.txt";
    private static final File COMPLAIN_REFFERENCE_FILE = new File(COMPLAIN_REFFERENCE_FILE_PATH);
      
      public FileService(){
          this.getAllPatients();
          
      }
      
      public void setPatientList(ArrayList<Patient> list){
          this.patientList=list;
          
      }
      public void setOfficerList(ArrayList<MedicalOfficer> list){
          this.officerList=list;
          
      }
      public void setReceptionistList(ArrayList<Receptionist> list){
          this.receptionistList=list;
          
      }
      
      public ArrayList<Patient> getPatientList(){
          return this.patientList;
      }
      
     //files
      public static File getUserFile(){
          return USER_FILE;
      }
      public static File getAdminFile(){
          return ADMIN_FILE;
      }
      
       public static File getMoFile(){
          return MO_FILE;
      } 
         public static File getVisitorsFile(){
          return VISITOR_FILE;
      } 
          public static File getComplaintsFile(){
          return COMPLAINT_FILE;
      } 
            public static File getReceptionistFile(){
          return RECEPTIONIST_FILE;
      }   
           public static File getAppointmentsFile(){
          return APPOINTMENTS_FILE;
      } 
           public static File getMailsFile(){
          return MAIL_FILE;
      }   
       public static File getUserLoginFile(){
           return LOGIN_FILE;
       }
        public static File getPatientsFile(){
          return PATIENTS_FILE;
      }
         public static File getSpecialityRefferenceFile(){
          return SPECIALITY_REFFERENCE_FILE;
      }
          public static File getComplaintRefferenceFile(){
          return COMPLAIN_REFFERENCE_FILE;
      }
       
       
       //file paths
       public static String getUserFilePath(){
          return USER_FILE_PATH;
      }
       public static String getAdminFilePath(){
          return ADMIN_FILE_PATH;
      }
       public static String getMoFilePath(){
          return MO_FILE_PATH;
      }
       
      public static String getPatientsFilePath(){
          return PATIENT_FILE_PATH;
      }
     
      public static String getReceptionistFilePath(){
          return RECEPTIONIST_FILE_PATH;
      }   
        public static String getAppointmentsFilePath(){
          return APPOINTMENTS_FILE_PATH;
      }
        public static String getVisitorsFilePath(){
          return VISITOR_FILE_PATH;
      }
         public static String getComplaintsFilePath(){
          return COMPLAINT_FILE_PATH;
      }
        public static String getImagePath(){
            return IMAGEPATH;
        }
         public static String getMailsFilePath(){
            return MAIL_FILE_PATH;
        }
          public static String getUserLoginFilePath(){
            return LOGIN_FILE_PATH;
        }
          public static String getSpecialityRefferenceFilePath(){
            return SPECIALITY_REFFERENCE_FILE_PATH;
        }
          public static String getComplainRefferenceFilePath(){
            return COMPLAIN_REFFERENCE_FILE_PATH;
        }
         
      
      //getters here
      
      
      
      
      
      
public static Patient readPatientUser(String line){
          String[] data=line.split(",");
          
          String userName=data[0];
           String name=data[1];
            String gender=data[2];
            String mobile=data[3];
            String idCard=data[4];
            String dob=data[5];
            String address=data[6];
            String status=data[7];
             String password=data[8];
              String bldGroup=data[9];
               String allergy=data[10];
 
               return new Patient(userName,name,gender,mobile,idCard,dob,address,status,password,bldGroup,allergy);
      }
public static MedicalOfficer readMoUser(String line){
      String[] data=line.split(",");

      String userName=data[0];
       String name=data[1];
        String gender=data[2];
        String mobile=data[3];
        String idCard=data[4];
        String dob=data[5];
        String address=data[6];
        String status=data[7];
         String password=data[8];
          String staffId=data[9];
           String email=data[10];
           String date=data[11];
            String cv=data[12];
            String speciality=data[13];
            String image=data[14];

            File cvFile = new File(cv);
             File staffImage = new File(image);

           return new MedicalOfficer(userName,name,gender,mobile,idCard,dob,address,status,password,staffId,email,date,cvFile,speciality,staffImage);
  } 
public static Receptionist readReceptionistUser(String line){
  String[] data=line.split(",");

  String userName=data[0];
   String name=data[1];
    String gender=data[2];
    String mobile=data[3];
    String idCard=data[4];
    String dob=data[5];
    String address=data[6];
    String status=data[7];
     String password=data[8];
      String staffId=data[9];
       String email=data[10];
       String date=data[11];
        String cv=data[12];
        String image=data[13];
        File cvFile = new File(cv);
         File staffImage = new File(image);

       return new Receptionist(userName,name,gender,mobile,idCard,dob,address,status,password,staffId,email,date,cvFile,staffImage);
} 
public static Appointment readAppoinment(String line){
String[] data=line.split(",");
String appoinmentNo=data[0];
String date=data[1];
 String time=data[2];
 String status=data[3];
 String patientName=data[4];
 String patientId=data[5];
 String moName=data[6];
 String speciality=data[7];
  String sysmtomps=data[8];
   String staffId=data[9];

 return new Appointment(appoinmentNo,getPatientById ( patientId ),getMoByStaffId(staffId),date,time,status,sysmtomps,speciality);
}
public static Complaint readComplaint(String line){
String[] data=line.split(",");
String type=data[0];
String date=data[1];
String complainBy=data[2];
String description=data[3];
String mobile=data[4];
String actionTaken=data[5];
String note=data[6];
String attachment=data[7];

 return new Complaint(type,date,complainBy,description,mobile,actionTaken,note,new File(attachment));
}
public static Visitor readVisitor(String line){
         String[] data=line.split(",");
          String date=data[0];
           String visitorId=data[1];
            String visitorName=data[2];
            String purpose=data[3];
            String mobile=data[4];
            String inTime=data[5];
             String outTime=data[6];
            String note=data[7];
             String attachment=data[8];

               return new Visitor(purpose,visitorName,date,visitorId,mobile,inTime,outTime,note,new File(attachment));
    }
public static DispatchedPostal readMail(String line){
         String[] data=line.split(",");
         
          String refferenceNumber=data[0];
           String date=data[1];
            String toName=data[2];
            String toAddress=data[3];
            String note=data[4];
            String attachment=data[5];
            
            

               return new DispatchedPostal(refferenceNumber,note,date,new File(attachment),toName,toAddress);
    }    
     
   
   
public  static ArrayList<Patient> getAllPatients(){
             ArrayList<Patient> allPatientList= new ArrayList<Patient>();
            try {
             BufferedReader reader = new BufferedReader(new FileReader(PATIENTS_FILE));
            String line;
            while ((line = reader.readLine()) != null) {

                 //username, password, email, etc

                Patient p=readPatientUser(line);//line with commas

                allPatientList.add(p);

            }
            reader.close();
             return allPatientList;


        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }



      }

public static ArrayList<MedicalOfficer> getMoBySpeciality(String speciality){
       ArrayList<MedicalOfficer> specialityOfficer= new ArrayList<MedicalOfficer>();
         try {
             BufferedReader reader = new BufferedReader(new FileReader(MO_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Doctor"+line);
                 
                String[] data = line.split(","); //username, password, email, etc
                if(data[13].equals(speciality)){
                MedicalOfficer user=readMoUser(line);
                
                specialityOfficer.add(user);
                }
            }
            reader.close();
            return specialityOfficer;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

       
   }   
   
public static MedicalOfficer getMoByStaffId(String id){
       MedicalOfficer officer=null;
         try {
             BufferedReader reader = new BufferedReader(new FileReader(MO_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Doctor"+line);
                 
                String[] data = line.split(","); //username, password, email, etc
                if(data[9].equals(id)){
                
                
               officer=readMoUser(line);
                }
            }
            reader.close();
            return officer;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
       
   }
 
public static Patient getPatientById(String id){
       Patient patient=null;
         try {
             BufferedReader reader = new BufferedReader(new FileReader(PATIENTS_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                 
                String[] data = line.split(","); //username, password, email, etc
                if(data[4].equals(id)){
                
                
               patient=readPatientUser(line);
                }
            }
            reader.close();
            return patient;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
       
   }
 
public static ArrayList<MedicalOfficer> getAllMo(ArrayList<String> list){
      ArrayList<MedicalOfficer> moOfficerList= new ArrayList<MedicalOfficer>();
    for(String line:list){
        MedicalOfficer officer=readMoUser(line);
            moOfficerList.add(officer);
    }
    return moOfficerList;
}
    
  /*  public static void writeAppoinment(Appointment appointment)throws IOException {
        
        try
        {
            System.out.println("works");
        FileWriter writer=new FileWriter(APPOINTMENTS_FILE_PATH,true);
        PrintWriter out =new PrintWriter(writer);

        if(appointment!=null){
            out.print(appointment.getAppointmentNumber());
            out.print(","+appointment.getStatus());
             out.print(","+appointment.getPatient().toString());
            out.print(","+appointment.getAppointmentDate());
            out.print(","+appointment.getAppointmentTime());
            out.print(","+appointment.getMedicalOfficer().toString());
            out.print(","+appointment.getSpeciality());
            out.println(","+appointment.getSymtomps());
             Appointment.increment();

        }    
        writer.close();
        out.close();
           
        }
    catch(IOException exception){
        System.out.println(exception);
    }
    

    
    }*/
    
  /* public static void writeComplaint(Complaint compain)throws IOException {
        
        try
        {
            System.out.println("works");
        FileWriter writer=new FileWriter(COMPLAINT_FILE_PATH,true);
        PrintWriter out =new PrintWriter(writer);

        if(compain!=null){
            out.print(compain.getStrType());
            out.print(","+compain.getStrDate());
            out.print(","+compain.getStrComplaintBy());
            out.print(","+compain.getStrDescription());
            out.print(","+compain.getIntPhonrNumber());
            out.print(","+compain.getStrActionTaken());
             out.print(","+compain.getStrNote());
             out.println(","+compain.getAttachment());
             
    
           
            

        }    
        writer.close();
        out.close();
           
        }
    catch(IOException exception){
        System.out.println(exception);
    }
    

    
    }*/
    
  /*   public static void writeMail(DispatchedPostal mail)throws IOException {
        
        try
        {
            System.out.println("works");
        FileWriter writer=new FileWriter(getMailsFilePath(),true);
        PrintWriter out =new PrintWriter(writer);

        if(mail!=null){
            out.print(mail.getIntReferenceNo());
            out.print(","+mail.getStrDate());
            out.print(","+mail.getStrToName());
            out.print(","+mail.getStrToAddress());
            out.print(","+mail.getStrNote());
             out.println(","+mail.getAttachment());
             
    
           PostalMail.incrementRefferenceCount();
            

        }    
        writer.close();
        out.close();
           
        }
    catch(IOException exception){
        System.out.println(exception);
    }
    

    
    }*/
    
 /*    public static void writeVisitorRecord(Visitor record)throws IOException {
        
        try
        {
            System.out.println("works");
        FileWriter writer=new FileWriter(getVisitorsFilePath(),true);
        PrintWriter out =new PrintWriter(writer);

        if(record!=null){
            out.print(record.getStrDate());
             out.print(","+record.getIntId());
            out.print(","+record.getStrName());
            out.print(","+record.getStrPurpose());
            out.print(","+record.getIntPhoneNo());
            out.print(","+record.getStrInTime());
            out.print(","+record.getStrOutTime());
             out.print(","+record.getStrNote());
             out.println(","+record.getAttachment());
             
    
          
            

        }    
        writer.close();
        out.close();
            
        }
    catch(IOException exception){
        System.out.println(exception);
    }
    

    
    }*/
     
public static void writeLoginRecord(String filePath,String line)throws IOException {
             String[] lineList=line.split(",");
           if(isRecordExist(filePath,lineList[0])){ 
                            System.out.println("key"+lineList[0]);

           removeLine(filePath,lineList[0]);
             System.out.println("removing");
              addLine(filePath,line);

       
       }
       else{
           addLine(filePath,line);
          System.out.println("adding");
       }
    

    
    }
     
public static ArrayList<String> getPatientAppointments(String id){
         ArrayList<String> appointmentList= new ArrayList<String>();
          try {
             BufferedReader reader = new BufferedReader(new FileReader(APPOINTMENTS_FILE));
            String line;
            while ((line = reader.readLine()) != null) {              
                String[] data = line.split(","); //username, password, email, etc
                if(data[3].equals(id)){
                    
               
                appointmentList.add(line);
                
                }
            }
            reader.close();
           return appointmentList;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
          
    
    }
      
public static ArrayList<String> getMOAppointments(String id){
         ArrayList<String> appointmentList= new ArrayList<String>();
          try {
             BufferedReader reader = new BufferedReader(new FileReader(APPOINTMENTS_FILE));
            String line;
            while ((line = reader.readLine()) != null) {              
                String[] data = line.split(","); //username, password, email, etc
                if(data[9].equals(id) && data[3].equals("approved")){
                    
               
                appointmentList.add(line);
                
                }
            }
            reader.close();
           return appointmentList;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
          
    
    }
       
   
    
   /* public static ArrayList<String> getAllAppointments(){
         ArrayList<String> appointmentList= new ArrayList<String>();
          try {
             BufferedReader reader = new BufferedReader(new FileReader(APPOINTMENTS_FILE));
            String line;
            while ((line = reader.readLine()) != null) {              
                String[] data = line.split(","); //username, password, email, etc
                
                    
               
                appointmentList.add(line);
                
                
            }
            reader.close();
           return appointmentList;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    
    }*/
    
    /* public static ArrayList<String> getAllComplaints(){
         ArrayList<String> complainList= new ArrayList<String>();
          try {
             BufferedReader reader = new BufferedReader(new FileReader(COMPLAINT_FILE));
            String line;
            while ((line = reader.readLine()) != null) {              
                String[] data = line.split(","); //username, password, email, etc
                
                    
               
                complainList.add(line);
                
                
            }
            reader.close();
           return complainList;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    
    }*/
          
   /*  public static ArrayList<String> getPatientComplaints(){
         ArrayList<String> complaintList= new ArrayList<String>();
          try {
               System.out.println("patient complaints");  
             BufferedReader reader = new BufferedReader(new FileReader(COMPLAINT_FILE));
            String line;
            while ((line = reader.readLine()) != null) {              
                String[] data = line.split(","); //username, password, email, etc
                
               
                    
               
                complaintList.add(line);
                
                
            }
            reader.close();
           return complaintList;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
          
    
    }*/
   /*  public static ArrayList<String> getDispatchedMails(){
            ArrayList<String> mailList= new ArrayList<String>();
          try {
               System.out.println("mails");  
             BufferedReader reader = new BufferedReader(new FileReader(MAIL_FILE));
            String line;
            while ((line = reader.readLine()) != null) {              
                String[] data = line.split(","); //username, password, email, etc
                  
              
                    
               
                mailList.add(line);
                
                
            }
            reader.close();
           return mailList;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
     
     
     }*/
     
  /*   public static ArrayList<String> getVisitorRecords(){
            ArrayList<String> recordList= new ArrayList<String>();
          try {
             BufferedReader reader = new BufferedReader(new FileReader(VISITOR_FILE));
            String line;
            while ((line = reader.readLine()) != null) { 
                               System.out.println("visitor record"+line);  

                String[] data = line.split(","); //username, password, email, etc
                  
              
                    
               
                recordList.add(line);
                
                
            }
            reader.close();
           return recordList;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
     
     
     }*/
     
public static ArrayList<String> getRecords(File file){
            ArrayList<String> recordList= new ArrayList<String>();
          try {
             BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) { 
                               System.out.println(" record-"+line);  

                //String[] data = line.split(","); //username, password, email, etc
                  
              
                    
               
                recordList.add(line);
                
                
            }
            reader.close();
           return recordList;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
     
     
     }

      public static int getRecordCount(File file){
          int count=0;
           try {
             BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) { 

                count++;
           
            }
            reader.close();
           return count;
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
          
      }
    
    
   public static boolean isRecordExist(String filePath,String key){//can be used for user name validation
      boolean isExist=false;
         try {
             BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));
            String line;
            while ((line = reader.readLine()) != null) { 
              
                String[] data = line.split(",");
                  System.out.println("value"+data[0]);System.out.println("key"+key);
                if(data[0].toLowerCase().equals(key.toLowerCase())){
                    
                    isExist=true;
                    break;
                
                }
            }
            reader.close();
          
            
        } 
         catch (FileNotFoundException e) {
            e.printStackTrace();
           
        } catch (IOException e) {
            e.printStackTrace();
            
        }
         return isExist;
         
   }
   
   public static void removeLine(String filePath,String lineToRemove){
         
     try {

      File inFile = new File(filePath);

      if (!inFile.isFile()) {
        System.out.println("Parameter is not an existing file");
        return;
      }

      //Construct the new file that will later be renamed to the original filename.
      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

      BufferedReader br = new BufferedReader(new FileReader(filePath));
      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

      String line = null;

      //Read from the original file and write to the new
      //unless content matches data to be removed.
      while ((line = br.readLine()) != null) {
            String[] strLine=line.split(",");
        if (!strLine[0].equals(lineToRemove)) {

          pw.println(line);
          pw.flush();
        }
      }
      pw.close();
      br.close();

      //Delete the original file
      if (!inFile.delete()) {
        System.out.println("Could not delete file");
        return;
      }

      //Rename the new file to the filename the original file had.
      if (!tempFile.renameTo(inFile))
        System.out.println("Could not rename file");

    }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }

       
       
       
     
       
   }
   
   public static void addLine(String filePath,String line){
        try
        {
            
        FileWriter writer=new FileWriter(filePath,true);
        PrintWriter out =new PrintWriter(writer);

        if(line!=null){
            out.println(line);
                                   
        }    
        writer.close();
        out.close();
          
        }
    catch(IOException exception){
        System.out.println(exception);
    }
       
   }
   
   public static void deleteRecord(String filePath,String lineToRemove){
        int dialogButton = JOptionPane.YES_NO_OPTION;
       int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to delete record?","Warning",dialogButton);
    if(dialogResult == JOptionPane.YES_OPTION){
         try {

      File inFile = new File(filePath);

      if (!inFile.isFile()) {
        System.out.println("Parameter is not an existing file");
        return;
      }

      //Construct the new file that will later be renamed to the original filename.
      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

      BufferedReader br = new BufferedReader(new FileReader(filePath));
      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

      String line = null;

      //Read from the original file and write to the new
      //unless content matches data to be removed.
      while ((line = br.readLine()) != null) {
            System.out.println("line to be removed "+lineToRemove);
        if (!line.toLowerCase().equals(lineToRemove.toLowerCase())) {
            System.out.println("line "+line);
          pw.println(line);
          pw.flush();
        }
      }
      pw.close();
      br.close();

      //Delete the original file
      if (!inFile.delete()) {
        System.out.println("Could not delete file");
        return;
      }

      //Rename the new file to the filename the original file had.
      if (!tempFile.renameTo(inFile))
        System.out.println("Could not rename file");

    }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
       
   }
   }
    
}
