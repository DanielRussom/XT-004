package application.model;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Element {
	static private int idCounter = 0;
	private int id;
	private String name;
	private Image image;
	private ArrayList<String> linkIDs;
	private String parentID;	
	
	public Element() {
		id = idCounter;
		idCounter++;
		System.out.println(id);
	}
}
