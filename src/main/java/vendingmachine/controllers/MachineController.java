package vendingmachine.controllers;

import vendingmachine.data.Deposit;
import vendingmachine.data.MoneyInMachine;
import vendingmachine.data.ProductData;

public class MachineController {

	private MoneyInMachine money = new MoneyInMachine();
	private ProductData productData = new ProductData();
	private Deposit deposit = new Deposit();

	public void runMachine() {
		initMachine();
		sellProducts();
	}

	private void initMachine() {
		initCoins();
		initProducts();
	}

	private void initCoins() {
		money.initCoins(IOController.requestInitMoney());
		IOController.printCoinData(money.getCoins());
	}

	private void initProducts() {
		productData.initData(IOController.requestInitProductData());
	}

	private void sellProducts() {
		depositMoney();
		while (checkReturnConditions()) {
			purchaseProduct();
		}
		returnChanges();
	}

	private void depositMoney() {
		deposit.setMoney(IOController.requestDepositMoney());
	}

	private boolean checkReturnConditions() {
		return false;
	}

	private void purchaseProduct() {
		String productName = IOController.printRequestProductName();
		if (checkPurchaseAvailable(productName)) {
			deposit.subtractDeposit(productData.getPrice(productName));
		}
	}

	private boolean checkPurchaseAvailable(String productName) {
		if (productData.checkProductData(productName)) {
			return false;
		}
		if (deposit.checkDeposit(productData.getPrice(productName))) {
			return false;
		}
		return true;
	}

	private void returnChanges() {
		IOController.printChanges(money.returnChanges(deposit.getDeposit()));
	}
}
