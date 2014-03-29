import java.awt.*;
import javax.swing.*;

/**
 * This class contains the main method that displays the InputPanel and PaintPanel in the JFrame.
 * @author Lily Peng
 * @version 1.0
 */
public class PaintMain 
{

	/**
	 * The main method, with the InputPanel and PaintPanel in a JFrame
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Not MSPaint");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		InputPanel input = new InputPanel();
		PaintPanel paint = new PaintPanel(input);
		
		input.setPreferredSize(new Dimension(100, 500));
		frame.getContentPane().add(input, BorderLayout.WEST);
		frame.getContentPane().add(paint, BorderLayout.CENTER);
		frame.setPreferredSize(new Dimension(500, 500));
		frame.pack();
		frame.setVisible(true);
	
	}
	
	
}
