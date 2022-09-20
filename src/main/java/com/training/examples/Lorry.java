package com.training.examples;

import java.util.Optional;

public class Lorry {

	public static void main(String args[]) {
		    Integer year = 2016;
		    Optional<Integer> yearOptional = Optional.of(year);
		    boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
		    boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
		    
		    System.out.println("is2016 "+is2016);
		    System.out.println("is2017 "+is2017);
		    
		    String nullName = "s";
		    String name = Optional.ofNullable(nullName).orElseThrow(
		      IllegalArgumentException::new);
		    
		    User u = u.orElseThrow(UserDetailsNotFOund::new)
		    
		    System.out.println("name "+name);
		    
		    if() {
		    	
		    }else {
		    	
		    }
	}

}
