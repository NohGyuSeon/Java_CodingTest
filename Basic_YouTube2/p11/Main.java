package JavaPracticeAlgorithm.p11;

import java.util.Scanner;

public class Main {
	/*
	 * 입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 
	 * 숫자 사각형을 출력하시오
	 * 4
	 * 정답: 1 2 3 4
	 *     8 7 6 5
	 *     9 10 11 12
	 *     16 15 14 13
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = 1;
		int flag = -1;
		
		for (int i = 0; i < n; i++) {
			if (flag == -1) {
				for (int j = 0; j < n; j++) {
					System.out.printf("%4d", k);
					k++;
				}
				k += n-1;
			} else {
				for (int j = 0; j < n; j++) {
					System.out.printf("%4d", k);
					k--;
				}
				k += n+1;
			}
			System.out.println();
			flag *= -1;
		}

		System.out.println();
		
		// 다른 방법 (배열 사용)
		int[][] arr = new int[n][n];
		
		/*
		 * n = 3
		 * 
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = i * n + j + 1;
				}
			} else {
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[i][j] = i * n + n - j;
				}
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
