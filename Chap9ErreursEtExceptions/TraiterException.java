package Chap9ErreursEtExceptions;

import java.util.Scanner;

public class TraiterException {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int val;
        try {
            val = OutilsEception.str2int(s.nextLine());
            System.out.println("C'est bien un nombre entier : " + val);
        } catch (Exception e) {
            System.out.println("La conversion n'est pas possible car " + e.getMessage());
        }
    }


}
