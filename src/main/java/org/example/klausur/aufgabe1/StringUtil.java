package org.example.klausur.aufgabe1;

public class StringUtil {
	// Wichtig! Aenderungen nur im "aenderbaren Bereich" durchfuehren
    // ----- Start "aenderbarer Bereich" ------ 
	
	public static String grossbuchstaben(String string) {
		return string.toUpperCase();
	}

	public static String rueckwaerts(String string) {
		String ergebnis = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			ergebnis += string.charAt(i);
		}
		return ergebnis;
	}

	// ----- Ende "aenderbarer Bereich" ------ 
	
	public static void main(String[] args) {
		var test = "liga";
		System.out.println(rueckwaerts(grossbuchstaben(test)));
	}
}
