package org.example.klausur.Allgemein;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println(String.format("%04d", new Random().nextInt(10000)));
    }
}
