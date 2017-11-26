package HOSPITAL;

public class Surgeon extends Doctor {
	Surgeon() {
		
	}
	
	public boolean performsSurgery() {
		return true;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
}
