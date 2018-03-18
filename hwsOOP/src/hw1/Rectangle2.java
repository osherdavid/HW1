package hw1;

import com.sun.javafx.geom.Rectangle;

import javafx.scene.effect.Light.Point;

public class Rectangle2 implements Rectangle {
	double height;
	double width;
	Point bottom_left;

	public Rectangle2() {
		this.height = 1;
		this.width = 1;
		this.bottom_left = new Point(-0.5, -0.5);
	}

	public Rectangle2(double height, double width, Point bottom_left) {
		this();
		if (height > 0 && width > 0) {
			this.height = height;
			this.width = width;
			this.bottom_left = bottom_left.copy();
		}
	}

	@Override
	public Point getBotLeftPoint() {
		Point p1 = new Point(this.bottom_left);
		return p1;
	}

	@Override
	public Point getTopRightPoint() {
		Point top_right = new Point(this.bottom_left);
		top_right.moveHorizontal(width);
		top_right.moveVertical(height);
		return top_right;
	}

	@Override
	public Point getCenter() {
		Point center = new Point(this.bottom_left);
		center.moveHorizontal(width / 2);
		center.moveVertical(height / 2);
		return center;
	}

	@Override
	public double getHeight() {
		return this.height;
	}

	@Override
	public double getWidth() {
		return this.width;
	}

	@Override
	public void setBotLeftPoint(Point p) {
		this.bottom_left = p.copy();
	}

	@Override
	public void setTopRightPoint(Point p) {
		// if (p.getX()>this.bottom_left.getX() && p.getY()>this.bottom_left.getY())
		this.bottom_left.setX(p.getX() - this.width);
		this.bottom_left.setY(p.getY() - this.height);
	}

	@Override
	public void setCenter(Point p) {
		// if (p.getX() > this.bottom_left.getX() && p.getY() > this.bottom_left.getY())
		// {
		this.bottom_left.setX(p.getX() - this.width / 2);
		this.bottom_left.setY(p.getY() - this.height / 2);
	}

	@Override
	public void setHeight(double height) {
		if (height >= 0) {
			this.height = height;
		}
	}

	@Override
	public void setWidth(double width) {
		if (width >= 0) {
			this.width = width;
		}
	}

	@Override
	public double getArea() {
		return (this.height * this.width)
	}

	@Override
	public double getPerimeter() {
		return this.height * 2 + this.width * 2;
	}

	@Override
	public void rotate() {
		double temp;
		temp = this.height;
		this.height = this.width;
		this.width
	}

	@Override
	public void scale(double scalePar) {
		this.height *= scalePar;
		this.width *= scalePar;
	}

	@Override
	public void moveVertical(double delta) {
		this.bottom_left.moveVertical(delta);
	}

	@Override
	public void moveHorizontal(double delta) {
		this.bottom_left.moveHorizontal(delta);
	}

	@Override
	public boolean isEqual(Rectangle rect) {
		if(this.height == rect.height && this.width == rect.width && this.bottom_left.isEqual(rect.bottom_left))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(Point p) {
		if(p.isUpper(this.bottom_left)&& p.getY()<this.bottom_left+this.height && p.isRight(this.bottom_left) && p.getX()<this.bottom_left+this.width)
		{
			return true
		}
		return false;
	}

	@Override
	public boolean contains(Rectangle rect) {
		if(this.contains(rect.bottom_left) && rect.botoom_left.getX()+rect.width < this.bottom_left.getX()+this.width && rect.bottom_left.getY()+rect.height<this.bottom_left.getY()+this.height)
		{
			return true;
		}
		return false;
	}
}
