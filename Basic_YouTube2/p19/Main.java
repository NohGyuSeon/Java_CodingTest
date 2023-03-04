package JavaPracticeAlgorithm.p19;

import java.util.Scanner;

public class Main {
	/*
	 * 다음 입력 n의 m승의 결과를 출력하시오
	 * 입력: 5 3
	 * 
	 * 정답: 125
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int pow = (int) Math.pow(a, b);
		System.out.println(pow);
		
		System.out.println();
		
		// 반복문 풀이
		
		int res = 1;
		
		for (int i = 0; i < b; i++) {
			res *= a;
		} 
		
		System.out.println(res);
	}
	
}
