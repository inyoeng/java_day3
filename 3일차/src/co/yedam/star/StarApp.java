package co.yedam.star;

public class StarApp {
	
	//삼각형 출력 "*"*3 기능 없음!
	void draw(int cnt) {
		for (int i = 1 ;  i<cnt; i ++) {
			//for (int j=0; j< i ; j++) {
				System.out.println(pad('*',i));
			}
			//System.out.println();
		}
	//역삼각형 만들기
	void drawinvert(int cnt) {
		for (int j = cnt ;  j > 0; j --) {
			//for (int j=0; j< i ; j++) {
			System.out.println(pad('*',j));
		}
	}
	//이등변삼각형 만들기
	void drawEq(int cnt) {
		//pad(' ',cnt+1-i)+pad('*',cnt+1-i);
		
		
		for (int i = 1 ;  i<cnt; i ++) {
			for (int j =1; j<50; j++) {
				System.out.print(' ');
			} //앞에 공백
			System.out.print(pad(' ',cnt-i)); //공백출력
			System.out.println(pad('*',(i*2)-1));
		}
		//System.out.println();
	}
	
	//역이등변삼각형
	void drawEqinvert(int cnt) {
		for (int i =cnt; i> 0; i-- ) {
			System.out.println(pad(' ', cnt-i));
			System.out.print(pad('*',(i*2)-1));
		}
		
	}
	
	//대신, (*,10) --->"**********" 만들기!
	String pad(char s ,int cnt) {
		String result =  "";
		for (int i = 0 ;  i<cnt; i ++) {
			result += s;
		}
		return result;
	}
	
}
