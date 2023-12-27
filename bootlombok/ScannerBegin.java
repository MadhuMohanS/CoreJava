package com.xworkz.board;

import java.util.Scanner;
import com.xworkz.board.lombok.*;

public class ScannerBegin{
public static void main(String[] args) throws CloneNotSupportedException {
	System.out.println("starting main in ScannerBegin");
	Scanner1 scanner=new Scanner1();
	Scanner1 scanner1=new Scanner1(300, "cannon", "wire less", "Office");
	System.out.println("Scanner1 :"+scanner1);
	
    Scanner1 ref=(Scanner1)scanner1.clone();
    System.out.println("Cloned :"+ref);
    
    Plastic plastic=new Plastic();
    Plastic plastic2=new Plastic("fibre", "chair", 300, "to made chair");
    System.out.println("plastic:"+plastic2);
    
 
    try {
    System.out.println("Cloned plastic:"+plastic2.clone()); 
    }catch(CloneNotSupportedException e) {
    	System.out.println(e);
    }
    
    Light light=new Light("phillips", "yellow", "0", "round");
    
    System.out.println("Light:"+light);
    
    Light cloned=(Light)light.clone();
    System.out.println("cloned light:"+cloned);
    
    Candle candle=new Candle("fire", 20,150, "usha");
    System.out.println("Candle:"+candle);
    
    Candle cloned1=(Candle)candle.clone();
    System.out.println("Cloned candle:"+cloned1);
    
    System.out.println("ending main in ScannerBegin");
    
    
}
}
