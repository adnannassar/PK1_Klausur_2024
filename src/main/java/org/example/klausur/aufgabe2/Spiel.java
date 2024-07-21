package org.example.klausur.aufgabe2;

import java.util.Objects;

public class Spiel implements Comparable<Spiel> {
    private String titel;
    private int erscheinungsjahr;
    private int rating;

    public Spiel(String titel, int erscheinungsjahr, int rating) {
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return titel + " (" + erscheinungsjahr + ") - Rating: " + rating;
    }

    @Override
    public int compareTo(Spiel o) {
        return this.titel.compareTo(o.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erscheinungsjahr, rating, titel);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Spiel other = (Spiel) obj;
        return erscheinungsjahr == other.erscheinungsjahr && rating == other.rating
                && Objects.equals(titel, other.titel);
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public void setErscheinungsjahr(int erscheinungsjahr) {
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


}