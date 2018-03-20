package hw1;


public class Rectangle1 implements Rectangle {
	Point top_right;
	Point bottom_left;
	
	public Rectangle()
	{
		this.top_right = new Point(0.5,0.5);
		this.bottom_left = new Point(-0.5,-0.5);
	}
	public Rectangle(point top Point bottom)
	{
		this();
		if(this.top_right.isUpper(this.bottom_left)&&this.top_right.isRight(this.bottom_left))
		{
			this.top_right = top.copy();
			this.bottom_left = bottom.copy();
		}
	}
}
