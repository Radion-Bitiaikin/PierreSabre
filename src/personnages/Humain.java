package personnages;

public class Humain {
	
	String nom;
	String boisson_favorite;
	int argent;
	int nbConnaissance = 0;
	final int tailleMemoire = 30;
	Humain[] memoire = new Humain[tailleMemoire];
	
	public Humain(String nom, String boisson_favorite, int argent) {
		this.nom = nom;
		this.boisson_favorite = boisson_favorite;
		this.argent = argent;
	}
	
	void parler(String s) {
		System.out.println("(" + nom + ") - " + s);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson_favorite + ".");
	}
	
	public void boire(String boisson) {
		if(boisson_favorite.equals(boisson)) {
			parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
		}
	}
	
	public void acheter(String bien, int prix) {
		if(argent > prix) {
			parler("J'ai " + argent +
					" sous en poche. Je vais pouvoir m'offrir " + bien +
					" ' " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent +
					" sous en poche. Je ne peux m'me pas m'orir " + bien +
					" ' " + prix + " sous.");
		}
	}
	
	void gagnerArgent(int gain) {
		argent += gain;
	}
	
	void perdreArgent(int perte) {
		argent -= perte;
	}
	
	String getNom() {
		return nom;
	}

	void memoriser(Humain autreHumain) {
		if(nbConnaissance<tailleMemoire) {
			memoire[nbConnaissance++] = autreHumain;
		} else {
			for(int i=0;i<tailleMemoire-1;i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[tailleMemoire-1] = autreHumain;
		}
	}

	public void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	public void listerConnaissance() {
		System.out.print("(" + nom + ") - Je connais beaucoup de monde dont: ");
		for(int i=0;i<nbConnaissance-1;i++) {
			System.out.print(memoire[i].getNom() + ", ");
		}
		if(0!=nbConnaissance)
			System.out.println(memoire[nbConnaissance-1].getNom());
	}

}
