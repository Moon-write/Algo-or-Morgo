package jun100;

import java.util.Scanner;

public class No1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // ���� �Է� 1~1000


		int count = 0; // �Ѽ��� �� ī��Ʈ

		for (int i = 1; i <= num; i++) {
			if (i >= 100) { // 3�ڸ������
				int one = i % 10; // 10���� �������� ������
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

		// ���� ���
		System.out.println(count);

	} // ���θ޼ҵ� ����

} // Ŭ���� ����
