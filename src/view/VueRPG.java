package view;

import java.util.List;
import java.util.Scanner;
import model.*;

public class VueRPG {

    static byte choixUser;


    public static Scanner sc = new Scanner(System.in);  // static pour lire du static


    public static void viewUser() {
        System.out.println("Veuillez choisir votre personnage parmi les Guerriers et Soigneurs. ");
        System.out.println("Voici les personnages : "); // afficher liste des soigneurs et liste des guerriers
        System.out.println("1. Je souhaite être un guerrier");
        System.out.println("2. Je souhaite être un soigneur");
        System.out.println("3. Je ne souhaite plus jouer");
        System.out.println("0. Quitter");
        System.out.print(" Faites votre choix : ");

    }
}