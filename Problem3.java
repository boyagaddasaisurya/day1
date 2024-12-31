package day6;
import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter data");
				String data = sc.nextLine();
				data = data.toUpperCase();
				int[] count = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				char ch = ' ';
				int index;
				for(int i=0;i<data.length();i++) {
					ch = data.charAt(i);
					if(ch >='A' && ch <='Z') {
						index = (int)(ch -65);
						count[index]++;// 'A'  65 % 65
					}
				}
				for(int i=0;i<26;i++) {
					if(count[i] > 0)
					System.out.println("["+(char)(i+65)+"]--->"+count[i]);
				}
			}
}

































import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String input) {
        // LinkedHashSet preserves the insertion order
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        // Add each character of the string to the set
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);  // Adds each character to the set (duplicates are ignored)
        }

        // Build the result string from the set
        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);  // Append each unique character
        }

        return result.toString();  // Convert the StringBuilder to a string and return
    }
}
