package day17java;

import java.util.Stack;

public class CollectionsDemo1 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Stack <String> oj = new Stack<>();
			    oj.push("ajinkya");
			    oj.push("bhuvi");
			    oj.push("chahal");
			    oj.push("dhawan");
			    oj.push("eshaan");
			    oj.push("farhan");
			    oj.push("ganguly");
			    System.out.println(oj);
			    oj.pop();
			    System.out.println(oj);
			    oj.peek();
			    System.out.println(oj);
			    oj.remove(3);
			    System.out.println(oj);
			    oj.remove("bhuvi");
			    System.out.println(oj);
			}
	}


