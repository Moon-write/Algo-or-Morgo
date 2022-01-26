package jun100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sub = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str," ",false);
		double[] arr = new double[st.countTokens()];
		
		double M=0;
		for(int i=0;i<sub;i++) {
			arr[i]=Double.parseDouble(st.nextToken());
// 확인용		System.out.println(arr[i]);
			if (arr[i]>M) {
				M = arr[i];
			}
		}
		for(int i=0;i<sub;i++) {
			arr[i] /= M;
// 확인용			System.out.println(arr[i]);
		}
		
		double sum =0;
		for(int i=0;i<sub;i++) {
			sum += (arr[i]*100);
		}
		
		System.out.println(sum/sub);
		
		
	}
	
	

}

