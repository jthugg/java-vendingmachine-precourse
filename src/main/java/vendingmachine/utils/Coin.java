package vendingmachine.utils;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.HashMap;
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

	public static Map<Integer, Integer> makeCoins(int money) {
		Map<Integer, Integer> coinBox = new HashMap<>();
		while (money > 0) {
			int coinUnit = Randoms.pickNumberInList(
					Arrays.asList(COIN_500.amount, COIN_100.amount, COIN_50.amount, COIN_10.amount));
			coinBox.put(coinUnit, money / coinUnit);
			money %= coinUnit;
		}
		return coinBox;
	}
}
