package Base;

public class Caractere {

    public static void main(String[] args) {
        int valeur = 1492;
    String nom = "Christophe Colomb";
    double finesseGravure = 0.0000001;
    System.out.println("LETTRE        |   SIGNIFICATION");
    System.out.println("s             |   chaîne de caractères");
    System.out.println("f             |   un nombre à virgule");
    System.out.println("e             |   un nombre à virgule en notation scientifique");
    System.out.println("n             |   un retour à laligne");
    System.out.println();
    System.out.printf("L'amerique a été découvert en %d par %s%n", valeur, nom);
    System.out.printf("La valeur %d équivaut à %X en base 16%n", valeur, valeur);
    System.out.printf("Pi vaut %f%n",  Math.PI);
    System.out.printf("La finesse de gravure des processus est de %e m%n", finesseGravure);

    }

}
