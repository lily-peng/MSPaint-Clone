import java.awt.*;

/**
 * This abstract class provides the framework for subclasses to use.
 * @author Lily Peng
 * @version 1.0
 */
public abstract class Shape 
{

	private int x;
	private int y;
	
	private int width;
	private int height;

	private Color c;
	
	/**
	 * This constructor of Shape creates and initializes a Shape object.
	 * @param x the starting x-value
	 * @param y the starting y-value
	 */
	public Shape(int x, int y)
	{
		this.x = x;
		this.y = y;
		width = 0;
		height = 0;
		c = Color.BLACK; //default color
	}
	
	/**
	 * An abstract method that will draw the shape (and check if it should be filled)
	 * @param g the graphics object to draw the shape on
	 */
	public abstract void draw(Graphics g);
	
	/**
	 * A getter method for the x-value
	 * @return x the x-value of the Shape
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * A getter method for the y-value
	 * @return y the y-value of the Shape
	 */
	public int getY()
	{
		return y;
	}
	
	/**
	 * A getter method for the width of the Shape
	 * @return width the width of the Shape
	 */
	public int getWidth()
	{
		return width;
	}
	
	/**
	 * A getter method for the height of the Shape
	 * @return width the height of the Shape
	 */
	public int getHeight()
	{
		return height;
	}
	
	/**
	 * A setter method for the width of the Shape
	 * @param width the width to set for the Shape
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	/**
	 * A setter method for the height of the Shape
	 * @param width the height to set for the Shape
	 */
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	/**
	 * A getter method for the color of the Shape
	 * @return c the color of the Shape
	 */
	public Color getColor()
	{
		return c;
	}
	
	/**
	 * A setter method for the color of the Shape
	 * @param c the color to set for the Shape
	 */
	public void setColor(Color c)
	{
		this.c = c;
	}
	
}
