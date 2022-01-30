package jun100;

import java.util.Arrays;

public class No11399 {

	public static void main(String[] args) {
		int line1 = 5;
		String line2 = "3 1 4 3 2";
		
		// 오름차순 정렬을 하고
		String[] arr = line2.split(" ",line1);
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				int num1= Integer.parseInt(arr[j]);
				int num2= Integer.parseInt(arr[j+1]);
				
				if(num1>num2) {
					String tmp;
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		int time = 0;
		// 그 결과물을 for문으로 더하기

		for(int i=0;i<arr.length;i++) {
			int waiting = 0;
			for(int j=0;j<=i;j++) {
				waiting += Integer.parseInt(arr[j]);
			}
			time += waiting;
		}

		System.out.println(time);
	}

}

