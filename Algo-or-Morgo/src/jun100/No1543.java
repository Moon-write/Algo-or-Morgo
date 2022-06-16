package jun100;

import java.util.Scanner;

public class No1543 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String document = sc.nextLine();
		String keyword = sc.nextLine();
		sc.close();
		
		int count = 0;
		while(true) {
			if(document.indexOf(keyword)!=-1) {
				count++;
				String newLine = document.replaceFirst(keyword, "");
				document = newLine;
			}else {
				break;
			}
		}
		System.out.println(count);
	}
}
