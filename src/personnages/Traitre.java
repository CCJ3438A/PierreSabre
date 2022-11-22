package personnages;

import java.util.Random;

public class Traitre extends Samourai {

	private int niveauTraitrise;

	public Traitre(String nom, String boisson, String nomSeigneur, int argent) {
		super(nom, boisson, nomSeigneur, argent);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut ! ");
	}

	public void ranconner(Commercant commercant) {
		if (this.niveauTraitrise < 3) {
			int argentRanconner = (commercant.getArgent() * 2) / 10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			this.niveauTraitrise++;
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi" + argentRanconner
					+ " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + this.getNom() + ".");
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}

	public void faireLeGentil() {
		if (this.nbConnaissance < 1) {
			this.parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			Random randAmi = new Random();
			Humain ami = this.memoire[randAmi.nextInt(this.nbConnaissance)];
			String nomAmi = ami.getNom();
			int don = ami.getArgent() / 20;
			this.parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec" + nomAmi + ".");
			this.parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant" + don + "sous.");
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			ami.parler("Merci " + this.getNom() + "Vous êtes quelqu'un de bien.");
			if (this.niveauTraitrise > 1) {
				this.niveauTraitrise--;
			}
		}
	}
}
