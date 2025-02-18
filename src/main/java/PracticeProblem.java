public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String in) {
		if (in.toLowerCase().endsWith("ey")) {
			return "eys";
		} else if (in.toLowerCase().endsWith("y")) {
			return "ies";
		} else if (in.toLowerCase().endsWith("ife")) {
			return "ives";
		}
		return "s";
	}

	public static int min(int in1, int in2, int in3) {
		int currMin = Math.min(in1, in2);
		return Math.min(currMin, in3);
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
}
