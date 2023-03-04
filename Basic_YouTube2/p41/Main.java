package JavaPracticeAlgorithm.p41;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1463
 * DP로 푸는 방법
 */
public class Main {
	static int[] ans = new int[100001];

	// 1로만들기 최솟값 구하기
	// 3 나누고 (나누어 떨어질 때)
	// 2 나누고
	// 1 빼고
	// 10은 3

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ans[2] = 1;
			ans[3] = 1;
			// ans[4]
			// 4-1 -> 3/3 => cnt = 2
			// 4/2 -> 2/2 => cnt = 2

			// ans[5]
			// 5-1 -> 4 => cnt = 3

			// ans[6]
			// 6-1 -> 5 => cnt = 4
			// 6/2 -> 3 => cnt = 2
			// 6/3 -> 2 => cnt = 2

			int input = sc.nextInt();
			for (int i = 4; i < 100000; i++) {
				int a = 99999, b = 99999, c = 99999;
				for (int w = 1; w <= 3; w++) {
					if (w == 1) {
						a = ans[i - 1];
					} else if (w == 2) {
						if (i % 2 == 0) {
							b = ans[i / 2];
						}
					} else if (w == 3) {
						if (i % 3 == 0) {
							c = ans[i / 3];
						}
					}
				}
				int min = min(a, b, c);
				ans[i] = 1 + min;
			}
			System.out.println(ans[input]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int min(int a, int b, int c) {
		if (a < b) {
			if (a < c)
				return a;
			else
				return c;
		} else {
			if (b < c)
				return b;
			else
				return c;
		}
	}

}
