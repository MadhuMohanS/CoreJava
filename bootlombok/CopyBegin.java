package com.xworkz.board;

import com.xworkz.board.lombok.ShallowCopy;

public class CopyBegin {
	public static void main(String[] args) {
		ShallowCopy obj=new ShallowCopy();
		obj.i=5;
		obj.j=6;
//		System.out.println(obj);
		
		ShallowCopy obj1=obj;
		obj1.j=8;
		System.out.println(obj1);
		System.out.println(obj);
	}

}
