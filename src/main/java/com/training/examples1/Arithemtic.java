package com.training.examples1;

public class Arithemtic {

	public static void main(String[] args) {
		        int dividend = 24;
		        int divisor = 6;

		        try {
		            int quotient = dividend / divisor;
		            System.out.println("Quotient: " + quotient);
		        } 
		        catch (ArithmeticException e) 
		        {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
	
	}


