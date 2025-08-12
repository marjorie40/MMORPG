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
        return "!!"+this.getNom() +" "+ this.getRace()+" "+ this.getClasse()+" "+ this.getGroupe()+" "+ this.getPointsDeVie()+" !!";
        //return this.getPersonnages().toString();
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }
    public void setPointsDeVie(int pointsDeVie) {
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
        this.race = race;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public String getGroupe() {
        return groupe;
    }
    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    List<Personnages> getPersonnages() {
        List<Personnages> personnages = new ArrayList<>();
        // personnages.add(this); pourquoi ??

        return personnages;
    }


}

