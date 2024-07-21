package org.example.klausur.aufgabe2;

import java.util.*;

public class SpieleDatenbank implements ISpieleDatenbank {

    private ArrayList<Spiel> liste = new ArrayList<>();
    private int anzahlSpiele = 0;


    /**
     * Fuegt das gegebene Spiel zur Datenbank hinzu, falls dieses noch nicht
     * enthalten ist (Überprüfung mittels "contains"!). Ist das Spiel in der
     * Datenbank schon enthalten, so tut diese Methode nichts.
     *
     * @param spiel Spiel, welches der Datenbank hinzugefuegt werden soll.
     */
    @Override
    public void fuegeHinzu(Spiel spiel) {
        if (!liste.contains(spiel)) {
            liste.add(spiel);
            Collections.sort(liste);
        }
    }

    /**
     * Gibt alle Inhalte der Datenbank als String zurueck. Die Inhalte sind nach der
     * natuerlichen Ordnung (= aufsteigend nach Titel) sortiert.
     *
     * @return Alle Inhalte der Datenbank als String in folgendem Format:
     * Elden Ring (2022) - Rating: 96
     * Marvel's Spider-Man 2 (2023) - Rating: 90
     * The Witcher 3 (2015) - Rating: 94
     */
    @Override
    public String gibInhalte() {
        StringBuilder ergebnis = new StringBuilder();
        for (Spiel spiel : liste) {
            ergebnis.append(spiel);
            ergebnis.append("\n");
        }
        return ergebnis.toString();
    }

    @Override
    public String gibInhalte(Comparator<Spiel> comparator) {
        liste.sort(comparator);
        return gibInhalte();
    }


    public static void main(String[] args) {
        SpieleDatenbank db = new SpieleDatenbank();

        db.fuegeHinzu(new Spiel("Elden Ring", 2022, 96));
        db.fuegeHinzu(new Spiel("The Witcher 3", 2015, 94));
        db.fuegeHinzu(new Spiel("Marvel's Spider-Man 2", 2023, 90));
        // Die folgende Zeile sollte keine Auswirkung haben, da diese Spiel schon
        // in der Datenbank vorhanden ist
        db.fuegeHinzu(new Spiel("Marvel's Spider-Man 2", 2023, 90));

        System.out.println(db.gibInhalte()); // Standardsortierung nach Titel aufsteigend


        // Spezialsortierung nach Rating absteigend
        System.out.println(db.gibInhalte(new RatingComparator()));
    }
}