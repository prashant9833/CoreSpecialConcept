package com.demo.wait;

public class ReportCard extends Thread {
	
	float marks;
	float per;
	
	public ReportCard(float marks)
	{
		this.marks=marks;
	}
	
	public void run()
	{
		synchronized(this)
		{
		   per=(marks/100);
		   
		   this.notifyAll();
		}
	}

}
