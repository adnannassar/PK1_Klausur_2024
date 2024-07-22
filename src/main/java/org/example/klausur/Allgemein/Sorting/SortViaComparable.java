package org.example.klausur.Allgemein.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortViaComparable {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>(Arrays.asList(
                new Student("Sabri", 20),
                new Student("Emna", 19),
                new Student("Ola", 22)
        ));

        Collections.sort(students);
    }

}
