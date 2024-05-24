package Chap5ProceduresEtFonction.CoursProcedureEtFonctions;

import java.util.Scanner;

public class FonctionRecursive {
    // Demande à l'utilisateur le texte à copier et le nombre de fois qu'il faut le copier
    
    // Dans l'algorithme principal, cette procédure est appelée une première fois avec en paramètres la phrase à afficher et le nombre de fois qu'elle doit l'être. Supposons que cette valeur saisie par l'utilisateur vaille 3. La procédure afficheNFois() commence fonc par l'éxecuter une premiere fois. Elle affiche une première fois le message. Ensuite, la condition est testée : nbfois valant 3, elle est vraie. La procédure afficherNfois() est donc appelée une seconde fois. Le message est donc affiché une deuxième fois. À nouveau, la condition est testée, et comme nbFois vaut 2, elle est encore vraie. La procédure est donc appelée et affiche une troisième fois le message. Comme nbFois vaut 1, certe fois-ci la condistion est fausse. La procédure n'est donc pas appelée. ce troisieme appel à la procédure se termine égaelement et rend la main au premier appel à cette procédure qui prend aussi fin. L'éxecution se poursuit donc dans l'algorithme principal et celui-ci se termine également. Au final, le message a bien été affiché trois fois et l'algorthme a bien pris fin. 
    
    public static void main(String[] args) {
        int nbFois;
        String phrase;
        Scanner console = new Scanner(System.in);
        System.out.println("Quelle phrase avez-vous à copier comme punition ?");
        phrase = console.nextLine();
        System.out.println("Combien de fois avez-vous eu à la copier ?");
        nbFois = console.nextInt();
        afficherNfois(phrase, nbFois);
        console.close();

    }

    // La procédure afficherNfois() est bien récursive puisque parmi ses instructions, elle s'appelle elle-même. L'idée de cette procédure est de dire que pour afficher n fois un message, il faut une foisn puis qu'il reste encore à l'afficher n fois. Et pour cela, il faut refaire le même traitement, donc appeler la même procédure pour afficher n-1 fois le message.
    
    
    public static void afficherNfois(String t, int nbFois) {
        System.out.println(t);
        if (nbFois - 1 > 0) {
            afficherNfois(t, nbFois - 1);
        }
    }
}
