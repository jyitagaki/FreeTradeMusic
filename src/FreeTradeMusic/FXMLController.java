package FreeTradeMusic;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLController {

	@FXML
	private MenuItem signIn;
	@FXML
	private MenuItem createAcc;
	@FXML
	private Button homeButton;
	@FXML
    void onClick(ActionEvent event) throws IOException {
		Stage stage;
		if(event.getSource() == signIn){
			FXMLLoader load = new FXMLLoader(getClass().getResource("SignIn.fxml"));
			load.setRoot(this);
			stage = new Stage();
			stage.setScene(new Scene(load.load()));
			stage.setTitle("Sign in");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.show();
		}
		else if(event.getSource() == createAcc){
			
		}
		else if(event.getSource() == homeButton){
			
		}
    }
	
}
