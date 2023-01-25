package org.capgemini.encapsulation.example2;

public class BookApp {

	public static void main(String[] args) {
		//creating object
        Book b1=new Book();
        //error if we set pages like below b1.pages=100;
        
//setting pages to 100
b1.setPages(100);

//getting the pages 
int m=b1.getPages();

System.out.println("The number of pages are "+ m);
	}

}


/* The process of providing controlled access to the private members 
 of the class using accessors and mutators is refer to as Encapsulation.
 */