package fcu.iecs.oop;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter a float: ");
        float num2 = scanner.nextFloat();
        
        System.out.print("Enter a name: ");
        String name = scanner.next();
        
        System.out.printf("Hello %s, the multiplication of %d and %f is %.2e", name , num1 , num2 , (float) num1 * num2);
	}

}
