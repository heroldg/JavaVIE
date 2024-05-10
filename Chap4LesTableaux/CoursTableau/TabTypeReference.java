package Chap4LesTableaux.CoursTableau;

public class TabTypeReference {
    // Il faut retenir que lorsqu'une affectation est effectué pour un tableau cela ne produit pas une copie du tableau mais les deux variables de type tableau référencent les mêmes cases du tableau. Une modification par l'un ou l'autre des variables de type modifie le même tableau. Ce n'est donc ps le tableau qui a été dupliqué mais le moyend'y accéder qui a été dupliqué. 

    public static void main(String[] args) {
        
        // Algo TableauTypeReference
        final int TAILlE = 4;
        int[] t1 = new int[TAILlE];
        int[] t2;
        int j;
     
        for (j = 0; j < TAILlE - 1; j++) {
            t1[j] = j + 1;
        }

        t2 = t1;
        t2[2] = 9;
        t1[0] = 6;
        System.out.println();
        System.out.println("TABLEAU DE RÉFÉRENCE");
        System.out.println();
        for (int i = 0; i < TAILlE - 1; i++) {
            System.out.println("t1[" + i + "] = " + t1[i] + " - t2[" + i + "] = " + t2[i]);
        } 
        
        // Algo CopieTableau

        // Si vous souhaitez avoir une copie d'un tableau, il est nécesssaire de créer un nouveau tableau de même taille et de recopier l'ensemble des valeurs dans ce nouveau tableau
        final int TAILLE = 4;
        int[] T1 = new int[TAILLE];
        int[] T2 =  new int[TAILLE]; 
        int i;
     
        for (i = 0; i < TAILLE - 1; i++) {
            T1[i] = i + 1;
        }

        // Ici à lieu une copie du tableau
        for (int k = 0; k < TAILLE; k++) {
            T2[i] = T1[i];
        }
        T2[2] = 9;
        T1[0] = 6;
        System.out.println();
        System.out.println("TABLEAU DE RÉFÉRENCE");
        System.out.println();
        for (i = 0; i < TAILLE - 1; i++) {
            System.out.println("T1[" + i + "] = " + T1[i] + " - T2[" + i + "] = " + t2[i]);
        } 
        
        
    }
        
}
