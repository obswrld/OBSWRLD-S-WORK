package MedicalRecordSystemApplication;

public class Doctor {
    private String name;
    private String specialization;
    private String doctorId;

    public Doctor(String name, String specialization, String doctorId){
        this.name = name;
        this.specialization = specialization;
        this.doctorId = doctorId;
    }
    public String getDoctorInfo(){
        return String.format("\nName: %s \nSpecialization: %s, \nID NUmber: %s",
                this.name, this.specialization, this.doctorId);
    }

}
