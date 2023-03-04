package JavaPracticeBasic.Test06.p01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	/*
	 * 1부터 N사이 임의의 정수를 반환하도록 주사위 클래스를 완성하고, 
	 * 해당 주사위를 1000번 던진 값의 평균을 구하시오.
	 */
	public static void main(String[] args) {
		// 입력값 받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// N면체 주사위 생성
		Die d = new Die(N);
		
		// 1000번 던진 주사위를 던져 결과를 저장
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			int randNum = d.roll();
			numbers.add(randNum);
			System.out.println(randNum);
		}
		
		// 평균값 계산
		double avg = average(numbers);
		
		// 출력
		System.out.println("avg: " + avg);
	}
	
	public static double average(ArrayList<Integer> list) {
		// 평균값을 반환
		double sum = 0;
		for (Integer n : list) {
			sum += n;
		}
		return sum / list.size();
	}
	
}

class Die {
	private int maxNumber; // 주사위의 최대값
	
	public Die(int maxNumber) {
		// 생성자 구현
		this.maxNumber = maxNumber;
	}
	
	public int roll() {
		// 메서드 구현: 1~maxNumber 까지 반환
		Random rand = new Random();
		return rand.nextInt(maxNumber)+1; // [1:maxNumber]
	}
	
}
