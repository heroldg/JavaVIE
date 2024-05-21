package Chap4LesTableaux.CoursTableau.CorrectionExo;

import java.util.Scanner;

public class PalindromeCorrection  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie du mot
        System.out.print("Entrez un mot: ");
        String word = scanner.nextLine();

        // Vérification si le mot est un palindrome
        if (isPalindrome(word)) {
            System.out.println(word + " est un palindrome");
        } else {
            System.out.println(word + " n'est pas un palindrome");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
