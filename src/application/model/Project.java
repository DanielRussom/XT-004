package application.model;

import java.util.ArrayList;

public class Project {
	static private int idCounter = 0;
	private int id;
	private String name;
	private String description;
	private ArrayList<Element> elements;

	public Project(String name) {
		id = idCounter;
		this.name = name;
		idCounter++;
	}

	public Project(String name, String description) {
		id = idCounter;
		this.name = name;
		this.description = description;
		idCounter++;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            - the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            - the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String toString = "Project " + id + ": [name = " + name + ", ";
		if (description != null && !description.isEmpty()) {
			toString = toString + "description = " + description + ", ";
		}
		toString = toString + "elements = " + elements + "]";
		return toString;
	}

}
