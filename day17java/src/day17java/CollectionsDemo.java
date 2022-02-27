package day17java;

import java.util.Stack;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> oj = new Stack<>();
	    oj.push(100);
	    oj.push(200);
	    oj.push(300);
	    oj.push(400);
	    oj.push(500);
	    oj.push(600);
	    oj.push(700);
	    System.out.println(oj);
	    oj.pop();
	    System.out.println(oj);
	    oj.peek();
	    System.out.println(oj);
	    oj.add(20000);
	    System.out.println(oj);
	    
	
	}

}
