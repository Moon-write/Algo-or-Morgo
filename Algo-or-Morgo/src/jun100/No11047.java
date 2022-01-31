package jun100;

import java.util.Scanner;

public class No11047 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		String[] s = str.split(" ",2);
		
		// s[0] = ��������
		// s[1] = �ѱݾ�
		int much = Integer.parseInt(s[0]);
		int total = Integer.parseInt(s[1]);
		
		// ���� �ּҴ����� �󸶳� ����� �ִ��� Ȯ�� = ù�ڸ��� ������ 1, �ݾ׸�ŭ ���� ����
		// �� ������ �ִ�ġ �����ִ¸�ŭ �й�
		
		// �����ݾ�
		int[] coin = new int[much];
		int[] coinCount = new int[much];
		// ������ �ݾ׹�ġ
		for(int i =0;i<much;i++) {
			if(i==0) {
				coin[i]=1;
			} else if(i%2==1) {
				coin[i]= coin[i-1]*5;
			} else if(i%2==0) {
				coin[i]= coin[i-1]*2;
			}
		} // �ݾ׹�ġ ��
		
		// �ݾ׺�
		for(int i=much-1;i>=0;i--) {
			if(coin[i]<=total) {
				total -= coin[i];
				coinCount[i]++;
				i++;
			}
		}
		
		int answer = 0;
		// ��������
		for(int i=0;i<much;i++) {
			answer +=coinCount[i];
		}
		
		
		
		System.out.println(answer);
	}

	
	
	
}
