package JavaPracticeAlgorithm.p28;

import java.util.Scanner;

public class Main {
	/*
	 * 입력받은 10진수를 n진수로 변환시키시오.
	 * 예제 입력: 19 16
	 * 
	 * 출력 13
	 */
	public static void main(String[] args) {

		char n[] = new char[100];
		// A, B, C... F
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int jinsu = sc.nextInt();
		
		int i = 0;
		while(num > 0) {
			int tmp = num % jinsu;
	        
			if(tmp >= 10 && tmp <= 15) {
				n[i] = (char)('A' + (tmp-10));
			} else {
				n[i] = (char)('0'+tmp);
				System.out.println(n[i]);
			}
			
			num /= jinsu;
			i++;
		}
		
		for(; i >= 0; i--) {
			System.out.print(n[i]);
		}
		
	}
}
