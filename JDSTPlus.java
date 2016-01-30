/**
 * jDiskStressTester+
 * A reimplementation of jDiskStressTester with a fully featured GUI plus a little bit of fun from AnotherOne
 * @author Shravan Jambukesan
 * Date: 1/29/16
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JDSTPlus
{
	public JFrame gui;
	public JLabel info;
	public JButton anotherOneButton;
	public JButton stressTestButton;

	public JDSTPlus()
	{
		createButton();
		createLabel();
		createFrame();
	}

	public static void main(String[] args)
	{
		JDSTPlus p = new JDSTPlus();
	}

	public void createButton()
	{
		anotherOneButton = new JButton("Click here to #BlessUp");
		stressTestButton = new JButton("Click here to run the stress test");
		anotherOneButton.setSize(300, 75);
		anotherOneButton.setLocation(new Point(575, 10));
		stressTestButton.setSize(300, 75);
		stressTestButton.setLocation(new Point(575, 95));
		anotherOneButton.addActionListener(new ButtonActionListener());
	}

	public void createFrame()
	{
		gui = new JFrame("jDiskStressTester+");
		gui.setSize(900, 700);
		gui.add(anotherOneButton);
		gui.add(stressTestButton);
		gui.add(info);
		gui.setVisible(true);
		gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void createLabel()
	{
		info = new JLabel("Welcome to jDiskStressTester+");
		info.setBounds(1, 1, 500, 500);
	}

	class ButtonActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			info.setText("LION ORDER");
			AnotherOne khaled = new AnotherOne();
		}
	}


	
}