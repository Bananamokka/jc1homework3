package com.bananamokka.Util;

import com.bananamokka.domain.Book;

import java.util.Comparator;

public class BookComparatorBySurname implements Comparator<Book> {

    public int compare(Book b1, Book b2) {
        return b1.getAuthorsSurname().compareTo(b2.getAuthorsSurname());
    }
}
