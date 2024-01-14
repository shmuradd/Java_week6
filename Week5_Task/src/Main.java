import Entities.Book;
import Entities.Library;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating books
        //Automatic id given
        Book book1 = new Book("Kozetta", "Viktor Hugo", "French", 10, 5);
        Book book2 = new Book("Robinzon Kruzo", " Daniel Defoe'", "English", 16, 8);
        //Manually id given
        Book book3 = new Book(10,"Cinayet ve Ceza", "Fyodr Dostoyevski", "Russian", 10, 15);
        Book book4 = new Book(11,"Bakı bulvarı", "Chingiz Abdullayev", "Azerbaijani", 10, 20);
        // Creating a library and adding books
        Library library = new Library();
        library.AddBook(book1);
        library.AddBook(book2);
        library.AddBook(book3);
        library.AddBook(book4);
        // Adding a new book with the same name to the library
        Book newBook = new Book(11,"Bakı bulvarı", "Chingiz Abdullayev", "Azerbaijani", 10, 10);
        library.AddBook(newBook);

        // Showing all books in the library
        library.ShowBooks();

        }
    }


