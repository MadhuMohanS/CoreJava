package com.xworkz.exception.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {
public static void main(String[] args) throws IOException {
//	FileInputStream frFileInputStream=new FileInputStream("C:\\Users\\User\\Desktop\\CoreJava\\Mock.txt");
	try {
//	FileInputStream fr=new FileInputStream(new File("C:\\Users\\User\\Desktop\\CoreJava\\Mock.txt"));
//byte[] arr=fr.readAllBytes();
//for(int i=0;i<arr.length;i++) {
//	System.out.print((char)arr[i]);
		FileInputStream frFileInputStream=new FileInputStream("Mock.txt");


	}catch(FileNotFoundException e) {
		System.out.println(e);
	}
//	FileInputStream fr=new FileInputStream(new File("C:\\Users\\User\\Desktop\\CoreJava\\Mock.txt"));
}
}
