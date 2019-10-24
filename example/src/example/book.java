package example;

public class book {

    private String aName;
    private String ISBNnumber;
    private int nPages;
    private int pYear;
    private String[] kWords;


    public Book(String bookName, String authorName, String ISBN, int numPages, int pubYear, String[]  keyWords){
        bName = bookName;
        aName = authorName;
        ISBNnumber = ISBN;
        nPages = numPages;
        pYear = pubYear;
        kWords = keyWords;
    }

    public Book(){
        bName = null;
        aName = null;
        ISBNnumber = null;
        nPages = 0;
        pYear = 0;
        kWords = null;
    }

    /
    public String getbName()
    {
        return bName;
    }

    public String getaName()
    {
        return aName;
    }

    public String getISBNnumber()
    {
        return ISBNnumber;
    }

    public int getnPages()
    {
        return nPages;
    }

    public int getpYear()
    {
        return pYear;
    }

    public String[] getkWords()
    {
        return kWords;
    }


    public void setbName(String nameOfBook)
    {
            bName = nameOfBook;
    }

    public void setaName(String nameOfAuthor)
    {
        aName = nameOfAuthor;
    }

    public void setISBNnumber(String numberOfISBN)
    {
        ISBNnumber = numberOfISBN;
    }

    public void setnPages(int numberOfPages)
    {
        nPages = numberOfPages;
    }

    public void setpYear(int yearOfPub)
    {
        pYear = yearOfPub;
    }

    public void setkWords(String[] wordsOfKey)
    {
        kWords = wordsOfKey;
    }

    public void Display(){
        System.out.print(getbName() + ", " + getaName() + ", " + getISBNnumber() + ", " + getnPages() + ", " + getpYear());
        for(int z = 0; z < getkWords().length; z++){
            String[] k = getkWords();
            System.out.print(", " + k[z]);
        }
        System.out.print(".");
    }

    public boolean searchKeyWord(String aWord){
        String[] k = getkWords();
        for(int x = 0; x < k.length; x++){
            if (k[x].equals(aWord)){
                return true;
            }
        }
        return false;
    }
}

}
