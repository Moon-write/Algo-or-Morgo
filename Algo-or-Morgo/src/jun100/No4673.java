package jun100;

public class No4673 {

	public static void main(String[] args) {
		
		// �ĺ� ���� ����
		int[] arr = new int[10000];
		for(int i=0;i<10000;i++) {
			arr[i] = i+1;			
		}
		
		// ���ڸ����� ��� ������ ����Ǽ� �����		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				for(int l=0;l<10;l++) {
					for(int o=0;o<10;o++) {
						int num = 1001*i+101*j+11*l+2*o;
					// �����ڴ� �迭���� ����
					for(int k=0;k<arr.length;k++) {
						if(arr[k]==num)
							arr[k]=0;
					}
				} // ������
			}
		} // ����Ǽ� üũ ��		
		}
		
		// ���
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}				
	}
}