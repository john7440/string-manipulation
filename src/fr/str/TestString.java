package fr.str;
import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		
		// Question 5.1
		// First Method for concatenation with + 
		String fName = "John";
		String lName = "Smith";
		String fullName = fName + " " +  lName;
		
		System.out.println(fullName);
		
		// The second method using += in our String variable
		String newName = "";
		newName += "\nJohn";
		newName += " ";
		newName += "Doe";
		
		System.out.println(newName);
		
		// Question 5.2
		// Split the words in testFindWord into a list of words, then we check
		// if there is a match with .equalsIgnoreCase
		String testFindWord = "Il fait beau aujourd'hui";
		String[] testFindArray = testFindWord.split(" ");
		
		for (String word : testFindArray ) {
			if (word.equalsIgnoreCase("beau")) {
				System.out.println("\nLe mot recherché (beau) a été trouvé!");
				continue;		
			}
		}
	
		// Question 5.3
		// We first initialize a new scanner, then prompt the user to put
		// a word he want to replace (beau)
		String textToReplace  = "Il fait beau aujourd'hui";
		System.out.println("Enter a word that will replace (beau): ");
		Scanner scan = new Scanner(System.in);
		String newWord = scan.next();
		
		// then we use the built-in method replace
		String replacedText = textToReplace.replace("beau", newWord);
		System.out.println(replacedText);
		
		scan.close();
		 
	}

}