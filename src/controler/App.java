package controler;

import model.*;

import java.time.LocalDateTime;

import static view.VueRPG.sc;
import static view.VueRPG.viewUser;


public class App {
    public static void main(String[] args) {
        System.out.println(" Hello World ! ");

        
        viewUser ();

        byte choix ;
        choix = sc.nextByte();

            switch (choix) {
                case 1:
                    System.out.println("*** Vous souhaitez être un guerrier. ***");
                    System.out.println(" Quel guerrier voulez vous incarner ? "); // list guerriers avec imbrication de choix entre les trois profils en toString
                    break;
                    case 2:
                        System.out.println("*** Vous souhaitez être un soigneur. ***");// list soigneurs avec imbrication de choix entre les trois profils en toString
                        break;
                        case 3:
                            System.out.println(" :( Vous ne souhaitez plus jouer... merci de votre visite. ");
                            break;
                            default:
                                System.out.println("Merci de votre visite, à bientôt. ");

            }



        //Personnages personnages1 = new Personnages ("Java", "HUMAIN", "leger", "1", 100);
        //Personnages personnages2 = new Personnages ("Pitch", "ORQUE", "lourd", "1", 100);


        //System.out.println(Arrays.toString(getPersonnages().toArray()));

        //System.out.println(personnages1.toString());
        //System.out.println(personnages2.toString());


        Guerriers guerrier1 = new Guerriers ("Gaetan", "HUMAIN", "léger", "1", 100,80);
        Guerriers guerrier2 = new Guerriers ("Georgina", "ORQUE", "lourd", "2", 100,95);
        Guerriers guerrier3 = new Guerriers ("Ginette", "GNOME", "léger", "3", 100,75);






        Soigneurs soigneur1 = new Soigneurs ("Sylvie", "ORQUE", "lourd", "2", 100,75);
        Soigneurs soigneur2 = new Soigneurs ("Souleman", "HUMAIN", "léger", "1", 100,95);
        Soigneurs soigneur3 = new Soigneurs("Samantha", "GNOME", "léger", "3", 100,80);



        System.out.println("********************************");  //veut faire une methode dans VueRPG guildGuerrier - mais guerrier1connu
        System.out.println(" Les GUERRIERS : ");
        System.out.println("********************************");

        System.out.print(guerrier1.toString());
        System.out.println(" : tapez 1 \n ou ");
        System.out.print(guerrier2.toString());
        System.out.println(" : tapez 2 \n ou ");
        System.out.print(guerrier3.toString());
        System.out.println(" : tapez 3 \n C'est à vous :  ");

        choix = sc.nextByte();
        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi Gaetan ! ");
                System.out.println("Nous sommes le ");
                System.out.println (LocalDateTime.now().toString());
                System.out.println(" , il est temps de jouer !!!! ");
                break;
                case 2:
                    System.out.println("Vous avez choisi Georgina ! ");
                    break;
                    case 3:
                        System.out.println("Vous avez choisi Ginette ! ");
                        break;
                        default:
                            System.out.println("Merci de votre visite, à bientôt. ");
        }




        System.out.println("********************************"); // créer methode guild soigneur
        System.out.println(" Les SOIGNEURS : ");
        System.out.println("********************************");

        System.out.println(soigneur1.toString());
        System.out.println(soigneur2.toString());
        System.out.println(soigneur3.toString());


    }




}
