package sample;

public class Phone {
	private String phoneNumber;
	private boolean isRegistered;
	
	public Phone() {
		
	}
	
	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.isRegistered = false;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}
	
	private void getIncomeCall(Phone phone) {
		System.out.println("The income call from "+phone.getPhoneNumber()+" ...");
		System.out.println("-----------------------------------------");
	}
	
	public void initiateOutcomeCall(Phone phoneToCall) {

		if(!this.isRegistered()) {
			System.out.println("The outcome call is not possible. Your phone "+this.getPhoneNumber()+" is not registered");
			return;
		}
		if(!phoneToCall.isRegistered()) {
			System.out.println("The call can not be recieved. Abonent phone "+phoneToCall.getPhoneNumber()+" is not registered");
			return;
		}
		
		if(this.isRegistered() && phoneToCall.isRegistered()) {
			System.out.println("Calling to "+phoneToCall.getPhoneNumber()+" ...");
			phoneToCall.getIncomeCall(this);
		}
		
	}
	
}
