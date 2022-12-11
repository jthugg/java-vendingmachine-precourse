package vendingmachine.controllers;

import java.util.List;
import java.util.Map;
import vendingmachine.utils.Ui;
import vendingmachine.utils.UserInput;
import vendingmachine.utils.Validator;

public class IOController {

	public static int requestInitMoney() {
		try {
			printRequestInitMoney();
			return Validator.InitMoney(UserInput.requestInitMoney());
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
			return requestInitMoney();
		}
	}

	public static void printRequestInitMoney() {
		Ui.printRequestInitMoney();
	}

	public static void printCoinData(List<Integer> coins) {
		Ui.printCointData(coins);
	}

	public static void printRequestInitProductData() {
		Ui.printRequestInitProductData();
	}

	public static Map<String, List<Integer>> requestInitProductData() {
		try {
			printRequestInitProductData();
			return Validator.InitProduct(UserInput.requestInitProductData());
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
			return requestInitProductData();
		}
	}
}
