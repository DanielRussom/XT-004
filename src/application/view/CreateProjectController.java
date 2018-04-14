package application.view;

import application.Main;
import application.model.Project;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CreateProjectController {

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
		Main.getInstance().showProjectMenu();
	}

	@FXML
	private void btnReturn() {
		Main.getInstance().showProjectMenu();
	}
}
