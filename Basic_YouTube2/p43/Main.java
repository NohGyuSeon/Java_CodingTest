package JavaPracticeAlgorithm.p43;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2293
 */
public class Main {

	public static void main(String[] args) {
		
		/*
		 * 		1 2 3 4 5 6 7 8 9 10
		 * 1	1 1 1 1 1 1 1 1 1 1
		 * 2	0 1 1 2 2 3 3 4 4 5 
		 * 5	0 0 0 0 1 1 2 2 3 4
		 * 		  2 2 3 4 5 5 7 8 10
		 */
		
		int coin[] = new int[101];
		int dp[] = new int[10001];
		
		Scanner sc = new Scanner(System.in);
		int numCoin = sc.nextInt();
		int money = sc.nextInt();

		for (int i = 1; i <= numCoin; i++) {
			coin[i] = sc.nextInt();
		}
		dp[0] = 1;
		for (int i = 1; i <= numCoin; i++) {
			for (int j = coin[i]; j <= money; j++) {
				dp[j] += dp[j - coin[i]];
			}
		}
		System.out.println(dp[money]);
		
	}
}
