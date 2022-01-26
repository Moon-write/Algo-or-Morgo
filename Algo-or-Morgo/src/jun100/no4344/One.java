package jun100.no4344;

import java.util.Random;
import java.util.Scanner;

public class One {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	public void method1() {
		System.out.print("�׽�Ʈ ���̽� ���� �Է� : ");
		int C = sc.nextInt(); // CASE ����
		int[][] arr = new int[C][]; // arr�迭 ���� (�� C���� �����迭)
		int[] sum = new int[C]; // �� �ึ�� ��
		double[] avg = new double[C]; // �� �ึ�� ���
		int[] count = new int[C]; // �� �ึ�� ��ճѴ� ��

		for (int i = 0; i < C; i++) { // �׽�Ʈ ���̽� �ݺ�
			int num = rd.nextInt(10) + 1; // ������ ����
			arr[i] = new int[num]; // �� �ึ�� ������ ����
			System.out.print(num + "\t");
			for (int j = 0; j < num; j++) {
				arr[i][j] = rd.nextInt(101);
				sum[i] += arr[i][j];
				avg[i] = (double) sum[i] / arr[i].length;
				System.out.print(arr[i][j] + " ");
			} // ��������

			for (int k = 0; k < arr[i].length; k++) {
				if (arr[i][k] > avg[i]) {
					count[i]++;
				}
			}
			System.out.printf("\t%.1f\t%.3f\n", (float) avg[i], (float) count[i] / (float) arr[i].length * 100);
			System.out.println(); // ����
		}
	}
}
