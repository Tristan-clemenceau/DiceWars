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
				nbLigne++;
				String[] tabChaine = chaine.split(";");
				String parts[] = tabChaine[0].split(",");
				nbColonne = parts.length;
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
				nbLigne++;
				String[] tabChaine = chaine.split(";");
				String parts[] = tabChaine[0].split(",");
				nbColonne = parts.length;
				for (String part : parts) {
					if (part.toLowerCase().equals("1")) {
						cpt++;
					}
					System.out.print(part + "\t");
				}
				System.out.println();
			}
			carte = new Territoire[nbLigne][nbColonne];
			fichier_source.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public void disCarte() {
		System.out.println("ligne : "+carte.length+" Colo "+carte[0].length);
	}

}
