package JavaPracticeAlgorithm.p09;

import java.util.Scanner;

public class Main {
	/*
	 * 입력된 수의 각 자릿수 합을 구하시오
	 * 1242
	 * 정답: 9
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		 
		String[] array = str.split("");
		
		int[] numArray = new int[array.length];
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			numArray[i] = Integer.parseInt(array[i]);
			sum += numArray[i];
		}
		System.out.println(sum);
		
		// 다른 방법 (자릿수로 계산)
		// 1242 => 124 => 12 => 1
		// 	  2      4     2    1 => 9
		
		int num = Integer.parseInt(str);
		int accSum = 0;
		
		while(num > 0) {
			accSum += num % 10;
			num /= 10;
		}
		
		System.out.println(accSum);
	}
	
}
