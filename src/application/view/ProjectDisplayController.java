package application.view;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProjectDisplayController {
	private Main main;
	
	@FXML
	private Label lblTitle;
	@FXML
	private Label lblID;
	@FXML
	private Label lblDescription;
	
	@FXML
	private void btnReturn() {
		main.showProjectMenu();
	}

}
