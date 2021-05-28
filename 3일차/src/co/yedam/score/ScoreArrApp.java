package co.yedam.score;

import co.yedam.app.score.printf;

public class ScoreArrApp {
	//일차원 배열
	int [] arr = {90, 90 ,50};
	
	void print() {
		for (int i = 0 ; i <arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	int total() {
		int result=0;
		for (int i =0; i <arr.length; i++) {
			result += arr[i];
		}
		
		return result;
	}
	void printf() {
		System.out.printf("%s\n국어:%-3d영어:%-3d수학:%-3d\n", "홍길동 성적",arr[0],arr[1],arr[2] );
	}
	
	double avg() {
		double result=0;
		result = (double) total() /(double) arr.length;
		return result;
	}
}
