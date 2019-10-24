package lab9;

public class person {
	private String name;
	private String address;
	private int phoneNumber;
	private String email;
	
	
	
	
	public person(String name, String address, int phoneNumber, String email) {
		
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public void setName(String name) {
		this.name=name;
		
	}
	public void setAddress(String address) {
		this.address=address;
		
	}
	
	public void setphoneNumber(int phoneNumber) {
		this.phoneNumber=phoneNumber;
				
	}
	public void setemail(String email) {
		this.email=email;
		
	}
	
	public String getName() {
		return name;
		
	}
	public String getAddress() {
		return address;
		
	}
	
	public int getphoneNumber() {
		return phoneNumber;
				
	}
	public String getemail() {
		return email;
		
	}
	
	public String toString() {
		
		return "name : "+ name+ "address: "+ address+ "phone Number: "+ phoneNumber;
		
	}
}


