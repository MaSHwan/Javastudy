package Study;

public class Account {
	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money, String pass) {
		if(pass.equals("1234"))
		this.money = money;
	}
	
	
}
