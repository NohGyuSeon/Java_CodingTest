package JavaPracticeBasic.Test07.p01;

public class Main {
	/*
	 * 각국의 통화 화폐가 아래와 같이 존재한다.
	 * KRW: 한국 원화
	 * USD: 미국 달러
	 * EUR: 유럽 유로
	 * JPY: 일본 엔화
	 * 해당하는 통화 화폐들의 부모 클래스인 Currency 클래스를 생성하고, 
	 * 각각의 환전 결과 값을 출력하라. 
	 */
	public static void main(String[] args) {
		// 객체 생성
		KRW krw = new KRW(1500, "원");
		USD usd = new USD(100.50, "달러");
		EUR eur = new EUR(260.87, "유로");
		JPY jpy = new JPY(1400, "엔");
		
		// 부모 클래스를 통한 그룹화
		Currency[] currencies = { krw, usd, eur, jpy };
		
		// 모든 화폐정보를 출력
		for (Currency c : currencies) {
			System.out.println(c.toString());
		}
		
	}
}

// 부모 클래스 작성
class Currency {
	// 중복 필드를 작성
	private double amount; // 수량
	private String notation; // 표기법
	// 생성자를 작성
	public Currency(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}
	
	// toString() 메서드 오버라이딩
	@Override
	public String toString() {
		return String.format("%s: %.2f %s", this.getClass().getSimpleName(), amount, notation);
	}
	
}

// 자식 클래스가 부모 클래스 상속
class KRW extends Currency {
	
	KRW(double amount, String notation) {
		super(amount, notation);
	}
	
}

class USD extends Currency {
	
	USD(double amount, String notation) {
		super(amount, notation);
	}
}

class EUR extends Currency {
	
	EUR(double amount, String notation) {
		super(amount, notation);
	}
}

class JPY extends Currency {
	
	JPY(double amount, String notation) {
		super(amount, notation);
	}
}
