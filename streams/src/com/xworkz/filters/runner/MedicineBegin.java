package com.xworkz.filters.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.filters.MedicineDto;

public class MedicineBegin {
	public static void main(String[] args) {
		String[] ingredients = { "Paracetamol", "Microcrystalline cellulose", "Pregelatinized starch", "Povidone",
				"Starch", "Starch", "Starch" };
		MedicineDto medinDto = new MedicineDto("dolo650", 101, "dolo", LocalDate.of(2024, 1, 13),
				LocalDate.of(2024, 2, 20), 10, ingredients);

		String[] panadolIngredients = { "Paracetamol", "Microcrystalline cellulose", "Pregelatinized starch",
				"Povidone", "Starch" };
		MedicineDto medinDto2 = new MedicineDto("panadol", 102, "paracetamol", LocalDate.of(2024, 2, 10),
				LocalDate.of(2024, 2, 20), 15, panadolIngredients);

		String[] ibuprofenIngredients = { "Ibuprofen", "Croscarmellose Sodium", "Colloidal Silicon Dioxide",
				"Microcrystalline Cellulose", "Stearic Acid" };
		MedicineDto medinDto3 = new MedicineDto("ibuprofen", 103, "ibuprofen", LocalDate.of(2023, 7, 10),
				LocalDate.of(2024, 7, 10), 20, ibuprofenIngredients);

		String[] aspiriningredients = { "Acetylsalicylic acid", "Corn starch", "Lactose", "Calcium carbonate",
				"Tricalcium phosphate" };
		MedicineDto medinDto4 = new MedicineDto("aspirin", 104, "aspirin", LocalDate.of(2023, 8, 15),
				LocalDate.of(2024, 8, 15), 25, aspiriningredients);

		String[] tylenolingredients = { "Acetaminophen", "Pregelatinized starch", "Corn starch", "Stearic acid",
				"Povidone" };
		MedicineDto medinDto5 = new MedicineDto("tylenol", 105, "acetaminophen", LocalDate.of(2023, 9, 25),
				LocalDate.of(2024, 9, 25), 30, tylenolingredients);

		String[] advilingredients = { "Ibuprofen", "Colloidal silicon dioxide", "Croscarmellose sodium",
				"FD&C red no. 40 aluminum lake", "Hypromellose" };
		MedicineDto medinDto21 = new MedicineDto("advil", 106, "ibuprofen", LocalDate.of(2023, 10, 5),
				LocalDate.of(2024, 10, 5), 35, advilingredients);

		String[] naproxeningredients = { "Naproxen", "Microcrystalline cellulose", "Pregelatinized starch",
				"Croscarmellose sodium", "Magnesium stearate" };
		MedicineDto medinDto6 = new MedicineDto("naproxen", 107, "naproxen", LocalDate.of(2023, 11, 15),
				LocalDate.of(2024, 11, 15), 40, naproxeningredients);

		String[] zyrtecingredients = { "Cetirizine", "Lactose monohydrate", "Microcrystalline cellulose",
				"Colloidal anhydrous silica", "Magnesium stearate" };
		MedicineDto medinDto7 = new MedicineDto("zyrtec", 108, "cetirizine", LocalDate.of(2023, 12, 25),
				LocalDate.of(2024, 12, 25), 45, zyrtecingredients);

		String[] benadrylingredients = { "Diphenhydramine", "Cellulose", "Magnesium stearate", "Sodium citrate",
				"Lactose" };
		MedicineDto medinDto8 = new MedicineDto("benadryl", 109, "diphenhydramine", LocalDate.of(2024, 1, 5),
				LocalDate.of(2025, 1, 5), 50, benadrylingredients);

		String[] claritinIngredients = { "Loratadine", "Calcium phosphate", "Lactose monohydrate", "Maize starch",
				"Magnesium stearate" };
		MedicineDto medinDto9 = new MedicineDto("claritin", 110, "loratadine", LocalDate.of(2024, 2, 15),
				LocalDate.of(2025, 2, 15), 55, claritinIngredients);

		String[] peptoingredients = { "Bismuth subsalicylate", "Calcium carbonate", "Magnesium carbonate", "Kaolin",
				"Povidone" };

		MedicineDto medinDto10 = new MedicineDto("pepto-bismol", 111, "bismuth subsalicylate",
				LocalDate.of(2024, 3, 25), LocalDate.of(2025, 3, 25), 60, peptoingredients);

		MedicineDto medinDto11 = new MedicineDto("motrin", 112, "ibuprofen", LocalDate.of(2023, 4, 10),
				LocalDate.of(2024, 4, 10), 40, ingredients);

		MedicineDto medinDto12 = new MedicineDto("aleve", 113, "naproxen", LocalDate.of(2023, 5, 20),
				LocalDate.of(2024, 5, 20), 45, ingredients);
	

		MedicineDto medinDto13 = new MedicineDto("cetirizine", 114, "cetirizine", LocalDate.of(2023, 6, 30),
				LocalDate.of(2024, 6, 30), 50, ingredients);

		MedicineDto medinDto14 = new MedicineDto("dramamine", 115, "dimenhydrinate", LocalDate.of(2023, 7, 10),
				LocalDate.of(2024, 7, 10), 55, ingredients);

		MedicineDto medinDto15 = new MedicineDto("zyrtec-d", 116, "cetirizine and pseudoephedrine",
				LocalDate.of(2023, 8, 15), LocalDate.of(2024, 8, 15), 60, ingredients);

		MedicineDto medinDto16 = new MedicineDto("tylenol pm", 117, "acetaminophen and diphenhydramine",
				LocalDate.of(2023, 9, 25), LocalDate.of(2024, 9, 25), 65, ingredients);

		MedicineDto medinDto17 = new MedicineDto("allegra", 118, "fexofenadine", LocalDate.of(2023, 10, 5),
				LocalDate.of(2024, 10, 5), 70, ingredients);

		MedicineDto medinDto18 = new MedicineDto("zantac", 119, "ranitidine", LocalDate.of(2023, 11, 15),
				LocalDate.of(2024, 11, 15), 75, ingredients);

		MedicineDto medinDto19 = new MedicineDto("pepcid", 120, "famotidine", LocalDate.of(2023, 12, 25),
				LocalDate.of(2024, 12, 25), 80, ingredients);

		MedicineDto medinDto20 = new MedicineDto("tagamet", 121, "cimetidine", LocalDate.of(2024, 1, 5),
				LocalDate.of(2025, 1, 5), 85, ingredients);

		List<MedicineDto> list = new ArrayList<>();
		list.add(medinDto);
		list.add(medinDto4);
		list.add(medinDto2);
		list.add(medinDto3);
		list.add(medinDto6);
		list.add(medinDto5);
		list.add(medinDto21);

		System.out.println("sort all medicine by company name");
		Collections.sort(list);
		list.forEach(l -> System.out.println(l));
		System.out.println("========================================");

		System.out.println("sort all by expiry date desc");
		list.stream().sorted((e1, e2) -> e2.getExpiryDate().compareTo(e1.getExpiryDate()))
				.forEach(l -> System.out.println(l));

		System.out.println("===============================");
		System.out.println("sort all by cost ascending order");
		list.stream().sorted((c1, c2) -> Double.compare(c1.getCost(), c2.getCost()))
				.forEach(l -> System.out.println(l));

		System.out.println("===============================");
		System.out.println("collect all elements where ingredients greater than 5");
		List<MedicineDto> list1 = list.stream().filter(l -> l.getIngredient().length > 5).collect(Collectors.toList());

		list1.forEach(l -> System.out.println(l));

		System.out.println("===================================");

		System.out.println("collect only ingredients");

		List<String[]> list2 = list.stream().map(MedicineDto::getIngredient).collect(Collectors.toList());

		list2.forEach(list4 -> {
			for (String i : list4) {
				System.out.println(i);
			}
		});

		System.out.println("==============================================");

		System.out.println("collect only company sort by descending order");
		List<String> companydesc = list.stream().map(MedicineDto::getCompany).collect(Collectors.toList());

		companydesc.stream().sorted(Collections.reverseOrder()).forEach(l -> System.out.println(l.toUpperCase()));

		System.out.println("==============================================");
		System.out.println("collect only name in lower case and sort in descending order ");

		list.stream().map(MedicineDto::getName).map(String::toLowerCase).sorted(Collections.reverseOrder())
				.forEach(l -> System.out.println(l));

		System.out.println("==============================================");
		System.out.println("collect all manufacture date less than 30 days");

		list.stream().filter(l -> l.getManfDate().isBefore(LocalDate.now())).forEach(l -> System.out.println(l));

		System.out.println("==============================================");
		System.out.println("collect all expiry date less than 30 days");

		list.stream().filter(l -> l.getExpiryDate().isBefore(LocalDate.now())).forEach(l -> System.out.println(l));

		System.out.println("==============================================");
		System.out.println("collect all manufacture date greater than 30 days");

		list.stream().filter(l -> l.getManfDate().isAfter(LocalDate.now())).forEach(l -> System.out.println(l));

	}
}
