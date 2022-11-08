package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		// TODO Auto-generated constructor stub
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		this.parler("J’ai tout perdu! Le monde est vraiment trop injuste...");
		return argent;
	}

	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent + " sous! Je te remercie généreux donateur!");
	}

}
