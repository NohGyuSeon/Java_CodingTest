package JavaPracticeBasic.Test02.p02;

public class Gasoline {
	/*
	 * 가솔린 8.68L를 충전한 A 자동차는 총 182.736Km를 운행할 수 있었다고 합니다.
	 * 해당하는 차의 연비를 메서드를 사용하여 계산하라.
	 */
	public static void main(String[] args) {
		// 가솔린 사용량
		double gasoline = 8.86;
		// 이동한 거리
		double distance = 182.736;
		
		double effieciency = calcEffiency(gasoline, distance);
		System.out.printf("연비: %.2f Km/L", effieciency);
	}
	
	public static double calcEffiency(double fuel, double distance) {
		// 해당 메서드를 구현
		// 연비 = 이동거리 / 사용량
		return distance / fuel;
	}
	
}
