package JavaPracticeBasic.Test03.p01;

import java.util.Scanner;

public class BMICalculator {
	/*
	 * 체중과 키를 입력받아 BMI 지수를 계산하고, 이에 따른 비만도를 출력하라.
	 * 비만도 = bmi 지수를 기준으로 아래 네 가지 단계로 구분할 것
	 * 저체중(18.5미만), 정상(18.5이상 ~ 25미만), 과체중(25이상~30미만), 비만(30이상)
	 * BMI = w / t^2
	 * 입력) 74.5 1.76
	 * 출력) BMI: 24.05
	 * 출력) 정상 
	 */
	
	// bmi 계산
	public static double calculatorBMI(double weight, double height) {
		// bmi 지수를 계산하여 반환
		return weight / (height * height);
	}
	
	public static void printBMIClassification(double bmi) {
		System.out.printf("BMI: %.2f\n", bmi);
		// 조건식을 사용하여 비만도 결과를 출력
		
		if (bmi > 30) {
			System.out.println("비만");
		} else if (bmi >= 25) {
			System.out.println("과체중");
		} else if (bmi >= 18.5) {
			System.out.println("정상");
		} else {
			System.out.println("저체중");
		}
	}
	
	public static void main(String[] args) {
		// 체중, 키 입력
		Scanner sc = new Scanner(System.in);
 		double weight = sc.nextDouble();
 		double height = sc.nextDouble();
 		// BMI 지수 계산
 		double bmi = calculatorBMI(weight, height);
 		// 비만도 결과 출력
 		printBMIClassification(bmi);
	}
	
}
