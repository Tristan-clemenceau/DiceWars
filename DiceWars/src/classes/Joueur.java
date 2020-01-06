package classes;

import java.util.Scanner;

public class Joueur {
	private final int id;
	
	public Joueur(int id) {
		this.id = id;
	}

	public void jouer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pour terminer votre tour entrez (\"q\")");
		String choix = sc.nextLine();
		
		while (!choix.toLowerCase().equals("q")) {
			System.out.println("Pour terminer votre tour entrez (\"q\")");
			choix = sc.nextLine();
		}
	}

	@Override
	public String toString() {
		return "Joueur : " + id ;
	}
	
}
