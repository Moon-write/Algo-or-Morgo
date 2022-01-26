package jun100.no4344;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Two {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	public void method2() {
		System.out.print("�׽�Ʈ ���̽� ���� �Է� : ");
		int C = sc.nextInt(); // CASE ����
		sc.nextLine();
		int[][] score = new int[C][];
		int[] sum = new int[C]; // ��
		double[] avg = new double[C]; // ���
		int[] count = new int[C]; // ��ճѴ°���

		for (int i = 0; i < C; i++) {
			int num = rd.nextInt(10) + 1;
			score[i] = new int[num];
			System.out.print(score[i].length + "\t"); // �����Է�
			String str = sc.nextLine(); // �����Է�

			StringTokenizer st = new StringTokenizer(str, " ", false); // �Է��ѳ��� ��ūȭ

			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = Integer.parseInt(st.nextToken()); // �� �迭�� �ֱ�
				sum[i] += score[i][j]; // sum�� �߰� ���Կ���
			} // j �ݺ��� ��
			avg[i] = (double) sum[i] / (double) score[i].length;
//			System.out.println(Arrays.toString(score[i]));
//			System.out.printf("\tavg:%.1f", avg[i]);

			for (int k = 0; k < score[i].length; k++) {
				if (score[i][k] > avg[i]) {
					count[i]++;
				}
			}
			System.out.printf("\t����:%.3f\n",(float)count[i]/score[i].length*100);
		} // i�ݺ��� ��
	}

}
