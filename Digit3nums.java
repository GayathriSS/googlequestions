package googlequestions;

public class Digit3nums {

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			for(int j=0;j<i;j++){
				for(int k=0;k<j;k++){
					System.out.print(i+""+j+""+k+"\t");
				}
			}System.out.println();
		}
	}

}
