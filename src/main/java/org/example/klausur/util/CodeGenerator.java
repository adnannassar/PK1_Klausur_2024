package org.example.klausur.util;

import java.util.Random;

public class CodeGenerator {
	private static Random random = new Random();

	/**
	 * Erzeugt einen zufaelligen Code, bestehend aus 4 Ziffern.
	 * 
	 * @return Ein zufaelliger Code, bestehend aus 4 Ziffern.
	 */
	public static String generateCode() {
		return String.format("%04d", random.nextInt(10000));
	}
}