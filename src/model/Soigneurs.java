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
        this.soin = soin;
}

}
