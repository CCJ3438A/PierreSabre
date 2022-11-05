package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

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
	}

	public void gagnerArgent(int gain) {
		this.argent += gain;
	}

	public void perdreArgent(int perte) {
		this.argent -= perte;
	}

	public void direBonjour() { // dit : Bonjour ! Je m’appelle (nom de l’humain) et j’aime boire du (boisson))
		parler("Bonjour ! Je m’appelle " + this.nom + " et j’aime boire du " + this.boisson + ".");
	}

	public void boire() { // dit : Ahhh, un bon verre de (boisson) ! GLOUPS !
		parler("Ahhh, un bon verre de " + this.boisson + " ! GLOUPS ! ");
	}

	public void parler(String texte) { // affiche : (nom de l’humain) - texte
		System.out.println("(" + this.nom + ") " + texte);
	}

	public void acheter(String bien, int prix) {
		if (this.argent >= prix) {
			parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			this.perdreArgent(prix);
		}
		parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à"
				+ prix + " sous.");
	}

	public int getArgent() {
		return this.argent;
	}

	public String getNom() {
		return this.nom;
	}

}
