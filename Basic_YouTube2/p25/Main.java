package JavaPracticeAlgorithm.p25;

import java.util.Scanner;

public class Main {
	/*
	 * N이 주어졌을 때 N의 사이클의 길이를 구하시오 (1 <= N <= 100)
	 * 입력: 26
	 * 정답: 4 (26시작 2+6=8 -> 68, 6+8=14 -> 84, 8+4=12 -> 42, 4+2=6 => 26)
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int res = n;
		int tmp = 0;
		int cnt = 0;
		
		do {
			tmp = res / 10 + res % 10;
			res = res % 10 * 10 + tmp % 10;
			cnt++;
		} while(n != res);
		
		System.out.println(cnt);
	}
	
}
