package com.sierra;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import com.collections.Employee;
import com.collections.EmployeeDAO;
import com.collections.IEmployeeDAO;


public class CursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList =  new ArrayList<String>();
		myList.add("10");
		myList.add("40");
		myList.add("40");
		myList.add("1110");
	
		/*//System.out.println(myList);
		LinkedList llist = new LinkedList(myList);
		System.out.println(llist);
		//llist.addAll(myList);
		//LinkedList llist = new LinkedList<>();
		//llist.add(0, 1);;
//		llist.addFirst(5);
//		System.out.println(llist.add(2));
		ListIterator listIterator = llist.listIterator();
		 while( listIterator.hasNext()) {
			 System.out.println(listIterator.next());
		 }
		
		Stack<String> stack = new Stack<String>();
				stack.push("100");
				stack.addAll(myList);
				System.out.println(stack);
				System.out.println(stack.peek());
				
				
				Enumeration<String> enumeration = stack.elements();
				while( enumeration.hasMoreElements()) {
					System.out.println(enumeration.nextElement());
				}
					// HashSet 
				HashSet empSet = new HashSet<>();
				empSet.add(100);
				empSet.add(100);
				empSet.add(6500);
				empSet.add(700);
				empSet.add(12);
				empSet.add(10);
				empSet.addAll(myList);
				// we can remove duplicates in arraylis by using the method addAll to the hashset
				System.out.println("data from HashSet:" + empSet);
				LinkedHashSet lhset = new LinkedHashSet<>();
				lhset.add(100);
				lhset.add(100);
				lhset.add(6500);
				lhset.add(700);
				lhset.add(10);
				lhset.addAll(myList);
				System.out.println("data from LinkedListHashSet:" + lhset); 
				TreeSet tset = new TreeSet<>();
				tset.add(4508);
				tset.add(23);
				tset.add(23);
				tset.add(4238);
				tset.add(45);
				tset.add(78);
				System.out.println(tset);
				
				TreeSet t=new TreeSet();
			    t.add(10);
			    t.add(0);
			    t.add(15);
			    t.add(5);
		    	t.add(20);
			    System.out.println(t);
 class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else return 0;
		
	}
}
			//System.out.println(tset.first());
				Queue queue = new PriorityQueue<>();
				queue.add(30);
				queue.add(130);
				queue.add(23);
				queue.add(450);
				System.out.println(queue);
				System.out.println(queue.peek());
				System.out.println(queue.remove());
				System.out.println(queue);
				
				Deque myqueue=new ArrayDeque<>();  // Double Ended Queue (1.6)    
				myqueue.addAll(myList);
				System.out.println(myqueue);
				myqueue.addFirst(100);
				System.out.println(myqueue);
				System.out.println(myqueue.getLast());
				System.out.println(myqueue.getFirst());
				System.out.println(myqueue.removeLast());
				System.out.println(myqueue);*/
				
				
		/*	HashMap map = new HashMap<>();
				map.put(101, "101value");
				map.put(107,"102value");
				map.put(1010,"103value");
				map.put(105,"104value" );
				System.out.println(map);
//				System.out.println(map.get(102));
//				Set keySet = map.keySet();
//				System.out.println(keySet);
//				 Collection values = map.values();
//				System.out.println(values);
				Set s =map.entrySet();
				System.out.println(s);
				
				Map map1 = new LinkedHashMap<>();
				map1.put(1015, "101value");
				map1.put(102,"102value");
				map1.put(107,"103value");
				map1.put(104,"104value" );
				System.out.println(map1);
				
				
				System.out.println(map1.get(102));
				Set keySet1 = map1.keySet();
				System.out.println(keySet1);
				Collection values1 = map1.values();
				System.out.println(values1);
				
				TreeMap tmap= new TreeMap(map);
				System.out.println(tmap);
			


			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			
			System.out.println("the sum is:"+(Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2])));
 */
		
				//Collections is an utility class for data manipulation
				System.out.println("bfore"+myList);
				Collections.shuffle(myList);
				System.out.println("after"+myList);
				
				System.out.println("bfore"+myList);
				Collections.sort(myList);
				System.out.println("after"+myList);
				
				System.out.println("bfore"+myList);
				Collections.reverse(myList);
				System.out.println("after"+myList);
		
	  }


		
 }


