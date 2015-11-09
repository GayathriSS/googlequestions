package googlequestions;

public class Fromnet {

	public static void main(String[] args) {
		String s = "careercup";

		generateAll18(s, 1, s.length() - 1);
	}

	public static void generateAll18(String s, int i, int j) {

		if (i >= j) {

			return;
		}

		String s1, s2, s3;

		s1 = s.substring(0, i + 1)+(j- i - 1)+""+s.substring(j, s.length());
		s2 = s.substring(0, i)+(j - i)+""+s.substring(j, s.length());
		s3 = s.substring(0, i+1)+(j - i)+""+s.substring(j + 1, s.length());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		generateAll18(s, i+ 1, j-1);
		generateAll18(s, i + 1, j);
		generateAll18(s, i, j - 1);
	}}
