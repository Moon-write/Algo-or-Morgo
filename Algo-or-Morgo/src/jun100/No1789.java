package jun100;

import java.util.Scanner;

public class No1789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		int i = 1;
		int count = 0;
		while(true) {
			count++;
			s -= i++;
			if(i>s) {
				break;
			}
		}
		System.out.println(count);

	}

}
