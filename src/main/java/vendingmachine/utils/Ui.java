package vendingmachine.utils;

public enum Ui {

	INIT_MONEY("자판기가 보유하고 있는 금액을 입력해 주세요.");

	private String value;

	Ui(String value) {
		this.value = value;
	}

	private int number;

	Ui(int number) {
		this.number = number;
	}

	public static void printRequestInitMoney() {
		System.out.println(INIT_MONEY.value);
	}
}
