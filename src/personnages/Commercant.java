package personnages;

import personnages.Humain;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		super.parler("J’ai tout perdu! Le monde est trop injuste...");
		int somme = super.argent;
		perdreArgent(somme);
		return somme;
	}
	
	public void recevoir(int argent) {
		super.parler(argent + " sous ! Je te remercie généreux donateur!");
		super.gagnerArgent(argent);
	}
	
	public void direBonjour() {
		super.direBonjour();
	}
	
	public void boire(String boisson) {
		super.boire(boisson);
	}

}
