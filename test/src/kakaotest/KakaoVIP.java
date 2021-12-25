package kakaotest;

import java.text.DecimalFormat;

public class KakaoVIP extends CreditCard{
	static final int PLUS_LIMIT = 1000000;
	
	public KakaoVIP (String owner) {
		super(owner);
	}
	  public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,### 원");
		return owner + "님. 이번 달 결제 예정 금액" + df.format(payTotal) + "원 입니다. [이용한도" + df.format(limit) + "원]";	
	  }
	public int upLimit(int plus) {
		if(limit+plus > PLUS_LIMIT) {
			return 0;
		}
		else {
			limit += plus;
			return plus;
		}
	}
	public int pay(int money) {
		if(money+payTotal > limit) {
			return 0;
		}
		else {
			payTotal += money;
			return payTotal;
		}
	}
	@Override
	public int plusLimit(int plus) {
		// TODO Auto-generated method stub
		return 0;
	}
}
