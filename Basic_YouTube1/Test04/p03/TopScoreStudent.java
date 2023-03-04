package JavaPracticeBasic.Test04.p03;

public class TopScoreStudent {
	/*
	 * 해당 성적표 중 최고 득점자를 찾고 이를 출력하시오.
	 */
	public static int topIndex(int[] scores) {
		// 가장 높은 성적의 인덱스를 반환하는 함수를 구현
		int topIdx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[topIdx] < scores[i]) {
				topIdx = i;
			}
		}
		
		return topIdx;
	}
	
	public static void main(String[] args) {
		
		// 이름 배열 생성
		String[] names = {"Elnea", "NGS", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
		
		// 점수 배열 생성
		int[] scores = {65, 100, 74, 23, 75, 68, 96, 88, 98, 54};
		
		// 1등 검색
		int i = topIndex(scores);
 		System.out.printf("1등: %s(%d)\n", names[i], scores[i]);
	}
	
}
