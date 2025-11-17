package personnages;

public class Humain {
	
	String nom;
	String boisson_favorite;
	int quantite_argent;
	
	public Humain(String nom, String boisson_favorite, int quantite_argent) {
		this.nom = nom;
		this.boisson_favorite = boisson_favorite;
		this.quantite_argent = quantite_argent;
	}
	
	void parler(String s) {
		System.out.println("(Prof) - " + s);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boisson_favorite + ".");
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(quantite_argent > prix) {
			parler("J'ai " + quantite_argent +
					" sous en poche. Je vais pouvoir m'offrir " + bien +
					" à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + quantite_argent +
					" sous en poche. Je ne peux même pas m'orir " + bien +
					" à " + prix + " sous.");
		}
	}
	
	void gagnerArgent(int gain) {
		quantite_argent += gain;
	}
	
	void perdreArgent(int perte) {
		quantite_argent -= perte;
	}

}
