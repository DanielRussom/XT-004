package application.model;

import java.util.ArrayList;

public class Project {
	static private int idCounter = 0;
	private int id;
	private String name;
	private ArrayList<Element> elements;
	
	public Project(String name) {
		id = idCounter;
		this.name = name;
		idCounter++;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Project " + id + ": [name = " + name + ", elements = " + elements + "]";
	}

}
