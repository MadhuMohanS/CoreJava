package com.xworkz.equalscontract.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.equalscontract.ClassDto;
import com.xworkz.equalscontract.StudentDto;

public class StudentClassMap {
public static void main(String[] args) {
	StudentDto studentDto=new StudentDto("anil", 23, 176.6);
	ClassDto classDto=new ClassDto("second", 103, 3);
	StudentDto studentDto1 = new StudentDto("Sara", 20, 165.2);
	StudentDto studentDto2 = new StudentDto("James", 22, 180.5);

	ClassDto classDto1 = new ClassDto("first", 101, 4);
	ClassDto classDto2 = new ClassDto("third", 105, 2);

	StudentDto studentDto3 = new StudentDto("Emily", 21, 170.1);
	StudentDto studentDto4 = new StudentDto("Michael", 24, 175.0);

	ClassDto classDto3 = new ClassDto("fourth", 107, 1);
	ClassDto classDto4 = new ClassDto("fifth", 109, 5);

	StudentDto studentDto5 = new StudentDto("Liam", 19, 160.8);
	StudentDto studentDto6 = new StudentDto("Sophia", 20, 168.9);
	
	StudentDto studentDto7 = new StudentDto("Aiden", 22, 172.3);
	StudentDto studentDto8 = new StudentDto("Olivia", 21, 166.7);

	ClassDto classDto5 = new ClassDto("sixth", 111, 2);
	ClassDto classDto6 = new ClassDto("seventh", 113, 3);

	
	StudentDto studentDto10 = new StudentDto("Isabella", 20, 162.5);

	ClassDto classDto7 = new ClassDto("eighth", 115, 4);
	ClassDto classDto8 = new ClassDto("ninth", 117, 5);
	
	
	Map<StudentDto, ClassDto> studentClassMap=new HashMap<>();
	studentClassMap.put(studentDto, classDto);
	studentClassMap.put(studentDto1, classDto1);
	studentClassMap.put(studentDto2, classDto2);
	studentClassMap.put(studentDto3, classDto3);
	studentClassMap.put(studentDto4, classDto4);
	studentClassMap.put(studentDto5, classDto5);
	studentClassMap.put(studentDto6, classDto6);
	studentClassMap.put(studentDto7, classDto7);
	studentClassMap.put(studentDto8, classDto8);
	
	StudentDto studentDto9 = new StudentDto("anil", 23, 179.4);
	ClassDto classDto9 = new ClassDto("ninth", 117, 5);
	studentClassMap.put(studentDto9, classDto9);
	
	studentClassMap.forEach((k,v)->System.out.println(k+" "+v));
	
	
}
}
