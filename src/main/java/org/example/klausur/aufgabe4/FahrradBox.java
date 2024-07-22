package org.example.klausur.aufgabe4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FahrradBox  extends Application{

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(5));
		gp.setHgap(5);
		gp.setVgap(5);
		
		//Buttons
		SlotButton b1 = new SlotButton(1);
		SlotButton b2 = new SlotButton(2);
		SlotButton b3 = new SlotButton(3);
		SlotButton b4 = new SlotButton(4);
		b4.setIstFrei(false);
		SlotButton b5 = new SlotButton(5);
		SlotButton b6 = new SlotButton(6);

		gp.add(b1, 0, 0);
		gp.add(b2, 0, 1);
		gp.add(b3, 1, 0);
		gp.add(b4, 1, 1);
		gp.add(b5, 2, 0);
		gp.add(b6, 2, 1);


		Scene scene = new Scene(gp , 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Fahrradbox");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
