import java.util.Scanner;


public class PigLatConv {

	public static void main(String[] args) {
		System.out.print("Welcome to The Pig Latin Converter");
		System.out.println();

		//Declaration and Initialization 
		Scanner sc = new Scanner(System.in);
		final String vowels ="aeiouAEIOU";
		String choice = "y";
		String word;
		
		
		while(choice.equalsIgnoreCase("y")) {
			//Ask user for Input
			System.out.print("Enter word: ");
			word = sc.nextLine();
			
			//While if a word length is greater than the cut and it doesn't start with a vowel, the first vowel is place at the beginning of the word 
			String beforeVowel ="";
			int cut = 0;
			while (cut < word.length() && !vowels.contains("" + word.charAt(cut))) {
				beforeVowel += word.charAt(cut);
				cut++;
			}
			
			//Starts words with Vowels
			if (cut == 0)
			{
				cut = 1;
				word += word.charAt(0) + "w";
			}
			
			System.out.println(word.toUpperCase().substring(cut) + beforeVowel.toUpperCase() + "ay".toUpperCase());
			System.out.println();
			
		
		}
	}

}
