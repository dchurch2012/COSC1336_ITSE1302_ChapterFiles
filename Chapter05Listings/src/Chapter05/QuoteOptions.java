package Chapter05;
import javax.swing.JFrame;

// Listing 5.16

//********************************************************************
// QuoteOptions.java Author: Lewis/Loftus
//
// Demonstrates the use of radio buttons.
//********************************************************************

public class QuoteOptions
{
	//-----------------------------------------------------------------
	// Creates and presents the program frame.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Quote Options");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		QuoteOptionsPanel panel = new QuoteOptionsPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
