package jun100;

import java.util.Scanner;

public class No2810 {

	public static void main(String[] args) {
		// 입력값 받기
		Scanner sc = new Scanner(System.in);
		// 첫줄 좌석수
		String size = sc.nextLine();
		// 둘째줄 좌석종류
		String seat = sc.next();
		sc.close();
		
		// 컵홀더 설치
		seat = seat.replaceAll("S", "*S*");
		seat = seat.replaceAll("LL", "*LL*");
		// 겹치는 컵홀더 제거
		seat = seat.replace("**", "*");
		
		char[] arr = new char[seat.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=seat.charAt(i);
		}
		
		int result = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='S'||arr[i]=='L') {
				// string 내 정보가 좌석이면
				if(arr[i-1]=='*') {
					// 왼쪽이 컵홀더일때
					arr[i]='O';
					arr[i-1]='O';
					result++;
				}else if(i!=arr.length-1&&arr[i+1]=='*') {
					// 오른족이 컵홀더일때
					arr[i]='O';
					arr[i+1]='O';
					result++;					
				}
			}
		}
		System.out.println(result);
	}

}
