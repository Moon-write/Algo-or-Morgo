package jun100;

import java.util.Scanner;

public class No1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 숫자 입력 1~1000


		int count = 0; // 한수인 애 카운트

		for (int i = 1; i <= num; i++) {
			if (i >= 100) { // 3자리수라면
				int one = i % 10; // 10으로 나눴을때 나머지
				int ten = (i / 10) % 10;
				int hrd = i / 100;
				
				int gap1 = hrd-ten;
				int gap2 = ten-one;

				if (gap1==gap2) {
	//				System.out.println(i);
					count++;
				} else {
					continue;
				}
			} else {
		//		System.out.println(i);
				count++;
			}

		}

		// 개수 출력
		System.out.println(count);

	} // 메인메소드 종료

} // 클래스 종료
