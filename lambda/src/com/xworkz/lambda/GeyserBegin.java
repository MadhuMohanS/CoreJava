package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.lambda.comparator.GeyserDto;
import com.xworkz.lambda.comparator.VentilatorDto;

//private String company;
//private double capacity;
//private double temperature;
//private int cost;
public class GeyserBegin {
	public static void main(String[] args) {
		GeyserDto geyser = new GeyserDto("prestige", 1000, 300, 5000);
		GeyserDto geyser1 = new GeyserDto("kent", 5000, 500, 8000);
		GeyserDto geyser2 = new GeyserDto("whirlpool", 3000, 350, 7000);
		GeyserDto geyser3 = new GeyserDto("butterfly", 1500, 200, 3500);
		GeyserDto geyser4 = new GeyserDto("bajaj", 6000, 700, 9000);

		List<GeyserDto> list = new ArrayList<>();
		list.add(geyser);
		list.add(geyser1);
		list.add(geyser2);
		list.add(geyser3);
		list.add(geyser4);

		System.out.println("============================================");

		Comparator<GeyserDto> companyAsc = (n1, n2) -> {
			return n1.getCompany().compareTo(n2.getCompany());
		};
		Collections.sort(list, companyAsc);
		System.out.println("after sorting company in ascending order");
		for (GeyserDto company : list) {
			System.out.println(company);
		}
		System.out.println("============================================");

		Comparator<GeyserDto> companyDesc = (n1, n2) -> {
			return n2.getCompany().compareTo(n1.getCompany());
		};
		Collections.sort(list, companyDesc);
		System.out.println("after sorting company in descending order");
		for (GeyserDto company : list) {
			System.out.println(company);
		}
		System.out.println("============================================");

		Comparator<GeyserDto> capacityAsc = (n1, n2) -> {
			return Double.compare(n1.getCapacity(), n2.getCapacity());
		};
		Collections.sort(list, capacityAsc);
		System.out.println("after sorting capacity in ascending order");
		for (GeyserDto capacity : list) {
			System.out.println(capacity);
		}
		System.out.println("============================================");

		Comparator<GeyserDto> capacityDesc = (n1, n2) -> {
			return Double.compare(n2.getCapacity(), n1.getCapacity());
		};
		Collections.sort(list, capacityDesc);
		System.out.println("after sorting capacity in ascending order");
		for (GeyserDto capacity : list) {
			System.out.println(capacity);
		}
		System.out.println("============================================");

		Comparator<GeyserDto> temperatureAsc = (n1, n2) -> {
			return Double.compare(n1.getTemperature(), n2.getTemperature());
		};
		Collections.sort(list, temperatureAsc);
		System.out.println("after sorting temperature in ascending order");
		for (GeyserDto temperature : list) {
			System.out.println(temperature);
		}
		System.out.println("============================================");

		Comparator<GeyserDto> temperatureDesc = (n1, n2) -> {
			return Double.compare(n2.getTemperature(), n1.getTemperature());
		};
		Collections.sort(list, temperatureDesc);
		System.out.println("after sorting temperature in ascending order");
		for (GeyserDto temperature : list) {
			System.out.println(temperature);
		}
		System.out.println("============================================");

		Comparator<GeyserDto> costAsc = (n1, n2) -> {
			return Integer.compare(n1.getCost(), n2.getCost());
		};
		Collections.sort(list, costAsc);
		System.out.println("after sorting cost in ascending order");
		for (GeyserDto cost : list) {
			System.out.println(cost);
		}
		System.out.println("============================================");

		Comparator<GeyserDto> costDesc = (n1, n2) -> {
			return Integer.compare(n2.getCost(), n1.getCost());
		};
		Collections.sort(list, costDesc);
		System.out.println("after sorting cost in descending order");
		for (GeyserDto cost : list) {
			System.out.println(cost);
		}
	}
}
