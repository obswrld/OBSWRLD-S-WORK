package MedicalRecordSystemApplication;

public class MedicalHistory {
    private Patient patient;

    public MedicalHistory(Patient patient){
        this.patient = patient;
    }
    public void setPatient(Patient patient){
        this.patient = patient;
    }
    public Patient getPatient(){
        return this.patient;
    }
}
