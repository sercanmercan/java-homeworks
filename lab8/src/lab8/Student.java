package lab8;
import java.util.*;
public class Student {
	
	
		private  int ID=0;
		private boolean condition=true;
		private double GPA=0.0;
		String name_surname="Ali Yaman";
		public static int count=0;
		public static int count2=0;
		public int getID() {
			return ID;
		}
		
		public boolean getcondition() {
			return condition;
		}
		
		public double getGPA() {
			return GPA;
		}
		public String getname_surname() {
			return name_surname;
		}
		public void setID(int x)
		{
			ID=x;
		}
		
		public void setcondition(boolean y) {
			condition=y;
			if(y==true) {
				count++;
			}
			else {
				System.out.println("there is not this student..."+ this.name_surname);
				ID=0;
				GPA=0.0;
				name_surname="NULL";
				count2++;
				
			}
		}
		public void setGPA(double z) {
			GPA=z;
		}
		public void setname_surname(String n) {
			name_surname=n;
		}
		public Student(){
			ID=0;
			condition=true;
			GPA=0.0;
			name_surname="Ali Yaman";
			count=0;
		}
		public String toString() {
			
			return "name and surname: "+ this.name_surname+ "ID: "+ this.ID+ "GPA: "+ this.GPA;
			
		}
	
	}

