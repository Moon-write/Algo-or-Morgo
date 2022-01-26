package programmers;

public class openChat {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
	      // 결과기록용 이중배열
      String[][] result = new String[record.length][3];
      
      // answer 크기설정
      int count = 0;
      // 이중배열에 나눠담기
      for(int i=0;i<record.length;i++) {
          String[] num = record[i].split(" ");
          result[i][0] = num[0];
          System.out.println(result[i][0]);
          result[i][1] = num[1];
          System.out.println(result[i][1]);
          result[i][2] = num[2];
          System.out.println(result[i][2]);
          
          if(i>=1) {
              if(result[i][0].equals("Change")) {
                 for(int j=0;j<=i;j++) {
                  if(result[j][1]==result[i][1]) {
                      result[j][2] = result[i][2];
                  }
              }
              count++;
          }
          }

      }
      String[] answer = new String[(record.length)-count];
      
      // 최종결과 리턴
      int i=0;
      int j=0;
      while(i<result.length) {
        switch(result[i][0]) {
          case "Enter" :
              answer[j] = result[i][2]+"님이 들어왔습니다.";
              j++;
              break;
          case "Leave" :
              answer[j] = result[i][2]+"님이 나갔습니다.";
              j++;
              break;
          case "Change" :
              break;
          default:
              break;
          }
          i++;
      }        
      
		
	}

}
