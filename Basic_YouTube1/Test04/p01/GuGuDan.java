package JavaPracticeBasic.Test04.p01;

public class GuGuDan {

	public static void main(String[] args) {
		// 단 반복
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			// 1~9 반복
			for (int j = 1; j <= 9; j++) {
				System.out.printf("\t%d x %d = %d\n", i, j, i*j);
			}
		}
		
	}
	
}
