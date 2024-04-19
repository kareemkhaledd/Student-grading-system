package Project;

public class DataCheck {
	public static boolean CheckStudentNumber(String name) {
		// Check if the length of the name is 8 characters
		if (name.length() != 8) {
			System.out.println("Invalid student number length.");
			return false;
		}

		// Check if first 7 characters are digits
		for (int i = 0; i < 7; i++) {
			if (!Character.isDigit(name.charAt(i))) {
				System.out.println("Invalid student number format. First 7 characters should be digits.");
				return false;
			}
		}

		// Check if the last character is alphabetic
		char lastChar = name.charAt(7);
		if (!Character.isLetter(lastChar) && !Character.isDigit(lastChar)) {
			System.out.println("Invalid student number format. Last character should be alphabetic or numeric.");
			return false;
		}

		return true;
	}
	
	public static boolean CheckActivitiesMark(int mark,int fullMark) {
		 int percentage = (int)((10.0 / 100) * fullMark);
		    if (mark >= 0 && mark <= percentage) {
		        return true;  // Valid mark
		    } else {
		        System.out.println("Invalid activities mark. Mark should be between 0 and 10% of the full mark.");
		        return false;
		    }
	}
	public static boolean CheckOralPracticalMark(int mark,int fullMark) {
		int percentage = (int)((10.0 / 100) * fullMark);
	    if (mark >= 0 && mark <= percentage) {
	        return true;  // Valid mark
	    } else {
	        System.out.println("Invalid Oral/Practical mark. Mark should be between 0 and 10% of the full mark .");
	        return false;
	    }
	}
	public static boolean CheckMidtermExamMark(int mark,int fullMark) {
		int percentage = (int)((20.0 / 100) * fullMark);
	    if (mark >= 0 && mark <= percentage) {
	        return true;  // Valid mark
	    } else {
	        System.out.println("Invalid Midterm exam mark. Mark should be between 0 and 20% of the full mark .");
	        return false;
	    }
	}
	public static boolean CheckFinalExamMark(int mark,int fullMark) {
		int percentage = (int)((60.0 / 100) * fullMark);
	    if (mark >= 0 && mark <= percentage) {
	        return true;  // Valid mark
	    } else {
	        System.out.println("Invalid Final exam mark. Mark should be between 0 and 60% of the full mark .");
	        return false;
	    }
	}
}
