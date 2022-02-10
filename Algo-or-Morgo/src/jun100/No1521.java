package jun100;

import java.util.ArrayList;
import java.util.Scanner;

public class No1521 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// ���ڹ迭�� ������ �迭���� 1 ũ��
		ArrayList list = new ArrayList();
		
		int start=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='+'||str.charAt(i)=='-') { // + �Ǵ� -�� ���ö����� i ����
				String s = str.substring(start,i); // �����ڸ����� i ������ �и�
				Integer num = Integer.parseInt(s); // ���� num���� ��ȯ
				list.add(num); // ���� num �߰�
				
				char c = str.charAt(i); // �����ڸ� ���� ����
				list.add(c); // ������ �߰�
				start = i+1; // �������� ����				
			}
			if(i==str.length()-1) { // ���� ������ �����϶�?
				String s1 = str.substring(start);
				Integer num1 = Integer.parseInt(s1);
				list.add(num1);
			}			
		}
		
		// Ȯ�ο�
		System.out.println(list);
		
		
		// ��Ģ 1. - - �Ѿ
		// ��Ģ 2. - + !!! - �ڿ� ��ȣó��(+)
		// ��Ģ 3. + - �Ѿ
		// ��Ģ 4. + + �Ѿ
		
		int i =1;
		int result = 0;
		
		// ���� ù �� ó���ϱ�
		result += (int)list.get(0);		
		list.remove(0);
		
		// ++������ �����ֱ�
		for(int j=0;j<list.size();j+=2) {
			if((j+2)<list.size()&&list.get(j).equals('+')&&list.get(j+2).equals('+')) {
				Integer num = (int)list.get(j+1) + (int)list.get(j+3);
				list.set(j+1,num);
				list.remove(j+3);
				list.remove(j+2);
			} 
		} // + + ������ �����ֱ�
		
		
		// ������ üũ �� ó��
		while(list.size()>0) {
			
			if(list.size()>=4&&list.get(0).equals('-')&&list.get(2).equals('+')) {
				result -= ( (int)list.get(1) + (int)list.get(3));
				list.remove(3);
				list.remove(2);
				list.remove(1);
				list.remove(0);
			} else if(list.size()>=2&&list.get(0).equals('-')) {
				result -= (int)list.get(1);
				list.remove(1);
				list.remove(0);
			} else if(list.size()>=2&&list.get(0).equals('+')) {
				result += (int)list.get(1);
				list.remove(1);
				list.remove(0);
			}			
		}
		System.out.println(result);		
	}
}
