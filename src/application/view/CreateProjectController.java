package application.view;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CreateProjectController {
	private Main main;

	@FXML
	private TextField tfProjectName;

	@FXML
	private void btnCreateProject() {

	}

	@FXML
	private void btnReturn() {
		main.showProjectMenu();
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
