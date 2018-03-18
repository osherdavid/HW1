package hw1;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this(0, 0);
	}

	public Point(Point p) {
		this(p.x, p.y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point copy() {
		return new Point(this);
	}

	public void moveHorizontal(double delta) {
		x += delta;
	}

	public void moveVertical(double delta) {
		y += delta;
	}

	/**
	 * @param p
	 * @return true if this is to the right of p, else return false
	 */
	public boolean isRight(Point p) {
		return (this.x > p.x);
	}

	/**
	 * @param p
	 * @return true if this is upper than p, else return false
	 */
	public boolean isUpper(Point p) {
		return (this.y > p.y);
	}

	/**
	 * @param p
	 * @return true if p is eaual to this, else return false
	 */
	public boolean isEqual(Point p) {
		return ((p.x == this.x) && (p.y == this.y));
	}

}
