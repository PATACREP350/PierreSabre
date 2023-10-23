package personnages;

public class Commercant extends Humain {

	public Commercant(String nom,  int nbArgent) {
		super( nom,  "thé", nbArgent);
	}
	
	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
		int butin = getNbArgent();
		perdreArgent(butin);
		return butin;
	}
	
	public void recevoir(int don) {
		parler(don + " sous! Je te remercie généreux donateur!");
		gagnerArgent(don);
	}

}
