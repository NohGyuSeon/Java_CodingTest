package JavaPracticeAlgorithm.p13;

import java.util.Scanner;

public class Main {
	/*
	 * 입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 
	 * 숫자 사각형을 출력하시오
	 * 4
	 * 정답: 1 2 3 4
	 *     2 4 6 8
	 *     3 6 9 12
	 *     4 8 12 16
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = j + i*(j+1) + 1;
			} 
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 다른 방법 풀이
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (i + 1) * (j + 1);
			} 
		} 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
