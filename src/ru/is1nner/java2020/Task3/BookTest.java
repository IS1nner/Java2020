package ru.is1nner.java2020.Task3;

import ru.is1nner.java2020.Task3.Book;

public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("Fyodor Dostoevsky", "Crime and Punishment", 1866, "Novel", 237);

        System.out.println("Book before editing:\n" + book);

        book.setAuthor("Alexander Pushkin");
        book.setTitle("Eugene Onegin");
        book.setYear(1833);
        book.setGenre("Novel in verse");
        book.setPages(127);

        System.out.println("\nBook after editing:\n" + book);
    }
}