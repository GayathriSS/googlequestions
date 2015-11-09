package googlequestions;

public class Mergelists {

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 9 };
		int b[] = { 0, 2, 6, 7, 8 };
		int temp[] = new int[a.length+b.length];
		int i = 0, j = 0,k=0;
		
			for (;j < b.length && i < a.length && k<temp.length;) {
				 
					if (a[i] < b[j]) {
						//System.out.println("if: a[i] "+a[i]+"b[j] "+b[j]);
						temp[k] = a[i];
						
						//System.out.println("a<b "+temp[k]+" j "+j+"k "+k);
						i++;k++;
					} else {
						//System.out.println("else: a[i] "+a[i]+"b[j] "+b[j]);
						temp[k] = b[j];
						
						//System.out.println("a>b "+ temp[k]+" j "+j+"k "+k);
						j++;k++;

					}
				
			
		}
		for ( k=0; k < temp.length-1; k++) {
			System.out.print(temp[k]);
		}
	}

}
