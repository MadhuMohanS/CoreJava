package com.xworkz.exception.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {
public static void main(String[] args) {
	int i;
	Scanner in=null;
	try {
	in=new Scanner(new File("G.txt"));
	}catch(FileNotFoundException e) {
		System.out.println(e);
	}finally {
		if(in!=null) {
			in.close();
		}
	}
}
}
