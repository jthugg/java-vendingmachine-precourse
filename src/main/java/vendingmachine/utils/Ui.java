package vendingmachine.utils;

import java.util.List;

public enum Ui {

	COIN_500_WON(0),
	COIN_100_WON(1),
	COIN_50_WON(2),
	COIN_10_WON(3),
	ZERO(0),

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
	MONEY_UNIT("원"),
	RESULT_HEADER("잔돈"),
	COIN_500("500원 - "),
	COIN_100("100원 - "),
	COIN_50("50원 - "),
	COIN_10("10원 - ");

	private String value;
	private int number;

	Ui(String value) {
		this.value = value;
	}

	Ui(int number) {
		this.number = number;
	}

	public static void printRequestInitMoney() {
		System.out.println(INIT_MONEY.value);
	}

	public static void printCoinData(List<Integer> coins) {
		System.out.println(COINS_IN_MACHINE.value);
		System.out.println(AMOUNT_500.value + coins.get(COIN_500_WON.number) + COUNTER_UNIT.value);
		System.out.println(AMOUNT_100.value + coins.get(COIN_100_WON.number) + COUNTER_UNIT.value);
		System.out.println(AMOUNT_50.value + coins.get(COIN_50_WON.number) + COUNTER_UNIT.value);
		System.out.println(AMOUNT_10.value + coins.get(COIN_10_WON.number) + COUNTER_UNIT.value);
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

	public static void printResult(List<Integer> changes) {
		System.out.println(RESULT_HEADER.value);
		print500(changes.get(COIN_500_WON.number));
		print100(changes.get(COIN_100_WON.number));
		print50(changes.get(COIN_50_WON.number));
		print10(changes.get(COIN_10_WON.number));
	}

	private static void print500(Integer amount) {
		if (amount > ZERO.number) {
			System.out.println(COIN_500.value + amount + COUNTER_UNIT.value);
		}
	}

	private static void print100(Integer amount) {
		if (amount > ZERO.number) {
			System.out.println(COIN_100.value + amount + COUNTER_UNIT.value);
		}
	}

	private static void print50(Integer amount) {
		if (amount > ZERO.number) {
			System.out.println(COIN_50.value + amount + COUNTER_UNIT.value);
		}
	}

	private static void print10(Integer amount) {
		if (amount > ZERO.number) {
			System.out.println(COIN_10.value + amount + COUNTER_UNIT.value);
		}
	}
}
