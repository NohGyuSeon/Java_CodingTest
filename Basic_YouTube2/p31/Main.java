package JavaPracticeAlgorithm.p31;

import java.util.Scanner;

public class Main {
	/*
	 * 입력된 수의 팩토리얼을 구하시오
	 * 5
	 * 정답: 120
	 */
	public static int calFact(int i) {

		if (i == 1 ) {
			return 1;
		}

		return i * calFact(i-1);
	}
	
	// 3 * 2 * 1
	// 		2 * 1
	//			 * 1
	// -> 6


	public static void main(String[] args) {

		int input;
		Scanner scan = new Scanner(System.in);

		input = scan.nextInt();
		int ans = 0;


		ans = calFact(input);



		System.out.println(ans);

	}
	
	
}
