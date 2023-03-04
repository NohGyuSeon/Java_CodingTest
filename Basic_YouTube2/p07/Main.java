package JavaPracticeAlgorithm.p07;

import java.util.Scanner;

public class Main {
	/*
	 * 입력된 수가 소수인지 판별하시오
	 * 13
	 * 정답: 13은 소수입니다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int root = (int) (Math.sqrt(n)+1);
		
		boolean isPrime = true;
		
		for (int i = 2; i < root; i++) {
			if (n % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("정답: " + n + "은 소수입니다.");
		} else {
			System.out.println("정답: " + n + "은 소수가 아닙니다.");
		}
		
	}
	
}
