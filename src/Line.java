import java.awt.Graphics;

/**
 * This Line class is a subclass of Shape. Used to draw Lines.
 * @author Lily Peng
 * @version 1.0
 */
public class Line extends Shape
{

	/**
	 * This constructor of Line creates and initializes a Line object.
	 * @param x the starting x-value
	 * @param y the starting y-value
	 */
	public Line(int x, int y) 
	{
		super(x, y);
	}

	/**
	 * This method draws the Line with a color.
	 */
	public void draw(Graphics g) 
	{
		g.setColor(super.getColor());
		g.drawLine(getX(), getY(), getWidth() + getX(), getHeight() + getY());
	}

}
