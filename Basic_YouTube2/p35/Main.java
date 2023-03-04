package JavaPracticeAlgorithm.p35;

import java.util.ArrayList;
import java.util.Scanner;
/*
	입력된 수를 높은 자릿수 부터 출력하시오
	2312
	
	정답:
	2
	3
	1
	2
*/
public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			ArrayList array = new ArrayList<>();
			
			System.out.print("Enter a digit: ");
			int n = sc.nextInt();
			
  			extract(n, array);
  			System.out.println("====================");
  			extract(n);
  			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int extract(int n, ArrayList array) {
		int res = n;
		int mok = n / 10;
		res = n % 10;
		
		array.add(res);
		
		if (mok == 0) {
			for (int i = array.size()-1; i >= 0; i--) {
				System.out.println(array.get(i));
			}
			return 0;
		} else {
			return extract(mok, array);
		}
	}
	
	// 다른 풀이
	public static void extract(int N) {
		if (N / 10 == 0) {
			System.out.println(N);
			return;
		}
		
		extract(N/10);
		System.out.println(N % 10);
	}
	
	
}
