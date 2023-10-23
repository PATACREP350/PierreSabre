package personnages;

import personnages.Yakuza;

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
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if((honneur*2)>= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			honneur+=1;
			gagnerArgent(adversaire.perdre());
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			int perte = getNbArgent();
			perdreArgent(perte);
			honneur-=1;
			adversaire.gagner(perte);
		}
	}
}
