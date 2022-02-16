package jun100;

import java.util.Scanner;

public class No2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 첫번째 줄? 로프의 갯수
		int[] arr = new int[sc.nextInt()];
		
		// 최소중량 탐색
		int min = 1000000;
		// 두번째 줄부터 각 로프의 중량
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		int max = min*arr.length;
		System.out.println(max);
	}

}
