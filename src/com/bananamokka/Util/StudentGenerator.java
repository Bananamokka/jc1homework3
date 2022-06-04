package com.bananamokka.Util;

import com.bananamokka.domain.Student;

import java.util.TreeSet;

public class StudentGenerator {

    public static TreeSet<Student> generateStudents(int count) {

        TreeSet<Student> Students = new TreeSet<>();
        String [] Names = new String[] {"Amanda", "Michael", "Trevor", "Carl", "Cesar", "Lance","Melvin", "Mike", "Ken","Thomas"};
        String [] Surnames = new String[] {"Townly", "de Santa", "Phillips", "Johnson", "Vialpando", "Wilson", "Harris", "Toreno", "Rosenberg", "Vercetti"};
        for (int i = 0; i < count; i++) {
            Student student = new Student();
            student.setStudentName(Names[i]);
            student.setStudentSurname(Surnames[i]);
            Students.add(student);
        }
        return Students;
    }
}
