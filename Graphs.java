package googlequestions;

import java.util.LinkedList;

public class Graphs {

	public static void main(String[] args) {
		LinkedList <Integer> l = new LinkedList<Integer>();
		LinkedList <Integer> nl = new LinkedList<Integer>();
		for(int i=0;i<10;i++){
		l.add(i);
		}
		for(int j=9;j>=0;j--){
			nl.add(l.get(j));
		}
		System.out.println(l);
		System.out.println(nl);
	}


}
