package jun100.no4344;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Two {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	public void method2() {
		System.out.print("테스트 케이스 갯수 입력 : ");
		int C = sc.nextInt(); // CASE 갯수
		sc.nextLine();
		int[][] score = new int[C][];
		int[] sum = new int[C]; // 합
		double[] avg = new double[C]; // 평균
		int[] count = new int[C]; // 평균넘는갯수

		for (int i = 0; i < C; i++) {
			int num = rd.nextInt(10) + 1;
			score[i] = new int[num];
			System.out.print(score[i].length + "\t"); // 점수입력
			String str = sc.nextLine(); // 점수입력

			StringTokenizer st = new StringTokenizer(str, " ", false); // 입력한내용 토큰화

			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = Integer.parseInt(st.nextToken()); // 각 배열에 넣기
				sum[i] += score[i][j]; // sum에 추가 대입연산
			} // j 반복문 끝
			avg[i] = (double) sum[i] / (double) score[i].length;
//			System.out.println(Arrays.toString(score[i]));
//			System.out.printf("\tavg:%.1f", avg[i]);

			for (int k = 0; k < score[i].length; k++) {
				if (score[i][k] > avg[i]) {
					count[i]++;
				}
			}
			System.out.printf("\t비율:%.3f\n",(float)count[i]/score[i].length*100);
		} // i반복문 끝
	}

}
