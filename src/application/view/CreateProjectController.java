package application.view;

import application.Main;
import application.model.Project;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CreateProjectController {
	private Main main;

	@FXML
	private TextField tfProjectName;

	@FXML
	private void btnCreateProject() {
		String projectName = tfProjectName.getText();
		Project newProject = new Project(projectName);
		System.out.println(newProject.toString());
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
