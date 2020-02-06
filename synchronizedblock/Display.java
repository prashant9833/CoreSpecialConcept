package com.demo.synchronizedblock;

public class Display {
	
	public void wish(String name)
	{
		
		synchronized(this){
			
			for(int i=1;i<=5;i++)
			{
				System.out.print("Good Morning: ");
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				
				System.out.println(name);
			}
		}
	}

}
