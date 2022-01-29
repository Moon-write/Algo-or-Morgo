package programmers.lv1;

public class EngAndNum {

	public static void main(String[] args) {
	    String s = "2three45sixseven";
        String[] eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        String ans = "";

        
        while(true) {
            // 1. 영문
            char c = s.charAt(0);
            if(c>=97&&c<=122) {
                for(int i=0;i<10;i++) {
                    if(s.startsWith(eng[i])) {
                        s = s.replaceAll(eng[i],num[i]);
                        break;
                    }
                }
            } else {
                // 2. 숫자
                ans += c;
                String s1 = s.substring(1);
                s = s1;
            }


            if(s.length()==0) {
                break;
            }
        }
        int answer = Integer.parseInt(ans);
        System.out.println(answer);
	}

}
