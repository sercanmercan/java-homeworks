package ikinci_lab;
import java.util.*;
public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("how many?");
		int x=input.nextInt();
		
		for(int i=1;i<x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}
			System.out.print("\n");
		}
	}

}
