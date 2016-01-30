/**
 * When you are feeling down, let DJ Khaled inspire you.
 * This simple java class can easily be implemented as an entire class or as a method
 * in conjuction with another program. 
 * The AnotherOne class opens an inspirational DJ Khaled video in the default web browser
 * @author Shravan Jambukesan
 * Date: 12/9/15
 * https://github.com/ShravanJ/AnotherOne
 */

import java.awt.*;
import java.net.*;

public class AnotherOne
{
	final String url = "https://www.youtube.com/watch?v=3GasdhXLXYA";

	public AnotherOne()
	{
		Desktop d = Desktop.getDesktop();
		if(d.isDesktopSupported())
		{
			try
			{
				d.getDesktop().browse(new URI(url));
			}
			catch(Exception e)
			{
				System.out.println("You smart. You very smart. We the best.");
			}
			
		}
	}
}