package Study;

public class AccountEx {
	public static void main(String[] args) {
		// 인스턴스(객체) 생성
		Account ac = new Account();
		// ac.money = 10000;
		ac.setMoney(10000, "1234");
		int myPay = ac.getMoney();
		System.out.println("현재 나의 잔액 : " + myPay);
	}
}
