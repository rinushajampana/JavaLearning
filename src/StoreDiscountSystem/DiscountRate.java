package StoreDiscountSystem;

public class DiscountRate {

	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;

	public static double getServiceDiscountRate(String type) {

		double value = 0;
		if (type.equalsIgnoreCase("Premium")) {
			value = serviceDiscountPremium;
		}
		else if (type.equalsIgnoreCase("Gold")) {
			value = serviceDiscountGold;
		} else if (type.equalsIgnoreCase("Silver")) {
			value = serviceDiscountSilver;
		} else if (type.equals("None")) {
			value = 0.0;
		}
		return value;

	}

	public static double getProductDiscountRate(String type) {

		return productDiscountSilver;
	}
}
