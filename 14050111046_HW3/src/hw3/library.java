package hw3;
import java.util.*;

public class library {
	boolean control=true;
	int numberOfBooks;
	Scanner input=new Scanner(System.in);
	
	String allData = " ";
	Book[] book=new Book[100]; 
	//Book b=new Book();
	
	//constructor
	library() {
		numberOfBooks=0;
	}
	
	public library(int numberOfBooks) {
		
		this.numberOfBooks = numberOfBooks;
		
	}
	
	
	//books are added
	public void  addBook(String bookName, String authorName,String ISBN,int numPages,int pubYear, String[] keyWords) {
	
	
		//String[] parts = allData.split(",");
					
		
			
        //    bookName= parts[0].substring((parts[0].length()));
        //    authorName = parts[0];
       
          //  if(control){//Added control
            
                   
                	Book o=new Book(bookName,authorName,ISBN,numPages,pubYear, keyWords);
                	book[numberOfBooks+1]=o;
                	numberOfBooks++;
               
                System.out.println("Added!");
                
         //   }	
			
	}

	//return book
	public Book[] returnBook(String bookName) {
		Book b=null ;
		for(int i=0;i<book.length;i++) {
			if(bookName==book[i].getBookName())
				
			b=book[i];
			
		}
		return book;
		
		
	}
	//return author
	public Book[] returnBookByAuthor(String authorName){
	
		Book b=null;
		for(int i=0;i<book.length;i++) {
			if(book[i].searchKeyWord(authorName)) {
				b=book[i];
			}		
		}
		return book;
		
	}
	//return keyword
	public Book[] BookByKeyword(String[] keyword) {
		Book b=null;
		for(int i=0;i<book.length;i++) {
			if(book[i].searchKeyWord(keyword[i])==true)
				
			b=book[i];
		}
		return book;
		
	}
	
	//books are deleted
	public void deleteBook(String ISBN) {
		
		System.out.println(numberOfBooks);
		if(numberOfBooks==0) {
			System.out.println("there is not any to delete");
			System.exit(numberOfBooks);			
		}
		
		for(int i=0;i<numberOfBooks;i++) {
			if(book[i].searchKeyWord(ISBN)) {
				for(int y=i;y<numberOfBooks;y++) {
					book[y]=book[i+1];
				}
				numberOfBooks--;
				i--;
			}
		}
	}

	
	
	
	}

