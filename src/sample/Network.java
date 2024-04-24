package sample;

import java.util.Arrays;

public class Network {
	
	private Phone[] phones;
	private String networkName;
	
	public Network() {

	}
	
	public Network(String networkName) {
		this.phones = new Phone[20];
		this.networkName = networkName;
	}
	 public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	@Override
	public String toString() {
		return "Network [phones=" + Arrays.toString(phones) + "]";
	}

	public void addPhoneToNetwork(Phone phone) {
		for(int i = 0; i < phones.length; i++) {
			if(phones[i] == null && i != phones.length - 1) {
				phones[i] = phone;
				break;
			}
		}
		
		 phone.setRegistered(true);
	 }
	
	public Phone getPhone(String phone) {
		for(int i = 0; i < phones.length; i++) {
			if(phones[i]!= null && phones[i].getPhoneNumber().equals(phone)) {
				return phones[i];
			}
		}
		return null;
	}
	 
	 public boolean isRegistered(String  phone) {
		 for(int i = 0; i < phones.length; i++) {
			 if(phones[i]!= null && phones[i].getPhoneNumber().equals(phone)) {
				 if(phones[i].isRegistered()) {
					 return true;
				 }
			 }
		 }
		 return false;
	 }
}
