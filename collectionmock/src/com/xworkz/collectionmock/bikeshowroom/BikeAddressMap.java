package com.xworkz.collectionmock.bikeshowroom;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.collectionmock.filterbooks.BookDto;

public class BikeAddressMap {
public static void main(String[] args) {
	BikeDto bikeDto=new BikeDto("ktm", 577001);
	AddressDto addressDto=new AddressDto("davangere");
	
	BikeDto bikeDto1=new BikeDto("ktm", 577003);
	AddressDto addressDto1=new AddressDto("mysore");
	
	BikeDto bikeDto2=new BikeDto("suzuki", 577005);
	AddressDto addressDto2=new AddressDto("banglore");
	
	BikeDto bikeDto3=new BikeDto("Bmw", 577008);
	AddressDto addressDto3=new AddressDto("banglore");
	
	BikeDto bikeDto4=new BikeDto("hornet", 577009);
	AddressDto addressDto4=new AddressDto("hubli");
	
	Map<AddressDto, BikeDto> bikeaddrMap=new HashMap<>();
	bikeaddrMap.put(addressDto, bikeDto);
	bikeaddrMap.put(addressDto1, bikeDto1);
	bikeaddrMap.put(addressDto2, bikeDto2);
	bikeaddrMap.put(addressDto3, bikeDto3);
	bikeaddrMap.put(addressDto4, bikeDto4);
	
	System.out.println("before remove");
	bikeaddrMap.forEach((k,v)->System.out.println(k+" "+v));
	
	System.out.println("after remove");
	bikeaddrMap.remove(addressDto);
	
	bikeaddrMap.forEach((k,v)->System.out.println(k+" "+v));
	
	System.out.println("find showroom in specific city");
	
	Set<AddressDto> keySet=bikeaddrMap.keySet();
	
   List<AddressDto> showrooms= keySet.stream().filter(l->l.getCity().contains("banglore")).collect(Collectors.toList());
	
   for(AddressDto a:showrooms) {
	   System.out.println(bikeaddrMap.get(a));
   }
   
   Collection<BikeDto> values=bikeaddrMap.values();
   
   System.out.println("find city with pincode");
   
   values.stream().map(l->l.getPincode()).filter(l->l==577003).forEach(l->System.out.println(l));
	
	
}
}
