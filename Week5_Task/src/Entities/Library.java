package Entities;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private ArrayList<Book> mybooks; //instead Book[] Array list is used

    public Library()
    {
        mybooks= new ArrayList<>();

    }

    public void AddBook(Book book1)
    {
        for (Book existingBook : mybooks) {
            if (existingBook.getName().equals(book1.getName())) {
                // If yes, increase the count and exit
                existingBook.increaseCount(book1.getCount());
                return;
            }
        }
        //If not
        mybooks.add(book1);

    }


    public void ShowBooks()
    {
        for (Book book:mybooks)
        {
            book.FullInfo();
            System.out.println("\n");
        }
    }

}
