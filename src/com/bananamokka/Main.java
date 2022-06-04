package com.bananamokka;

import com.bananamokka.Util.*;
import com.bananamokka.domain.Book;
import com.bananamokka.domain.Student;
import com.bananamokka.domain.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("LinkedList of Books:");

        List<Book> Books = BookGenerator.generateListOfBooks(20);
        for (int i = 0; i < 20; i++) {
            System.out.println(Books.get(i));
        }

        System.out.println("LinkedList of Books without 7th element:");

        Books.remove(6);
        for (int i = 0; i < 19; i++) {
            System.out.println(Books.get(i));
        }

        System.out.println("HashSet of Books:");

        HashSet<Book> HashBooks = BookGenerator.generateHashSetOfBooks(25);
        for (Book i : HashBooks) {
            System.out.println(i);

        }

        System.out.println("Books, started with vowels:");
        for (Book i : HashBooks) {
            if (!i.getBookName().matches("^[^eyuioaEYUIOA]\\w++")) System.out.println(i);
        }

        System.out.println("Books, sorted by surname");
        Comparator<Book> Compare = new BookComparatorBySurname();
        Books.sort(Compare);
        for (Book i : Books) {
            System.out.println(i);
        }

        System.out.println("Books, sorted by name");
        Compare = new BookComparatorByName();
        Books.sort(Compare);
        for (Book i : Books) {
            System.out.println(i);
        }

        System.out.println("Books, sorted by fathersname");
        Compare = new BookComparatorByFathersname();
        Books.sort(Compare);
        for (Book i : Books) {
            System.out.println(i);
        }

        TreeSet<Student> Students = StudentGenerator.generateStudents(10);
        System.out.println(Students);
        Students.iterator();
        Iterator<Student> itr = Students.iterator();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
            itr.next();
        }
        System.out.println("Info about every even Student:");
        System.out.println(Students);

        List<User> Users = UserGenerator.generateUser(5);
        for (User i : Users) {
            System.out.println(i);
        }
    }
}



