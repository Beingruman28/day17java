package day17java;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.*;


public class CollectionsDemo3 {
	void display(List<String> list) {
		Iterator <String> obj = list.iterator();
		while (obj.hasNext()) {
			
		System.out.println("Element is :" + obj.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					List <String> oj = new LinkedList<>();
				    oj.add("rohit");
				    oj.add("dhawan");
				    oj.add("virat");
				    oj.add("rahul");
				    oj.add("shreyas");
				    oj.add("pant");
				    oj.add("jadeja");
				    System.out.println(" Element is : " + oj);
				    CollectionsDemo3 cd = new CollectionsDemo3();
				    cd.display(oj);
				    
				  /*  oj.remove();
				    System.out.println(oj);
				    oj.peek();
				    System.out.println(oj);
				    oj.set(0,10000);
				    oj.set(4,10000);
				    System.out.println(oj);
				    oj.add(2,1000);
				    System.out.println(oj);
				    */
				}

			}

