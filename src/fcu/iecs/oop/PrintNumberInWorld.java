package fcu.iecs.oop;

import java.util.Scanner;

public class PrintNumberInWorld {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		
		int num = scanner.nextInt();
		
		switch(num) { 
        case 1: 
            System.out.println("One"); 
            break; 
        case 2: 
            System.out.println("Two"); 
            break; 
        case 3: 
            System.out.println("Three"); 
            break; 
        case 4: 
            System.out.println("Four"); 
            break; 
        case 5: 
            System.out.println("Five"); 
            break; 
        case 6: 
            System.out.println("Six"); 
            break; 
        case 7: 
            System.out.println("Seven"); 
            break; 
        case 8: 
            System.out.println("eight"); 
            break; 
        case 9: 
            System.out.println("nine"); 
            break; 
        default: 
            System.out.println("Other"); 
    }
	}

}
