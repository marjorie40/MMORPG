package model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Soigneurs extends Personnages {

    private int soin = 100;


    private static List <Soigneurs> listeSoigneurs = new ArrayList <Soigneurs>();

    public Soigneurs(String nom, String race, String classe, String groupe, int pointsDeVie, int soin) {
        super(nom, race, classe, groupe, pointsDeVie);
        this.setSoin(soin);

    }
public int getSoin() {
        return soin;
}
public void setSoin(int soin) {
    if (soin <= 50 ||soin > 100) { //seulement des entiers de 0 à 100
        throw new IllegalArgumentException("Veuillez choisir un groupe valide. ");
    } else {
        this.soin = soin;
    }
}
}
