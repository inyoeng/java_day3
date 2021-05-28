package Score2;

public class ArrayTest {

	public static void main(String[] args) {
		
		int [] arr = new int[10]; //0~9
		for (int i =0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10)+1;
		}
		//배열 출력
		
		for (int j= 0; j<arr.length; j++) {
			
			System.out.print(arr[j]+" ");
			
		}
		System.out.println();
		
		//합계 구하기
		
		int total =0;
		for (int i =0; i <arr.length; i++) {
			total += arr[i];
		}
		System.out.println("total: "+total);
		
		//max
		int max =arr[0];
		for (int i =0; i <arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max:" +max);
	}

}
