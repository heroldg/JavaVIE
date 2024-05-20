package Chap4LesTableaux.ExercicesTableaux;

import java.util.Scanner;

public class MachineAVoter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] tabVote = new int[4];
        String[] candidat = new String[4];
        int vote = 0;
        int nbVotesTotal = 0;

        candidat[0] = "Gerard Duchemin";
        candidat[1] = "Philippe Valmy";
        candidat[2] = "Louis Quinet";
        candidat[3] = "Marcel Follin";
        while (vote != -1) {

            System.out.println("1 - Gerard Duchemin");
            System.out.println("2 - Philippe Valmy");
            System.out.println("3 - Louis Quinet");
            System.out.println("4 - Marcel Follin");
            
            System.out.println();
            System.out.println("faites votre vote:");
            vote = console.nextInt(); 
            if (vote >= 1 && vote <= 4) {
                nbVotesTotal++;
                
                switch (vote) {
                    case 1:
                    tabVote[0] += 1;         
                    break;
                    
                    case 2:
                    
                    tabVote[1] += 1;         
                    break;
                    
                    case 3:
                    tabVote[2] += 1;         
                    
                    break;
                    
                    case 4:
                    
                    tabVote[3] += 1;         
                    break;
                    
                    default:
                    break;
                }
                
            }          
                

        }

        for (int i = 0; i < tabVote.length; i++) {
            
            System.out.println("Pour " + candidat[i] + " le nombre de vote est " +tabVote[i] + " soit " +(  tabVote[i] * 100) /  nbVotesTotal  + "% des votes");
        }

       console.close();

    }
}
