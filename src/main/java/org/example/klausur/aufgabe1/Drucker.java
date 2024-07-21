package org.example.klausur.aufgabe1;

public class Drucker {
    private int tonerstandInProzent;
    private int anzahlBlaetter;

    public Drucker(int tonerstandInProzent, int anzahlBlaetter) {
        this.tonerstandInProzent = tonerstandInProzent;
        this.anzahlBlaetter = anzahlBlaetter;
    }

    @Override
    public String toString() {
        return "Tonerstand: " + tonerstandInProzent + "%, Anzahl Blätter: " + anzahlBlaetter;
    }

    public void drucke(int anzahlSeiten) throws TonerLeerException, PapierLeerException {
        if (tonerstandInProzent == 0)
            throw new TonerLeerException("tonerstandInProzent ist zero");
        if (anzahlBlaetter == 0 || anzahlSeiten > anzahlBlaetter)
            throw new PapierLeerException("anzahlBlaetter <= 0 oder anzahlSeiten zu groß");

        // vereinfachte Annahmen:
        // * es gibt keinen Duplexdruck
        // * jeder Druck kostet konstant 10% Toner
        anzahlBlaetter -= anzahlSeiten;
        tonerstandInProzent -= 10;
    }

    class TonerLeerException extends Exception {
        private static final long serialVersionUID = 8986420973014322212L;

        public TonerLeerException(String message) {
            super(message);
        }
    }

    class PapierLeerException extends Exception {
        private static final long serialVersionUID = -1820553331588291733L;

        public PapierLeerException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        var drucker = new Drucker(30, 6);
        try {
            drucker.drucke(40);
            System.out.println(drucker);

            // Testfall 1: Papier leer (einkommentieren zum Testen)
//			drucker.drucke(5);

            // Testfall 2: Toner leer (einkommentieren zum Testen)
//			drucker.drucke(1);
//			drucker.drucke(1);
//			drucker.drucke(1);

            System.out.println(drucker);
        } catch (TonerLeerException | PapierLeerException exp) {
            System.out.println(exp.getMessage());
        }
    }
}
