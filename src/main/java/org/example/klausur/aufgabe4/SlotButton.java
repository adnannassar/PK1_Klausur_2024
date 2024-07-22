package org.example.klausur.aufgabe4;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import org.example.klausur.aufgabe4.util.CodeGenerator;
import org.example.klausur.aufgabe4.util.DialogUtil;

public class
SlotButton extends Button {

    private boolean istFrei;
    private String code;

    public SlotButton(int slotNr) {
        super("Slot " + slotNr);
        this.setIstFrei(true);
        initSize();
        this.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                handleClick();
            }
        });
    }

    private void handleClick() {
        if (this.istFrei) {
            fahrradParkBeginnen();
        } else {
            fahrradParkBeenden();
        }
    }

    public void fahrradParkBeginnen() {
        code = CodeGenerator.generateCode();
        setIstFrei(false);
        DialogUtil.showMessageDialog("Erfolgreich", "Fach erfolgreich belegt. Hier ist Ihr Abholung-Code: " + code);
    }

    public void fahrradParkBeenden() {
        String eingabe = DialogUtil.showInputDialog("Code-Eingabe", "Bitte geben Sie den Code ein!");
        if (eingabe.equalsIgnoreCase(code)) {
            setIstFrei(true);
        } else {
            DialogUtil.showErrorDialog("Fehler", "Der Code war leider falsch");
        }
    }


    public void setIstFrei(boolean istFrei) {
        if (!istFrei) {
            this.setRedColor();
        } else {
            this.setGreenColor();
        }
        this.istFrei = istFrei;
    }


    // Hilfsmethoden - zur Nutzung auskommentieren!

    /**
     * Sorgt dafuer, dass der Button den verfuegbaren Platz ausnutzt und
     * entsprechend waechst.
     */
    private void initSize() {
        GridPane.setVgrow(this, Priority.ALWAYS);
        GridPane.setHgrow(this, Priority.ALWAYS);
        GridPane.setFillWidth(this, true);
        GridPane.setFillHeight(this, true);
        this.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    }

    /**
     * Setzt die Farbe des Buttons auf gruen.
     */
    private void setGreenColor() {
        this.setStyle("-fx-background-color: MediumSeaGreen");
    }

    /**
     * Setzt die Farbe des Buttons auf rot.
     */
    private void setRedColor() {
        this.setStyle("-fx-background-color: Tomato");
    }
}