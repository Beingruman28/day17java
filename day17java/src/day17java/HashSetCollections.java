package day17java;

import java.util.*;  

public class HashSetCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		  //Creating HashSet and adding elements  
		    HashSet<String> set = new  HashSet<String>();  
		         
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five");  
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  
		           {  
		           System.out.println(i.next());  
		           }  
		           set.remove("Four");  
		           System.out.println("After  remove(object) method: "+set);  
		           HashSet<String> set1=new HashSet<String>();  
		           set1.add("Two");  
		           set1.add("Seven");  
		           set.addAll(set1);  
		           System.out.println("Updated List: "+set);  
		           //Removing all the new elements from HashSet  
		           set.removeAll(set1);  
		           System.out.println("After  removeAll() method: "+set);  
		           //Removing elements on the basis of specified condition  
		           set.removeIf(str->str.contains("one"));    
		           System.out.println("After removeIf() method: "+set);  
		           //Removing all the elements available in the set  
		           set.clear();  
		           System.out.println("After invoking clear() method: "+set);  
		          
		           }  
		 }  
	