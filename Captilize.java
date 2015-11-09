package googlequestions;

//Capitalize 2nd, 4th, 8th, 16th, … letters in a string input   : letters in a string output: lEtTers in a stRing
public class Captilize {

	public static void main(String[] args) {

		String s = "letters in a string";
		StringBuilder n = new StringBuilder();
		int j = 2;
		for (int i = 0; i < s.length(); i++) {
			if (i != j) {
				n.append(s.charAt(i));
			} else if (i == j) {
				n.append(s.toUpperCase().charAt(i));
				j = j * 2;
			}

		}
		System.out.println(n);
	}
}