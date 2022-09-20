package com.training.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class StreamsAPI {

	public static void main(String args[]) {
		
		
		Optional<Integer> optional = Optional.of(25);
			System.out.println("optional "+optional.isPresent());
			
		List<Integer> nums = new ArrayList<>();
		nums.add(85);//0
		nums.add(2);//1
		nums.add(3);//2
		nums.add(4);//3
		nums.add(null);//4
		nums.add(6);//5
		
		//System.out.println(nums);
		//before java 8
		for(int i=0; i<nums.size();i++) {
			Integer num = nums.get(i);//we have to store some where performance degrade its more interms of memory
			
			System.out.println(num.hashCode());
			}
		}
		
		//any collections we iterate through for loop .forEach loop, iterator
		//iterator
		

}
