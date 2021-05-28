package co.yedam.score;

public class AppMain {

	public static void main(String[] args) {
		ScoreArrApp score = new ScoreArrApp();
		System.out.println("국영수 성적");
		score.print();
		System.out.println();
		System.out.printf("총점: %04d",score.total());
		System.out.println();
		System.out.printf("평균 : %-6.2f", score.avg());
		System.out.println();
		score.printf();
		
	}

}
