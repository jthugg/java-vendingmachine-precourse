package vendingmachine.data;

public class Deposit {

	private int money = 0;
	public void setMoney(int money) {
		this.money += money;
	}

	public int getMoney() {
		return money;
	}
}
