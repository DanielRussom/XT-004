package application.view;

import application.Main;
import application.model.Project;
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
	
	public void displayProject(Project currentProject) {
		lblTitle.setText(currentProject.getName());
		lblID.setText(Integer.toString(currentProject.getId()));
		lblDescription.setText(currentProject.getDescription());
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
