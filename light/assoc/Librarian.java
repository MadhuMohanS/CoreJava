package com.xworkz.light.assoc;

public class Librarian {
LibraryRule libraryRule;
public Librarian(LibraryRule libraryRule) {
	this.libraryRule=libraryRule;
}

public void lendingBook() {
	boolean silence=libraryRule.keepSilence();
	String memberID=libraryRule.memberID();
	if(silence && memberID !=null) {
		System.out.println("can lend the book to "+memberID);
	}else {
		System.err.println("cannot lend the book to "+memberID);
	}
}
}
