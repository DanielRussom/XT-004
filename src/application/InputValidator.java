package application;

public class InputValidator {

	public static boolean validateName(String input) {
		if (input == null || input.isEmpty()) {
			return false;
		}
		if(input.length()>30) {
			return false;
		}
		return true;
	}

}
