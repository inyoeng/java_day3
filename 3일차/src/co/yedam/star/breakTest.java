package co.yedam.star;

public class breakTest {

	public static void main(String[] args) {
		
		while (true) {
			int num = (int) (Math.random()*6) +1 ; //1~10 난수구하는 법
			System.out.println(num);
			if (num ==6) {
				break;
			}
		}
	}

}
