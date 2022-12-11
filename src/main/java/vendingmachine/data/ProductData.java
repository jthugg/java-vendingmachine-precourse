package vendingmachine.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductData {

	private Map<String, List<Integer>> productData;

	public void initData(Map<String, List<Integer>> productData) {
		this.productData = productData;
	}

	public boolean checkProductData(String productName) {
		return productData.get(productName) == null;
	}

	public int getPrice(String productName) {
		return productData.get(productName).get(0);
	}

	public boolean checkAmounts(int money) {
		List<List<Integer>> data = makePriceAmountData();
		boolean condition = false;
		for (List<Integer> value : data) {
			if (value.get(1) > 0 && value.get(0) < money) {
				condition = true;
			}
		}
		return condition;
	}

	private List<List<Integer>> makePriceAmountData() {
		List<List<Integer>> priceAmountData = new ArrayList<>();
		for (List<Integer> value : productData.values()) {
			priceAmountData.add(value);
		}
		return priceAmountData;
	}
}
