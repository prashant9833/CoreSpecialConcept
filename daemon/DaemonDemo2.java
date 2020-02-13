package com.demo.daemon;

class MyThread extends Thread
{

	public void run()
	{
		System.out.println("Child Thread");
	}

}



public class DaemonDemo2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().isDaemon());
		
		MyThread t=new MyThread();
		t.start();
		t.setDaemon(true);
		System.out.println("Main Thread");

	}

}
