package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Carte {
	private List<Joueur> listJoueur = new ArrayList<Joueur>();/* Permet d'interargir avec les player */
	private List<Territoire> listTerritoire = new ArrayList<Territoire>();/* Permet d'interragir avec les territoires */
	private Territoire carte[][];/* Tableau en 2D Territoire */

	public Carte() {

	}
	
	public void setDefault(){/*Definit la taille du tableau en fonction du fichier csv*/
		try {
			String chemin = "fichier.csv";
			BufferedReader fichier_source = new BufferedReader(new FileReader(chemin));
			String chaine;
			int nbLigne = 0, nbColonne = 0;

			while ((chaine = fichier_source.readLine()) != null) {
				String[] tabChaine = chaine.split(";");
				String parts[] = tabChaine[0].split(",");
				nbColonne = parts.length;
				nbLigne++;
			}
			carte = new Territoire[nbLigne][nbColonne];
			fichier_source.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void setMap() {/* Lecture fichier CSV & Affiliation des territoires */
		try {
			String chemin = "fichier.csv";
			BufferedReader fichier_source = new BufferedReader(new FileReader(chemin));
			String chaine;
			int cpt = 0, nbLigne = 0, nbColonne = 0;

			while ((chaine = fichier_source.readLine()) != null) {
				String[] tabChaine = chaine.split(";");
				String parts[] = tabChaine[0].split(",");
				nbColonne = parts.length;
				
				for(int i = 0 ;i< parts.length;i++) {
					if (parts[i].toLowerCase().equals("1")) {
						carte[nbLigne][i] = new Territoire(cpt);
						cpt++;
					}else {
						carte[nbLigne][i] = null;
					}
				}
				nbLigne++;
			}
			fichier_source.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public void disCarte() {
		System.out.println("[CARTE]\nNombre ligne : "+carte.length+" Nombre Colonne "+carte[0].length);
		for (int i = 0; i < carte.length; i++) {
			for (int j = 0; j < carte[0].length; j++) {
				if(carte[i][j] == null) {
					System.out.print("[null]");
				}else {
					System.out.print("["+carte[i][j].toString()+"]");
				}
			}
			System.out.println("");
		}
	}

}
