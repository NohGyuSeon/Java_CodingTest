package JavaPracticeAlgorithm.p03;

import java.util.Scanner;

public class Main {
	/*
	 * 가장 많이 출현한 수를 출력하시오.
	 * 1 2 2 3 1 4 2 2 4 3 5 3 2
	 * 정답: 2 (5회)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 숫자 횟수를 입력하세요 ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		System.out.println("숫자들을 입력하세요");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		// "checkArray[3] = 5, => 3번 숫자가, 5번 출현했다"
		int checkArray[] = new int[n];
		
		for (int i = 0; i < checkArray.length; i++) {
			checkArray[array[i]]++;
		}
		
		System.out.println();
		
		int maxNum = 0; // 최빈수
		int maxCnt = 0; // 최빈수가 나온 횟수
		
		for (int i = 1; i < checkArray.length; i++) {
			if (maxCnt < checkArray[i]) {
				maxCnt = checkArray[i];
				maxNum = i;
			}
		}
		
		System.out.printf("정답: %d (%d회)", maxNum, maxCnt);
	}
	
}
