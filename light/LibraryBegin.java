package com.xworkz.light;

import com.xworkz.light.assoc.Librarian;
import com.xworkz.light.assoc.LibraryRule;
import com.xworkz.light.assoc.MadhuLibraryRuleImpl;

public class LibraryBegin {

	public static void main(String[] args) {
		System.out.println("starting main in libraryBegin");
		// TODO Auto-generated method stub
		LibraryRule libraryRule=new MadhuLibraryRuleImpl();
		Librarian librarian=new Librarian(libraryRule);
		librarian.lendingBook();
		System.out.println("ending main in libraryBegin");

	}

}
