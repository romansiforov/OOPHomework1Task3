package sample;

public class Main {

	public static void main(String[] args) {
		Network network = new Network("Kyivstar");
		
		Phone phone1 = new Phone("+380502987600", network);
		Phone phone2 = new Phone("+380502987601", network);
		Phone phone3 = new Phone("+380502987602", network);
		Phone phone4 = new Phone("+380502987603", network);
		Phone phone5 = new Phone("+380502987604", network);
		
		phone1.registratePhone();
		phone2.registratePhone();
		phone3.registratePhone();
		
		phone1.initiateOutcomeCall("+380502987601");
		
		phone2.initiateOutcomeCall("+380502987604");
		
		phone5.initiateOutcomeCall("+380502987600");
		
		phone3.initiateOutcomeCall("+380502987600");
		
		phone3.initiateOutcomeCall("+380502987602");
		
		
	}

}
