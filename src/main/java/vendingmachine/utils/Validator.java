package vendingmachine.utils;

public class Validator {

	public static int InitMoney(String initMoney) {
		if (initMoney.length() > 6) {
			throw new IllegalArgumentException(ErrorMessages.LENGTH_LIMIT);
		}
		return checkIsNumber(initMoney);
	}

	public static int checkIsNumber(String initMoney) {
		try {
			return checkLimit(Integer.parseInt(initMoney));
		} catch (NumberFormatException exception) {
			throw new IllegalArgumentException(ErrorMessages.IS_NOT_NUMBER);
		}
	}

	private static int checkLimit(int initMoney) {
		if (initMoney > 100_000) {
			throw new IllegalArgumentException(ErrorMessages.TOO_MUCH_MONEY);
		}
		return check1won(initMoney);
	}

	private static int check1won(int initMoney) {
		if (initMoney % 10 != 0) {
			throw new IllegalArgumentException(ErrorMessages.WE_DONT_HAVE_1_WON);
		}
		return initMoney;
	}
}
