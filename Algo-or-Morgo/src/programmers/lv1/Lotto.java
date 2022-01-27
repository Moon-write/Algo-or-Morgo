package programmers.lv1;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
        int[] answer = {0,0};
        
        // lotto �迭�� ���� ���� ���ڵ�
        // win �迭�� ��÷��ȣ ���ڵ�
        // answer �ְ����� �������
        
        // �� �ζǹ�ȣ�� ������ 0�� ��ִ��� Ȯ�� - 0�̸� ������ī��Ʈ
        // 0�� �ƴϸ� �����̶� �󸶳� ��ġ�ϴ��� Ȯ��
        int anony = 0; // ����������        
        int count = 0; // 0�̿��� ������ġ
        
        for(int i=0;i<lottos.length;i++) {
            if(lottos[i]==0) anony++;
            else {
                for(int j=0;j<win_nums.length;j++) {
                    if(lottos[i]==win_nums[j]) {
                        // ���� ��ġ�ϸ� count ����
                        count++;
                        break;
                    }
                }
            }
        }
        // �ְ����
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
