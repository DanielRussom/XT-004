package application.view;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class SelectProjectController implements Initializable{
	private Main main;
	
	@FXML
	private ListView<String> projectList;
	
	public SelectProjectController() {
		//initializeList();
	}
	
	private void initializeList() {
		//projectList.getItems().addAll(ProjectController.getProjectIDs());
//		ProjectController.addProjectID("1");
//		if(ProjectController.getProjectIDs().size()<1) {
//		//	projectList.setVisible(false);
//			return;
//		}
		
		ObservableList<String> data = FXCollections.observableArrayList(
				"TestProject", "TestProject2");
		projectList.setItems(data);
		//projectList.setVisible(true);
		//projectList.getItems().addAll(ProjectController.getProjectIDs());
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<String> data = FXCollections.observableArrayList(
				"TestProject", "TestProject2");
		projectList.setItems(data);
	}
}
