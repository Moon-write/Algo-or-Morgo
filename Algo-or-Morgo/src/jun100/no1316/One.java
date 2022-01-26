package jun100.no1316;

import java.util.Arrays;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// 그룹단어체커
		// 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
		// 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 각 줄별로 단어 입력
		String[] arr=new String[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.next();
		}
		
		check(arr[0]);
		
	} // 메인메소드 끝
	
	public static void check(String arr) {
		char[] alphabet = new char[26];
		for(int i=0;i<alphabet.length;i++) {
			alphabet[i]=(char)(97+i);
		}
		
		// String 속의 알파벳 갯수 찾기
		int[] count = new int[26];
		for(int i=0;i<arr.length();i++) {
			for(int j=0;j<alphabet.length;j++) {
				if(alphabet[j]==arr.charAt(i)) {
					count[j]++;
				}
			}
		}
		System.out.println(Arrays.toString(count));
		
		// 연달아 나오는 알파벳 찾기
		int start = 0;
		int end = 1;
		while(true) {
			if(arr.charAt(start)==arr.charAt(end)) {
				end++;
			} else {// 둘이다르다? 그러면 그때 start 숫자 기준으로 글자수 세기
				for(int i=0;i<alphabet.length;i++) {
					if(alphabet[i]==arr.charAt(start)) {
						(count[i]-(end-start))==0? return true:return false;
					}
				}
						
			}
		}
		
		
		
	} // 메소드 끝
} // 클래스 끝
