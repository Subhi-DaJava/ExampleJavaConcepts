package getter_setter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthors(new String[]{"A", "B", "C"});
        book.setTitle("Very Tech Trip");
        book.setYearOfPublishing(2023);


        System.out.println(book.getTitle() + "\n" + book.getYearOfPublishing() + "\t" + Arrays.toString(book.getAuthors()));
    }
}
