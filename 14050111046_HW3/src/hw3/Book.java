package hw3;

public class Book {
	private String bookName;
	private String authorName;
	private String ISBN;
	private int numPages;
	private int pubYear;
	private String[] keyWords;
	Book(){
		bookName=null;
		authorName=null;
		ISBN=null;
		numPages=0;
		pubYear=0;
		
	}
	//constructor
	public Book(String bookName , String authorName,String ISBN, int numPages,int pubYear,String[] keyWords ){
		this.bookName=bookName;
		this.authorName=authorName;
		this.ISBN=ISBN;
		this.numPages=numPages;
		this.pubYear=pubYear;
		this.keyWords=keyWords;
	}
	//setter and getter
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		if(bookName.length()>=3)
		this.bookName = bookName;
		else {
			System.out.println("book's name is not available");
		}
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		if(authorName.length()>=3)
		this.authorName = authorName;
		else {
			System.out.println("you should enter greater than 2");
			System.exit(0);
		}
	}

	public String getISBN() {
		
		return ISBN;
		
	}

	public void setISBN(String iSBN) {
		if(ISBN.length()==13)
		ISBN = iSBN;
		else {
			System.out.println("ISBN must have 13 digits!");
			System.exit(0);
		}
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
			if(numPages>0)
			this.numPages = numPages;
			else {
				System.out.println("you should enter the positive numbers!!");
				System.exit(0);
			}
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		if(pubYear>=1923 && pubYear<=2016)
		this.pubYear = pubYear;
		else {
			System.out.println("you should enter number between 1923 and 2016");
			System.exit(0);
		}
	}

	public String[] getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String [] keyWords) {
		
		if(keyWords.length==3 || keyWords.length==4 || keyWords.length==5) {
			this.keyWords=keyWords;
		}
		
		else {
			System.out.println("You should enter minimum 3 words and maximum 5 words");
			System.exit(0);
		}
	}
	public boolean searchKeyWord(String keyWord) {
		for(int i=0;i< keyWords.length;i++) {
			if(keyWords[i].equals(keyWord)) {
				System.out.println("Found it");
				return true;
			}
			else {
				System.out.println("it wasnot found it");
			}
		}
		return false;
		
	}
	//print everything about books
	public void displayBook() {
		
		if(keyWords.length==3)
		
		 System.out.print(bookName+ ", " + authorName +", "+ISBN+", "+numPages+", "+pubYear+", "+keyWords[0] +", "+keyWords[1]+", "+keyWords[2] );
	     
		if(keyWords.length==4)
			
			 System.out.print(bookName+ ", " + authorName +", "+ISBN+", "+numPages+", "+pubYear+", "+keyWords[3] +", "+keyWords[4]+", "+keyWords[5] );
	}

}
