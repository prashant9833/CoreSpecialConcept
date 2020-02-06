package com.demo.synchronizedblock;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d=new Display();
		
		MyThread t1=new MyThread(d,"Prashant");
		MyThread t2=new MyThread(d,"Sonu");
		
		t1.start();
		t2.start();

	}

}
