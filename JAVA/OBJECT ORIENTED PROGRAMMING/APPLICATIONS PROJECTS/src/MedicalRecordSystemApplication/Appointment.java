package MedicalRecordSystemApplication;

import java.sql.Time;
import java.time.LocalDateTime;

public class Appointment {
    private LocalDateTime date;
    private Time time;
    private Patient patient;
    private Doctor doctor;

    public Appointment(LocalDateTime date, Time time, Patient patient, Doctor doctor) {
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
    }
    public String getAppointmentDetails(){
        return String.format("\nDate: %s\nTime: %s\nPatient: %s\nDoctor: %s", date, time, patient, doctor);
    }
}
