package vendingmachine.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vendingmachine.utils.Coin;

public class MoneyInMachine {

	private Map<Integer, Integer> coinData;

	public MoneyInMachine() {
		coinData = new HashMap<>();
		coinData.put(500, 0);
		coinData.put(100, 0);
		coinData.put(50, 0);
		coinData.put(10, 0);
	}

	public void initCoins(int initMoney) {
		coinData = Coin.makeCoins(initMoney, coinData);
	}

	public List<Integer> getCoins() {
		List<Integer> coins = new ArrayList<>();
		coins.add(coinData.get(500));
		coins.add(coinData.get(100));
		coins.add(coinData.get(50));
		coins.add(coinData.get(10));
		return coins;
	}

	public List<Integer> returnChanges(int deposit, List<Integer> changes) {
		System.out.println(deposit);
		System.out.println(coinData);
		changes.add(check500(deposit));
		deposit -= check500(deposit);
		changes.add(check100(deposit));
		deposit -= check100(deposit);
		changes.add(check50(deposit));
		deposit -= check50(deposit);
		changes.add(check10(deposit));
		return changes;
	}

	private Integer check500(int deposit) {
		if (coinData.get(500) > (deposit / 500)) {
			return deposit / 500;
		}
		return coinData.get(500);
	}

	private Integer check100(int deposit) {
		if (coinData.get(100) > (deposit / 100)) {
			return deposit / 100;
		}
		return coinData.get(100);
	}

	private Integer check50(int deposit) {
		if (coinData.get(50) > (deposit / 50)) {
			return deposit / 50;
		}
		return coinData.get(50);
	}

	private Integer check10(int deposit) {
		if (coinData.get(10) > (deposit / 10)) {
			return deposit / 10;
		}
		return coinData.get(10);
	}
}
