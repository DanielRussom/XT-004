package application.view;

import application.Main;
import application.ProjectController;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class SelectProjectController {
	private Main main;
	
	@FXML
	private ListView<String> projectList;
	
	public SelectProjectController() {
		initializeList();
	}
	
	private void initializeList() {
		ProjectController.addProjectID("1");
		if(ProjectController.getProjectIDs().size()<1) {
			projectList.setVisible(false);
			return;
		}
		projectList.setVisible(true);
		projectList.getItems().addAll(ProjectController.getProjectIDs());
//		for(String currentID:ProjectController.getProjectIDs()) {
//			projectList.add
//		}
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
