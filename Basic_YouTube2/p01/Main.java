package JavaPracticeAlgorithm.p01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/*
	 * 학생정보들을 저장하고, 학생이름으로
	 * 검색했을 때 학번을 출력하는 프로그램 작성.
	 * 
	 * Student 클래스 생성
	 * String name, no를 가짐 (이름과 학번)
	 * 
	 * 학생들을 ArrayList에 저장한 이후, 
	 * 계속 검색을 하겠느냐 y -> 반복
	 * 종료하고싶으면 n -> 프로그램 종료
	 *     
	 * 학생 이름이 있는 경우 그 학생의 학번을 출력
	 * 학생 이름이 없으면, 없는 학생이름이라고 출력
	 */
	public static void main(String[] args) {
		
		Student std1 = new Student("손오공", "1682");
		Student std2 = new Student("저팔계", "1772");
		Student std3 = new Student("샤오정", "1813");
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(std1);
		list.add(std2);
		list.add(std3);
		
		for (Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner sc = new Scanner(System.in);
		 
		while(true) {
			System.out.println("계속 검색을 하고 싶으면 y, 종료하고 싶으면 n");
			String input = sc.next();
			
			if (input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = sc.next();
				boolean flag = false;
				
				for (Student stu : list) {
					if (stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은: " + stu.getNo());
						flag = true;
					} 
				}
				
				if (!flag) {
					System.out.println("해당하는 학생이름이 없습니다");
				}
			} else if (input.equals("n")) {
				break;
			}
			
		}
		
		System.out.println("");
	}
	
}
