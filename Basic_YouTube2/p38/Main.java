package JavaPracticeAlgorithm.p38;

import java.util.Scanner;
/*
 * https://www.acmicpc.net/problem/1673
 */
public class Main {
	
	public static void doFunc(int coupon, int stamp, int k, int ans) {
		if (coupon > 0) {
			coupon--;
			stamp++;
			ans++;
			doFunc(coupon, stamp, k, ans);
			return;
		} else if (stamp > 0) {
			if (stamp/k > 0) {
				stamp -= k;
				coupon++;
				doFunc(coupon, stamp, k, ans);
			}
		}
		
		if (coupon == 0 && stamp/k == 0) {
			System.out.println(ans);
		}
	}
	
 	public static void main(String[] args) {
		int k;
		int n;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		n = sc.nextInt();
		int coupon = n;
		
		doFunc(coupon, 0, k, 0);
	}
 	
}
