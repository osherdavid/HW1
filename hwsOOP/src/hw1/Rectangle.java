package hw1;

/**
 * This interface should be implemented in two different classes as part of HW1,
 * 
 * @author Michal Horovitz.
 * 
 */

public interface Rectangle {

	/**
	 * @return the bottom-left corner of the rectangle. Note that this method should
	 *         return a copy of the bottom-left corner, and not a reference to a
	 *         field.
	 */
	public Point getBotLeftPoint();

	/**
	 * @return the top-right corner of the rectangle. Note that this method should
	 *         return a copy of the top-left corner, and not a reference to a field.
	 */
	public Point getTopRightPoint();

	/**
	 * @return the center point. Note that this method should return a copy of the
	 *         center point, and not a reference to a field.
	 */
	public Point getCenter();

	/**
	 * @return the height of the rectangle
	 */
	public double getHeight();

	/**
	 * @return the width of the rectangle
	 */
	public double getWidth();

	/**
	 * @param p
	 *            (not null) Set the bottom-left corner of the rectangle to be a
	 *            copy of p.
	 */
	public void setBotLeftPoint(Point p);

	/**
	 * @param p
	 *            (not null) Set the top-right corner of the rectangle to be a copy
	 *            of p.
	 */
	public void setTopRightPoint(Point p);

	/**
	 * @param p
	 *            (not null) Set the center point of the rectangle to be a copy of
	 *            p.
	 */
	public void setCenter(Point p);

	/**
	 * @param height
	 */
	public void setHeight(double height);

	/**
	 * @param width
	 */
	public void setWidth(double width);

	/**
	 * @return the area
	 */
	public double getArea();

	/**
	 * @return the perimeter
	 */
	public double getPerimeter();

	/**
	 * Rotate the triangle 90 degrees to the left (the center point is not changed,
	 * the height and the width are replaced).
	 */
	public void rotate();

	/**
	 * @param scalePar:double
	 *            Multiply the height and width of the rectangle by scalePar (the
	 *            center point is not changed).
	 */
	public void scale(double scalePar);

	/**
	 * @param delta:double
	 *            delta Move the rectangle to the right by delta (Note that delta
	 *            might be negative, and then the rectangle is moved to the left).
	 */
	public void moveVertical(double delta);

	/**
	 * @param delta:double
	 *            Move up the rectangle (this) by delta (Note that delta might be
	 *            negative, and then the rectangle is moved down).
	 */
	public void moveHorizontal(double delta);

	/**
	 * @param rect:Rectangle
	 * @return If the rectangle rect represents the same rectangle as this, then
	 *         return true. Otherwise, return false
	 */
	public boolean isEqual(Rectangle rect);

	/**
	 * @param p:Point
	 * @return If the rectangle (this) contains the Point p then return true.
	 *         Otherwise return false
	 */
	public boolean contains(Point p);

	/**
	 * @param rect:Rectangle
	 * @return If the rectangle (this) contains the Rectangle rect then return true.
	 *         Otherwise, return false
	 */
	public boolean contains(Rectangle rect);


}
