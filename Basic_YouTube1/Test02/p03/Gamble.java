package JavaPracticeBasic.Test02.p03;

public class Gamble {
	/*
	 * 주사위를 던져 나오는 눈의 수 만큼 달러를 획득하는 게임이 있다.
	 * 주사위를 총 3번 던져 얻은 달러로 환전한 결과를 출력하라.
	 * Math.random() 1과 6 사이의 숫자를 반환하는 dice() 메서드를 구현
	 * 1 달러의 환율은 1082.25108원으로 할 것
	 */
	public static void main(String[] args) {
		// 획득 달러 계산
		double dollar = dice() + dice() + dice();
		// 달러를 환전
		double won = exchange(dollar);
		System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
	}
	
	public static int dice() {
		// Math.random(): double 값을 반환 -> 0.00.. ~ 0.99..
		// Math.random() * 6 -> 0.00.. ~ 5.99.. ~
		// double -> int: (int) (Math.random() * 6) -> 0 ~ 5
		return (int) (Math.random() * 6) + 1;
	}
	
	// 입력받은 달러로 환전한 결과를 반환
	public static double exchange(double dollar) {
		// 입력받은 달러를 환전하여 반환
		return dollar * 1082.25018;
	}
	
}
