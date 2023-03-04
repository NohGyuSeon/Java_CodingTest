package JavaPracticeBasic.Test04.p02;

import java.util.Arrays;

public class Bacteria {
	/*
	 * 배양을 통해서 하루에 두 배씩 번식하는 세균이 있다.
	 * 최초 한 마리의 세균을 배양하여 9일 뒤까지 512마리가 되었다.
	 * 이 과정을 반복문과 배열을 사용하여 기록하고 출력하시오.
	 */
	public static void main(String[] args) {
		// 배열
		int[] values = new int[10];
		
		// 박테리아의 개체 수 변화를 배열에 저장하시오.
		for (int i = 0; i < values.length; i++) {
			values[i] = (int) Math.pow(2, i); // 2^i
		}
		
		// 출력
		System.out.println(Arrays.toString(values));
	}
	
}
