package classes;

public class Territoire {
	private final int id;
	private Joueur owner;
	private static final int LIMITE_DE = 8;
	
	public Territoire(int id) {
		this.id = id;
	}
	
	public Territoire(int id, Joueur owner) {
		this.id = id;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Territoire : "+id+"\t Proprietaire : "+owner.toString();
	}
	
}
