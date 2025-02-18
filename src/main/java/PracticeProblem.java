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
		if (in1 < in2) {
			if (in1 < in3) {
				return in1;
			}
			return in2;
		} else {
			if (in2 < in3) {
				return in2;
			}
			return in3;
		}
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
