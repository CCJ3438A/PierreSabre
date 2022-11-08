/**
 * 
 */
package personnages;

/**
 * @author joyce
 */
public class Ronin extends Humain {

	private int honneur = 1;

	/**
	 */
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void donner(Commercant commercant) {
		int don = this.getArgent() / 10;
		this.perdreArgent(don);
		this.parler("Marco prend ces " + don + " sous.");
		commercant.recevoir(don);
	}

	public void provoquer(Yakuza adversaire) {
		int forceR = this.honneur * 2;

		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (forceR > adversaire.getReputation()) {
			this.parler("Je t’ai eu petit yakusa!");
			this.gagnerArgent(adversaire.perdre());
			this.honneur += 1;
		} else {
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.getArgent());
			this.perdreArgent(this.getArgent());
			this.honneur -= 1;
		}
	}
}
