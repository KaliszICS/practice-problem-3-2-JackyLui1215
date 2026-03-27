public class PracticeProblem {

	public static void main(String args[]) {

	}
    public static String isFive(int number) {
		String isFive = "isFive";
		if(number == 5) {
         isFive = "The number is Five";
		}
		else {
         isFive ="The number is not Five";
		}
		return isFive;
	}
    public static String positiveOrNegative(double number) {
		String positiveOrNegative = "positiveOrNegative";
		if(number > 0) {
          positiveOrNegative = "Positive";
		}
		else {
		  positiveOrNegative = "Negative";
		}
		return positiveOrNegative;

	}

	public static String highOrLow(int number) {
		String highOrLow = "highOrLow";
		if(number > 100) {
			highOrLow = "High";
		}
		else {
			highOrLow = "Low";
		}
		return highOrLow;
	}

	public static String isHello(String word) {
		String isHello = "isHello";
		if(word == "Hello") {
			isHello = "The word is Hello";
		}
	    else {
			isHello = "The word is not Hello";
		}
		return isHello;
	}

	

}
