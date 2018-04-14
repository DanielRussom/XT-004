package application.view;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProjectDisplayController {
	@FXML
	private Label lblTitle;
	@FXML
	private Label lblID;
	@FXML
	private Label lblDescription;
	
	@FXML
	private void btnReturn() {
		Main.getInstance().showProjectMenu();
	}

}
