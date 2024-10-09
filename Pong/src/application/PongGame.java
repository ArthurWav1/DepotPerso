package application;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PongGame {
	static final int SCREEN_WIDTH = 1280;
	static final int SCREEN_HEIGHT = 720;
	
	static final int BARRE_WIDTH = 25;
	static final int BARRE_HEIGHT = 150;
	
	static final long TIME = 16000000; //nanosecondes
	
	public PongGame(Stage primaryStage) {
		
		AnchorPane root = new AnchorPane();
		Scene scene = new Scene(root,1280,720);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//Meilleur manière de faire le background car prend tout l'espace qu'occupe la racine (qui occupe toute la scène)
		root.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
		
		// Possible mais moins souvent utilisé
		// scene.setFill(Color.BLACK);
		
		//Node à placer(dans les scenes)
		Barre userBar = new Barre(10,10,BARRE_WIDTH,BARRE_HEIGHT,Color.CHARTREUSE,null);
		Barre ennemyBar = new Barre(SCREEN_WIDTH - 35, 10, BARRE_WIDTH, BARRE_HEIGHT, Color.DARKRED, null);
		
		
		
		
		//On met la node dans la scene)
		root.getChildren().add(userBar);
		root.getChildren().add(ennemyBar);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}
