
public class TestGoodsAndServices {
	public static void main(String args[]) {
		Book b1, b2, b3;
		b1 = new Book(1996, "John Smith", "Java for dummies", 85.0);
		b2 = new Book(1996, "John Smith", "Java for dummies", 40.0);
		b3 = new Book(2010, "Jane Adam", "Python for dummies", 50.0);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		NutsBasket n1, n2;
		n1 = new NutsBasket("Pistachios", 150);
		n2 = new NutsBasket("Almonds", 400);
		System.out.println(n1);
		System.out.println(n2);

		//////////////// With taxes

		b1 = new Book(1996, "John Smith", "Java for dummies", 85.0);
		n1 = new NutsBasket("Pistachios", 150);
		System.out.println("With taxes: " + b1 + " costs " + TaxedPrice.priceTaxesIncluded(b1, TaxedPrice.ON)
				+ " in Ontario and " + TaxedPrice.priceTaxesIncluded(b1, TaxedPrice.QC) + " in Quebec.");
		System.out.println("With taxes: " + n1 + " costs " + TaxedPrice.priceTaxesIncluded(n1, TaxedPrice.ON)
				+ " in Ontario and " + TaxedPrice.priceTaxesIncluded(n1, TaxedPrice.QC) + " in Quebec.");
	}
}