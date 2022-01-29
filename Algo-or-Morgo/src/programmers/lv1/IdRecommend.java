package programmers.lv1;



public class IdRecommend {

	public static void main(String[] args) {
		String new_id = new String(	"=.=");
		StringBuilder sb = new StringBuilder();
		String answer = "";
        
        // 1단계+2단계
        for(int i=0;i<new_id.length();i++) {
            char c = new_id.toLowerCase().charAt(i);
            if((c>=48&&c<=57)||(c>=97&&c<=122)||c=='-'||c=='_'||c=='.') sb.append(c);
        }
        
        boolean bool5 = false;
        while(!bool5) {
            step5(sb);
            
            boolean bool3 = true;
            while(bool3) {
                bool3 = step3(sb);
            }
            
            step5(sb);

            
            boolean bool4 = true;
            while(bool4) {
                bool4 = step4(sb);
            }
            
            while(!bool5) {
            bool5 = step5(sb);
            }  
    
            
        }
        
        // 6단계
        if(sb.length()>=16&&sb.charAt(14)=='.') answer = sb.substring(0,14);
        else if(sb.length()>=16&&sb.charAt(14)!='.') answer = sb.substring(0,15);
        else if(sb.length()<=2) {
            while(sb.length()<3) {
                sb.append(sb.charAt(sb.length()-1));
            } 
            answer = sb.toString();
        } else {
            answer = sb.toString();
        }       

        System.out.println(answer);;
    }
    
    public static boolean step3(StringBuilder sb) {
        for(int i=0;i<sb.length()-1;i++) {
           if(sb.charAt(i)=='.'&&sb.charAt(i+1)=='.') {
                sb.replace(i,i+2,".");
                return true;
            }
        }
        return false;
    }
    
    public static boolean step4(StringBuilder sb) {
        if(sb.length()!=0&&sb.charAt(0)=='.') {
            sb.deleteCharAt(0);
            return true;
        }
        
        if(sb.length()!=0&&sb.charAt(sb.length()-1)=='.') {
            sb.deleteCharAt(sb.length()-1);
            return true;
        }
        return false;
    }
    
    public static boolean step5(StringBuilder sb) {
        if(sb.length()==0) {
            sb.append("a");
            return false;
        }
        return true;
    }
    

    
}
