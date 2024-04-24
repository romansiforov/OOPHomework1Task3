package sample;

public class Phone {

	private String phoneNumber;
	private boolean isRegistered;
	private Network network;

	public Phone() {
		
	}
	
	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.isRegistered = false;
		this.network = null;
	}
	
	public Phone(String phoneNumber, Network network) {
		this.phoneNumber = phoneNumber;
		this.isRegistered = false;
		this.network = network;
	}
	
	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
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
	
	public boolean isRegistered(String phone, Network network) {
		return network.isRegistered(phone);
	}
	
	public Phone getPhoneByNumber(String phone) {
		return network.getPhone(phone);
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public void registratePhone() {
		network.addPhoneToNetwork(this);
	}
	
	private void getIncomeCall(String phone) {
		System.out.println("The "+phone+" is calling you...");
		System.out.println("-------------------------------");
	}
	

	public void initiateOutcomeCall(String phoneToCall) {
		if(isRegistered() && isRegistered(phoneToCall, network)
				&& !this.getPhoneNumber().equals(phoneToCall)) {
			System.out.println("Calling to "+phoneToCall);
			
			Phone abonentPhone = getPhoneByNumber(phoneToCall);
			abonentPhone.getIncomeCall(phoneNumber);
		}
		
		if(!this.isRegistered()) {
			System.out.println("Your phone "+this.getPhoneNumber()+" isn't registered in the network");
			System.out.println("-------------------------------");
		}
		if(!network.isRegistered(phoneToCall)) {
			System.out.println("You can not initiate a call to a number "+phoneToCall+" because it's not registered");
			System.out.println("-------------------------------");
		 }
		if(this.getPhoneNumber().equals(phoneToCall)) {
			System.out.println("Hey! You can not call yourself ;-)");
		}

	}

	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + ", isRegistered=" + isRegistered + ", network=" + network.getNetworkName() + "]";
	}


}
