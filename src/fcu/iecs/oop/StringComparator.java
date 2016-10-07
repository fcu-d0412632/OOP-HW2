package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string 1: ");
        String string1 = scanner.next();
        
        System.out.print("Enter a string 2: ");
        String string2 = scanner.next();
        
        if (string1.equals(string2))
        {
        	System.out.print("The two strings are the same");
        }
        else
        {
        	System.out.print("The two strings are not the same");
        }
	}

}
