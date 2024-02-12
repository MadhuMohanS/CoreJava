package com.xworkz.markerinterface;

public class StudentBegin {
public static void main(String[] args) {
     StudentImpl student=new StudentImpl();
     if(student instanceof MarkerInterface) {
    	 student.absent();
     }else {
    	 System.out.println("student have no permission for absent");
     }
}
}
