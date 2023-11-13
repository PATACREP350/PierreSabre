package personnages;

public class traire extends Samourai{
	private int nvTraitrise = 0;
	
	public traire(String nom, String boissonFav, int nbArgent,String seigneur) {
		super( nom,  boissonFav,  nbArgent, seigneur);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Ma traitrise est de " + nvTraitrise);
	}
	
	public void rançonner(Commercant victime) {
		if(nvTraitrise<3) {
			int gain = victime.getNbArgent()/5;
			gagnerArgent(gain);
			victime.perdreArgent(gain);
			parler("Si tu veux ma protection contre les Yakusas, il va falloir payer! Donne-moi " + gain + " sous ou gare à toi!");
			victime.parler("Tout de suite grand " + getNom() + ".");
			nvTraitrise+=1;
			parler("J’ai piqué les " + gain + " sous de " + victime.getNom() + ", ce qui me fait " + getNbArgent() + " sous dans ma poche. Hi ! Hi !");
		}else {
			parler("Mince, je ne peux plus rançonner personne sinon un samourai risque de me démasquer!");
		}
	}
	
	public void faireLeGentil() {
		if ( nbConnaissance == 0) {
			parler("Je ne peux faire ami ami avec personne car je ne connais paersonne! Snif!");
		} else {
			int don= getNbArgent()/20;
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire amiami avec " + listConnaissance[0].getNom() + ".");
		}
	}

}
