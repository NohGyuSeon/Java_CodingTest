package JavaPracticeAlgorithm.p40;

import java.util.Scanner;
/*
 * https://www.acmicpc.net/problem/1463
 * 재귀로 푸는 방법
 */
public class Main {
	public static int min = 99999999;

	public static void doFunc(int num, int way, int cnt) {
		if (way == 3 && num % 3 == 0) {
			cnt ++;
			num /= way;
			for (int i = 1; i <= 3; i++) {
				doFunc(num, way, cnt);
			}
		} else if (way == 2 && num % 2 == 0) {
			cnt ++;
			num /= way;
			for (int i = 1; i <= 3; i++) {
				doFunc(num, way, cnt);
			}
		} else if (num >= 2) {
			cnt ++;
			num -= 1;
			for (int i = 1; i <= 3; i++) {
				doFunc(num, way, cnt);
			}
		} 
		
		if (num == 1 && cnt < min) {
			min = cnt;
			return;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc  = new Scanner(System.in)) {
			int n = sc.nextInt();
			for (int i = 1; i <= 3; i++) {
				doFunc(n, i, 0);
			}
			System.out.println(min);
			
 		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
