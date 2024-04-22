package sample;

import java.util.Arrays;

public class Network {
	
	Phone[] phones;
	
	public Network() {

	}
	
	public Network(Phone[] phones) {
		this.phones = phones;
	}
	 public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Network [phones=" + Arrays.toString(phones) + "]";
	}

	public void addPhoneToNetwork(Phone phone) {
		 phone.setRegistered(true);
	 }
	 
	 public boolean isRegistered(String  phone) {
		 for(int i = 0; i < phones.length; i++) {
			 if(phones[i].getPhoneNumber().equals(phone)) {
				 if(phones[i].isRegistered()) {
					 return true;
				 }
			 }
		 }
		 return false;
	 }
}
