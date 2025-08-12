package model;

import java.util.ArrayList;
import java.util.List;


public class Voleurs extends Personnages {

    private int discretion = 100;

    private static List<String> voleurs = new ArrayList<String>() {
        public void add(int index, Voleurs element) {
            voleurs.add("Valentin");
            voleurs.add("Valerie");
            voleurs.add("Voldemor");
            voleurs.add("Victoria");
        }
    };

    public Voleurs(String nom, String race, String classe, String groupe, int pointsDeVie, int discretion) {
        super(nom, race, classe, groupe, pointsDeVie);
        this.setDiscretion (discretion);

    }
    public int getDiscretion() {
        return discretion;
    }
    public void setDiscretion(int discretion) {
        this.discretion = discretion;
    }





}
