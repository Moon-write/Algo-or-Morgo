package jun100;

import java.util.Scanner;

public class No10162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력값 T? 조리시간
		int t = sc.nextInt();
		// 버튼
		int[][] button = {{300,0},{60,0}, {10,0}};

		
		// 버튼조절
		int i =0;		
		while(t>=10) {
			if(button[i][0]<=t) {
				t -= button[i][0];
				button[i][1]++;
			} else {
				i++;
				if(i==3) {
					break;
				}
			}
		}
		if(t!=0) {
			System.out.println(-1);
		} else {
			System.out.println(button[0][1]+" "+button[1][1]+" "+button[2][1]);
		}
	}
}
