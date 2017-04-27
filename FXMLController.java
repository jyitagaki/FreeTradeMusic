package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLController {
	private Main main;
	    @FXML
	    private ScrollPane mainStage;

	    @FXML
	    private MenuItem signIn;

	    @FXML
	    private MenuItem createAcc;

	    @FXML
	    private MenuItem logoutItem;

	    @FXML
	    private Button homeButton;

	    @FXML
	    void onClick(ActionEvent event) {

	    }

	    @FXML
	    void onSignIn(ActionEvent event) throws IOException {
	    	main.signinScene();
	    }

	}
