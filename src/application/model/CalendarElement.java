package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class CalendarElement extends Element {
	private LocalDate startDate;
	private LocalDate endDate;
	private ArrayList<String> prerequisiteTaskIDs;	
	
	public CalendarElement() {
		super();
		// TODO Auto-generated constructor stub
	}

}
