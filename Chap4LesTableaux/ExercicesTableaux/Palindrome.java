package Chap4LesTableaux.ExercicesTableaux;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = "";
        char[] wordRightOrder = new char[100];
        char[] wordReverse = new char[100];
        boolean isPalindrome = false;

        System.out.println("Tapez un mot:");
        word = console.nextLine();

        int lengthWord = word.length();

        // Tableau mot à l'endroit
        for (int i = 0; i < lengthWord; i++) {
            wordRightOrder[i] = word.charAt(i);
        }

        System.out.println();

        // Tableau mot à l'envers 
        for (int i = 0; i < lengthWord; i++) {
            wordReverse[(lengthWord -  1) - i] = word.charAt(i);
            if (wordReverse[i] == wordRightOrder[i]) {
                isPalindrome = true;
            }
        }
        
        if (isPalindrome) {
            System.out.println(word + " est un palindrome");
        }
        
     
      
        
        console.close();

       


    }
}
