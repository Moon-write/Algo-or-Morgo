package jun100;

import java.util.Scanner;

public class No2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ù��° ��? ������ ����
		int[] arr = new int[sc.nextInt()];
		
		// �ּ��߷� Ž��
		int min = 1000000;
		// �ι�° �ٺ��� �� ������ �߷�
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		int max = min*arr.length;
		System.out.println(max);
	}

}
