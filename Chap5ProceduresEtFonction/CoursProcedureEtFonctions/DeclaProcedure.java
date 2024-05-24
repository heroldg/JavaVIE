package Chap5ProceduresEtFonction.CoursProcedureEtFonctions;

public class DeclaProcedure {

    public static void afficheNfois(String t, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        System.out.println();
        afficheNfois("null", 2);
    }
}
