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
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		super.parler(nom_victime + ", si tu tiens a la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		super.gagnerArgent(gain);
		super.parler("J'ai pique les " + gain + " sous de " + nom_victime + ", ce qui me fait " + super.argent + " sous dans ma poche. Hi ! Hi !");
		reputation+=1;
	}
	
	int perdre() {
		parler("J'ai perdu mon duel et mes " + argent + " sous, snif... J'ai deshonore le clan de " + clan + ".");
		reputation--;
		int perte = argent;
		perdreArgent(argent);
		return perte;
	}
	
	void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + " ? Je l'ai depouille de ses " + gain + " sous.");
		reputation++;
		gagnerArgent(gain);
	}
	
	int getReputation() {
		return reputation;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}

}
