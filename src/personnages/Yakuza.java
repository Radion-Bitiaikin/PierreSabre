package personnages;

public class Yakuza extends Humain {
	
	String clan;
	int reputation = 0;
	
	public Yakuza(String nom, String boisson_favorite, int argent, String clan) {
		super(nom, boisson_favorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		String nom_victime = victime.getNom();
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(nom_victime + ", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		super.gagnerArgent(gain);
		super.parler("J’ai piqué les " + gain + " sous de " + nom_victime + ", ce qui me fait " + super.argent + " sous dans ma poche. Hi ! Hi !");
		reputation+=1;
	}
	
	public void direBonjour() {
		super.direBonjour();
	}
	
	public void boire(String boisson) {
		super.boire(boisson);
	}

}
