package personnages;

public class Samourai extends Ronin {

	String seigneur;

	public Samourai(String seigneur, String nom, String boisson_favorite, int argent) {
		super(nom, boisson_favorite, argent);
		this.seigneur = seigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur + ".");
	}

	@Override
	public void boire(String boisson) {
		super.boire(boisson);
		if(!boisson_favorite.equals(boisson))
			parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
	}

}
