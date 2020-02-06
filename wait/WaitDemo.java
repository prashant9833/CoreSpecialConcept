package com.demo.wait;

import java.util.*;

public class WaitDemo {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks obtained");
		float marks=sc.nextFloat();
		ReportCard r=new ReportCard(marks);
		r.start();
		synchronized(r)
		{
			r.wait();
		}
		System.out.println("Your Overall Pointer is: "+r.per);

	}

}
