import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* Andre Austin - Virginia Commonwealth University */
/* Run this! */

public class MatchingGameFrame extends MatchingGamePanel
{
	public static void main(String[] args)
	{
      /* giving title to JFrame */
		JFrame myFrame = new JFrame("NBA Matching Game!");
  		myFrame.setLocation(250, 200);
      /* sizing for JFrame */
		myFrame.setSize(1000, 300);
      /* placing panel inside the frame */
		myFrame.setContentPane(new MatchingGamePanel());
      /* display panel */
      myFrame.setVisible(true);
      /* on close of JFrame, complete the run of application */
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	}
}