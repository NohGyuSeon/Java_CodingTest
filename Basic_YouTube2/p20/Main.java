package JavaPracticeAlgorithm.p20;

public class Main {
	/*
	 * 100까지 369 게임을 아래와 같이 진행하시오.
	 * 정답: 1 2 짝 4 5 짝 7 8 짝 10 11 12 ''''
	 *     ''' 57 58 짝 짝 짝 짝 짝짝 짝 짝 ''''
	 *     88 짝 짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 ''''  
	 */
	public static void main(String[] args) {
		
		int n = 100;
		
		for (int i = 1; i <= n; i++) {
			int cnt = getNum(i);
//			int cnt = getNum2(i);
			
			if (cnt == 0) {
				System.out.print(i + " ");
			} else {
				for (int j = 0; j < cnt; j++) {
					System.out.print("짝");
				}
				System.out.print(" ");
			}
			
		}
		
	}
	
	public static int getNum (int k) {
		int j = 0;
		
		if (k % 10 == 3 || k % 10 == 6 || k % 10 == 9) {
			j++;
		}
		if ((k / 10) % 10 == 3 || (k / 10) % 10 == 6 || (k / 10) % 10 == 9) {
			j++;
		}
		
		return j;
	}
	
	// 다른 방법 풀이
	public static int getNum2 (int k) {
		int j = 0;
		
		while (k > 0) {
			if (k % 10 == 3 || k % 10 == 6 || k % 10 == 9) {
				j++;
 			}
			k /= 10;
		}
		
		return j;
	}
	
}
