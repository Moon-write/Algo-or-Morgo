package programmers;

public class openChat {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
	      // �����Ͽ� ���߹迭
      String[][] result = new String[record.length][3];
      
      // answer ũ�⼳��
      int count = 0;
      // ���߹迭�� �������
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
      
      // ������� ����
      int i=0;
      int j=0;
      while(i<result.length) {
        switch(result[i][0]) {
          case "Enter" :
              answer[j] = result[i][2]+"���� ���Խ��ϴ�.";
              j++;
              break;
          case "Leave" :
              answer[j] = result[i][2]+"���� �������ϴ�.";
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
