package fr.str;
import java.util.Scanner;

public class Palindrome {
	
	// Question 5.4
	public static boolean isPalindrome(String text){
		
		// We clean the original text, remove spaces and put everything into lower case:
		String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		// We reverse the cleaned text
		String reversedText = new StringBuilder(cleanedText).reverse().toString();
		
		// We compare both text, if they are the same, then the text is a palindrome:
		return cleanedText.equals(reversedText);
	}

	public static void main(String[] args) {
		
		
		System.out.println("Palindrom checking: ");
		Scanner scan = new Scanner(System.in);
		String textToCheck = scan.nextLine();
		
		boolean result = isPalindrome(textToCheck);
		if (result) {
			System.out.println(textToCheck + " is a palindrome!");
		} else {
			System.out.println(textToCheck + " is not a palindrome!");
		}
		
		scan.close();
	}

}
