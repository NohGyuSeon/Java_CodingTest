package JavaPracticeAlgorithm.p08;

import java.util.Scanner;

public class Main {
	/*
	 * 입력된 수의 팩토리얼을 구하시오
	 * 5
	 * 정답: 120
	 */
	
	// 재귀함수 이용 방법
	public static int fibo(int n) {
		
		if (n < 0) {
			return -1;
		}
		if (n == 0) {
			return 1;
		}
		
		return n * fibo(n-1);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fibo(n));
		
		// 반복문 이용 방법
		int fiboNum = 1;
		
		for (int i = 1; i <= n; i++) {
			fiboNum *= i;
		}
		
		System.out.println(fiboNum);
	}  
	
}
