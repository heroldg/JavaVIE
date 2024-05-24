package Chap5ProceduresEtFonction.CoursProcedureEtFonctions;

public class TestConstantes {
    public static final int GLOBALE = 42;

    public static void main(String[] args) {
        final int LOCAL = -77;
        System.out.println("il est possible d'accéder à la constante GLOBALE : " + GLOBALE + " et la constance LOCAL" + LOCAL);

    }

    public static void proc() {
        System.out.println("Il est possible d'acceder à la constante GLOBALE: " + GLOBALE + " mais pas la constante LOCAL");
    }
}
