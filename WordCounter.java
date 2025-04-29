import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // Trim and split the string by one or more spaces
        String[] words = input.trim().split("\\s+");

        int wordCount = (input.trim().isEmpty()) ? 0 : words.length;

        System.out.println("Total number of words: " + wordCount);

        sc.close();
    }
}
