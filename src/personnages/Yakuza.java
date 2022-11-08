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

	public int perdre() { // il perd dans un duel l’opposant à un ronin
		int argentPerdu = this.getArgent();
		this.perdreArgent(argentPerdu);
		this.reputation -= 1;
		this.parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de "
				+ this.clan + ".");
		return argentPerdu;
	}

	public void gagner(int gain) { // il gagne un duel l’opposant à un ronin
		this.gagnerArgent(gain);
		this.reputation += 1;
		this.parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + this.clan + " ?\n"
				+ "Je l'ai dépouillé de ses " + gain + " sous.");
	}

	public int getReputation() {
		return this.reputation;
	}

}
