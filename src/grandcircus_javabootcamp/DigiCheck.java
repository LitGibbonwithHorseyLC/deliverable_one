/* ***LAB INCOMPLETE***
 * 
 *  
 *  LAB 1 PART 1: Write a Java Console program to perform the following task:
 * 
 * Input: Your program should read two integer numbers from the user with the
 * same number of digits (example: number1= 234, number2 = 564).
 * 
 * Task: Check if each corresponding place in the two numbers (ones, tens,
 * hundreds, ...) sums to the same total.
 * 
 * Output: Your program should print out: True or False based on the result.
 * 
 * Examples: Number1 = 153 , Number2 = 345 => 1+3 ≠ 5+4 ≠ 3+5 Program prints
 * False. Number1 = 543 , Number2 = 456 => 5+4 = 4+5 = 3+6 Program prints True.
 * 
 * Things to look for:
 *  - Do proper validation on the user’s input.
 *  - Write the task in a separate method.
 *  - Provide adequate comments.
 *  - Provide adequate user prompts. */
package grandcircus_javabootcamp;

import java.util.Scanner;

public class DigiCheck {
	public static void main(String[] args) {

		// Create scanner object.
		Scanner input = new Scanner(System.in);

		int userNum1 = 0; // 1st user integer input
		int userNum2 = 0; // 2nd user integer input
		boolean isInteger;

		do {
			// Output the prompt.
			System.out.println("Enter 3 digit number between 100 and 999: [Example:'123'] ");
			// Wait for the user to enter a line of text.
			// If user inputs invalid integers, .hasNextInt verifies.
			if (input.hasNextInt()) { // FIXME && (userNum1 >= 100 && userNum1 < 1000)) { // <- bad code, is still
										// allowing integers below 100.
				userNum1 = input.nextInt();
				isInteger = true;
			} else {
				System.out.println("Invalid input, number between 100 and 999: [Example:'321'] ");
				isInteger = false;
				input.next(); // clears undesirable input from scanner.
			}
		} while (!(isInteger));
		// Output the prompt.
		System.out.println("Enter 3 more digits, number between 100 and 999: [Example:'789'] ");

		// Wait for the user to enter the next line of text.
		userNum2 = input.nextInt();

		// Tell them what they entered.
		System.out.println("You've entered: " + userNum1 + " and " + userNum2 + ".");
	}
}