package jun100.no15596;

public class One {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Test(arr));

		
		// TODO Auto-generated method stub

	}
	
	public static long Test(int[] arr) {
		// arr�� ���ԵǾ� �ִ� ���� n���� ��
		// arr ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭
		long sum = 0L;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i]; 
		}
		return sum;
	}

}
