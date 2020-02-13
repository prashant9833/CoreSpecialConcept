package com.demo.collection;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector al=new Vector();
		al.add("A");
		al.add("A");
		al.add(10);
		al.add(null);
		al.add(582);
		al.add("B");
		System.out.println(al); //1
		al.add(4,"Prashant"); //2
		System.out.println(al.get(4)); //3
		al.remove(0); //4
		al.set(0,"Ishant"); //5
		System.out.println(al);
		System.out.println(al.indexOf("A")); //6
		al.add("A");
		System.out.println(al.lastIndexOf("A")); //7
		Vector al2=new Vector();
		al2.add(100);
		al2.add(200);
		al.addAll(2,al2); //8
		System.out.println(al);
		System.out.println(al.add("Prashant")); //9
		System.out.println(al.addAll(al2)); //10
		System.out.println(al.contains("Q")); //11
		Vector al3=new Vector();
		al3.add("R");
		al3.add("J");
		System.out.println(al.containsAll(al3)); //12
		System.out.println(al.remove("A")); //13
		System.out.println(al.removeAll(al2)); //14
		System.out.println(al);
		System.out.println(al.retainAll(al2)); //15
		System.out.println(al);
		System.out.println(al.isEmpty()); //16
		System.out.println(al.size()); //17
		System.out.println(al.toArray()); //18
		al.clear(); //19
		System.out.println(al.size());
		System.out.println("----------------------------------------------------------------------");
		Vector al4=new Vector();
		al4.addElement("S"); //20
		al4.addElement("T");
		al4.addElement("U");
		al4.addElement("V");
		al4.addElement("W");
		System.out.println(al4);
		System.out.println(al4.elementAt(1)); //21
		System.out.println(al4.firstElement()); //22
		System.out.println(al4.lastElement()); //23
		al4.remove(3); //24
		Vector al5=new Vector();
		al5.addElement("X");
		al5.addElement("Y");
		al5.addElement("Z");
	    al5.remove("Z"); //25
	    System.out.println(al5);
	    al5.removeAllElements(); //26
	    System.out.println(al5);
	    System.out.println(al5.capacity()); //27
	    Enumeration e=al4.elements(); //28
	    while(e.hasMoreElements()) //29
	    {
	    	String str=(String)e.nextElement(); //30
	    }
	    System.out.println(al4); 
		
		


	}

}
