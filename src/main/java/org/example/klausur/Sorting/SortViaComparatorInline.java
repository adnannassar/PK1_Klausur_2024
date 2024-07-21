package org.example.klausur.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortViaComparatorInline {

    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>(Arrays.asList(
                new Student("Sabri", 20),
                new Student("Emna", 19),
                new Student("Ola", 22)
        ));


        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


    }
}
