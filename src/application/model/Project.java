package application.model;

import java.util.ArrayList;

public class Project {
	static private int idCounter = 0;
	private int id;
	private ArrayList<Element> elements;
	
	public Project() {
		id = idCounter;
		idCounter++;
	}

}
