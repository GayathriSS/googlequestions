package googlequestions;


//Similar to this: Given an NxN grid of 0s, 1s, and 2s, find   out whether 1s or 2s is surrounded starting at (i,j). Being surrounded means that 1s is surrounded by 2s or that 2s is surrounded by 1s. 
public class Surrounded {
	static int[][] a = new int[10][10];

	public static void main(String[] args) {

		int b = 0, c = 1;

		checksurrounded(b, c);
	}

	public static void checksurrounded(int x,int y ){
		 if(a[x][y] == 2){
			 if(a[x-1][y] == 1 && a[x][y-1] == 1 ){
				 
			 }
		 }
		 else if (a[x][y] ==1){
			 
		 }
		
	}
}
