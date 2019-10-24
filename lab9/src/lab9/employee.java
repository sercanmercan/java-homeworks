package lab9;

public class employee extends person {
	String office;
	int salary;
	
	
	
	public void setOffice(String office) {
		this.office=office;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public String getOffice() {
		return office;
	}
	public int getSalary() {
		return salary;
	}

	
	public employee(String name, String address, int phoneNumber, String email, String office, int salary) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
	}
	public String toString() {
		
		return super.toString()+"Office : "+ office+ "Salary : "+ salary;
		
	}
	
}
