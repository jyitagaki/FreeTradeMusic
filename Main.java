package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;

public class Main extends Application {
	private static Stage primaryStage;
	private static ScrollPane mainStage;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		viewStage();
		//signinScene();
	}
	private void viewStage() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("FreeTradeMusic.fxml"));
		mainStage = loader.load();
		Scene scene = new Scene(mainStage);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void signinScene() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("SignIn.fxml"));
		ScrollPane signIn = loader.load();
		Stage signInStage = new Stage();
		signInStage.initModality(Modality.WINDOW_MODAL);
		signInStage.initOwner(primaryStage);
		Scene scene = new Scene(signIn);
		signInStage.setScene(scene);
		signInStage.showAndWait();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

