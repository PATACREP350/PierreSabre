package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	
	public Ronin(String nom, String boissonFav, int nbArgent){
		super( nom,  boissonFav,  nbArgent);
	}

	public void donner(Commercant chanceux) {
		int don = getNbArgent()/10;
		perdreArgent(don);
		parler(chanceux.getNom() + " prend ces " + don + " sous.");
		chanceux.recevoir(don);
	}
}
