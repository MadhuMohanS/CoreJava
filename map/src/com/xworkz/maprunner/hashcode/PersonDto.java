package com.xworkz.maprunner.hashcode;

import java.io.Serializable;
import java.util.Objects;

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
public class PersonDto implements Serializable{
    private String name;
    private String email;


    @Override
    public boolean equals(Object o) {
//        System.out.println("running equals in person");
//        if (this == o) return true;
        if (!(o instanceof PersonDto)) return false;
        PersonDto personDTO = (PersonDto) o;
        return Objects.equals(getEmail(), personDTO.getEmail());
    }

    @Override
    public int hashCode() {
//        System.out.println("running hashcode in person");
        return Objects.hash(getEmail());
    }


}
