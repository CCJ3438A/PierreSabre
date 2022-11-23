package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[30];

	/**
	 * @param argent
	 * @param boisson
	 * @param nom
	 */
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		this.nbConnaissance = 0;
	}

	protected void gagnerArgent(int sommeGannee) {
		this.argent += sommeGannee;
	}

	protected void perdreArgent(int sommePerdue) {
		this.argent -= sommePerdue;
	}

	public void direBonjour() { // dit : Bonjour ! Je m’appelle (nom de l’humain) et j’aime boire du (boisson))
		parler("Bonjour ! Je m’appelle " + this.nom + " et j’aime boire du " + this.boisson + ".");
	}

	public void boire() { // dit : Ahhh, un bon verre de (boisson) ! GLOUPS !
		parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS ! ");
	}

	protected void parler(String texte) { // affiche : (nom de l’humain) - texte
		System.out.println("(" + this.nom + ") " + texte);
	}

	public void acheter(String bien, int prix) {
		if (this.argent >= prix) {
			parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			this.perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à"
					+ prix + " sous.");
		}
	}

	public int getArgent() {
		return this.argent;
	}

	public String getNom() {
		return this.nom;
	}

	protected void memoriser(Humain humainAMemoriser) {
		if (this.nbConnaissance < this.memoire.length) {
			this.memoire[this.nbConnaissance] = humainAMemoriser;
			this.nbConnaissance++;
		} else {
			this.memoire[0] = humainAMemoriser;
		}
	}

	private void repondre(Humain humainARep) {
		this.direBonjour();
		this.memoriser(humainARep);
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}

	public void listerConnaissance() {
		String texte = "";
		for (int i = 0; i < this.nbConnaissance; i++) {
			texte += this.memoire[i].getNom();
			if (i < this.nbConnaissance - 1) {
				texte += ", ";
			}
		}
		this.parler("Je connais beaucoup de monde dont : " + texte);
	}
}
