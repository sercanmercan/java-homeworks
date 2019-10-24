package hw3;
import java.util.*;
import java.lang.String;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word,bookN = null,authorN = null,isbn=null;
		int numP = 0,pubY = 0;
		String [] array;
		String[] keyW = null;
		Book[] book = new Book[100];
		int numberOfBooks = 0;
		Scanner input=new Scanner(System.in);
		Book b=new Book();
		library lib=new library();
		System.out.println("Press A to insert a book\n Press D to delete a book\n Press L to display books of an author\n Press X to display a book\n Press Q to exit \n Your choice: ");
		String choice1=input.nextLine();
		char choice2=choice1.charAt(0);

		
		if(choice2=='A'||choice2=='D' || choice2=='X'|| choice2=='Q') {
		
		while( Character.isLetter(choice2)) {						
			switch(choice2) {
			case 'A':
				
				array=choice1.split(",");
				int a=array.length;
				
				System.out.println("Enter the book name: ");
				bookN=input.nextLine();
				System.out.println("Enter the author name: ");
				authorN=input.nextLine();
				System.out.println("Enter the ISBN: ");
				isbn=input.nextLine();
				System.out.println("Enter the number of pages: ");
				numP=input.nextInt();
				System.out.println("Enter the number of year: ");
				pubY=input.nextInt();
				//System.out.println("Enter the keyWord: ");
				//keyW[]=input.nextLine();
				String [] keyWord=new String[a];
				lib.addBook(bookN, authorN,isbn,numP,pubY,keyW);
				
				break;
				
			case 'D':
				System.out.println("Enter the ISBN: ");
				isbn=input.nextLine();
				lib.deleteBook(isbn);
				break;
				
			case 'L':
				word=choice1.substring(2, choice1.length());
				book=lib.returnBookByAuthor(word);
				
				
			case 'X':
				int i=0;
				
				while(numberOfBooks !=0 ) {
					book[i].displayBook();
					i++;
				}
				
				
				if(numberOfBooks==0) {
					System.out.println("empty array" );
				}
				break;
				
			case 'Q':
				System.out.println("good bye");
				System.exit(1);
				break;
			default:
				System.out.println("Please enter high letter");
			}
		
			System.out.println("Press A to insert a book\n Press D to delete a book\n Press X to display a book\n Press Q to exit \n Your choice: ");
			choice1=input.next();
			}
		}
	}
}
