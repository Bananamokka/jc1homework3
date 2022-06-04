package com.bananamokka.Util;

import com.bananamokka.domain.Book;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class BookGenerator {

    public static String[] BookNames = new String[]{"Under Your Scars", "Key", "Olymp", "Savage", "Avalon", "Watermelon", "Jade"};
    public static String[] AuthorsNames = new String[]{"Andrew", "Ivan", "Vasiley", "Vladimir"};
    public static String[] AuthorsSurnames = new String[]{"Ivanov", "Petrov", "Russkih", "Afanasiev", "Emelyanov"};
    public static String[] AuthorsFathersNames = new String[]{"Ivanovich", "Alexeevich", "Sergeevich", "Dmitrievich", "Petrovich"};

    public static List<Book> generateListOfBooks(int count) {

        List<Book> Books = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            Books.add(new Book());
            Books.get(i).setID(i + 1);
            Books.get(i).setBookName(BookNames[(int) (Math.random() * (BookNames.length - 1))]);
            Books.get(i).setAuthorsName(AuthorsNames[(int) (Math.random() * (AuthorsNames.length - 1))]);
            Books.get(i).setAuthorsSurname(AuthorsSurnames[(int) (Math.random() * (AuthorsSurnames.length - 1))]);
            Books.get(i).setAuthorsFathersName(AuthorsFathersNames[(int) (Math.random() * (AuthorsFathersNames.length - 1))]);
        }
        return Books;
    }

    public static HashSet<Book> generateHashSetOfBooks(int count) {
        HashSet<Book> HashBooks = new HashSet<>();
        for (int i = 0; i < count - 5; i++) {
            Book NewBook = new Book();
            NewBook.setID(i + 1);
            NewBook.setBookName(BookNames[(int) (Math.random() * (BookNames.length - 1))]);
            NewBook.setAuthorsName(AuthorsNames[(int) (Math.random() * (AuthorsNames.length - 1))]);
            NewBook.setAuthorsSurname(AuthorsSurnames[(int) (Math.random() * (AuthorsSurnames.length - 1))]);
            NewBook.setAuthorsFathersName(AuthorsFathersNames[(int) (Math.random() * (AuthorsFathersNames.length - 1))]);
            HashBooks.add(NewBook);
        }
        for (int j = 0; j < 7; j++) {
            Book CloneBook = new Book();
            CloneBook.setID(j + 20);
            CloneBook.setBookName("Oak");
            CloneBook.setAuthorsName("Alexey");
            CloneBook.setAuthorsSurname("Vasiliev");
            CloneBook.setAuthorsFathersName("Nickolaevich");
            HashBooks.add(CloneBook);
        }
        return HashBooks;
    }
    public static void booksWithVowels(HashSet<Book> HashBooks) {
        for (Book b: HashBooks) {
            if (b.getBookName().matches("^[eyuioaEYUIOA]"));
            System.out.println(b);
        }
    }
}


