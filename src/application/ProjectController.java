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

	/**
	 * Adds a project ID to the stored list
	 * 
	 * @param id
	 *            - ID to be added
	 */
	public void addProjectID(String id) {
		projectIDs.add(id);
	}

}
