package org.example.klausur.aufgabe5;

import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.util.List;

public class Sachbearbeiter extends Thread  {
    private String name;
    private List<Integer> warteliste;


    public Sachbearbeiter(String name, List<Integer> warteliste) {
        this.name = name;
        this.warteliste = warteliste;
    }


    @Override
    public void run() {
        int anzahlBearbeitetenBürger = 0;
        while (anzahlBearbeitetenBürger < 25) {
            int nummer;
            synchronized (warteliste) {
                while (warteliste.isEmpty()) {
                    try {
                        warteliste.wait();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
                nummer = warteliste.remove(0);
            }
            System.out.println("Mitarbeiter: " + name + " bearbeitet gerade die nummer " + nummer);
            anzahlBearbeitetenBürger++;

            try {
                Thread.sleep((int) (Math.random() * 4000.0));
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /*
     @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            int nummer;
            synchronized (warteliste) {
                while (warteliste.isEmpty()) {
                    try {
                        warteliste.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                nummer = warteliste.remove(0);
            }
            System.out.println("Mitarbeiter: " + name + " bearbeitet gerade die nummer " + nummer);

            try {
                Thread.sleep((int) (Math.random() * 4000.0));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

     */
}
