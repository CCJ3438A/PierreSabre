package personnages;

import java.util.Random;

public class GrandMere extends Humain {
	private Humain[] memoire = new Humain[5];

	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}

	@Override
	protected void memoriser(Humain humainAMemoriser) {
		if (this.nbConnaissance < this.memoire.length) {
			this.memoire[this.nbConnaissance] = humainAMemoriser;
			this.nbConnaissance++;
		} else {
			this.parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}

	private enum TypeHumain {
		GrandMere, Commercant, Ronin, Samouraï, Yakuza, Traître, Habitant
	}

	private String humainHasard(Humain humain) {
		Random classe = new Random();
		TypeHumain[] types = TypeHumain.values();
		int iClasse = classe.nextInt(7);

		return "" + types[iClasse] + "";
	}

	public void ragoter() {
		for (int i = 0; i < this.nbConnaissance; i++) {
			if (this.memoire[i] instanceof Traitre) {
				this.parler("Je sais que " + this.memoire[i].getNom() + " est un traître. Petit chenapan !");
			} else {
				this.parler("je crois que " + this.memoire[i].getNom() + " est un " + this.humainHasard(this.memoire[i])
						+ ".");
			}
		}
	}

}
