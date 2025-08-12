package controler;

import model.Personnages;
import model.Guerriers;
import model.Voleurs;


public class App {
    public static void main(String[] args) {
        System.out.println(" Hello World ! ");



        Personnages personnages1 = new Personnages ("Java", "HUMAIN", "leger", "1", 100);
        Personnages personnages2 = new Personnages ("Pitch", "ORQUE", "lourd", "1", 100);
        System.out.println(personnages1.toString());
        System.out.println(personnages2.toString());
    }
}
