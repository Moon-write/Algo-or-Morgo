package jun100;

import java.util.Scanner;

public class No10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char[] apb = new char[26];
		for(int i=0;i<apb.length;i++) {
			apb[i] = (char)(97+i);
		}
		
		int[] clue = new int[apb.length];
		for(int i=0;i<apb.length;i++) {
			clue[i] = (str.indexOf(apb[i]));
			System.out.print(clue[i]+" ");
		}
		
	}
}
