package JavaPracticeBasic.Test03.p02;

public class JavaCorporation {
	/*
	 * 회사에서 직원들에게 지급할 임금을 계산하는 프로그램 작성
	 * 직원의 임근은 주급으로 정산하며, (근무시간)x(기본시급)을 기준으로 한다.
	 * 주당 근무시간 40시간을 초과 시, 초과급여는 (초과시간)x(기본시급)x(1.5)로 한다.
	 * 기본시급은 최저 $8.00이며, 이보다 작을 경우 에러를 출력한다.
	 * 주당 근무시간이 60시간을 초과하는 경우 에러를 출력한다.
	 */
	public static void printPay(double basePay, int hours) {
		// 최저시급
		if (basePay < 8.00) {
			System.out.println("ERROR: 최저시급 불이행");
			return; // return 키워드를 만나면 해당 메서드 종료
		}
		
		// 해당 메서드를 요구사항에 부합하도록 구현
		double pay = 0;
		
		if (hours > 60) {
			System.out.println("ERROR: 초과 근무시간 불이행");
			return; // return 키워드를 만나면 해당 메서드 종료
		} else if (hours > 40) {
			int extraHours = hours - 40; // 초과 근무시간
			hours -= extraHours; // 초과 근무시간 제거
			double extraPay = extraHours * basePay * 1.5; // 초과 급여
			pay += extraPay;
		}
		
		pay += basePay * hours;
		System.out.printf("$ %.2f\n", pay);
	}
	
 	public static void main(String[] args) {
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);
	}
 	
}
