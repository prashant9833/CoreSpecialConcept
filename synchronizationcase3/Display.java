package com.demo.synchronizationcase3;

public class Display {
	
	public synchronized void numbers()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void characters()
	{
		for(char j=65;j<=70;j++)
		{
			System.out.println(j);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}

}
