/*
 * Nom : Bouzid Youcef
 * Groupe : BDML3
 * Rôle : TP0 - Partie 1 (Affichage d'un message)
 * Date : 16/11/2026
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author youyo
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prenom;
        Scanner sc = new Scanner (System.in);
        System.out.println("Bonjour quel est votre prenom ?");
        prenom = sc.nextLine();
        
        System.out.println("Bonjour "+ prenom +"!");
        System.out.println("Au revoir "+prenom + "!");
    }
    
}
