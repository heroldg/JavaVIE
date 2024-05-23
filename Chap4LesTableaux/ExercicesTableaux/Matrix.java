package Chap4LesTableaux.ExercicesTableaux;

import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Random random = new Random();
        char[][] matrixChar = new char[20][30];
        for (int i = 0; i < matrixChar.length; i++) {
            System.out.print(i + 1);
            System.out.println();
            for (int j = 0; j < matrixChar.length; j++) {
                // Permet de prendre des lettres aléatoire en 'a' et 
                char aleatChar = (char)(random.nextInt(26)+ 97);
                System.out.print(aleatChar);
            }
            System.out.println();
        }
    }
}
