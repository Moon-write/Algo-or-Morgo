package jun100;

import java.util.Scanner;

public class No5585 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// 첫번째줄 입력값? 물건값
		int price = 1000 - sc.nextInt();
		
		int[][] change = new int[6][2];
		// 잔돈 액수지정
		change[0][0]=500;
		change[1][0]=100;
		change[2][0]=50;
		change[3][0]=10;
		change[4][0]=5;
		change[5][0]=1;
		
		int i=0;
		int count=0;
		while(i<6) {
			if(change[i][0]<=price) {
				change[i][1]++;
				price -= change[i][0];
			} else {
				i++;
				if(i==6) {
					for(int j=0;j<change.length;j++) {
						count += change[j][1];
					}
				}
			}
		}
		
		System.out.println(count);
	}

}
