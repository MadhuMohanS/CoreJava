package com.xworkz.board;

import com.xworkz.board.lombok.DeepCopy;

public class DeepBegin {
public static void main(String[] args) {
	DeepCopy obj=new DeepCopy();
	obj.i=5;
	obj.j=8;
	
	System.out.println(obj);
	DeepCopy obj1=new DeepCopy();
	obj1.i=obj.i;
	obj1.j=obj.j;
	
//	System.out.println(obj1);
	obj.j=6;
	System.out.println(obj1);
	System.out.println(obj);

	
}
}
