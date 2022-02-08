package jun100;

import java.util.Arrays;
import java.util.Scanner;

public class No1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int[][] meeting = new int[num][2];
		
		// 배분
		for(int i=0;i<num;i++) {
			String str = sc.nextLine();
			String[] s = str.split(" ",2);
			meeting[i][0] = Integer.parseInt(s[0]);
			meeting[i][1] = Integer.parseInt(s[1]);
		}
		
		// 오름차순정리
		for(int i=0;i<num-1;i++) {
			for(int j=0;j<num-1-i;j++) {
				if(meeting[j][0]>meeting[j+1][0]) {
					int[] tmp = meeting[j];
					meeting[j] = meeting[j+1];
					meeting[j+1] = tmp;
				} else if(meeting[j][0]==meeting[j+1][0]) {
					if(meeting[j][1]>meeting[j+1][1]) {
						int[] tmp = meeting[j];
						meeting[j] = meeting[j+1];
						meeting[j+1] = tmp;
					}
				}
			}
		}
		
//		// 출력
//		for(int i =0;i<num;i++) {
//			System.out.println(Arrays.toString(meeting[i]));
//		}
		
		int time = 0; // 시작시간
		int count = 0; // 회의갯수
		int Max = 0; // 최대회의갯수
		
		
		
		
		int i = 0;
		while(true) {
			if(time<=meeting[i][0]) {
				count++;
				time = meeting[i][1];
			} else if(time>meeting[i][0]) {
				break;
			}
		}
		

		
	}

}
