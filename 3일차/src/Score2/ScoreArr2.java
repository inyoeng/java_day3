package Score2;

public class ScoreArr2 {
	//이차원 배열!!!
					// ko en mat			
	int [][] arr = { {100,90,80},
				{40,90,50},
				{70,80,100},
				{30,50,60}};
	
	//전체 성적 출력
	 void print() {
		 for(int i = 0 ; i < arr.length; i++) {
			 for (int j = 0; j < arr[i].length; j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
	 }
	// 입력한 번호의 한 학생의 총점 계산 
	 
	 int stdtotal(int no) {
		 int result = 0;
		 for (int i=0 ;i<arr[no].length; i++) {
			 result += arr[no][i];
		 }
		 return result;
		 
	 }
	 
	 //해당 학생의 과목 수
	 int getsbjCnt (int no) {
		 for (int i=0 ;i<arr[no].length; i++) {
			 arr[i].length;
		 return 
		 }
	 }
}
