package model;

import java.sql.Array;
import java.util.*;

import static model.Race.HUMAIN;

public class Guerriers extends Personnages {

    private int force;


    public Guerriers(String nom, String race, String classe, String groupe, int pointsDeVie, int setForce) {
        super(nom, race, classe, groupe, pointsDeVie);
        this.setForce(force);

    }


    public int getForce () {
        return force;
    }

    public void setForce (int force){
        //seulement des entiers de 0 à 100 / pas de caractere ou special
        this.force = force;
    }

    @Override
    public String toString () {
        return "-- " + this.getNom() + " " + this.getRace() + " " + this.getClasse() + " " + this.getGroupe() + " "
                + this.getPointsDeVie() + this.getForce();
    }


    private static List<Guerriers> listeGuerriers = new ArrayList<Guerriers>(); {
        for (int i = 0; i <= listeGuerriers.size(); i++) {

            //listeGuerriers.add(listeGuerriers.set());

            //listeGuerriers.add(listeGuerriers.get(0));
        }
    }
}