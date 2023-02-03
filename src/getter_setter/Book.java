package getter_setter;

public class Book {
    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String[] getAuthors() {
        if (this.authors == null) {
            throw new RuntimeException("Book must have au author min!");
        }
        return this.authors.clone();
    }

    public void setAuthors(String[] authors) {
        this.authors = authors.clone();
    }
}
