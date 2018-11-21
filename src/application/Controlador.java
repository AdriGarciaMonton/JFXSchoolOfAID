package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Controlador {

	@FXML
	public void cerrar() {
		System.exit(0);
	}
	
	@FXML
	public void mostrarVentanaSecundaria() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("segundaVentana.fxml"));
            AnchorPane ventanaDos = (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Venta Dos");
            Scene scene = new Scene(ventanaDos);
            ventana.setScene(scene);
            ventana.show();
 
        } catch (Exception e) {
            //tratar la excepción
        }
    }
}
