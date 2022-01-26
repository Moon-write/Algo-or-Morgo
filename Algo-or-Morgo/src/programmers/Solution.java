package programmers;

public class Solution {

	public static void main(String[] args) {

		String s = "aabbaccc";

        int answer = 0;
        int min = s.length();
        
        for(int i=1;i<s.length();i++) {
            // 1. 분할한 값 저장용 배열 생성
            int amount = s.length()/i;
            if(s.length()%i!=0) amount++; // 나머지가 있다면 1칸 추가

            String[] split = new String[amount];

            // 2. 각 배열에 분할한 문자열 집어넣기        
            int startIndex = 0;
            int endIndex = 0;

            for(int j=0;j<split.length-1;j++) {
                endIndex = startIndex+i;
                split[j] = s.substring(startIndex,endIndex);
                startIndex = endIndex;
            }
            split[split.length-1] = s.substring(startIndex); // 마지막 배열은 직접 넣기
            
            // 3. 각 배열간 비교
            String result = "";
            if(split.length==1) result = split[0]; 
            else {
                int count = 1;
                for(int j=0;j<split.length-1;j++) {
                    if(split[j].equals(split[j+1])) {
                        // 두개가 같으면
                        count++;
                    } else {
                        // 두개가 다르면
                        if(count==1) {
                            result += split[j];
                            count = 1;
                        } else {
                            result += count + split[j];
                            count = 1;
                            }
                        }
                    }   
 
                // 최후 배열 관리
                if(count==1) result += split[split.length-1];
                else result += count + split[split.length-1];
            } // else 끝
            if(result.length()<min) min = result.length();
        }
        
        answer = min;
        System.out.println(answer);
	}

}
