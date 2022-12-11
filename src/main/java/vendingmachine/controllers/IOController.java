package vendingmachine.controllers;

import java.util.List;
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
}
