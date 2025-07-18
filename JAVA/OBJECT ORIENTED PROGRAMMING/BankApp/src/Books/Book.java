package Books;

public enum Book {
    //Declaring constants of enum types
    JHTP("Java How To Program", "2018"),
    CHTP("C How To Program", "2016"),
    IW3HTP("Internet & World Wide Web, How To Program", "2012"),
    CPPHTP("C++, How To Program", "2017"),
    VBHTP("Visual Basic, How To Program", "2014");

    //Instance variables of the enum
    private final String bookName;
    private final String copyrightYear;

    // constructor of the enum
    Book(String bookName, String copyrightYear){
        this.bookName = bookName;
        this.copyrightYear = copyrightYear;
    }

    //getters
    public String getBookName(){
        return this.bookName;
    }

    public String getCopyrightYear(){
        return this.copyrightYear;
    }
}
