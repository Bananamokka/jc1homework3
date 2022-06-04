package com.bananamokka.domain;

import java.util.Comparator;

public class Book implements Comparator<Book> {

    private int ID;
    private String bookName;
    private String authorsName;
    private String authorsSurname;
    private String authorsFathersName;

    public Book() {

    }

    public Book(int ID, String bookName, String authorsName, String authorsSurname, String authorsFathersName) {
        this.ID = ID;
        this.bookName = bookName;
        this.authorsName = authorsName;
        this.authorsSurname = authorsSurname;
        this.authorsFathersName = authorsFathersName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public String getAuthorsSurname() {
        return authorsSurname;
    }

    public void setAuthorsSurname(String authorsSurname) {
        this.authorsSurname = authorsSurname;
    }

    public String getAuthorsFathersName() {
        return authorsFathersName;
    }

    public void setAuthorsFathersName(String authorsFathersName) {
        this.authorsFathersName = authorsFathersName;
    }

    @Override
    public String toString() {
        return ID + ") " + bookName + " - " + authorsSurname + " " + authorsName + " " + authorsFathersName;

    }


    @Override
    public int compare(Book o1, Book o2) {
        return 0;
    }
}

