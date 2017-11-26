package HOSPITAL;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patients;
	
	Doctor() {
		patients = new ArrayList<Patient>();
	}
	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient patient) {
		patients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void doMedicine() {
		for (Patient patient : patients) {
			patient.checkPulse();
		}
	}
}
