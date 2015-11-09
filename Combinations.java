package googlequestions;

import java.util.ArrayList;

public class Combinations {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		char[] arr1 = { 'a', 'b', 'c', 'p', 'l', 'g' };

		String word = "";

		ArrayList<String> s1 = new ArrayList<String>();
		// int m = 1;
		for (int m = 0; m <= arr1.length; m++) {
			recursion(0, m, arr1, s1, word);
		}

		for (String s : s1)

			System.out.println(s);

	}

	public static void recursion(int curr, int m, char[] a,
			ArrayList<String> s1, String word)

	{

		if (m == 0)

		{

			s1.add(word);

			return;

		}

		for (int i = curr; i < a.length - m + 1; i++)

		{

			word = word + a[i];

			recursion(i + 1, m - 1, a, s1, word);

			word = word.substring(0, word.length() - 1);

		}

	}

}