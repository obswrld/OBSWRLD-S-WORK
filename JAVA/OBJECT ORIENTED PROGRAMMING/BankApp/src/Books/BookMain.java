package Books;
import java.util.EnumSet;

public class BookMain {
    public static void main(String[] args) {
        System.out.println("ALl Books");

        for (Book book : Book.values()){
            System.out.printf("%-10s%-45s%s%n", book, book.getBookName(), book.getCopyrightYear());
        }

        System.out.println("Display a range of enum constants");

        for (Book book : EnumSet.allOf(Book.class)) {
            System.out.printf("%-10s-%45s%s%n", book, book.getBookName(), book.getCopyrightYear());
        }
    }
}
