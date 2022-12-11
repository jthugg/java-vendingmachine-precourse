package vendingmachine.data;

public class Deposit {

	private int money = 0;
	public void setMoney(int money) {
		this.money += money;
	}

	public int getMoney() {
		return money;
	}

	public boolean checkDeposit(int price) {
		return money < price;
	}

	public void subtractDeposit(int price) {
		money -= price;
	}
}
