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

}
