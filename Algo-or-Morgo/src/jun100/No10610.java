package jun100;

import java.util.ArrayList;
import java.util.Scanner;

public class No10610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int[] arr = new int[N.length()];
		
		int sum = 0;
		boolean zero = false;
		for(int i=0;i<arr.length;i++) {
			Character ch = N.charAt(i);
			String str = ch.toString();
			int num = Integer.parseInt(str);
			arr[i] = num;
			sum += arr[i];
			if(arr[i]==0) {
				zero = true;
			}
		}
		
		// 30의 배수? 3의 배수이자 10의 배수
		// 3의 배수 특징? 각 자릿수를 다 더하면 3의 배수임
		if(zero&&sum%3==0) {
			// 30의 배수가 될 가능성이 있음
			// 제일 큰 수로 만들어야 한다 > 큰 수부터 나열 - 내림차순 나열
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					if(arr[j]<arr[j+1]) {
						int tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
					}
				}
			}
			
			// 정렬
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			
		} else {
			System.out.println(-1);
		}

		

	}

}
