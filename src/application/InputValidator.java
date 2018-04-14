package application;

public class InputValidator {

	public static boolean validateName(String name) {
		if (name == null || name.isEmpty()) {
			return false;
		}
		if(name.length()>30) {
			return false;
		}
		return true;
	}

	public static boolean validateDescription(String description) {
		if(description.length()>150) {
			return false;
		}
		return true;
	}

}
