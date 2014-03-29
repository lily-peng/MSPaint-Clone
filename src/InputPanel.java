import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class is a subclass of JPanel. It holds the buttons and labels and determines whether
 * you draw a rectangle, circle, or line.
 * @author Lily Peng
 * @verson 1.0
 */
public class InputPanel extends JPanel
{
	private JButton rect, circle, line, pickColor, quit;
	private JCheckBox fillBox;
	private JLabel current, color;
	
	private String shape;
	private Color c;
	
	private JPanel j;
	
	/**
	 * The constructor of InputPanel, initializes and creates the panel.
	 */
	public InputPanel()
	{
		j = this;
		c = Color.BLACK; //default color
		shape = "line"; //default shape
		rect = new JButton("Rectangle");
		circle = new JButton("Circle");
		line = new JButton("Line");
		pickColor = new JButton("Color...");
		quit = new JButton("Quit");
		
		fillBox = new JCheckBox("Filled");
		
		current = new JLabel("Current Color");
		color = new JLabel("");
		color.setBackground(c); //defaults to black
		color.setPreferredSize(new Dimension(75, 75));
		color.setOpaque(true);
		
		ButtonListener a = new ButtonListener();
		rect.addActionListener(a);
		circle.addActionListener(a);
		line.addActionListener(a);
		pickColor.addActionListener(a);
		
		QuitListener b = new QuitListener();
		quit.addActionListener(b);
		
		add(rect);
		add(circle);
		add(line);
		add(fillBox);
		add(pickColor);
		add(current);
		add(color);
		add(quit);
	}
	
	/**
	 * This class implements ActionListener. It determines what shape should be drawn
	 * depending on what button was clicked. It also lets the user
	 * choose a color for the shapes.
	 * @author Lily Peng
	 * @version 1.0
	 */
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource().equals(rect))
			{
				shape = "rectangle";
			}
			else if (event.getSource().equals(circle))
			{
				shape = "circle";
			}
			else if (event.getSource().equals(line))
			{
				shape = "line";
			}
			else if (event.getSource().equals(pickColor))
			{
				c = JColorChooser.showDialog(j, "Choose a Color", c);
				color.setBackground(c);
			}
		}
	}
	
	/**
	 * This class also implements ActionListener. It terminates the program
	 * when the Quit button is pressed.
	 * @author Lily Peng
	 * @version 1.0
	 */
	private class QuitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.exit(0);
		}
	}
	
	/**
	 * A getter method for the current color.
	 * @return Color the color selected
	 */
	public Color getColor()
	{
		return c;
	}
	
	/**
	 * A method that returns whether the checkbox is selected or not.
	 * @return boolean returns true if the checkbox is selected, and false otherwise
	 */
	public boolean isFilled()
	{
		return fillBox.isSelected();
	}
	
	/**
	 * A getter method for the current shape selected.
	 * @return String the shape selected (in String form)
	 */
	public String getShape()
	{
		return shape;
	}
	
}
