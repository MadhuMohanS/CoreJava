package com.xworkz.collectionpractise;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class TimeConversion {
	public static String timeConversion(String s) {
	    // Write your code here
		String indi=s.substring(8,10);
		int ti=Integer.parseInt(s.substring(0,2));
		String s1[]=s.split(":");
		
		if(ti<=12 && indi.equals("PM")) {
			ti+=12;	
			return ti+":"+s.substring(3,8);
		}else {
			return s;
		}

	    }
public static void main(String[] args) {
	String s="07:05:45PM";
	String time= timeConversion(s);
	System.out.println(time);

	
}
}
