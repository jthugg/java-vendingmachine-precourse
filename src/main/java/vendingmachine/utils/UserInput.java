package vendingmachine.utils;

import camp.nextstep.edu.missionutils.Console;

public class UserInput {

	public static String requestInitMoney() {
		return Console.readLine();
	}

	public static String requestInitProductData() {
		return Console.readLine();
	}
}
