package vendingmachine;

public enum Coin {
	COIN_500(500),
	COIN_100(100),
	COIN_50(50),
	COIN_10(10);

	private final int amount;

	Coin(final int amount) {
		this.amount = amount;
	}

	public static Integer get500(int initMoney) {
		return initMoney / COIN_500.amount;
	}

	public static Integer get100(int initMoney) {
		return initMoney / COIN_100.amount;
	}

	public static Integer get50(int initMoney) {
		return initMoney / COIN_50.amount;
	}

	public static Integer get10(int initMoney) {
		return initMoney / COIN_10.amount;
	}
}
