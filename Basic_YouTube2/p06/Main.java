package JavaPracticeAlgorithm.p06;

import java.util.Scanner;

public class Main {
	/*
	 * 입력된 두 수의 최대공약수를 구하시오
	 * 12 18
	 * 정답: 6
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int small, big;
		
		if (a > b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}
		
		int gcd = 1; // 최대공약수
		int i = 2;
		
		while(i <= small) {
			if (small % i == 0 && big % i == 0) {
				gcd = i;
			}
			i++;
		}
		
		System.out.println("gcd: " + gcd);
	}
	
}
