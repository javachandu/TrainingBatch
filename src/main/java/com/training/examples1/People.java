package com.training.examples1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class People {
	
	public static void main(String args[]) {
		
		List<String> names = Arrays.asList("Sharath", "Chandra", "Thadakamalla");
		List<String> places = Arrays.asList("California", "Texas", "Newyork");
		List<Integer> nameLengths = names.stream()
				.map(String::length)
				   .collect(Collectors.toList());
		System.out.println(nameLengths);
		List<Integer> placeLengths = places.stream()
		   .map(String::length)
		   .collect(Collectors.toList());
		System.out.println(placeLengths);

	}

}
