package org.example.klausur.aufgabe2;

import java.util.Comparator;

public class RatingComparator implements Comparator<Spiel> {

    @Override
    public int compare(Spiel o1, Spiel o2) {
      return o2.getRating() - o1.getRating();
    }
}

