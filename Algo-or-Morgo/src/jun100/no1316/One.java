package jun100.no1316;

import java.util.Arrays;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// �׷�ܾ�üĿ
		// ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�.
		// ��° �ٺ��� N���� �ٿ� �ܾ ���´�. �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// �� �ٺ��� �ܾ� �Է�
		String[] arr=new String[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.next();
		}
		
		check(arr[0]);
		
	} // ���θ޼ҵ� ��
	
	public static void check(String arr) {
		char[] alphabet = new char[26];
		for(int i=0;i<alphabet.length;i++) {
			alphabet[i]=(char)(97+i);
		}
		
		// String ���� ���ĺ� ���� ã��
		int[] count = new int[26];
		for(int i=0;i<arr.length();i++) {
			for(int j=0;j<alphabet.length;j++) {
				if(alphabet[j]==arr.charAt(i)) {
					count[j]++;
				}
			}
		}
		System.out.println(Arrays.toString(count));
		
		// ���޾� ������ ���ĺ� ã��
		int start = 0;
		int end = 1;
		while(true) {
			if(arr.charAt(start)==arr.charAt(end)) {
				end++;
			} else {// ���̴ٸ���? �׷��� �׶� start ���� �������� ���ڼ� ����
				for(int i=0;i<alphabet.length;i++) {
					if(alphabet[i]==arr.charAt(start)) {
						(count[i]-(end-start))==0? return true:return false;
					}
				}
						
			}
		}
		
		
		
	} // �޼ҵ� ��
} // Ŭ���� ��
