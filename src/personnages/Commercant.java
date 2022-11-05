package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		// TODO Auto-generated constructor stub
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		this.perdreArgent(this.getArgent());
		this.parler("J’ai tout perdu! Le monde est vraiment trop injuste...");
		return this.getArgent();
	}

	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent + " sous ! Je te remercie généreux donateur!");
	}

}
