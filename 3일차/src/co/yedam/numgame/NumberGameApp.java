package co.yedam.numgame;

import java.util.Scanner;
//정인영!

public class NumberGameApp {
 /*
  * 임의의 수 생성
  * 사용자 수를 입력
  * 높다 or 낮다
  */
	int com;
	int user;
	
	void init() {
		com = (int)(Math.random()*10)-1;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
	}
	
	//높or낮 false, 정답 true
	boolean confirm() {
		if (com == user) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	void start() {
		init();
		while(true) {
			input();
			if (confirm()) {
				break;
			}
		}
		System.out.println("You win!");
	}
}
