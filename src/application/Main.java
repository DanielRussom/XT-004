package application;

import java.io.IOException;

import application.view.CreateProjectController;
import application.view.ProjectMenuController;
import application.view.SelectProjectController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage primaryStage;
	private BorderPane rootLayout;
	private ProjectController projectController;

 	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("XT-004");
		projectController = new ProjectController();
		initMenuRoot();

		showProjectMenu();
	}

	/**
	 * Initializes the root layout
	 */
	public void initMenuRoot() {
		try {
			// Load root layout from fxml file
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/MenuRoot.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Show the scene containing the root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Shows the person overview inside the root layout
	 */
	public void showProjectMenu() {
		try {
			// Load project menu
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/ProjectMenu.fxml"));
			AnchorPane projectMenu = (AnchorPane) loader.load();

			ProjectMenuController controller = loader.getController();
			controller.setMainApp(this);
			
			// Set person overview into the center of root layout
			rootLayout.setCenter(projectMenu);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showCreateProjectDisplay() {
	    try {
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("view/CreateProjectDisplay.fxml"));
	        AnchorPane createProjectDisplay = (AnchorPane) loader.load();

	        CreateProjectController createProjectController = loader.getController();
	        createProjectController.setMainApp(this);
			
			// Set person overview into the center of root layout
			rootLayout.setCenter(createProjectDisplay);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public void showSelectProjectDisplay() {
		try {
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("view/SelectProjectDisplay.fxml"));
	        AnchorPane createProjectDisplay = (AnchorPane) loader.load();

	        SelectProjectController selectProjectController = loader.getController();
	        selectProjectController.setMainApp(this);
			
			// Set person overview into the center of root layout
			rootLayout.setCenter(createProjectDisplay);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Returns the main stage.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
