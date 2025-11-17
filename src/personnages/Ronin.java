package personnages;

public class Ronin extends Humain {
	
	int honneur = 1;
	
	public Ronin(String nom, String boisson_favorite, int argent) {
		super(nom, boisson_favorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int quantite = super.argent / 10;
		super.parler(beneficiaire.getNom() + " prend ces " + quantite + " sous.");
		beneficiaire.recevoir(quantite);
		super.perdreArgent(quantite);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = honneur * 2;
		if( force >= adversaire.getReputation() ) {
			parler("Je t’ai eu petit yakusa!");
			gagnerArgent(adversaire.perdre());
			honneur++;
		} else {
			parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
			perdreArgent(argent);
			honneur--;
		}
	}

}
