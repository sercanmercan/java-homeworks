package ikinci_lab;
import java.util.*;
public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a 3-word sentence : ");
		
		String s=input.nextLine();
		int a=s.indexOf(' ');
		String s1=' '+s.substring(0, a);
		
		String s2=s.substring(a+1);
		
		int b=s2.indexOf(' ');
		String s4=' '+s2.substring(0,b+1);
		
		for(int i=1;i<=s.length();i++) {
			for(int j=i;j>=1;j--) {
				System.out.println(j);
			}
		}
		
		int m=s2.indexOf(' ');
		String s3=s2.substring(m);
		System.out.println(s1+s4+s3);
		System.out.println(s1+s3+s4);
		System.out.println(s4+s1+s3);
		System.out.println(s4+s3+s1);
	}

}
