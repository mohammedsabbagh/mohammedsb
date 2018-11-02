package ms225hk;

public class Point {

	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public boolean isEqualTo(Point p) {
		return (x == p.getX() && y == p.getY());
	}

	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public void moveToXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distanceTo(Point p) {
		return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
	}

}
