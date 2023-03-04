package JavaPracticeBasic.Test05.p01;

public class Main {
	/*
	 * 두 영웅 중 한 쪽의 체력이 소진될 때 까지, 서로를 향해 펀치를 
	 * 날리는 격투 게임을 만드시오.
	 * 영웅은 다음과 같은 속성을 갖는다.
	 * 이름
	 * 체력
	 * 영웅은 펀치를 통해 상대 영웅에게 피해를 입힐 수 있다.
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		// 두 영웅 객체를 생성
		Hero arthas = new Hero("아서스"); // {name: "아서스", hp: 30}
		Hero leona = new Hero("레오나"); // {name: "레오나", hp: 30}
		// 격투 시작
		Hero.battle(arthas, leona);
	}
}

class Hero {
	// 필드
	String name;
	int hp = 30;
	
	// 생성자
	Hero(String name) {
		this.name = name;
	}

	// 펀치
	void punch(Hero enermy) {
		enermy.hp -= 10;
		System.out.printf("[%s]의 펀치\n", this.name);
		System.out.printf("\t%s: %d/30\n", enermy.name, enermy.hp);
	}
	
	// 격투
	public static void battle(Hero a, Hero b) throws InterruptedException {
		// 두 영웅 모두 체력이 남아있다면, 계속 싸움을 진행
		while(a.hp > 0 && b.hp > 0) { // 둘 다 살아있다면 반복하도록 조건식을 구현
			// 1/2 확률로 공격/수비 결정
			Hero attacker, defender;
			
			if (Math.random() < 0.5) { // 0.0000.. ~ 0.9999..
				attacker = a;
				defender = b;
			} else {
				attacker = b;
				defender = a;
			}
			
			// 대상을 공격
			attacker.punch(defender);
			
			// 딜레이 0.5초
			Thread.sleep(500);
		}
	}
	
}
