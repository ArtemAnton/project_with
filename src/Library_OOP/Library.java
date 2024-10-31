package Library_OOP;

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void add_book(Book book){
        books.add(book);
    }

    public Book get_book(int index) {
        Book book = books.get(index);
        System.out.println("Title: " + book.get_title());
        System.out.println("Author: " + book.get_author());
        System.out.println("Year: " + book.get_year());
        System.out.println("Page: " + book.get_page());
        return book;
    }

}
