package personnages;

import java.util.Random;

public class Traitre extends Samourai {

	int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boisson_favorite, int argent) {
		super(seigneur, nom, boisson_favorite, argent);
	}

	public void ranconner(Commercant commercant) {
		if(niveauTraitrise<3) {
			int argentRanconner = commercant.getArgent()/5;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi "
					+ argentRanconner + " sous ou garre a toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		} else {
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me demasquer !");
		}
	}

	public void faireLeGentil() {
		if(nbConnaissance==0) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			//TODO
		}
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveau de traitrise est : " + niveauTraitrise + ". Chut !");
	}
}
