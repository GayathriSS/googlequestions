package googlequestions;

public class Check {

	public static void main(String[] args) {
		
	String check  = "careepcup";
	int n = check.length()-1;
	int i = 0;
	while(i!=n){
		
	sub(check.substring(0, i+1),check.substring(n-i, check.length()),n-i);
	//sub(check.substring(i, n-i),check.substring(n-i, n),n-i);
	i++;
	}
	}
	private static void sub(String charAt, String charAt2, int i) {
		
		System.out.println(charAt+""+i+""+charAt2);
	}
	

}
