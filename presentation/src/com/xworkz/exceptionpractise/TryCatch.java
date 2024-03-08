package com.xworkz.exceptionpractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {
public static void main(String[] args) throws IOException {
//	FileInputStream file=null;
	try(FileInputStream file=new FileInputStream("mock.txt")) {
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e);
//	}finally {
//		file.close();
//	}
	
	int[] age=new int[10];
	try {
//		System.out.println(age[11]);
		age[4]=3/0;
	}catch(ArrayIndexOutOfBoundsException s) {
		System.out.println(s);
	}
	catch(ArithmeticException h) {
		System.out.println(h);
	}
	System.out.println("printing....");
	
}
}
}
