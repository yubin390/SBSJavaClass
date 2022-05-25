package Day14;

public class Circle {
	Point center;
	int rad;
	
	public Circle(int x, int y, int r) {
		center =  new Point(x, y);
		rad = r;
	}
	
	public void showCircleInfo() {
		center.showPointInfo();
		System.out.println("¹ÝÁö¸§ : "+rad);
	}
	
	
	public static void main(String[] args) {
		Circle c = new Circle(2,2,4);
		c.showCircleInfo();
	}

}
