package application.model;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Element {
	static private int idCounter = 0;
	private String id;
	private String name;
	private Image image;
	private ArrayList<String> linkIDs;
	private String parentID;	
	
	public Element() {
		id = newID();
		System.out.println(id);
	}

	/**
	 * 
	 * @return
	 */
	private String newID() {
		// TODO Auto-generated method stub
		return null;
	}

}
