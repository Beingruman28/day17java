package day17java;

import java.util.ArrayList;

	public class CollectionsofArray {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<String> oj = new ArrayList<>();
				    oj.add("ajinkya");   // to add in the list
				    oj.add("bhuvi");
				    oj.add("chahal");
				    oj.add("dhawan");
				    oj.add("eshaan");
				    oj.add("virat");
				    oj.add("ganguly");
				    oj.add("zaheer");
				    System.out.println(oj);
				    oj.add(4, "bhumrah");           // to add in the list with index and value.
				    System.out.println(oj);
				    oj.remove(6);                 //to remove from list with index
				    System.out.println(oj);
				    oj.remove("bhuvi");           //to remove from list with value
				    System.out.println(oj);
				    oj.set(3,"rohit");             //to set the value by index
			       System.out.println(oj);
			       oj.get(6);                        //to get the value by index
			       System.out.println(oj);
				    oj.sort(null);            //to sort array list 
				   System.out.println(oj);
				    oj.contains("kapil");  //Returns true if this list contains the specified element.
				    System.out.println(oj);
					oj.addAll(oj);                  //to append the list
				    System.out.println(oj);
				    oj.clone();                  //Returns a shallow copy of this ArrayList instance.
				    System.out.println(oj);
				    oj.clear();            //to empty the array
				    System.out.println(oj);
				}
	}