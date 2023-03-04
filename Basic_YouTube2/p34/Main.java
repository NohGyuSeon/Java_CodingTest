package JavaPracticeAlgorithm.p34;

import java.util.Scanner;

/*
	입력된 항의 피보나치 수를 구하시오
	
	6
	
	정답: 8
*/
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter a digit: ");
			int n = sc.nextInt();
			
			System.out.println(fibo(n-1));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static int fibo(int n) {
		
		if (n == 0) {
			return 1;
		}
		
		if (n == 1) {
			return 1;
		}
		
		return fibo(n-2) + fibo(n-1);
	}
	
}
