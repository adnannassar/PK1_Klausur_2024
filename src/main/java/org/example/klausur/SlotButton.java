package org.example.klausur;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class SlotButton extends Button{

	private boolean istFrei;
	
	public SlotButton()
	{
		setGreenColor();
		initSize();
	}
	
	
 public boolean isIstFrei() {
		return istFrei;
	}


	public void setIstFrei(boolean istFrei) {
		this.istFrei = istFrei;
	}


	//Hilfsmethoden - zur Nutzung auskommentieren!
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

	public void setOnAction(Auswahl auswahl) {
		// TODO Auto-generated method stub
		
	}
	
}

class Auswahl implements EventHandler<MouseEvent>
{

	@Override
	public void handle(MouseEvent arg0) {
		
		
	}
	
}