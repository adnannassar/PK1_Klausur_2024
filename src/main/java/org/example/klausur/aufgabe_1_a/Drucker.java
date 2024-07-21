package org.example.klausur.aufgabe_1_a;

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

	public void drucke(int anzahlSeiten) throws Exception {
		if (tonerstandInProzent == 0)
			throw new TonerLeerException();
		if (anzahlBlaetter == 0 || anzahlBlaetter - anzahlSeiten < 0)
			throw new PapierLeerException();

		// vereinfachte Annahmen:
		// * es gibt keinen Duplexdruck
		// * jeder Druck kostet konstant 10% Toner
		anzahlBlaetter -= anzahlSeiten;
		tonerstandInProzent -= 10;
	}

	class TonerLeerException extends Exception {
		private static final long serialVersionUID = 8986420973014322212L;
	}

	class PapierLeerException extends Exception {
		private static final long serialVersionUID = -1820553331588291733L;
	}

	public static void main(String[] args) {
		var drucker = new Drucker(30, 6);
		try {
			drucker.drucke(2);
			System.out.println(drucker);

			// Testfall 1: Papier leer (einkommentieren zum Testen)
//			drucker.drucke(5);

			// Testfall 2: Toner leer (einkommentieren zum Testen)
//			drucker.drucke(1);
//			drucker.drucke(1);
//			drucker.drucke(1);

			System.out.println(drucker);
		} catch (Exception exp) {
			// eat it!
			exp.printStackTrace();
		}
	}
}
