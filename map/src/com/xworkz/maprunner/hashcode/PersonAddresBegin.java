package com.xworkz.maprunner.hashcode;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonAddresBegin {
public static void main(String[] args) {
	 PersonDto personDTO = new PersonDto("Vikas", "vikas@gmail.com");
     PersonDto personDTO1 = new PersonDto("Shivam","shivam@gmail.com");
     PersonDto personDTO2 = new PersonDto("Radha","radha12345@gmail.com");
     PersonDto personDTO3 = new PersonDto("Krishna","krishna12345@gmail.com");
     PersonDto personDTO4 = new PersonDto("Radha","radha5@gmail.com");

     AddressDto addressDTO = new AddressDto(678672876,"BTM");
     AddressDto addressDTO1 = new AddressDto(82789293,"Marathalli");
     AddressDto addressDTO2 = new AddressDto(78253678,"Haveri");
     AddressDto addressDTO3 = new AddressDto(63787389,"Chennasandra");
     AddressDto addressDTO4 = new AddressDto(64738922,"BTM");

     Map<PersonDto,AddressDto> person = new HashMap<>();
     person.put(personDTO,addressDTO);
     person.put(personDTO2,addressDTO2);
     person.put(personDTO3,addressDTO3);
     person.put(personDTO4,addressDTO4);
     person.put(personDTO1,addressDTO1);



     PersonDto personDTO5 = new PersonDto("Karan","krishna12345@gmail.com");
     AddressDto addressDTO5= new AddressDto(64738777,"Majestic");

     System.out.println("Person6 is existing: " +person.containsKey(personDTO5));
     System.out.println();
     person.put(personDTO5,addressDTO5);

     person.forEach((k,v)-> System.out.println(k +" : "+v));

     System.out.println("===================");
     
     person.forEach((k,v)-> System.out.println(k +" : "+v));
//     System.out.println("Printing only Key");
//     Set<PersonDTO> key = person.keySet();
//     key.forEach(System.out::println);

//     System.out.println();
//     System.out.println("Printing only Value");
//     Collection<AddressDTO> value = person.values();
//     value.forEach(System.out::println);

//     System.out.println();
//     System.out.println("Printing both key and value");
//     Set<Map.Entry<PersonDto,AddressDto>> entrySet = person.entrySet();
//     for (Map.Entry<PersonDto,AddressDto> entry : entrySet){
//         PersonDto key1 = entry.getKey();
//         AddressDto value1 = entry.getValue();
//         System.out.println("Person: " + key1 + ", Address: " + value1);
//     }
	
	
}
}
