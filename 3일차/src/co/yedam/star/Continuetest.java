package co.yedam.star;

public class Continuetest {

	public static void main(String[] args) {
		//짝수만 프린트
		for (int i = 1; i<10; i++) {
			if (i%2 == 1) {
				continue;
			}
			System.out.println(i);
			if (i==5) {
				break;
			}
		}
	}

}
