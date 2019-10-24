package lab9;

public class Student extends person{
	final String classStatus;

	

	public Student(String name, String address, int phoneNumber, String email, String classStatus) {
		super(name, address, phoneNumber, email);
		this.classStatus = classStatus;
	}



	
	public String toString() {
		return "Student [classStatus=" + classStatus + "]";
	}

	
}
