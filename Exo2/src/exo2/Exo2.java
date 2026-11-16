/*
 * Nom : Bouzid Youcef
 * Groupe : BDML3
 * Rôle : TP0 - Partie 2 (Addition d'entiers)
 * Date : 16/11/2026
 */
package exo2;

import java.util.Scanner;

public class Exo2 {

    public static void main(String[] args) {
        // Declaration des variables
        int nb; // nombre d'entiers a additionner
        int result; // resultat
        int ind; // indice
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        nb = sc.nextInt();
        
        result = 0;
        
        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind++; 
        }
        
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est : " + result);
    }
}
