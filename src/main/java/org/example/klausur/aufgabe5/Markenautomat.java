package org.example.klausur.aufgabe5;

import java.util.List;

public class Markenautomat extends Thread {
    private final List<Integer> warteliste;

    public Markenautomat(List<Integer> warteliste) {
        this.warteliste = warteliste;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            synchronized (warteliste) {
                warteliste.add(i);
                warteliste.notifyAll();
            }
            System.out.println("Eine Wartenummer wurde erstellt: " + i);
            try {
                Thread.sleep((int) (Math.random() * 2000.0));
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    /*
    *   @Override
    public void run() {
        int i = 0;
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (warteliste) {
                warteliste.add(i++);
                warteliste.notifyAll();
            }
            System.out.println("Eine Wartenummer wurde erstellt: " + i);
            try {
                Thread.sleep((int) (Math.random() * 2000.0));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }
    *
    * */
}
