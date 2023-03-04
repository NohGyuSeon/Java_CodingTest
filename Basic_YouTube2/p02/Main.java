package JavaPracticeAlgorithm.p02;

import java.util.Scanner;

public class Main {
	/*
	 * 피보나치 수열을 출력해라
	 * An = An-1 + An-2
	 * 1 1 2 3 5 8 13 21 34 '''
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번째까지 구할까요? ");
		
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		// An = An-1 + An-2; n>=3
		// a1 = 1, a2 = 1
		array[0] = 1;
		array[1] = 1;
		
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i-1] + array[i-2];
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		// 2번째 방법
		int prevPrevNum = 1; 	// An-2
		int prevNum = 1;			// An-1
		System.out.print(prevPrevNum + " ");
		System.out.print(prevNum + " ");
		
		for (int i = 2; i < array.length; i++) {
			int nNum = prevPrevNum + prevNum;
			System.out.print(nNum + " ");
			
			prevPrevNum = prevNum;
			prevNum = nNum;
		}
		
	}	
	
}
