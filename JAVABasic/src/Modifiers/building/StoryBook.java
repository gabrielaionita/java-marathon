package Modifiers.building;

import Modifiers.library.Book;

public class StoryBook extends Book {

    void complete() {
        Book book = new Book();
        book.isbn = "9124568";
        book.printBook();
    }
}
