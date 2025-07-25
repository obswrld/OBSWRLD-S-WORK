package MedicalRecordSystemApplication;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private LocalDate date;
    private String contactDetails;
    private List<MedicalHistory> medicalHistoryList;

    public Patient(String name,LocalDate date,String contactDetails) {
        this.name = name;
        this.date = date;
        this.contactDetails = contactDetails;
        this.medicalHistoryList = new ArrayList<>();
    }
    public void addMedicalHistory(MedicalHistory medicalHistory){
        medicalHistoryList.add(medicalHistory);
    }
    public String getPatientInfo(){
        return String.format("Name: %s, \nDOB: %s, \nContact Details: %s, \nMedical History: %s",
                name, date, contactDetails, medicalHistoryList);
    }
    public String getName(){
        return name;
    }
}
