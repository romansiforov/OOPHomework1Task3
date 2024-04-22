package sample;

public class Main {

	public static void main(String[] args) {
		Network network = new Network();
		
		Phone[] phones = new Phone[10]; 
		
		phones = initPhones(phones, network);
		
		network.setPhones(phones);
		
		phones[0].registratePhone(network, phones[0]);
		phones[1].registratePhone(network, phones[1]);
		phones[2].registratePhone(network, phones[2]);
		phones[3].registratePhone(network, phones[3]);
		
		getPhoneDetails(phones);
		
//		phones[0].initiateOutcomeCall("+380502987601");
		
		
	}
	
	public static void getPhoneDetails(Phone[] phones) {
		for(int i = 0; i < phones.length; i++) {
			System.out.println(phones[i].toString());
		}
		System.out.println("----------------------------");
	}
	
	public static Phone[] initPhones(Phone[] phones, Network network) {
		for(int i = 0 ; i< phones.length; i++) {
			phones[i] = new Phone("+38050298760"+i, network);
			phones[i].setPhoneNumber("+38050298760"+i);
//			phones[i].setNetwork(network);
		}
		return phones;
	}

}
