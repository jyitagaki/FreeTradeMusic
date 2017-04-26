package FreeTradeMusic;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
