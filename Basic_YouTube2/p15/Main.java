package JavaPracticeAlgorithm.p15;

import java.util.Scanner;

public class Main {
	/*
	 * 구구단 시작 s부터 f단까지 입력 받아 아래와 같이 출력하시오
	 * 입력: 2 3
	 * 정답:
	 * 2 * 1 = 2    3 * 1 = 3
	 * 2 * 1 = 4    3 * 2 = 6
	 * '''			'''
	 * 2 * 8 = 16   3 * 8 = 24
	 * 2 * 9 = 18   3 * 9 = 27
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			for (int j = a; j <= b; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
		
	}

}
