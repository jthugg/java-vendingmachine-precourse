package vendingmachine.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vendingmachine.Coin;

public class MoneyInMachine {

	private Map<Integer, Integer> coinData;

	public MoneyInMachine() {
		coinData = new HashMap<>();
	}

	public void initCoins(int initMoney) {
		coinData.put(500, Coin.get500(initMoney));
		coinData.put(100, Coin.get100(initMoney % 500));
		coinData.put(50, Coin.get50(initMoney % 100));
		coinData.put(10, Coin.get10(initMoney % 50));
	}

	public List<Integer> getCoins() {
		List<Integer> coins = new ArrayList<>();
		coins.add(coinData.get(500));
		coins.add(coinData.get(100));
		coins.add(coinData.get(50));
		coins.add(coinData.get(10));
		return coins;
	}
}
