package application.view;

import application.Main;
import javafx.fxml.FXML;

public class ProjectMenuController {
	
	@FXML
	private void btnCreateNewProject() {
		Main.getInstance().showCreateProjectDisplay();
	}

	@FXML
	private void btnOpenProject() {
		
	}
	
	@FXML
	private void btnReturn() {
		System.exit(0);
	}
}
