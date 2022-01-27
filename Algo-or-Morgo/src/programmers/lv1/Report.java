package programmers.lv1;

import java.util.Arrays;

public class Report {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;

        int[] answer = new int[id_list.length];  
        
        // 행 신고한 사람/열 신고당한 사람 - 해당되는 케이스에 1 체크
        int[][] black = new int[id_list.length][id_list.length];
        
        for(int i=0;i<report.length;i++) {
            int column = 0;
            int row = 0 ;
            String[] str = report[i].split(" ");
            for(int j=0;j<id_list.length;j++) {
                if(id_list[j].equals(str[0])) column = j;
                else if(id_list[j].equals(str[1])) row = j;
            }
            black[column][row] = 1;
        }
        
        // 신고량이 k건 이상인 경우
        for(int i=0;i<id_list.length;i++) {
            int count=0;
            for(int j=0;j<id_list.length;j++) {
                count += black[j][i];
            }
            if(count>=k) {
                for(int j=0;j<id_list.length;j++) {
                    if(black[j][i]==1) answer[j]++;
                }
            }
        }    
    
        System.out.println(Arrays.toString(answer));
    } // 메소드 끝

}
