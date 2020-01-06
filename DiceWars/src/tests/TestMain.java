package tests;

import classes.Carte;
import classes.Joueur;
import classes.Territoire;

public class TestMain {

	public static void main(String[] args) {
		/*VARIABLES*/
		Joueur j1 = new Joueur(1);
		Carte c1 = new Carte();
		Territoire t = new Territoire(1);
		
		/*CODE*/
		j1.jouer();
		c1.setDefault();
		c1.setMap();
		c1.disCarte();
	}

}
