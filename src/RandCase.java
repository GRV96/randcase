public class RandCase {

	private static String CONSOLE_HELP =
		"Randomly changes the case of a string's letters. The change of each "
		+ "letter occurs with the given probability.\n\nArguments:\n"
		+ "1: a string\n"
		+ "2: the probability that each letter in the string have its case"
		+ " changed";

	public static void main(String[] args) {
		int argNum = args.length;
		String consoleOutput = null;

		switch (argNum) {
			case 1:
				consoleOutput = randSwitchCase(args[0]);
				break;
			case 2:
				double probability = Double.parseDouble(args[1]);
				consoleOutput = randSwitchCase(args[0], probability);
				break;
			default:
				consoleOutput = CONSOLE_HELP;
		}

		System.out.println(consoleOutput);
	}

	/**
	 * Randomly changes the case of a string's letters. The change of each
	 * letter occurs with a probability of 0.5.
	 * @param s a string
	 * @return the result of the case change
	 */
	public static String randSwitchCase(String s) {
		return randSwitchCase(s, 0.5);
	}

	/**
	 * Randomly changes the case of a string's letters. The change of each
	 * letter occurs with the given probability.
	 * @param s a string
	 * @param prob the probability that each letter in s have its case changed
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
