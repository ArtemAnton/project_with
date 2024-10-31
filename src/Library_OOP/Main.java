package Library_OOP;

public class Main {
    public static void main(String[] args) {

        Library books = new Library();

        Book book1 = new Book("1984", "George Orwell", 1949, 328);
        Book book2 = new Book("Brave New World", "Aldous Huxley", 1932, 311);
        Book book3 = new Book("Fahrenheit 451", "Ray Bradbury", 1953, 160);

        books.add_book(book1);
        books.add_book(book2);
        books.add_book(book3);

        books.get_book(0);
        books.get_book(1);
        books.get_book(2);
    }
}
