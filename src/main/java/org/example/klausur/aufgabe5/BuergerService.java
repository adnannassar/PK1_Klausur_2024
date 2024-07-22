package org.example.klausur.aufgabe5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BuergerService {
    public static void main(String[] args) {
        List<Integer> warteliste = new LinkedList<>();

        /*
        Thread[] threads = {
                new Markenautomat(warteliste),
                new Sachbearbeiter("Sabri", warteliste),
                new Sachbearbeiter("Ola", warteliste),
                new Sachbearbeiter("Emna", warteliste),
                new Sachbearbeiter("Adnan", warteliste)
        };
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

         */



        LinkedList<Thread> threads = new LinkedList<>(Arrays.asList(
                new Markenautomat(warteliste),
                new Sachbearbeiter("Sabri", warteliste),
                new Sachbearbeiter("Ola", warteliste),
                new Sachbearbeiter("Emna", warteliste),
                new Sachbearbeiter("Adnan", warteliste)
        ));


        for (Thread thread : threads) {
            thread.start();
        }


    }
}
