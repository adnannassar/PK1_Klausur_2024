package org.example.klausur.aufgabe_1_a;

public class Anmeldeliste {
	private Student[] anmeldeliste;

	public Anmeldeliste() {
		this.anmeldeliste = new Student[5];
	}

	// Wichtig! Aenderungen nur im "aenderbaren Bereich" durchfuehren
	// ----- Start "aenderbarer Bereich" ------ 
	
	public void meldeAn(Student student) {

	}

	public void printListe() {

	}
	
	// ----- Ende "aenderbarer Bereich" ------ 

	public static void main(String[] args) {
		var liste = new Anmeldeliste();
		liste.meldeAn(new Student(1, "Marina"));
		liste.meldeAn(new Student(2, "Hakim"));
		liste.meldeAn(new Student(3, "Jeanette"));
		liste.meldeAn(new Student(4, "Thorsten"));
		liste.printListe();
	}

	static class Student {
		private int id;
		private String name;

		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}
	}
}
