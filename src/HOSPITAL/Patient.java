package HOSPITAL;

public class Patient {
	public boolean isCaredFor;
	
	Patient() {
		isCaredFor = false;
	}
	
	public boolean feelsCaredFor() {
		return isCaredFor;
	}
	
	public void checkPulse() {
		isCaredFor = true;
	}
}
