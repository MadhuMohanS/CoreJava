package com.xworkz.equalscontract.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.equalscontract.HeroDto;
import com.xworkz.equalscontract.MovieDto;

public class MovieHeroMap {
public static void main(String[] args) {
	HeroDto heroDto=new HeroDto("ranbir", 30, 176);
	MovieDto movieDto=new MovieDto("animal", "vanga", 3);
	HeroDto heroDto1=new HeroDto("ntr", 32, 166);
	MovieDto movieDto1=new MovieDto("devara", "vamshi", 2.5);
	HeroDto heroDto2=new HeroDto("prabhas", 40, 180);
	MovieDto movieDto2=new MovieDto("bahubali", "rajamouli", 2.6);
	HeroDto heroDto3=new HeroDto("dulquer", 36, 176);
	MovieDto movieDto3=new MovieDto("kali", "vignesh", 2.5);
	
	HeroDto heroDto5 = new HeroDto("Tom Cruise", 58, 170);
	HeroDto heroDto6 = new HeroDto("Brad Pitt", 57, 180);

	MovieDto movieDto5 = new MovieDto("Inception", "Christopher Nolan", 4);
	MovieDto movieDto6 = new MovieDto("The Dark Knight", "Christopher Nolan", 5);

	HeroDto heroDto7 = new HeroDto("Emma Stone", 33, 168);
	HeroDto heroDto8 = new HeroDto("Jennifer Lawrence", 31, 165);

	MovieDto movieDto7 = new MovieDto("Interstellar", "Christopher Nolan", 5);
	MovieDto movieDto8 = new MovieDto("Dunkirk", "Christopher Nolan", 4);
	MovieDto movieDto9 = new MovieDto("nanaku prematho", "Christopher Nolan", 4);
	MovieDto movieDto10 = new MovieDto("jai", "Christopher Nolan", 4);

	HeroDto heroDto9 = new HeroDto("Leonardo DiCaprio", 48, 183);
	HeroDto heroDto10 = new HeroDto("Matt Damon", 52, 178);
	
	
	
	Map<MovieDto, HeroDto> movieHeroMap=new HashMap<>();
	movieHeroMap.put(movieDto,heroDto );
	movieHeroMap.put(movieDto1,heroDto1 );
	movieHeroMap.put(movieDto2,heroDto2 );
	movieHeroMap.put(movieDto3,heroDto3 );
	movieHeroMap.put(movieDto5,heroDto5 );
	movieHeroMap.put(movieDto6,heroDto6 );
	movieHeroMap.put(movieDto7,heroDto7 );
	movieHeroMap.put(movieDto8,heroDto8 );
	movieHeroMap.put(movieDto9,heroDto9 );
	movieHeroMap.put(movieDto10,heroDto10 );
	
	HeroDto heroDto4=new HeroDto("dulquer", 36, 176);
	MovieDto movieDto4=new MovieDto("bahubali", "vignesh", 2.5);
	
	movieHeroMap.put(movieDto4,heroDto4 );
	
	
	movieHeroMap.forEach((k,v)-> System.out.println(k +" : "+v));
	
	
}
}
