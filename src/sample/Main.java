package sample;

public class Main {

	public static void main(String[] args) {
		Network network = new Network();
		
		Phone[] phones = new Phone[10];
		
		setPhones(phones, network);
		
		phones[0].initiateOutcomeCall(phones[2]);
		
		phones[1].initiateOutcomeCall(phones[2]);
		
		phones[0].initiateOutcomeCall(phones[3]);
		
		phones[1].initiateOutcomeCall(phones[3]);
		
	}
	
	public static void setPhones(Phone[] phones, Network network) {

		for(int i = 0; i < phones.length; i++) {
			phones[i] = new Phone();
			phones[i].setPhoneNumber("+38050298764"+String.valueOf(i));
			if(i % 2 == 0) {
				network.registratePhone(phones[i]);
			}
			System.out.println(phones[i].getPhoneNumber()+ " registered " + phones[i].isRegistered());
		}
		System.out.println("---------------------------------");
	}
}
