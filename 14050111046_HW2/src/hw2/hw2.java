package hw2;
import java.lang.reflect.Array;
import java.util.*;
public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,z,count=0;	//initializing counter
		
		//create arrays
		char [][][] array=new char[6][6][6]; 
		char [][][] temp=new char[6][6][6];
		
		//defining just limited word
		String word="ABCDE";
		
		Scanner input=new Scanner(System.in);
		System.out.println("How many book do you have?");//want book number
		int book_num=input.nextInt();
		
		//if user enter nonpositive, it will ask again
		while(book_num<=0) {
			if(book_num<=0) {
			System.out.println("Please enter the positive book number...");
			System.out.println("How many book do you have?");
			book_num=input.nextInt();
			}
		}
		//want page number
		System.out.println("How many pages do they have?");
		int page_num=input.nextInt();
		//if user enter nonpositive, it will ask again
		while(page_num<=0) {
			if(page_num<=0) {
			System.out.println("Please enter the positive page number...");
			System.out.println("How many page do you have?");
			page_num=input.nextInt();
			}
		}
		
		System.out.println("Here are the books;");
		//writing books and pages
		for(i=0;i<book_num;i++) {
			System.out.println("\nBook"+(i+1)+":");
			
			for(j=0;j<page_num;j++) {
				System.out.print("\nPage "+(j+1)+":");
				for(z=0;z<5;z++) {
					Random r=new Random();//random class
						array[i][j][z]=word.charAt(r.nextInt(5)) ;//5 letter assign each three dimensional array
						
					for(int m=0;m<2;m++) {
						System.out.print(array[i][j][z]);//array will write twice and it will create word
						
					}
					System.out.print("  ");
					
				}
			}
		}
		
		for (j=0;j<page_num;j++){			
			for(z=0;z<5;z++) {				
				for (i=0;i<book_num;i++){	
					temp[i][j][z]=array[i][j][z];
					//compare to words of each array
					if(array[i][j][z]==array[i+1][j][z]) {
						
						System.out.println("\n' " +array[i][j][z] + array[i][j][z]+ " '"+"is the "+ (z+1)+" th word on the Page"+ (j+1)+"of the books " + (i+1)+ "and"+ (i+2));
						count++;//control common word
					}
					
					
				}			
			}
		}
		if(count==0) {//if count equal to zero, there isnot common word
			System.out.println("\n Books have nothing in common...");
		}
		
	}	
}