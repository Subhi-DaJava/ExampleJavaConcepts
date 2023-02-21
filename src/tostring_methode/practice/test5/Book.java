package tostring_methode.practice.test5;

import java.util.Arrays;

/**
 * Books as strings
 * Here's a class named Book. It has three fields: string field title, int field yearOfPublishing and an array of strings authors.
 * Override the method toString in the class to return string representations of books.
 *
 * The overridden method must return a string including all field-value pairs separated by commas.
 * An array of authors always includes at least one author. Do not add a comma after the last author.
 *
 * Here is an example: "title=Java 8 & 9 in Action,yearOfPublishing=2017,authors=[Mario Fusco,Alan Mycroft]".
 * Pay attention, the quote marks are not part of the string.
 */
public class Book {
    public static void main(String[] args) {
        Book book = new Book("Java 8 & 9 in Action",2017, new String[]{"Mario Fusco", "Alan Mycroft"});
        System.out.println(book);
    }
    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors; // authors.clone()
    }

    @Override
    public String toString() {
      //  return "\"title=" + title + ", yearOfPublishing=" + yearOfPublishing + ", authors=" + Arrays.toString(authors) + "\""; // pay attention with white spaces
        return "title=" + title + ",yearOfPublishing=" + yearOfPublishing +
                ",authors=" + Arrays.toString(authors).replace(", ", ",");
    }
}
