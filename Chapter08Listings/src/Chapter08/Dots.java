package Chapter08;

// Listing 8.17

//********************************************************************
// Dots.java Author: Lewis/Loftus
//
// Demonstrates mouse events.
//********************************************************************
//L i s t i N g 8 . 1 7
//8.8 Mouse Events 419
import javax.swing.JFrame;
public class Dots
{
	//-----------------------------------------------------------------
	// Creates and displays the application frame.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Dots");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add( new DotsPanel());
		frame.pack();
		frame.setVisible( true );
	}
}
