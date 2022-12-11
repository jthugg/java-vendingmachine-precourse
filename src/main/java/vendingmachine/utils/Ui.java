package vendingmachine.utils;

import java.util.List;

public enum Ui {

	INIT_MONEY("자판기가 보유하고 있는 금액을 입력해 주세요."),
	COINS_IN_MACHINE("자판기가 보유한 동전"),
	AMOUNT_500("500원 - "),
	AMOUNT_100("100원 - "),
	AMOUNT_50("50원 - "),
	AMOUNT_10("10원 - "),
	COUNTER_UNIT("개"),
	INIT_PRODUCT_DATA("상품명과 가격, 수량을 입력해 주세요."),
	REQUEST_DEPOSIT("투입 금액을 입력해 주세요."),
	REQUEST_PRODUCT_NAME("구매할 상품명을 입력해 주세요."),
	DEPOSIT_MONEY_IS("투입 금액: "),
	MONEY_UNIT("원");

	private String value;

	Ui(String value) {
		this.value = value;
	}

	public static void printRequestInitMoney() {
		System.out.println(INIT_MONEY.value);
	}

	public static void printCointData(List<Integer> coins) {
		System.out.println(COINS_IN_MACHINE.value);
		System.out.println(AMOUNT_500.value + coins.get(0) + COUNTER_UNIT.value);
		System.out.println(AMOUNT_100.value + coins.get(1) + COUNTER_UNIT.value);
		System.out.println(AMOUNT_50.value + coins.get(2) + COUNTER_UNIT.value);
		System.out.println(AMOUNT_10.value + coins.get(3) + COUNTER_UNIT.value);
	}

	public static void printRequestInitProductData() {
		System.out.println(INIT_PRODUCT_DATA.value);
	}

	public static void printRequestDepositMoney() {
		System.out.println(REQUEST_DEPOSIT.value);
	}

	public static void printDeposit(int money) {
		System.out.println(DEPOSIT_MONEY_IS.value + money + MONEY_UNIT.value);
	}

	public static void printRequestProductName() {
		System.out.println(REQUEST_PRODUCT_NAME.value);
	}
}
