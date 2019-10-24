package örnekler;
import java.util.*;
public class örnekler {

	public static void main(String [] args) {
		
		int head=0,tail=0;
		String[] rands=new String[5];
		
		double i=(double)(Math.random()*1.0);
		for(int j=0;j<5;j++) {
			if(i>0.5) {
				head++;
				rands[j]="head";
			}
			else {
				tail++;
				rands[j]="tail";
			}
			
			
		}
		System.out.println("number of head : "+head);
		System.out.println("number of tail : "+ tail);
	}
	
	
}
