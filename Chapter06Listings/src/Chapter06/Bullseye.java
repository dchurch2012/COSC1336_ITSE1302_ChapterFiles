package Chapter06;
import javax.swing.JFrame;

// Listing 6.5

//********************************************************************
// Bullseye.java Author: Lewis/Loftus
//
// Demonstrates the use of loops to draw.
//********************************************************************

public class Bullseye
{
	//-----------------------------------------------------------------
	// Creates the main frame of the program.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Bullseye");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BullseyePanel panel = new BullseyePanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}