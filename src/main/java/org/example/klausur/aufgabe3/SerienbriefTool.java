package org.example.klausur.aufgabe3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class SerienbriefTool {
    private static void erzeugeBrief(String dateiname, Map<String, String> daten) {
        File f = new File("vorlage.txt");
        if (!f.isDirectory() && f.exists()) {
            try {
                String content = Files.readString(f.toPath());

                for (Map.Entry<String, String> entry : daten.entrySet()) {
                    content = content.replace("${" + entry.getKey() + "}", entry.getValue());
                }
                /*
                content = content.replace("${anrede}", daten.get("anrede"));
                content = content.replace("${nachname}", daten.get("nachname"));
                content = content.replace("${betrag}", daten.get("anrede"));
                content = content.replace("${frist}", daten.get("frist"));
                 */

                FileWriter fw = new FileWriter(dateiname);
                System.out.println(content);
                fw.write(content);
                fw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {
        var werte1 = new HashMap<String, String>();
        werte1.put("anrede", "Frau");
        werte1.put("nachname", "Swift");
        werte1.put("betrag", "25,50 Euro");
        werte1.put("frist", "27.11.2024");

        var werte2 = new HashMap<String, String>();
        werte2.put("anrede", "Herr");
        werte2.put("nachname", "Gosling");
        werte2.put("betrag", "42,23 Euro");
        werte2.put("frist", "07.09.2024");

        erzeugeBrief("brief1.txt", werte1);
        System.out.println();
        erzeugeBrief("brief2.txt", werte2);
    }
}
