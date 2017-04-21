package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SignInController {

	@FXML
    private Label messageLbl;	
	@FXML
    private Button buttonSign;
	@FXML
    private PasswordField password;
	@FXML
    private TextField username;
	@FXML
    private Button cancel;
	@FXML
    void onSign(ActionEvent event) throws IOException {
		
		if(username.getText().equals("Test") && password.getText().equals("Test")){
			messageLbl.setText("Correct");
		}
		else{
			messageLbl.setText("Incorrect");
		}
    }

    @FXML
    void close(ActionEvent event) {

    }
   
}
