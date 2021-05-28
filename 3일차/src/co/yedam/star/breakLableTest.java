package co.yedam.star;

public class breakLableTest {

	public static void main(String[] args) {
		Outer: 
			for (int i = 1 ; i <9 ; i++) {
			for (int j =0 ; j<9 ; j++) {
				System.out.println(i*j);
				if(j ==2) break Outer; //한 줄이면 중괄호 생략 가능
			}
		} System.out.println("end");
	}
		
}
