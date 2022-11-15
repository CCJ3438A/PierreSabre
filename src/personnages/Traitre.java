package personnages;

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

	}

	public void faireLeGentil(Humain humain, int montant) {
		
}
