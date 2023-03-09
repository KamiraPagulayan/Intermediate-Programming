package Attendance;
import java.util.Scanner;

public class recursion {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//asks the user to input a string
		System.out.print("Enter a word: ");
		String input = scan.nextLine();
		System.out.print("Number of vowels: " + cVowels(input));
	}
	
	public static int cVowels(String s) {
		
		//this function will count the number of vowels in the input string
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
		
		    if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'I' || s.charAt(i) == 'i'|| s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'U' || s.charAt(i) == 'u'){
				++count; 
				
            }
        }
		return count;
    }
}
