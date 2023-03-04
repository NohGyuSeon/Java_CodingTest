package JavaPracticeBasic.Test01.p01;

public class Pay {
	/*
	 * 시급과 일한 시간을 main()의 입력값으로 받아, 총 급여를 계산하여 출력하시오.
	 * 총 급여 = 시급 x 일한시간
	 * 시간, 일한시간 순 입력 8000, 160
	 */
	public static void main(String[] args) {
	
		// 메인 메서드의 입력값: args[0]. args[1], ...
		int basePay = Integer.parseInt("8000");
		int hours = Integer.parseInt("160");
		
		System.out.println(basePay * hours);
	}
	
}
