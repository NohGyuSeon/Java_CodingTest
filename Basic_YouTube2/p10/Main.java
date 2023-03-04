package JavaPracticeAlgorithm.p10;

import java.util.Scanner;

public class Main {
	/*
	 * 입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 
	 * 숫자 사각형을 출력하시오
	 * 4
	 * 정답: 1 2 3 4
	 *     5 6 7 8
	 *     9 10 11 12
	 *     13 14 15 16
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", k);
				k++;
			}
			System.out.println();
		}
		
		System.out.println();
		
		// k를 사용하지 않고 해결 방법
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", i*n + j + 1);
			}
			System.out.println();
		}
		
	}
	
}
