package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	/**
	 * @param clan
	 */
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argent = victime.seFaireExtorquer();
		this.gagnerArgent(argent);
		this.reputation += 1;
		this.parler("J’ai piqué les " + argent + " sous de " + victime.getNom() + "ce qui me fait " + this.getArgent()
				+ " sous dans ma poche. Hi ! Hi !");

	}
}
