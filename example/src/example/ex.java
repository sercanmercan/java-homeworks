package example;

public class ex {


    public static void main(String[] args) {

    try {
        // TODO code application logic here
        Book[] book = new Book[100]; //an array of book with size of 100.

        Scanner scan= new Scanner(System.in);
        String input;
        String bookName;
        String authorName;
        String ISBN;
        int numPages;
        int pubYear;
        String[] keyWords;
        Character choice;

        do { //Display the menu after every operation until the user exits:
            System.out.print("Press A to insert a book\nPress D to delete a book\nPress S to (BONUS) quick sort in a recursive way all books\nPress L to (first sort) brute-force way sort all books\nPress X to display all books\nPress Q to exit\nYour choice:");
            input=scan.nextLine();
            choice = input.charAt(0);
            boolean control = true;
            int errcount = 0; //

            if(choice=='Q'){
                if(!(input.length()==1)){
                    choice='Z';
                    System.out.println("1. error, exit in input: Just input a 'Q' character. Again Please:");
                }
            }
            switch(choice){
                case 'A':
                    System.out.println("");

                    Character Addspace_cotrol = input.charAt(1);
                    if(!(Addspace_cotrol.equals(' '))){
                        control=false;
                        errcount++;
                        System.out.println(errcount + ". error, Add in input: A space is missing after the choice character. Again Please:");
                    }

                    String[] parts = input.split(", ");
                    bookName = parts[0].substring(2, (parts[0].length()));
                    authorName = parts[1];
                    ISBN = parts[2];
                    numPages = Integer.parseInt(parts[3]);
                    pubYear = Integer.parseInt(parts[4]);

                    int x = parts.length;
                    int y = x-5;
                    keyWords = new String[y];
                    for(int i = 0; i<y; i++){
                        keyWords[i]=parts[i+5];
                    }

                    if(bookName.length()<3){
                        control=false;
                        errcount++;
                        System.out.println(errcount + ". error, in input Rule: A string field for a book’s name which must have at least 3 letters. Again Please:");
                    }

                    if(authorName.length()<3){
                        control=false;
                        errcount++;
                        System.out.println(errcount + ". error, in input Rule: A string field for a author’s name which must have at least 3 letters. Again Please:");
                    }

                    if(!(ISBN.length()==13)){
                        control=false;
                        errcount++;
                        System.out.println(errcount + ". error, in input Rule: A string field for 13 digit ISBN number. Again Please:");
                    }

                    if(numPages <= 0){
                        control=false;
                        errcount++;
                        System.out.println(errcount + ". error, in input Rule: An integer field for number of pages in the book which must be a positive number. Again Please:");
                    }

                    if(pubYear < 1923 || pubYear > 2016 || pubYear <= 0){
                        control=false;
                        errcount++;
                        System.out.println(errcount + ". error, in input Rule: An integer field for publication year which must be a positive number between 1923 and 2016. Again Please:");
                    }

                    if(keyWords.length < 3 || keyWords.length > 5){
                        control=false;
                        errcount++;
                        System.out.println(errcount + ". error, in input Rule: A string array for the book’s keywords which are at least 3 words and most 5 words separated by a comma. Again Please:");
                    }

                    if(control){//Added control
                        Book o = new Book(bookName, authorName, ISBN, numPages, pubYear, keyWords);
                        for(int n = 0; n<=book.length; n++ ){
                            if(book[n]==null){
                                book[n] = o;
                                break;
                            }
                        }
                        System.out.println("Added!");
                    }
                    break;
                case 'D':
                    Character Deletespace_cotrol = input.charAt(1);
                    if(!(Deletespace_cotrol.equals(' '))){
                        control=false;
                        errcount++;
                        System.out.println(errcount + ". error, Delete in input: A space is missing after the choice character. Again Please:");
                    }

                    if(control){
                        String aWord = input.substring(2, (input.length()));
                        boolean found=false;
                        for(int i = 0; i<book.length && book[i]!=null; i++){
                            if(book[i].searchKeyWord(aWord)){
                                delete(book, aWord);
                                found = true;
                                break;
                            }
                        }

                        if(found){
                            System.out.println("");
                            System.out.println("Deleted!");
                        }
                        else {
                            System.out.println("");
                            System.out.println("Not found!");
                        }
                    }
                    break;
                case 'S':
                    if(!(input.length()==1)){
                        control = false;
                        errcount++;
                        System.out.println(errcount + ". error, Quick Sorted in input: Just input a 'S' character. Again Please:");
                    }
                    if(control){
                        System.out.println("");
                        if(book[0]==null){
                            System.out.println("Not record");
                        }
                        else {
                            int booksize=0;
                            for(int i = 0; i<book.length && book[i]!=null; i++){
                                booksize++;
                            }
                            quicksort(book, 0, booksize-1);
                            System.out.print("Quick Sorted!\n");
                        }
                    }
                    break;
                case 'L':
                    if(!(input.length()==1)){
                        control = false;
                        errcount++;
                        System.out.println(errcount + ". error, Brute-force way sorted in input: Just input a 'L' character. Again Please:");
                    }
                    if(control){
                    System.out.println("");
                        if(book[0]==null){
                            System.out.print("Not record");
                        }
                        else {
                            sort(book);
                        }
                        System.out.println("");
                    }
                    break;
                case 'X':
                    System.out.println("");
                    if(!(input.length()==1)){
                        control = false;
                        errcount++;
                        System.out.println(errcount + ". error, List in input: Just input a X character. Again Please:");
                    }
                    if(control){
                        for(int i = 0; i<book.length && book[i]!=null; i++){
                            book[i].Display();
                            System.out.println("");
                        }
                        if(book[0]==null){
                            System.out.println("Not record");
                        }
                    }
                    break;
                case 'Q':
                    break;
            }
            System.out.println("");
        } while(choice!='Q');

        System.out.println("Good bye!");
    }catch (Exception e) {

            System.out.println("Error, in all input rule:\nchoice(Character) (space) bookName(String), authorName(String), ISBN(String), numPages(int), pubYear(int), keyWords(String[]: separated by a comma)\nOr there are any problem, again start.");
        }
    }

