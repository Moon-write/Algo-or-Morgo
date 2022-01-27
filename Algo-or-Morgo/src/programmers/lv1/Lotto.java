package programmers.lv1;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
        int[] answer = {0,0};
        
        // lotto 배열은 내가 넣은 숫자들
        // win 배열은 당첨번호 숫자들
        // answer 최고등수와 최저등수
        
        // 내 로또번호를 돌려서 0이 몇개있는지 확인 - 0이면 미지수카운트
        // 0이 아니면 정답이랑 얼마나 일치하는지 확인
        int anony = 0; // 미지수숫자        
        int count = 0; // 0이외의 숫자일치
        
        for(int i=0;i<lottos.length;i++) {
            if(lottos[i]==0) anony++;
            else {
                for(int j=0;j<win_nums.length;j++) {
                    if(lottos[i]==win_nums[j]) {
                        // 둘이 일치하면 count 증가
                        count++;
                        break;
                    }
                }
            }
        }
        // 최고순위
        answer[0] = prize(count+anony);
        answer[1] = prize(count);
        System.out.println(Arrays.toString(answer));
    }
    
    public static int prize(int count) {
        switch(count) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }        
    }
}
