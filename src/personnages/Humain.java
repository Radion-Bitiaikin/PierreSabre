package personnages;

public class Humain {
	
	String nom;
	String boisson_favorite;
	int argent;
	
	public Humain(String nom, String boisson_favorite, int argent) {
		this.nom = nom;
		this.boisson_favorite = boisson_favorite;
		this.argent = argent;
	}
	
	void parler(String s) {
		System.out.println("(" + nom + ") - " + s);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boisson_favorite + ".");
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(argent > prix) {
			parler("J'ai " + argent +
					" sous en poche. Je vais pouvoir m'offrir " + bien +
					" à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent +
					" sous en poche. Je ne peux même pas m'orir " + bien +
					" à " + prix + " sous.");
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

}
