package model;

import java.util.ArrayList;

public class Groupe {

    private String nom;
    private Guerriers guerrier;
    private Soigneurs soigneur;
    public String groupe1;
    public String groupe2;
    public String groupe3;


    public Groupe(String setNom, Guerriers setGuerrier, Soigneurs setSoigneur) {
        this.setNom(nom);
        this.setGuerriers(guerrier);
        this.setSoigneurs(soigneur);

    }

        private static ArrayList<String> groupe = new ArrayList<String>() {
        };

    public ArrayList<String> getGroupe() {
        return groupe;
    }
    public void setGroupe(ArrayList<String> groupe) {
        //test que 1 Soigneur +1 Guerrier pour chaque groupe =n !2soigneurs ; !2gueurriers

        this.groupe = groupe;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Guerriers getGuerriers() {
        return guerrier;
    }

    public void setGuerriers(Guerriers guerriers) {
        this.guerrier = guerriers;
    }

    public Soigneurs getSoigneurs() {
        return soigneur;
    }

    public void setSoigneurs(Soigneurs soigneurs) {
        this.soigneur = soigneurs;
    }
}
