package jun100;

import java.util.Arrays;
import java.util.Scanner;

public class No1026 {
	// ���1. a�� �������� b�� �ø��������� �Ѵ�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ù°�� n < �迭����
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] aCopy = new int[n];
		int[] bSize = new int[n];
		
		sc.nextLine();
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		String[] s1 = str1.split(" ",n);
		String[] s2 = str2.split(" ",n);
		

		for(int i=0;i<n;i++) {
			aCopy[i] = Integer.parseInt(s1[i]);
			b[i] = Integer.parseInt(s2[i]);
		}
		
		// aCopy �������� ����
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(aCopy[j]<aCopy[j+1]) {
					int tmp = aCopy[j];
					aCopy[j] = aCopy[j+1];
					aCopy[j+1] = tmp;
				}
			}
		}
		
		// b Size�� ũ�������� ��ġ
		// �������� ���?
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j&&b[i]>b[j]) {
					bSize[i]++;
				}
			}
		}
		
		// aCopy 0���� bSize���� 0�� [n] ��Ī ��, a[n]�� aCopy[0] ���
		for(int i=0;i<n;i++) {
			// i = aCopy �ε�����
			for(int j=0;j<n;j++) {
				if(bSize[j]==i) {
					a[j] = aCopy[i];
				}
			}
		}
		
		

		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += a[i]*b[i];
		}
		
		System.out.println(sum);

		
		

	}

}
