public class BoundingBox {
	Point bottomLeft, topRight;
	public BoundingBox (Point[] array) {
	
		if (array == null || array.length == 0) {
			bottomLeft = topRight = new Point (0, 0);
			return;
		}
		

		double minX = array[0].getX(), minY = array[0].getY(), maxX = minX, maxY = minY;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i].getX() < minX) 
				minX = array[i].getX();
		
			if (array[i].getX() > maxX) 
				maxX = array[i].getX();
			
			if (array[i].getY() < minY)
				minY = array[i].getY();
			
			if (array[i].getY() > maxY)
				maxY = array[i].getY();
		}

		bottomLeft = new Point (minX, minY);
		topRight = new Point (maxX, maxY);		
	}
	
	public String toString () {
		return "Bottom left corner is: " + bottomLeft + " and the top right corner is: " + topRight;
	}

	public static void main(String[] args) {

		Point[] points = null;

		BoundingBox box1 = new BoundingBox(points);
		System.out.println(box1);

		points = new Point[5];

		points[0] = new Point(-5, 0);
		points[1] = new Point(0, -6);
		points[2] = new ColoredPoint(10, 20, new Color("green"));
		points[3] = new Point(15, 15);
		points[4] = new ColoredPoint(5, 25, new Color("green"));

		BoundingBox box2 = new BoundingBox(points);
		System.out.println(box2);
	}
}