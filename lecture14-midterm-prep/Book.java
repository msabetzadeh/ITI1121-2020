
public class Book implements GoodsAndServices {
	private String author;
	private String title;
	private int year;
	private double price;

	public Book(int year, String author, String title, double price) {
		this.author = author;
		this.title = title;
		this.year = year;
		this.price = price;
	}

	public boolean equals(Object other) {
		if (other == null || getClass() != other.getClass()) {
			return false;
		}

		Book o = (Book) other;
		if (this.year != o.year) {
			return false;
		}

		if (this.title == null) {
			if (o.title != null) {
				return false;
			}
		} else if (!title.equals(o.title)) {
			return false;
		}

		if (this.author == null) {
			if (o.author != null) {
				return false;
			}
		} else if (!this.author.equals(o.author)) {
			return false;
		}

		return true;
	}

	public String toString() {
		return "\"" + this.title + "\" by " + this.author + ", sold for " + this.price + "$ plus taxes";
	}

	public double getPrice() {
		return this.price;
	}
}