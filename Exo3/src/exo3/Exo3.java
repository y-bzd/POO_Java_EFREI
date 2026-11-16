/*
 * Nom : Bouzid Youcef
 * Groupe : BDML3
 * Rôle : TP0 - Partie 3 (Calculatrice)
 * Date : 16/11/2026
 */
package exo3;

import java.util.Scanner;

public class Exo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ex 2 
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // Ex 3 
        int operateur = sc.nextInt();

        // Ex 7/8
        if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : operateur invalide (choisir entre 1 et 5).");
            System.exit(0);
        }

        // Ex 4 et 5
        System.out.println("Please enter the first number:");
        double operande1 = sc.nextDouble();

        System.out.println("Please enter the second number:");
        double operande2 = sc.nextDouble();

        // Ex6
        double resultat = 0;

        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                // Sécurité pour empêcher le plantage (division par zéro)
                if (operande2 == 0) {
                    System.out.println("Erreur : division par zero impossible.");
                    System.exit(0);
                }
                resultat = operande1 / operande2;
                break;
            case 5:
                if (operande2 == 0) {
                    System.out.println("Erreur : modulo par zero impossible.");
                    System.exit(0);
                }
                resultat = operande1 % operande2;
                break;
        }

        System.out.println("The result is: " + resultat);
    }
}
