package Condition.ExerciceCondition;

import java.util.Scanner;

public class BulletinDePaie {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String prenom = "" ;
        String nom = "";
        String statut ="";
        int nbHeureTravaillees = 0;
        int nbEnfants = 0;
        double tauxHoraire, salaireBrut;
        

        System.out.println("Nom de la personne ?");
        nom = console.nextLine();
        
        System.out.println("Prénom de la personne ?");
        prenom = console.nextLine();
        
        System.out.print("Statut ? \n 1 - Agent de service \n 2 - Employé de bureau \n 3 - Cadre \n");
        int choixStatut = console.nextInt();

        switch (choixStatut) {
            case 1:
                statut = "Agent de service";
                break;
        
            case 2:
                statut = "Employé de bureau";
                break;
        
            case 3:
                statut = "Cadre";
                break;
        
            default:
                break;
        }

        System.out.println("Nombre d'heure travaillées ?");
        nbHeureTravaillees = console.nextInt();
        
        System.out.println("Taux horaire ?");
        tauxHoraire = console.nextDouble();

        System.out.println("Nombre d'enfants ?");
        nbEnfants = console.nextInt();

        int heureNormal = 0;
        int heureSupp60 = 0;
        int heureSupp50 = 0;

        for (int i = 0; i < nbHeureTravaillees; i++) {
            if (i < 169) {
                heureNormal++;
            }

            if (i > 169 && i <= 180) {
                heureSupp50++;
            }

            if (i >= 180) {
                heureSupp60++;
            }
        }

        double salaireHeureNormal = heureNormal * tauxHoraire;
        double salaireHeureSupp50 = heureSupp50 * (tauxHoraire * 1.50);
        double salaireHeureSupp60 = heureSupp60 * (tauxHoraire * 1.60);

        
        salaireBrut = salaireHeureNormal + salaireHeureSupp50 + salaireHeureSupp60;
        
        System.out.println("Bulletin de " + prenom + " " + nom);
        System.out.println("Statut: " + statut );
        System.out.println("Salaire brut: " + salaireBrut + "| heure normal:" + heureNormal + "| heure supp 50:  " + heureSupp50 + "| heure supp 60: " + heureSupp60 );
        System.out.println("Nombre d'enfants: " + nbEnfants  );
        System.out.println();
        System.out.println("Calcul des cotisations:");
        System.out.println();
        
        
        double contributionDetteSocialeEtSocialeGeneralImposable = salaireBrut * 0.0349;
        double contributionSocialeGeneralNonImposable = salaireBrut * 0.0615;
        double assuranceMaladie = salaireBrut * 0.0095;
        double assuranceVieillesse = salaireBrut * 0.0844;
        double assuranceChomage = salaireBrut * 0.0305;
        double retraiteComplementaire = salaireBrut * 0.0381;
        double cotisationAGFF = salaireBrut * 0.0102;

        double totalCotisationSalariales =
                                            contributionDetteSocialeEtSocialeGeneralImposable +
                                            contributionSocialeGeneralNonImposable +
                                            assuranceMaladie +
                                            assuranceVieillesse +
                                            assuranceChomage +
                                            retraiteComplementaire +
                                            cotisationAGFF ;

        double salaireNet = salaireBrut - totalCotisationSalariales;

        int primefamiale = (nbEnfants > 0) ? 110 : 0;

        double salaireNetAPayer = salaireNet + primefamiale;

        System.out.println("- Contribution pour le remboursement de la dette sociale et contribution sociale généralisée imposable");
        System.out.println( salaireBrut + " x 3,49 % = " + contributionDetteSocialeEtSocialeGeneralImposable);
        System.out.println("- Contribution sociale généralisée non imposable");
        System.out.println(salaireBrut +  " x " + contributionSocialeGeneralNonImposable);
        System.out.println("- Assurance Maladie");
        System.out.println(salaireBrut +  " x " + assuranceMaladie);
        System.out.println("- Assurance Vieillesse");
        System.out.println(salaireBrut + " x " + assuranceVieillesse);
        System.out.println("- Assurance chômage");
        System.out.println(salaireBrut + " x " + assuranceChomage);
        System.out.println("- Retraite complémentaire (IRCEM)");
        System.out.println(salaireBrut +  " x " + retraiteComplementaire);
        System.out.println("- Cotisation AGFF");
        System.out.println(salaireBrut + " x " + cotisationAGFF);
        System.out.println("Total des cotisations salariales: " + totalCotisationSalariales );
        System.out.println("Salaire net: " + salaireNet );
        System.out.println("Prime familiale:" + primefamiale);
        System.out.println("Salaire net à payer: " + salaireNetAPayer);

        


        // System.out.printf("Bulletin de %s %s %n  Statut: %s %n Salaire brut: %f (%d h sans majoration, %d h avec une majoration de 50 % , %d avec une majoration de 60 %) %n Nombre d'enfant: %d", prenom , nom, statut , salaireBrut, heureNormal, heureSupp50, heureSupp60, nbEnfants);

        

console.close();
    }
}
