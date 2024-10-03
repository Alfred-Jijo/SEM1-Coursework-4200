package main.javasaver;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
	@FXML
	private Label welcomeText;
	
	@FXML
	protected void onHelloButtonClick() {
		welcomeText.setText("You a b###h a#s mf :3");
	}
}