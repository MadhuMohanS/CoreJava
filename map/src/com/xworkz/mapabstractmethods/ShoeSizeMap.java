package com.xworkz.mapabstractmethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoeSizeMap {
	public static void main(String[] args) {
		Map<String, Integer> shoeSizeMap = new HashMap<>();
		shoeSizeMap.put("hashpuppies", 9);
		shoeSizeMap.put("paragon", 7);
		shoeSizeMap.put("gucci", 6);
		shoeSizeMap.put("puma", 5);
		shoeSizeMap.put("woodland", 8);

		System.out.println("----------keys-----------------");

		Set<String> keySet = shoeSizeMap.keySet();
		keySet.forEach(l -> System.out.println(l));

		System.out.println("----------values--------------");

		Collection<Integer> values = shoeSizeMap.values();
		values.forEach(l -> System.out.println(l));

		System.out.println("---------keys and values-------------");

		Set<Map.Entry<String, Integer>> map = shoeSizeMap.entrySet();
		map.forEach(l -> System.out.println(l.getKey() + ":" + l.getValue()));

		System.out.println("contains key");
		System.out.println(shoeSizeMap.containsKey("paragon"));

		System.out.println("contains value");
		System.out.println(shoeSizeMap.containsValue(7));

		System.out.println("get method");
		System.out.println(shoeSizeMap.get("gucci"));

		shoeSizeMap.putIfAbsent("adidas", 10);
		System.out.println("after adding");
		shoeSizeMap.forEach((k, v) -> System.out.println(k + " " + v));

		shoeSizeMap.putIfAbsent("adidas", 10);
		System.out.println("again adding adidas");
		shoeSizeMap.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println("adding null value");
		shoeSizeMap.put("sketches", null);
		shoeSizeMap.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println("remove method");
		shoeSizeMap.remove("paragon");

		System.out.println("after remving paragon");
		shoeSizeMap.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println("replace adidas");
		shoeSizeMap.replace("adidas", 30);
		shoeSizeMap.forEach((k, v) -> System.out.println(k + " " + v));

	}
}
