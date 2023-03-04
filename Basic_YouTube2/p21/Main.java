package JavaPracticeAlgorithm.p21;

import java.util.Scanner;

public class Main {
	/*
	 * 1~100까지 숫자가 입력될 때 한번이라도 입력되었으면 출력하시오.
	 * 입력: 1 2 3 1 1 2 3 4 5 5 
	 * 정답: 1 2 3 4 5
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int array[] = new int[10];
		int num[] = new int[101];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int j = 0; j < array.length; j++) {
			num[array[j]] = 1;
		}
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 1) {
				System.out.print(i + " ");
			}
		}
		
	}
	
}
