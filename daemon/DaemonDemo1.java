package com.demo.daemon;

public class DaemonDemo1 {

	public static void main(String[] args) {
		
		Thread.currentThread().setDaemon(true);
		System.out.println(Thread.currentThread().isDaemon());

	}

}
