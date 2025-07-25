package MedicalRecordSystemApplication;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordSystem {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    public MedicalRecordSystem(){
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }
    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }
    public void scheduleAppointment(Appointment appointment){
        this.appointments.add(appointment);
    }

}
