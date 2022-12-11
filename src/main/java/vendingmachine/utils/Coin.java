package vendingmachine.utils;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Coin {
	COIN_500(500),
	COIN_100(100),
	COIN_50(50),
	COIN_10(10);

	private final int amount;

	Coin(final int amount) {
		this.amount = amount;
	}

	public static Map<Integer, Integer> makeCoins(int money, Map<Integer, Integer> coinBox) {
		List<Integer> coinUnits = Arrays.asList(get500(), get100(), get50(), get10());
		while (money > 0) {
			int coinUnit = Randoms.pickNumberInList(coinUnits);
			if(money - coinUnit >= 0) {
				coinBox.put(coinUnit, coinBox.get(coinUnit) + 1);
				money -= coinUnit;
			}
		}
		return coinBox;
	}

	private static int get500() {
		return COIN_500.amount;
	}

	private static int get100() {
		return COIN_100.amount;
	}

	private static int get50() {
		return COIN_50.amount;
	}

	private static int get10() {
		return COIN_10.amount;
	}
}
