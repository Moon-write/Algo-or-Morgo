package jun100.no15596;

public class One {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Test(arr));

		
		// TODO Auto-generated method stub

	}
	
	public static long Test(int[] arr) {
		// arr에 포함되어 있는 정수 n개의 합
		// arr 합을 구해야 하는 정수 n개가 저장되어 있는 배열
		long sum = 0L;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i]; 
		}
		return sum;
	}

}
