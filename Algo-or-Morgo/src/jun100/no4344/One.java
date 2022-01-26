package jun100.no4344;

import java.util.Random;
import java.util.Scanner;

public class One {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	public void method1() {
		System.out.print("테스트 케이스 갯수 입력 : ");
		int C = sc.nextInt(); // CASE 갯수
		int[][] arr = new int[C][]; // arr배열 생성 (총 C행의 가변배열)
		int[] sum = new int[C]; // 각 행마다 합
		double[] avg = new double[C]; // 각 행마다 평균
		int[] count = new int[C]; // 각 행마다 평균넘는 놈

		for (int i = 0; i < C; i++) { // 테스트 케이스 반복
			int num = rd.nextInt(10) + 1; // 랜덤수 생성
			arr[i] = new int[num]; // 각 행마다 열수로 적립
			System.out.print(num + "\t");
			for (int j = 0; j < num; j++) {
				arr[i][j] = rd.nextInt(101);
				sum[i] += arr[i][j];
				avg[i] = (double) sum[i] / arr[i].length;
				System.out.print(arr[i][j] + " ");
			} // 점수나열

			for (int k = 0; k < arr[i].length; k++) {
				if (arr[i][k] > avg[i]) {
					count[i]++;
				}
			}
			System.out.printf("\t%.1f\t%.3f\n", (float) avg[i], (float) count[i] / (float) arr[i].length * 100);
			System.out.println(); // 개행
		}
	}
}
