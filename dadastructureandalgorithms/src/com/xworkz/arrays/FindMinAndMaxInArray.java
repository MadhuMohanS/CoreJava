package com.xworkz.arrays;

public class FindMinAndMaxInArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	int max = Integer.MIN_VALUE;
  int min = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min)
			min=arr[i];
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max)
			max=arr[i];
	}
	System.out.println("min:"+min+" max:"+max);
}
}
//import java.util.*;
//
//
//public class FindMinAndMaxInArray {
//   public static void main(String args[]) {
//      Scanner sc = new Scanner(System.in);
//      int size = sc.nextInt();
//      int numbers[] = new int[size];
//
//
//      //input
//      for(int i=0; i<size; i++) {
//          numbers[i] = sc.nextInt();
//      }
//
//
//      int max = Integer.MIN_VALUE;
//      int min = Integer.MAX_VALUE;
//     
//       for(int i=0; i<numbers.length; i++) {
//           if(numbers[i] < min) {
//               min = numbers[i];
//           }
//           if(numbers[i] > max) {
//               max = numbers[i];
//           }
//       }
//       System.out.println("min:"+min+" max:"+max);
//   }
//}

