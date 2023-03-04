package JavaPracticeBasic.Test01.p03;

public class Exchange {
	/*
	 * 유로와 달러를 입력받아 원화로 환전한 결과를 출력하시오.
	 * 1 유로 = 1281.62644원
	 * 1 달러 = 1091.70306원
	 */
	public static void main(String[] args) {
		// 유로 입력
		int euro = Integer.parseInt("52");
		// 달러 입력
		int dollar = Integer.parseInt("32");
		
		// 적절한 환율을 대입
		double euroToKwnRate = 1281.62644;
		double dollarToKwnRate = 1091.70306;
		
		// 환전 결과 출력
		double kwn = (euro * euroToKwnRate) + (dollar * dollarToKwnRate);
		System.out.printf("환전결과: %.0f원", kwn);
	}
	
}
