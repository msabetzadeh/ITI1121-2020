public class NutsBasket implements GoodsAndServices {
	private String nutsType;
	private int weight;

	public NutsBasket(String nutsType, int weight) {
		this.nutsType = nutsType;
		this.weight = weight;
	}

	public double getPrice() {
		return 0.1 * weight;
	}

	public String toString() {
		return "basket of " + nutsType + " costing " + getPrice() + " $ plus taxes";
	}
}
