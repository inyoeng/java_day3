package Score2;

public class ScoreMain2 {

	public static void main(String[] args) {
		ScoreArr2 app = new ScoreArr2();
		app.print();
		System.out.println();
		for (int i = 0; i < app.arr.length; i++) {
			System.out.println(app.getsbjCnt(i) +" "+app.stdtotal(i));
		}

		for (int i = 0; i < app.arr.length; i++) {
			System.out.println(app.arr[i].length+"과목의 총점 : "+app.stdtotal(i));
		}
	}

}
