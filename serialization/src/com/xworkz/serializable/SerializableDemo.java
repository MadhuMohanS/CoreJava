package com.xworkz.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializableDemo {
public static void main(String[] args) {
	StudentDto studentDto=new StudentDto("Madhu Mohan S", 26);
	String fileName="C:\\Users\\User\\Desktop\\serializable\\student.txt";
	
	try {
		FileOutputStream foos=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(foos);
		oos.writeObject(studentDto);
		oos.close();
		foos.close();
		System.out.println("object saved in file");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
