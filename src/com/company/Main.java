package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new PupilAdapter(new Pupil("Andrzej", "Nowak", "anowak@sda.pl", 19, 4)));
        for (Student student : students) {
            System.out.println(student.getFullName());
            System.out.println(student.getContactDetails());
            System.out.println(student.getResults());
            System.out.println(student.isAdult());
        }
    }
}
