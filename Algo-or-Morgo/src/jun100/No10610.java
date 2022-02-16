package jun100;

import java.util.ArrayList;
import java.util.Scanner;

public class No10610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int[] arr = new int[N.length()];
		
		int sum = 0;
		boolean zero = false;
		for(int i=0;i<arr.length;i++) {
			Character ch = N.charAt(i);
			String str = ch.toString();
			int num = Integer.parseInt(str);
			arr[i] = num;
			sum += arr[i];
			if(arr[i]==0) {
				zero = true;
			}
		}
		
		// 30�� ���? 3�� ������� 10�� ���
		// 3�� ��� Ư¡? �� �ڸ����� �� ���ϸ� 3�� �����
		if(zero&&sum%3==0) {
			// 30�� ����� �� ���ɼ��� ����
			// ���� ū ���� ������ �Ѵ� > ū ������ ���� - �������� ����
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					if(arr[j]<arr[j+1]) {
						int tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
					}
				}
			}
			
			// ����
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			
		} else {
			System.out.println(-1);
		}

		

	}

}
