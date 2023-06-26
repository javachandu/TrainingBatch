package com.training.examples1;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		boolean isPrime = true; 
		
		if (a <=1) {
			isPrime = false;
		}
		else 
		{
			for (int i = 2; i<= Math.sqrt(a); i++)
			{
				if (a% i ==0)
				{
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime
				) {
			System.out.println(a + "\nIt is a prime number");
		}
		else 
		{ 
			System.out.println(a+ "\nIt is not a prime number");
		}
		
		}
	}

