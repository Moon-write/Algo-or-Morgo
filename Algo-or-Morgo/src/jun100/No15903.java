package jun100;

import java.util.Scanner;

public class No15903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		sc.close();
		
		String[] one = line1.split(" ");
		String[] two = line2.split(" ");
		
		int[] card = new int[Integer.parseInt(one[0])]; // 카드 수만큼 배열 만들기
		// 카드 배열에 수 대입
		for(int i=0;i<card.length;i++) {
			card[i]=Integer.parseInt(two[i]);
		}
		
		card = array(card);
		
		// 횟수만큼 더하기
		for(int m=0;m<Integer.parseInt(one[1]);m++) {
			int sum = card[0]+card[1];
			card[0]= sum;
			card[1]=sum;
			card= array(card);
		}
		
		// 최종 합
		int count = 0;
		for(int i=0;i<card.length;i++) {
			count += card[i];
		}
		System.out.println(count);

	}
	
	public static int[] array(int[] card) {
		// 오름차순 배열
		for(int i=0;i<card.length;i++) {
			for(int j=i;j<card.length-1;j++) {
				if(card[j]>card[j+1]) {
					int tmp = card[j];
					card[j] = card[j+1];
					card[j+1] = tmp;
				}
			}
		}
		return card;
	}
}
