package jun100;

import java.util.Scanner;

public class No2864 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] insert = sc.nextLine().split(" ");
		sc.close();
				
		// 5이거나 6이 들어있을경우
		// 최솟값 : 다 5로 맞춰야함
		// 최댓값 : 다 6으로 맞춰야함
		
		// 최소값
		int min = change(insert[0],"5") + change(insert[1],"5");
		int max = change(insert[0],"6") + change(insert[1],"6");
	
		
		System.out.println(min+" "+max);
	}
	
	public static int change(String insert, String num) {
		String result = insert;
		for(int i=0;i<insert.length();i++) {
			if(insert.charAt(i)=='5'||insert.charAt(i)=='6') {
				result = insert.replaceAll("[5]", num).replaceAll("[6]", num);
			}
		}
		return Integer.parseInt(result);
	}

}
