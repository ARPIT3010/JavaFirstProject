package com.sapient.week1;

public class CheckEven {

	static boolean check(int n)
	{
		if(n%2 == 0)
			return true;
		else
			return false;
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {

		System.out.println ("Hello!");
                int x = 6;
	        boolean result = check(x);

		if(result == true)
			  System.out.println ("Number is even");
		else
			  System.out.println ("Number is Odd!"); 
	   
    }
}