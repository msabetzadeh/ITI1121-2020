public class ColoredPoint extends Point {
	Color c;
	
	public ColoredPoint (double x, double y, Color c) {
		super(x,y);
		this.c = c;
	}

	public Color getColor () {
		return c;
	}
	
	public void setColor (Color color) {
		this.c = color;
	}
	
	public String toString () {
	    String part = super.toString();
		return part + "and the color is: " + c;
	}
	
	public static void main (String[] arguments) {
	
		ColoredPoint point = new ColoredPoint (1, 2, new Color("red"));
		System.out.println(point);
	
	}

}