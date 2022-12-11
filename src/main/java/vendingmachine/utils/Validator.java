package vendingmachine.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

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

	public static Map<String, List<Integer>> InitProduct(String productData) {
		Map<String, List<Integer>> data = new HashMap<>();
		for(String eachData : checkPattern(productData)) {
			eachData = eachData.replace("[", "").replace("]", "");
			List<String> namePriceAmount = Arrays.asList(eachData.split(","));
			data.put(namePriceAmount.get(0), getPriceAmount(namePriceAmount.subList(1, 3)));
		}
		return data;
	}

	private static List<String> checkPattern(String productData) {
		List<String> data = Arrays.asList(productData.split(";"));
		for(String eachData : data) {
			if(!Pattern.matches("^\\[[가-힣]*,[0-9]*0,[0-9]*\\]$", eachData)) {
				throw new IllegalArgumentException(ErrorMessages.PRODUCT_DATA_REGEX);
			}
		}
		return data;
	}

	private static List<Integer> getPriceAmount(List<String> priceAmount) {
		List<Integer> data = new ArrayList<>();
		for(String value : priceAmount) {
			try {
				data.add(Integer.parseInt(value));
			} catch (NumberFormatException exception) {
				throw new IllegalArgumentException(ErrorMessages.PRODUCT_DATA_REGEX);
			}
		}
		return data;
	}

	public static int depositMoney(String deposit) {
		return checkIsNumber(deposit);
	}

	public static String productName(String name) {
		if(!Pattern.matches("^[가-힣]*$", name)) {
			throw new IllegalArgumentException(ErrorMessages.PRODUCT_NAME);
		}
		return name;
	}
}
