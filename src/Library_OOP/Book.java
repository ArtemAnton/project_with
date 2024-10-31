package Library_OOP;

public class Book {
    String title;
    String author;
    Integer year;
    Integer page;

    public Book(String title, String author, Integer year, Integer page) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.page = page;
    }

    public String get_title() {
        return title;
    }

    public String get_author() {
        return author;
    }

    public Integer get_year(){
        return year;
    }

    public Integer get_page(){
        return page;
    }
}
