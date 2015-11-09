package googlequestions;

import java.util.Scanner;

/*Mutiply given digits in a number till you result in a single digit number*/
public class Multiplynumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		getresult(number);

	}
	public static void getresult(int n){
		while (n>=9){
			int mul=1,num,i= n;
			while (i>0){
				num=i%10;
				mul=mul*num;
				i=i/10;				
			}
			n=mul;
			System.out.println(n);
		}
	}

}
