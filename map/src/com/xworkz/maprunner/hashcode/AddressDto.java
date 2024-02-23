package com.xworkz.maprunner.hashcode;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressDto implements Serializable{
	private  long pincode;
    private  String Street;

    public int compareTo(AddressDto o) {
        return 0;
    }
}
