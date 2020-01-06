package tests;

import classes.Carte;
import classes.Joueur;

public class TestMain {

	public static void main(String[] args) {
		/*VARIABLES*/
		Joueur j1 = new Joueur(1);
		Carte c1 = new Carte();
		
		/*CODE*/
		j1.jouer();
		c1.setMap();
	}

}
