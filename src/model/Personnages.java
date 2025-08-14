package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static model.Race.*;

public class Personnages {
    private int pointsDeVie = 100;
    private String nom;
    private String race; // Humain, Elfe, Gnome
    private String classe; // filles : Voleurs, Guerriers, Soigneurs
    private String REGEX = " ^[a-z]+$";
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
    public void setPointsDeVie(int pointsDeVie) throws IllegalArgumentException {
        if(pointsDeVie < 0 || pointsDeVie > 100) {
            throw new IllegalArgumentException("Le nombre de points de vie n'est pas conforme, " +
                    "veuillez saisir un nombre valide (entre 1 et 100). ");
        } else {
            this.pointsDeVie = pointsDeVie;
        }
    }
    public String getNom() {
        return nom;

    }
    public void setNom(String nom) throws IllegalArgumentException {
        if (nom == null || !nom.matches(REGEX)) {
            throw new IllegalArgumentException("Le nom n'est pas conforme, " +
                    "veuillez saisir un nom valide. ");
        } else {
            this.pointsDeVie = pointsDeVie;
            this.nom = nom;
        }
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) throws IllegalArgumentException {
        if (race == null || race != HUMAIN && race != GNOME && race != ORQUE) { //seulement HUMAIN, GNOME, ORQUE
            throw new IllegalArgumentException("Veuillez saisir une valide préenregistrée : HUMAIN, GNOME ou ORQUE. ");
        } else {
            this.race = race;
        }
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) throws IllegalArgumentException {
        if (classe == null || classe != Guerriers && classe != Soigneurs) { //seulement une fille (guerrier ou soigneur)
            throw new IllegalArgumentException("Veuillez saisir une classe valide  : Guerriers ou Soigneurs. ");
        } else {
            this.classe = classe;
        }
    }
    public String getGroupe() {
        return groupe;
    }
    public void setGroupe(String groupe) throws IllegalArgumentException {
        if (groupe!= "1" && groupe!= "2" && groupe!= "3" ) { //que 3 groupe (1-2-3)
            throw new IllegalArgumentException("Veuillez choisir un groupe valide : 1-2-3. ");
        } else {
            this.groupe = groupe;
        }
    }

    /*public static List<Personnages> getPersonnages() {
        List<Personnages> personnages = new ArrayList<Personnages>();
        personnages.add(Personnages.getPersonnages().get(0));
        personnages.add(Personnages.getPersonnages().get(1));
        personnages.add(Personnages.getPersonnages().get(2));

        return personnages;
    }*/

}


