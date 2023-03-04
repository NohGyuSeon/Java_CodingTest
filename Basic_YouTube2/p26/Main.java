package JavaPracticeAlgorithm.p26;

import java.util.Scanner;

public class Main {
	/*
	 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734과 893을 칠판에 
	 * 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서 상수는 두 수중 큰 수인 
	 * 437을 큰 수라고 말할 것이다.
	 * 
	 * 예제 입력: 734 893
	 * 예제 출력: 437
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(reverseMax(a, b));
	}
	
	public static int reverseMax(int a, int b) {
		
		int arrA[] = new int[3];
		int arrB[] = new int[3];
		
		int lenA = 0;
		do {
			arrA[lenA] = a % 10;
			a /= 10;
			lenA++;
		} while(a > 0);
		
		int tranA = 0;
		int muxA = 1;
		for (int i = arrA.length-1; i >= 0; i--) {
			tranA += arrA[i] * muxA;
			muxA *= 10;
		}
		
		int lenB = 0;
		do {
			arrB[lenB] = b % 10;
			b /= 10;
			lenB++;
		} while(b > 0);
		
		int tranB = 0;
		int muxB = 1;
		for (int i = arrB.length-1; i >=0; i--) {
			tranB += arrB[i] * muxB;
			muxB *= 10;
		}
		
		if (tranA >= tranB) {
			return tranA;
		} else {
			return tranB;
		}
		
	}
	
}
