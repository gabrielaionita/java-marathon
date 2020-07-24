package Modifiers.building;

import Modifiers.library.Book;

public class House {

    void run() {
        Book book = new Book();
        book.isbn = "9124568";
        book.printBook();
    }
}

