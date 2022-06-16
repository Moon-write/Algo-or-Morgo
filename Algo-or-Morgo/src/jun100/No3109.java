package jun100;

import java.util.Scanner;

public class No3109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String size = sc.nextLine();
		String[] sizeArr = size.split(" ");

		int row = Integer.parseInt(sizeArr[0]);
		int col = Integer.parseInt(sizeArr[1]);
		
		String[][] map = new String[row][col];
		
		for(int i = 0;i<row;i++) {
			String oneRow = sc.nextLine();
			for(int j=0;j<col;j++) {
				map[i][j]= Character.toString(oneRow.charAt(j));
			}
		}
		sc.close();
		
		// 왼쪽부터 시작
		// 바로 위로 나가는걸 최우선, 없으면 옆 또는 아래 검색
		// 각 행별로 하나씩 출발
		// 파이프가 설치된 곳은 .에서 O로 바꾸기
		// 최종적으로 도달 성공하면 O에서 X로 고정해서 변환
		// 도달 못하면 O에서 .로 바꾸고 리턴
		
		int result = 0;

		for(int i =0;i<row;i++) {	
			int j =0;
			while(true) {
				 // 0행일때
				if(i==0) {
					// 바로 오른쪽이 비었는지 판단
					if(map[i][j+1].equals(".")) {
						map[i][j+1]="O"; // .를 O로 변환
						j++; // 행은 그대로 열한칸 옆으로
					}else if(map[i+1][j+1].equals(".")) {
						map[i+1][j+1]="O";
						i++; // 행도 늘리고 열도 늘리고
						j++;
					}else {
						// 망한거임
						map = init(map);
						break;
					}
				}else if(i==row-1){
					// 마지막 행일때
					if(map[i-1][j+1].equals(".")) {
						map[i-1][j+1]="O";
						i--;
						j++;
					}else if(map[i][j+1].equals(".")) {
						map[i][j+1]="O"; // .를 O로 변환
						j++; // 행은 그대로 열한칸 옆으로
					}else {
						// 망한거임
						map = init(map);
						break;
					}
				}else{
					// 0행이도 마지막행도 아닐때
					if(map[i-1][j+1].equals(".")) {
						map[i-1][j+1]="O";
						i--;
						j++;
					}else if(map[i][j+1].equals(".")) {
						map[i][j+1]="O"; // .를 O로 변환
						j++; // 행은 그대로 열한칸 옆으로
					}else if(map[i+1][j+1].equals(".")) {
						map[i+1][j+1]="O";
						i++; // 행도 늘리고 열도 늘리고
						j++;
					}else {
						// 망한거임
						map = init(map);
						break;
					}
				}
				// 끝까지 도달했다
				if(j==col-1) {
					result++;
					map = check(map);
					break;
				}
			}
		}		
		System.out.println(result);
	}
	
	// 초기화 메소드
	public static String[][] init(String[][] map){
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				if(map[i][j].equals("O")) {
					map[i][j]=".";
				}
			}
		}
		return map;
	}
	
	// 임시변경 메소드
	public static String[][] check(String[][] map){
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				if(map[i][j].equals("O")) {
					map[i][j]="P";
				}
			}
		}
		return map;
	}
	
	public static void printMap(String[][] map) {
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
