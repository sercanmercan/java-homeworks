package lab9;

public class faculty extends employee {
	int officeHour;
	int rank;
	
	
	
	public faculty(String name, String address,int phoneNumber, String email, String office, int salary, int officeHour,
			int rank) {
		super(name, address, phoneNumber, email, office, salary);
		this.officeHour = officeHour;
		this.rank = rank;
	}



	public String toString() {
		
		return super.toString()+"office hour : "+ officeHour+ "rank: "+ rank;
		
	}
}
