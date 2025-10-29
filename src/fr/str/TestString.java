package fr.str;
import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		
		// Question 5.1
		
		String fName = "John";
		String lName = "Smith";
		String fullName = fName + " " +  lName;
		
		System.out.println(fullName);
		
		
		String newName = "";
		newName += "\nJohn";
		newName += " ";
		newName += "Doe";
		
		System.out.println(newName);
		
		
		// Question 5.2
		
		String testFindWord = "Il fait beau aujourd'hui";
		String[] testFindArray = testFindWord.split(" ");
		
		for (String word : testFindArray ) {
			if (word.equalsIgnoreCase("beau")) {
				System.out.println("\nLe mot recherché (beau) a été trouvé!");
				continue;		
			}
		}
	
		// Question 5.3
		String textToReplace  = "Il fait beau aujourd'hui";
		System.out.println("Enter a word that will replace (beau): ");
		Scanner scan = new Scanner(System.in);
		String newWord = scan.next();
		
		
		String replacedText = textToReplace.replace("beau", newWord);
		System.out.println(replacedText);
		
		scan.close();
		 
		
	}

}