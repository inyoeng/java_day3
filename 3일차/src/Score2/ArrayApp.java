package Score2;

public class ArrayApp {
	
	int [] arr = new int[10]; //0~9
	
	void init() {
		for (int i =0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10)+1;
			}
		}
	
	void print() {
		for (int j= 0; j<arr.length; j++) {
			
				System.out.print(arr[j]+" ");
			
			}
			System.out.println();
		}
	
	void total() {
		int total =0;
		for (int i =0; i <arr.length; i++) {
			total += arr[i];
		}
		System.out.println("total: "+total);
	}
	
	
	void max() {
		int max =arr[0];
		for (int i =0; i <arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max:" +max);
	}
	
	public static void main(String[] args) {
		ArrayApp app = new ArrayApp();
		
		app.init();
		app.total();
		app.max();
		app.print();

	}

}