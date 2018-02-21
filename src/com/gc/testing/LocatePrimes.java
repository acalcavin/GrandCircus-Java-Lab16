package com.gc.testing;

import java.util.ArrayList;
import java.util.Scanner;

public class LocatePrimes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String cont = "y";
		
		System.out.println("Let's locate some primes!\n\nThis application will find you any prime, in order, from first prime number on.");

		while (cont.equalsIgnoreCase("y")) {
			
		int userChoice = getInt(scan, "Which prime number are you looking for?");
		
		System.out.println("\nThe number " + userChoice + " prime is " + returnPrime(userChoice) + ".");
		
		System.out.println("\nDo you want to find another prime number? (y/n): ");
		cont = scan.next();
		}
		
		System.out.println("\nGoodbye!");
		
		scan.close();
	}
	
	// method to prompt, validate, return int
	public static int getInt(Scanner sc, String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

	// method to take in position, build array of primes to that position, return prime at that position
	public static int returnPrime(int position) {
		
		ArrayList<Integer> primesArrayList = new ArrayList<Integer>(1);
				
		for (int i = 1; primesArrayList.size() <= position; i++) { //set condition to stop when ArrayList at position is not empty?
			
			boolean result = checkIfPrime(i);
			if (result == true) {
				// add prime to arrayList, convert int to Integer object
				primesArrayList.add(new Integer(i));
			} // else do nothing, repeat for next i
			
		}
		return primesArrayList.get(position-1);
	}

	// method to check if prime
	public static boolean checkIfPrime(int val) {

		boolean result = true;
		if (val == 1) {
			result = false;
		} else if (val % 2 == 0) {
			if (val == 2) {
				result = true;
			} else {
				result = false;
			}
		} else if (val % 3 == 0) {
			if (val == 3) {
				result = true;
			} else {
				result = false;
			}
		} else if (val % 5 == 0) {
			if (val == 5) {
				result = true;
			} else {
				result = false;
			}
		} else if (val % 7 == 0) {
			if (val == 7) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;

	}

}
