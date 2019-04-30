package javapgm;

import java.util.ArrayList;

public class Array2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> emp= new ArrayList<Integer>();
		//int num[]=new int[5];
		
		
		//int a[]={10,10,20,50,60,80,60,50};
		emp.add(10);
		emp.add(40);
		emp.add(40);
		emp.add(20);
		emp.add(40);
		emp.add(50);
		emp.add(40);
		System.err.println(emp);
		ArrayList<Integer> emp1= new ArrayList<Integer>();
		
		
		//num[0]=10;
		//num[1]=20;
		////num[2]=30;
		//num[3]=40;
		//num[4]=50;
		
		
		//System.out.println(num[2]);
		
		//System.out.println(emp);
		//emp.add(1, 80);
		//System.out.println(emp);
		
		//boolean
		
		//System.out.println(emp);
		//boolean empty = emp.isEmpty();
		//System.err.println(empty);
		
		//Index
		//System.out.println(emp);
		//int indexOf = emp.indexOf(40);
		//System.out.println(indexOf);
		
		//IndexOf
		//int lastIndexOf = emp.lastIndexOf(40);
		//System.out.println(lastIndexOf);
		
		//emp.remove(1);
		
		//System.out.println(emp);
		
		
		//Copy Array
		
		//System.out.println(emp);
		emp1.addAll(emp);
		emp1.add(6,40);
		emp1.add(7,600);
		System.out.println(emp1);
		boolean c = emp.containsAll(emp1);
		System.out.println(c);
		System.out.println(emp);
		
		System.out.println(emp);
		emp.retainAll(emp1);
		System.err.println(emp);
		
	}

}
