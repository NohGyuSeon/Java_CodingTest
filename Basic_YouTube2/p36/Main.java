package JavaPracticeAlgorithm.p36;

import java.util.Scanner;

/*
	입력된 수를 이진수로 변환하세요
	17
	정답: 1 0001
 */
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Enter a digit: ");
			int n = sc.nextInt();
			
			binaryOP(n);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void binaryOP(int n) {
		if (n / 2 == 0) {
			System.out.print(n);
			return;
		}
		
		binaryOP(n/2);
		System.out.print(n % 2);
	}
	
	
}
