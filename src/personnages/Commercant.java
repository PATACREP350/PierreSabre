package personnages;

public class Commercant extends Humain {

	public Commercant(String nom,  int nbArgent) {
		super( nom,  "thé", nbArgent);
	}
	
	public void seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
		setNbArgent(0);
	}
	
	public void recevoir(int don) {
		parler(don + " sous! Je te remercie généreux donateur!");
		setNbArgent(don+getNbArgent());
	}

}
