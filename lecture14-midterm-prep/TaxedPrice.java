
public class TaxedPrice {
	// One could also define string abbreviations for provinces and write a method
	// to return the tax rate for a given province
	public static double ON = 13;
	public static double QC = 14.975;

	public static double priceTaxesIncluded(GoodsAndServices gs, double taxPercentage) {
		return gs.getPrice() + gs.getPrice() * taxPercentage / 100;
	}
}
