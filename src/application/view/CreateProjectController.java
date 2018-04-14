package application.view;

import application.Main;
import application.model.Project;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CreateProjectController {
	private Main main;

	@FXML
	private TextField tfProjectName;

	@FXML
	private TextArea taProjectDescription;

	@FXML
	private void btnCreateProject() {
		String projectName = tfProjectName.getText();
		String description = taProjectDescription.getText();
		Project newProject;
		if ((description != null) && (description.trim().length() > 0)) {
			newProject = new Project(projectName, description);
		} else {
			newProject = new Project(projectName);
		}
		System.out.println("Project Created - " + newProject.toString());
		main.showProjectMenu();
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
