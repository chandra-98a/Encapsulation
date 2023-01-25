package org.capgemini.encapsulation.example1;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Book b1=new Book();
     //providing direct access to most imp element outside the class
     b1.pages=100;
     System.out.println(b1.pages);
     b1.pages=-99;
     System.out.println(b1.pages);
	}

}
//According to the rules of object orientation the most
//Important element of the object should
//not be accessible outside the class.