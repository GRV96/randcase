public class RandCase {

	public static void main(String[] args) {
		System.out.println(randSwitchCase("Anticonstitutionnellement", 0.7));
	}

	/**
	 * Randomly changes the case of a string's letters with a probability of
	 * 0.5.
	 * @param s a string
	 * @return the result of the case change
	 */
	public static String randSwitchCase(String s) {
		return randSwitchCase(s, 0.5);
	}

	/**
	 * Randomly changes the case of a string's letters with the given
	 * probability.
	 * @param s a string
	 * @param prob the probability that any letter in s have its case changed
	 * @return the result of the case change
	 */
	public static String randSwitchCase(String s, double prob) {
		int strLength = s.length();
		char[] randCaseText = new char[strLength];

		for(int i=0; i<strLength; i++) {
			char c = s.charAt(i);

			if(Math.random() < prob) {
				randCaseText[i] = switchCase(c);
			}
			else {
				randCaseText[i] = c;
			}
		}

		return new String(randCaseText);
	}

	/**
	 * Changes the case of the given character if it has a case.
	 * @param c the character whose case must be changed
	 * @return the other version of c or c if it does not have a case
	 */
	public static char switchCase(char c) {
		char sc = c;

		if(Character.isLowerCase(c)) {
			sc = Character.toUpperCase(c);
		}
		else if(Character.isUpperCase(c)) {
			sc = Character.toLowerCase(c);
		}

		return sc;
	}
}
