package application;

import java.util.ArrayList;

public class ProjectController {
	ArrayList<String> projectIDs;

	public ProjectController() {
		initialize();
	}

	/**
	 * Initializes variables in the project controller
	 */
	public void initialize() {
		projectIDs = new ArrayList<String>();
	}

}
