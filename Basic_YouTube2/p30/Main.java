package JavaPracticeAlgorithm.p30;

import java.util.Scanner;

public class Main {
	/*
	 * 입력된 숫자까지 + - 를 차례대로 반복하시오
	 * 예제 입력: 9
	 * 출력: 1+2-3+4-5+6-7+8-9
	 */
	public static void main(String[] args) {
		int until;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		until = scan.nextInt();
		
		for (int i = 1; i <= until; i++) {
			if (i == until) {
				System.out.println(i);
				break;
			}			
			
			if (flag) {
				System.out.print(i+"+");
				flag = !flag;
			}
			else {
				System.out.print(i+"-");
				flag = !flag;
			}		
		}
		
		
	}

}
