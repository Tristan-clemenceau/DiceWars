package classes;

public class Territoire {
	private final int id;
	private int nombreDe;
	private Joueur owner;
	private static final int LIMITE_DE = 8;

	public Territoire(int id) {
		this.id = id;
		owner = null;
		nombreDe = 0;
	}

	public Territoire(int id, Joueur owner) {
		this.id = id;
		this.owner = owner;
	}


	public int getNombreDe() {
		return nombreDe;
	}

	public void setNombreDe(int nombreDe) {
		this.nombreDe = nombreDe;
	}

	public Joueur getOwner() {
		return owner;
	}

	public void setOwner(Joueur owner) {
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public static int getLimiteDe() {
		return LIMITE_DE;
	}

	@Override
	public String toString() {
		return "Territoire : "+id+"\t Proprietaire : "+owner.toString();
	}

}
