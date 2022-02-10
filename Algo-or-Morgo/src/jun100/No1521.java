package jun100;

import java.util.ArrayList;
import java.util.Scanner;

public class No1521 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 숫자배열은 연산자 배열보다 1 크다
		ArrayList list = new ArrayList();
		
		int start=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='+'||str.charAt(i)=='-') { // + 또는 -가 나올때까지 i 진행
				String s = str.substring(start,i); // 시작자리에서 i 전까지 분리
				Integer num = Integer.parseInt(s); // 정수 num으로 변환
				list.add(num); // 정수 num 추가
				
				char c = str.charAt(i); // 연산자만 따로 추출
				list.add(c); // 연산자 추가
				start = i+1; // 시작지점 변경				
			}
			if(i==str.length()-1) { // 제일 마지막 숫자일때?
				String s1 = str.substring(start);
				Integer num1 = Integer.parseInt(s1);
				list.add(num1);
			}			
		}
		
		// 확인용
		System.out.println(list);
		
		
		// 규칙 1. - - 넘어감
		// 규칙 2. - + !!! - 뒤에 괄호처리(+)
		// 규칙 3. + - 넘어감
		// 규칙 4. + + 넘어감
		
		int i =1;
		int result = 0;
		
		// 제일 첫 항 처리하기
		result += (int)list.get(0);		
		list.remove(0);
		
		// ++끼리만 묶어주기
		for(int j=0;j<list.size();j+=2) {
			if((j+2)<list.size()&&list.get(j).equals('+')&&list.get(j+2).equals('+')) {
				Integer num = (int)list.get(j+1) + (int)list.get(j+3);
				list.set(j+1,num);
				list.remove(j+3);
				list.remove(j+2);
			} 
		} // + + 끼리만 묶어주기
		
		
		// 연산자 체크 후 처리
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
