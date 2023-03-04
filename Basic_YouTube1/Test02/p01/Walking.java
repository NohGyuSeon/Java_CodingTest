package JavaPracticeBasic.Test02.p01;

public class Walking {
	/*
	 * 한 걸음을 걸을 때마다 0.02 kcal가 소모된다.
	 * 하루동안 5000걸음을 걸었다고 할 때, 총 소모된 칼로리량을 메서드로 계산하라.
	 */
	public static void main(String[] args) {
		double kcal = calculateWalkingKcal(5000);
		System.out.println("소모 칼로리: " + kcal + " kcal");;
	}
	
	public static double calculateWalkingKcal(int walkingCount) {
		// 해당 메서드를 구현
		return walkingCount * 0.02;
	}
	
}
