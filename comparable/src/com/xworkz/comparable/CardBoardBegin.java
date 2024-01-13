package com.xworkz.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.sorting.CardBoardDto;

public class CardBoardBegin {
public static void main(String[] args) {
	CardBoardDto cardBoardDto=new CardBoardDto("wood", 20, 5, 30);
	CardBoardDto cardBoardDto1=new CardBoardDto("plastic", 30, 8, 40);
	CardBoardDto cardBoardDto2=new CardBoardDto("hard plastic", 10, 5, 35);
	CardBoardDto cardBoardDto3=new CardBoardDto("fiber", 15, 3, 90);
	CardBoardDto cardBoardDto4=new CardBoardDto("wood", 30, 20, 70);
	List<CardBoardDto> list=new ArrayList<>();
	list.add(cardBoardDto);
	list.add(cardBoardDto1);
	list.add(cardBoardDto2);
	list.add(cardBoardDto3);
	list.add(cardBoardDto4);
	
	Collections.sort(list);
	for(CardBoardDto ref:list) {
		System.out.println(ref);
	}
	
}
}
