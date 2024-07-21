package org.example.klausur.aufgabe1;

public class Anmeldeliste {
    private Student[] anmeldeliste;

    public Anmeldeliste() {
        this.anmeldeliste = new Student[5];
    }

    // Wichtig! Aenderungen nur im "aenderbaren Bereich" durchfuehren
    // ----- Start "aenderbarer Bereich" ------

    public void meldeAn(Student student) {

        /* if the IDs of the Students are not from 1 to 4 for example(10-14)
        for (int i = 0; i < anmeldeliste.length; i++) {
            if (anmeldeliste[i] == null) {
                anmeldeliste[i] = student;
                break;
            }
        }

         */
        this.anmeldeliste[student.getId() - 1] = student;
    }

    public void printListe() {
        for(Student s : anmeldeliste) {
            if(s != null) {
                System.out.println(s.getId() + " - " + s.getName());
            }
        }
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
