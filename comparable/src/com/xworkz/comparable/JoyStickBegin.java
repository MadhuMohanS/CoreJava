package com.xworkz.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.sorting.JoyStickDto;

public class JoyStickBegin {
public static void main(String[] args) {
	JoyStickDto joyStickDto=new JoyStickDto("simple", 150, 5, "super");
	JoyStickDto joyStickDto1=new JoyStickDto("medium", 100, 5, "star");
	JoyStickDto joyStickDto2=new JoyStickDto("hard", 50, 20, "super");
	JoyStickDto joyStickDto3=new JoyStickDto("flexed", 170, 45, "bosche");
	JoyStickDto joyStickDto4=new JoyStickDto("bomb", 150, 5, "super");
	
	List<JoyStickDto> list=new ArrayList<>();
	list.add(joyStickDto);
	list.add(joyStickDto1);
	list.add(joyStickDto2);
	list.add(joyStickDto3);
	list.add(joyStickDto4);
	
	Collections.sort(list);
	for(JoyStickDto ref:list) {
		System.out.println(ref);
	}
}
}
