import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * This class is a subclass of JPanel. It holds all the shapes that can be drawn
 * (Rectangle, Circle, Line). 
 * @author Lily Peng
 * @version 1.0
 */
public class PaintPanel extends JPanel 
{
	private InputPanel input;
	private int x, y;
	private ArrayList<Shape> array;
	
	/**
	 * Constructor for PaintPanel.
	 * @param input This parameter is the InputPanel this class wants to communicate with.
	 */
	public PaintPanel(InputPanel input)
	{
		this.input = input;
		x = 0;
		y = 0;
		array = new ArrayList<Shape>();
		
		setBackground(Color.WHITE);
		
		addMouseListener(new DrawShape());
		addMouseMotionListener(new DrawShape());
	}
	
	/**
	 * This method draws all the shapes in the ArrayList.
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for (Shape s: array)
		{
			s.draw(g);
		}
	}
	
	/**
	 * This class draws shapes when the mouse is clicked and dragged to the down and right.
	 * @author Lily Peng
	 * @version 1.0
	 */
	private class DrawShape extends MouseAdapter
	{
		
		/**
		 * Adds a shape to the ArrayList when the mouse is pressed.
		 */
		public void mousePressed(MouseEvent event)
		{
			x = event.getX();
			y = event.getY();
			
			if (input.getShape().equals("rectangle"))
			{
				array.add(new Rectangle(x, y, input.isFilled()));
			}
			else if (input.getShape().equals("circle"))
			{
				array.add(new Circle(x, y, input.isFilled()));
			}
			else if (input.getShape().equals("line"))
			{
				array.add(new Line(x, y));
			}
			
			array.get(array.size() - 1).setColor(input.getColor());
			repaint();
		}
		
		/**
		 * Updates the width and height of the shape when the mouse is dragged.
		 */
		public void mouseDragged(MouseEvent event)
		{
			array.get(array.size() - 1).setWidth((int) (event.getPoint().getX() - x));
			array.get(array.size() - 1).setHeight((int) (event.getPoint().getY() - y));
			repaint();
		}
		
		
	}
	
	
}
