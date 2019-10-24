package lab8;
import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student =new Student();
		Student student2=new Student();
		Student student3=new Student();
		Random random1=new Random(3);
		
		student.setname_surname("sercan mercan");
		student.setID(2);
		
		student.setcondition(true);
		
		student2.setname_surname("hilal ayar");
		student2.setID(3);
		
		student2.setcondition(true);
		
		student3.setname_surname("x");
		student3.setID(1);
		
		student3.setcondition(false);
		student.setGPA(random1.nextInt(4));
		student2.setGPA(random1.nextInt(4));
		student3.setGPA(random1.nextInt(4));
		student.toString();
		student2.toString();
		student3.toString();
		System.out.println("count of registers of student : "+student.count);
		System.out.println("count of not registers of student : "+student.count2);
		System.out.println(student.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	}

}
