package programmers.lv1;

import java.util.Arrays;

public class Report {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;

        int[] answer = new int[id_list.length];  
        
        // �� �Ű��� ���/�� �Ű���� ��� - �ش�Ǵ� ���̽��� 1 üũ
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
        
        // �Ű��� k�� �̻��� ���
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
    } // �޼ҵ� ��

}
