package lab9;

public class staff extends employee {
	String title;

	public staff(String name, String address, int phoneNumber, String email, String office, int salary, String title) {
		super(name, address, phoneNumber, email, office, salary);
		this.title = title;
	}

	public String toString() {
		
		return super.toString()+"title : "+ title;
		
	}
}
