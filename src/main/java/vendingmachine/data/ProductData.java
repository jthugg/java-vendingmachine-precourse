package vendingmachine.data;

import java.util.List;
import java.util.Map;

public class ProductData {

	private Map<String, List<Integer>> productData;

	public void initData(Map<String, List<Integer>> productData) {
		this.productData = productData;
	}
}
