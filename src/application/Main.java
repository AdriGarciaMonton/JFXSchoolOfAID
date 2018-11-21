package application;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * 
 * @author Adri
 * @version 1.0
 * @see Controlador
 *
 */
public class Main extends Application {

	private AnchorPane mypane;
	
	public void start(Stage primaryStage) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("layoutIngenieros.fxml"));
		
		mypane = (AnchorPane)loader.load();
		
		primaryStage.setTitle("layout.fxml");
		primaryStage.setScene(new Scene(mypane));
		primaryStage.show();
	}

	
	
	public static void main(String[] args) {
		launch(args);
	}
}

