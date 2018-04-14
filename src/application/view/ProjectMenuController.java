package application.view;

import application.Main;
import javafx.fxml.FXML;

public class ProjectMenuController {
	private Main main;

	@FXML
	private void btnCreateNewProject() {
		main.showCreateProjectDisplay();
	}

	@FXML
	private void btnOpenProject() {

	}

	@FXML
	private void btnReturn() {
		System.exit(0);
	}

	/**
	 * Sets the local reference to the main class
	 * 
	 * @param main
	 *            - reference to main class
	 */
	public void setMainApp(Main main) {
		this.main = main;
	}
}
