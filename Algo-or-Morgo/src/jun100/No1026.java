package jun100;

import java.util.Arrays;
import java.util.Scanner;

public class No1026 {
	// 방법1. a는 내림차순 b는 올림차순으로 한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 첫째줄 n < 배열갯수
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] aCopy = new int[n];
		int[] bSize = new int[n];
		
		sc.nextLine();
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		String[] s1 = str1.split(" ",n);
		String[] s2 = str2.split(" ",n);
		

		for(int i=0;i<n;i++) {
			aCopy[i] = Integer.parseInt(s1[i]);
			b[i] = Integer.parseInt(s2[i]);
		}
		
		// aCopy 내림차순 정렬
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(aCopy[j]<aCopy[j+1]) {
					int tmp = aCopy[j];
					aCopy[j] = aCopy[j+1];
					aCopy[j+1] = tmp;
				}
			}
		}
		
		// b Size에 크기순서대로 배치
		// 같을경우는 어떡함?
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j&&b[i]>b[j]) {
					bSize[i]++;
				}
			}
		}
		
		// aCopy 0번과 bSize값이 0인 [n] 서칭 후, a[n]에 aCopy[0] 담기
		for(int i=0;i<n;i++) {
			// i = aCopy 인덱스값
			for(int j=0;j<n;j++) {
				if(bSize[j]==i) {
					a[j] = aCopy[i];
				}
			}
		}
		
		

		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += a[i]*b[i];
		}
		
		System.out.println(sum);

		
		

	}

}
