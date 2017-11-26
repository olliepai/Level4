package HOSPITAL;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors;
	ArrayList<Patient> patients;
	
	Hospital() {
		doctors = new ArrayList<Doctor>();
		patients = new ArrayList<Patient>();
	}
	
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
}
