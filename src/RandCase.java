public class RandCase {

	public static void main(String[] args) {
		System.out.println(switchCase('c'));
		System.out.println(switchCase('C'));
		System.out.println(switchCase('?'));
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
