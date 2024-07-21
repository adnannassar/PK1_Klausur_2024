package org.example.klausur.aufgabe2;

import java.util.Comparator;

public interface ISpieleDatenbank {
	/**
	 * Fuegt das gegebene Spiel zur Datenbank hinzu, falls dieses noch nicht
	 * enthalten ist (Überprüfung mittels "contains"!). Ist das Spiel in der
	 * Datenbank schon enthalten, so tut diese Methode nichts.
	 * 
	 * @param spiel Spiel, welches der Datenbank hinzugefuegt werden soll.
	 */
	public void fuegeHinzu(Spiel spiel);

	/**
	 * Gibt alle Inhalte der Datenbank als String zurueck. Die Inhalte sind nach der
	 * natuerlichen Ordnung (= aufsteigend nach Titel) sortiert.
	 * 
	 * @return Alle Inhalte der Datenbank als String in folgendem Format: 
	 * 			Elden Ring (2022) - Rating: 96
	 * 			Marvel's Spider-Man 2 (2023) - Rating: 90
	 * 		    The Witcher 3 (2015) - Rating: 94
	 */
	public String gibInhalte();

	/**
	 * Gibt alle Inhalte der Datenbank als String zurueck. Die Inhalte sind gemaess 
	 * dem gegebenen Comparator sortiert.
	 * 
	 * @return Alle Inhalte der Datenbank als String in folgendem Format: 
	 * 			Elden Ring (2022) - Rating: 96
	 * 		    The Witcher 3 (2015) - Rating: 94
	 *         Marvel's Spider-Man 2 (2023) - Rating: 90
	 */
	public String gibInhalte(Comparator<Spiel> comparator);
}
