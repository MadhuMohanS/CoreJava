package com.xworkz.equalscontract;

import java.util.Objects;

import com.xworkz.maprunner.hashcode.PersonDto;

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
public class MovieDto {
private String name;
private String director;
private double duration;

public boolean equals(Object obj) {
//  System.out.println("running equals in person");
//  if (this == o) return true;
	
  if(obj!=null) {
	  MovieDto movie=this;
	  if(obj instanceof MovieDto) {
		  MovieDto movieDto=(MovieDto)obj;
		  if(movie.getName().equals(this.getName())) {
			  return true;
		  }
	  }
  }
  return false;
}
	

public int hashCode() {
//  System.out.println("running hashcode in person");
  return Objects.hash(getName());
}
}
