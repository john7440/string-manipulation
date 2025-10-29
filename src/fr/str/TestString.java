package fr.str;

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
		
		String testFind = "Il fait beau aujourd'hui";
		String[] testFindArray = testFind.split(" ");
		
		for (String word : testFindArray ) {
			if (word.equalsIgnoreCase("beau")) {
				System.out.println("\nLe mot recherché (beau) a été trouvé!");
			}
		}
	
	}

}