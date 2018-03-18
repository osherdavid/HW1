package hw1;

public class Rectangle2 implements Rectangle{
	double height;
	double width;
	Point bottom_left;
	
	
	public Rectangle2()
	{
		this.height = 1;
		this.width = 1;
		this.bottom_left = new Point(-0.5,-0.5);
	}
	
	public Rectangle2(double height, double width, Point bottom_left)
	{
		this();
		if(height > 0 && width > 0)
		{
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
		center.moveHorizontal(width/2);
		center.moveVertical(height/2);
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
		if (p.getX()>this.bottom_left.getX() && p.getY()>this.bottom_left.getY())
		{
			this.height = p.getY()-this.bottom_left.getY();
			this.width = p.getX()-this.bottom_left.getX();
		}
	}

	@Override
	public void setCenter(Point p) {
		if (p.getX()>this.bottom_left.getX() && p.getY()>this.bottom_left.getY())
		{
			this.height = p.getY()-this.bottom_left.getY();
			this.width = p.getX()-this.bottom_left.getX();
		}
	}

	@Override
	public void setHeight(double height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWidth(double width) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scale(double scalePar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveVertical(double delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveHorizontal(double delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEqual(Rectangle rect) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Rectangle rect) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void checkin() {
		System.out.println("it's working!");
		System.out.println("boolbool");
	}

}
