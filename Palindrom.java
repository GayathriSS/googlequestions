package googlequestions;

import java.util.ArrayList;

public class Palindrom {

	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<String>();
		ArrayList<String> s2 = new ArrayList<String>();
		
		String b ="tab";
		s1.add("bat");
		s1.add(b);
		s1.add("cat");
		s1.add("tac");
		s1.add("atc");
		int curr=0;
		while(curr!=s1.size()){
		for(int i=curr+1;i<s1.size();i++){
			checkpalin(s1.get(curr),s1.get(i));
			//System.out.println(s1.get(i));
		}
		curr++;
		}
		}

	public static void checkpalin(String a,String b){
		
		if(a.length() == b.length()){
			for(int i=0;i<a.length();i++){
				if(a.charAt(i) == b.charAt(a.length()-i-1)){
				System.out.print(a.charAt(i));
				
					continue;
				}
				else{
					//System.out.println();
					break;
				}
			}
			
		}
		//System.out.print("Sorry1");
		
	}
}
