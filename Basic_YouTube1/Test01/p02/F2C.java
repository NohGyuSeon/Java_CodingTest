package JavaPracticeBasic.Test01.p02;

public class F2C {
	/*
	 * 화씨(F) 온도를 입력하면 섭씨(C)온도로 변환하는 프로그램 작성.
	 * C = (F - 32) / 1.8 
	 * 입력 77.0 출력 25.0
	 */
	public static void main(String[] args) {
		// 입력 문자열을 실수로 변환하여 변수에 저장
		double fahrenheit = Double.parseDouble("77.0");
		double celsius = (fahrenheit - 32) / 1.8;
		System.out.println(celsius);
	}
	
}
