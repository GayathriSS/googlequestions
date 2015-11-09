package googlequestions;

import java.util.ArrayList;

//Given a set. Display all possible subsets of the set

public class Setsubset {

	public static void main(String[] args) {

		ArrayList<String> s1 = new ArrayList<String>();

		char[] arr1 = { 'a', 'b', 'c', 'd' };

		String words = "";
		int m =2;
		//for (int m = 0; m <= arr1.length; m++) {

			recursion(0,arr1, words, s1, m);
		//}
		for (String s : s1) {
			
			;System.out.println(s);
		}
	}

	public static void recursion(int curr,char[] arr1, String words,
			ArrayList<String> s1, int m) {

		if (m == 0) {
			s1.add(words);
			return;
		}

		for(int i=curr;i < arr1.length-m+1;i++){
			
			words = words + arr1[i];
			//System.out.println(words);
			
			recursion(i+1,arr1,words,s1,m-1);
			
			words = words.substring(0, words.length()-1);
		}
		

	}
}
