package com.demo.daemon;

class MyThread2 extends Thread
{

 public void run()
 {
	 
	 System.out.println("Child Thread--->Daemon");
	 
 }

}

public class DaemonDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread2 t=new MyThread2();
		t.setDaemon(true);
		t.start();
		System.out.println("Main Thread--->Non-Daemon");

	}

}
