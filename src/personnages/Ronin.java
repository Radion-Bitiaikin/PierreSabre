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
	
	public void direBonjour() {
		super.direBonjour();
	}
	
	public void boire(String boisson) {
		super.boire(boisson);
	}

}
