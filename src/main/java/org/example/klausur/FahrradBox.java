package org.example.klausur;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FahrradBox  extends Application{

	
	@Override
	public void start(Stage arg0) throws Exception {
		
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(5));
		gp.setHgap(5);
		gp.setVgap(5);
		
		//Buttons
		SlotButton b1 = new SlotButton();
		SlotButton b2 = new SlotButton();
		SlotButton b3 = new SlotButton();
		SlotButton b4 = new SlotButton();
		SlotButton b5 = new SlotButton();
		SlotButton b6 = new SlotButton();
		
		//Controls
		Label lbl1 = new Label("Slot 1");
		Label lbl2 = new Label("Slot 2");
		Label lbl3 = new Label("Slot 3");
		Label lbl4 = new Label("Slot 4");
		Label lbl5 = new Label("Slot 5");
		Label lbl6 = new Label("Slot 6");
		
		//Btn
		gp.add(b1, 0, 0);
		gp.add(b2, 0, 1);
		gp.add(b3, 1, 0);
		gp.add(b4, 1, 1);
		gp.add(b5, 2, 0);
		gp.add(b6, 2, 1);
		
		b1.setOnAction(new Auswahl());
		
		//Labels
		gp.add(lbl1, 0, 0);
		gp.add(lbl2, 0, 1);
		gp.add(lbl3, 1, 0);
		gp.add(lbl4, 1, 1);
		gp.add(lbl5, 2, 0);
		gp.add(lbl6, 2, 1);
		
		gp.setHalignment(lbl1, HPos.CENTER);
		gp.setHalignment(lbl2, HPos.CENTER);
		gp.setHalignment(lbl3, HPos.CENTER);
		gp.setHalignment(lbl4, HPos.CENTER);
		gp.setHalignment(lbl5, HPos.CENTER);
		gp.setHalignment(lbl6, HPos.CENTER);
		
		
		arg0.setScene(new Scene(gp));
		arg0.setTitle("Fahrradbox");
		arg0.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
