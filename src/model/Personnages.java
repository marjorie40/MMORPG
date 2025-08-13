package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personnages {
    private int pointsDeVie = 100;
    private String nom;
    private String race; // Humain, Elfe, Gnome
    private String classe; // filles : Voleurs, Guerriers, Soigneurs
    protected String groupe; // Groupe1 , Groupe2, ...
    Scanner sc = new Scanner(System.in);




    public Personnages(String nom, String race, String classe, String groupe, int pointsDeVie) {
        this.setNom (nom);
        this.setRace(race);
        this.setClasse (classe);
        this.setGroupe(groupe);
        this.setPointsDeVie(pointsDeVie);

    }

    @Override
    public String toString() {
        return "!!"  +this.getNom() +" "+ this.getRace()+" "+ this.getClasse()+" "+ this.getGroupe()+" "+ this.getPointsDeVie()+" !!";
        //return this.getPersonnages().toString();
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }
    public void setPointsDeVie(int pointsDeVie) {
        //seulement des entiers de 0 à 100 / pas de caractere ou special
        this.pointsDeVie = pointsDeVie;
    }
    public String getNom() {
        return nom;

    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        //seulement HUMAIN, GNOME, ORQUE
        this.race = race;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        //seulement une fille (guerrier ou soigneur)
        this.classe = classe;
    }
    public String getGroupe() {
        return groupe;
    }
    public void setGroupe(String groupe) {
        //seulement des entiers 1 ou 2 ou 3 / pas de caractere ou special
        this.groupe = groupe;
    }

    /*public static List<Personnages> getPersonnages() {
        List<Personnages> personnages = new ArrayList<Personnages>();
        personnages.add(Personnages.getPersonnages().get(0));
        personnages.add(Personnages.getPersonnages().get(1));
        personnages.add(Personnages.getPersonnages().get(2));

        return personnages;
    }*/

}

