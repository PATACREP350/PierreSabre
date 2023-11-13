package personnages;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 1;
	
	public Yakuza(String nom, String boissonFav, int nbArgent, String clan) {
		super(nom, boissonFav, nbArgent);
		this.clan=clan;
	}
	
	public int getReputation(){
		return reputation;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		reputation+=1;
		parler("J’ai piqué les " + gain + " sous de " + victime.getNom() + ", ce qui me fait " + getNbArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		parler(" J’ai perdu mon duel et mes " + getNbArgent() + " sous, snif... J'ai déshonoré le clan de " + clan);
		int perte = getNbArgent();
		perdreArgent(perte);
		reputation-=1;
		return perte;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + "?\nJe l'ai dépouillé de ses " + gain + " sous.");
		reputation+=1;
		gagnerArgent(gain);
	}

}
