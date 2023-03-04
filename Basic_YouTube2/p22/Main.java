package JavaPracticeAlgorithm.p22;

import java.util.Scanner;

public class Main {
	/*
	 * 입력된 수가 팰린드롬인지 판별하시오
	 * 입력: 12321
	 * 정답: True
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int len = str.length();
		boolean flag = true;
		
		for (int i = 0; i < len/2; i++) {
			if (str.charAt(i) != str.charAt(len-i-1)) {
				flag = false;
			}
		}
		
		System.out.println(flag);
	}
	
}
