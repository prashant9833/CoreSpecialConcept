package com.demo.collection;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList al=new LinkedList();
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
		LinkedList al2=new LinkedList();
		al2.add(100);
		al2.add(200);
		al.addAll(2,al2); //8
		System.out.println(al);
		System.out.println(al.add("Prashant")); //9
		System.out.println(al.addAll(al2)); //10
		System.out.println(al.contains("Q")); //11
		LinkedList al3=new LinkedList();
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
		LinkedList al4=new LinkedList();
		al4.add("S");
		al4.add("T");
		al4.add("U");
		al4.add("V");
		al4.add("W");
		System.out.println(al4);
		al4.addFirst("M"); //20
		al4.addLast("N"); //21
        System.out.println(al4);
        System.out.println(al4.getFirst()); //22
        System.out.println(al4.getLast()); //23
        al4.removeFirst(); //24
        al4.removeLast(); //25
        Iterator itr=al4.iterator(); //26
        while(itr.hasNext())
        {
        	
           String str=(String)itr.next();
           if(str.equals("U"))
           {
        	   itr.remove();
           }
           
        }
        System.out.println(al4); 

	}

}