    public static void delete(Book[] bookArray, String aWord){
        boolean flag;
        for(int i = 0; i<bookArray.length && bookArray[i]!=null;){
            flag = false;
            String[] k = bookArray[i].getkWords();
            for(int x = 0; x < k.length; x++){
                if (k[x].equals(aWord)){
                    for(int z=i; z<bookArray.length && bookArray[z]!=null; z++){
                        bookArray[z]=bookArray[z+1];
                    }
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                i++;
            }
        }
    }

    public static void sort(Book[] bookArray){
        Book tmp;
        for (int i = 0; bookArray[i+1]!=null; i++){
            int maxid=i;
            for (int j = i+1; bookArray[j]!=null; j++){

                if(bookArray[maxid].getnPages() < bookArray[j].getnPages()){
                    maxid=j;
                }
            }
            //swap
            tmp = bookArray[i];
            bookArray[i]= bookArray[maxid];
            bookArray[maxid]= tmp;
        }
        System.out.print("Brute-force way sorted!");
    }

    public static void quicksort(Book[] bookArray, int left, int right) {
        int index = partition(bookArray, left, right);
        if (left < index - 1)
            quicksort(bookArray, left, index - 1);
        if (index < right)
            quicksort(bookArray, index, right);
    }

    public static int partition(Book[] bookArray, int left, int right)
    {
        int i = left, j = right;
        Book tmp;
        int pivot = bookArray[(left + right) / 2].getnPages();

        while (i <= j) {
            while (bookArray[i].getnPages() > pivot)
                i++;
            while (bookArray[j].getnPages() < pivot)
                j--;
            if (i <= j) {
                //swap
                tmp = bookArray[i];
                bookArray[i] = bookArray[j];
                bookArray[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

}
