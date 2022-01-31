package jun100;

import java.util.Scanner;

public class No11047 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		String[] s = str.split(" ",2);
		
		// s[0] = 동전종류
		// s[1] = 총금액
		int much = Integer.parseInt(s[0]);
		int total = Integer.parseInt(s[1]);
		
		// 동전 최소단위로 얼마나 만들수 있는지 확인 = 첫자리는 무조건 1, 금액만큼 동전 쓰기
		// 그 개수로 최대치 뺄수있는만큼 분배
		
		// 동전금액
		int[] coin = new int[much];
		int[] coinCount = new int[much];
		// 동전당 금액배치
		for(int i =0;i<much;i++) {
			if(i==0) {
				coin[i]=1;
			} else if(i%2==1) {
				coin[i]= coin[i-1]*5;
			} else if(i%2==0) {
				coin[i]= coin[i-1]*2;
			}
		} // 금액배치 끝
		
		// 금액별
		for(int i=much-1;i>=0;i--) {
			if(coin[i]<=total) {
				total -= coin[i];
				coinCount[i]++;
				i++;
			}
		}
		
		int answer = 0;
		// 최종갯수
		for(int i=0;i<much;i++) {
			answer +=coinCount[i];
		}
		
		
		
		System.out.println(answer);
	}

	
	
	
}
