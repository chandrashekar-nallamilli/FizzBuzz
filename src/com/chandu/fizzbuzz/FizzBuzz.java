package com.chandu.fizzbuzz;


public class FizzBuzz 
{
	public static void main(String[] args)	
	{
		
			for(int i=1; i<=100; i++)
		  {
			  boolean f = i % 3 == 0;
			  boolean g = i % 5 == 0;
			  
			  System.out.println(f ? g ? "FizzBuzz" : "Fizz" : g ? "Buzz"  : i);
		  }
	}
}
