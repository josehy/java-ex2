package kakaotest;

public class MySolution3 {
	public static void main(String[] args) {
		
		CreditCard card1 = new KakaoVIP ("정연");

		int result = card1.upLimit(1000000);   
		limitResult(result);
		System.out.println(card1);
		
		result = card1.upLimit(1000000);   
		limitResult(result);
		System.out.println(card1);
		
		//카드 사용
		result = card1.pay(40000);		
		payResult(result);
		System.out.println(card1);
		
		result = card1.pay(2000000);		
		payResult(result);
		System.out.println(card1);
		
	}
	
	public static void limitResult(int result) {
		System.out.println(".....이용한도 금액 처리 결과 입니다. .....");
		if (result==0)
			System.out.println("한도 금액 1000000원 올렸습니다.");
		else
			System.out.println("한도 금액 " + result + "원 올렸습니다.");
		
	}
	
	public static void payResult(int result) {
		System.out.println(".....결제 금액 카드 사용 처리 결과 입니다. .....");
		if (result==0)
			System.out.println("이용한도 금액을 초과하였습니다.");
		else
			System.out.println("결제 금액 " + result + " 원이 사용되었습니다.");
		
	}
}