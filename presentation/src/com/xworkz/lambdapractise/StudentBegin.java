package com.xworkz.lambdapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
class StudentDto{
	private String name;
	private int rollNo;
}
public class StudentBegin {
public static void main(String[] args) {
	StudentDto studentDto=new StudentDto("madhu", 23);
	StudentDto studentDto1=new StudentDto("mohan", 25);
	StudentDto studentDto2=new StudentDto("kiran", 12);
	StudentDto studentDto3=new StudentDto("manoj", 34);
	StudentDto studentDto4=new StudentDto("anil", 5);
	
	List<StudentDto> list=Arrays.asList(studentDto,studentDto1,studentDto2,studentDto3,studentDto4);
	Comparator<StudentDto> comp=new Comparator<StudentDto>() {
		public int compare(StudentDto s,StudentDto s1) {
			return Integer.compare(s1.getRollNo(), s.getRollNo());
		}
	};
	Collections.sort(list,comp);
	
//	list.forEach(s->System.out.println(s));
	Iterator<StudentDto> ref=list.iterator();
	while(ref.hasNext()) {
		StudentDto stu=ref.next();
		System.out.println(stu);
		
//		if(stu.getName().equals("madhu"))
//		   ref.remove();
	}
	
}
}
