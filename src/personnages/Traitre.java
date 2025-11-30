package personnages;

public class Traitre extends Samourai {

	int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boisson_favorite, int argent) {
		super(seigneur, nom, boisson_favorite, argent);
	}

	/*public void ranconner(commercant Commercant) {
		if(niveauTraitrise<3) {
			int argentRanconner = commercant.getArgent();
		} else {

		}
	}

	public void faireLeGentil() {
	}*/

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
	}
}
