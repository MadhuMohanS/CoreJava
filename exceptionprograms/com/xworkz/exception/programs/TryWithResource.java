package com.xworkz.exception.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {
public static void main(String[] args) {
	try(Scanner scanner=new Scanner(new File("G.txt"))){
		while(scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
	}catch(FileNotFoundException e){
		System.out.println(e);
	}
}
}
