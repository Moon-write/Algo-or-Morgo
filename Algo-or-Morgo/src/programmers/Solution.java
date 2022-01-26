package programmers;

public class Solution {

	public static void main(String[] args) {

		String s = "aabbaccc";

        int answer = 0;
        int min = s.length();
        
        for(int i=1;i<s.length();i++) {
            // 1. ������ �� ����� �迭 ����
            int amount = s.length()/i;
            if(s.length()%i!=0) amount++; // �������� �ִٸ� 1ĭ �߰�

            String[] split = new String[amount];

            // 2. �� �迭�� ������ ���ڿ� ����ֱ�        
            int startIndex = 0;
            int endIndex = 0;

            for(int j=0;j<split.length-1;j++) {
                endIndex = startIndex+i;
                split[j] = s.substring(startIndex,endIndex);
                startIndex = endIndex;
            }
            split[split.length-1] = s.substring(startIndex); // ������ �迭�� ���� �ֱ�
            
            // 3. �� �迭�� ��
            String result = "";
            if(split.length==1) result = split[0]; 
            else {
                int count = 1;
                for(int j=0;j<split.length-1;j++) {
                    if(split[j].equals(split[j+1])) {
                        // �ΰ��� ������
                        count++;
                    } else {
                        // �ΰ��� �ٸ���
                        if(count==1) {
                            result += split[j];
                            count = 1;
                        } else {
                            result += count + split[j];
                            count = 1;
                            }
                        }
                    }   
 
                // ���� �迭 ����
                if(count==1) result += split[split.length-1];
                else result += count + split[split.length-1];
            } // else ��
            if(result.length()<min) min = result.length();
        }
        
        answer = min;
        System.out.println(answer);
	}

}
