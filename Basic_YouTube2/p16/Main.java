package JavaPracticeAlgorithm.p16;

import java.util.Scanner;

public class Main {
	/*
	 * 다음 입력 n을 받아 아래와 같은 *을 출력하시오
	 * 입력: 5
	 * 
	 * 정답:
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
