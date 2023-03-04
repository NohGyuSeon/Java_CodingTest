package JavaPracticeAlgorithm.p24;

import java.util.Scanner;

public class Main {
	/*
	 * 학생수와 점수들이 순서대로 입력된다. 평균보다 넘은 학생들의 비율을 
	 * 출력하시오
	 * 
	 * 입력: 7 100 95 90 80 70 60 50
	 * 
	 * 정답: 57.143%
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s_num = sc.nextInt();
		
		double[] rate = new double[s_num];
		
		for (int k = 0; k < s_num; k++) {
			int n = sc.nextInt();

			int arr[] = new int[n];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			int sum = 0;
			double avg = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			
			avg = sum / arr.length;
			
			int idx = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > avg) {
					idx++;
				}
			}
			
			rate[k] = ((double)idx / arr.length)* 100;
		}
		
		for (int i = 0; i < s_num; i++) {
			System.out.printf("%.3f%%", rate[i]);
			System.out.println();
		}
		
	}
	
}
