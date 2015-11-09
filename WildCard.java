package googlequestions;

public class WildCard {

	public static void main(String[] args) {
		String s = new String();
		s="010?";

		if(s.contains("?")) {
			s.replace("?", "0");
			System.out.println(s);
			//s.replace("?", "1");
			//System.out.println(s);
		}
		else{
			System.out.println(s);
		}
	}

}
