package jun100;

import java.util.Scanner;

public class No2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // »çÅÁ kg¼ö
		
		int min = n; // ÃÖ¼Ò ºÀÁö ¼ö
		int answer = -1;
		
		for(int i=0;i<=n/3;i++) {
			for(int j=n/5;j>=0;j--) {
				if(n==(3*i+5*j)) {
					if(min>(i+j)) {
						min = i+j;
					}
				}
			}
		}
		
		if(min!=n) {
			answer = min;
		}

		System.out.println(answer);
	}

}
