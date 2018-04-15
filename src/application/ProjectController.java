package application;

import java.util.ArrayList;

public class ProjectController {
	private static ArrayList<String> projectIDs;

	public ProjectController() {
		initialize();
	}

	/**
	 * Initializes variables in the project controller
	 */
	private void initialize() {
		projectIDs = new ArrayList<String>();
	}

	/**
	 * Adds a project ID to the stored list
	 * 
	 * @param id
	 *            - ID to be added
	 */
	public static void addProjectID(String id) {
		projectIDs.add(id);
	}

	/**
	 * @return the projectIDs
	 */
	public static ArrayList<String> getProjectIDs() {
		return projectIDs;
	}

}
