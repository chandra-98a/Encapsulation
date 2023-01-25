package org.capgemini.encapsulation.example2;

public class Book {
	//we need to declare the most imp element as private
	private int pages;

	//getters(accessors) 
	public int getPages() {
		return pages;
	}
    //setters(mutators)
	public void setPages(int x) {
		if(x>0)
		pages =x;
	}

}
//The private members now provided access through accessors and mutators

//This is called ENCAPSULATION.-->