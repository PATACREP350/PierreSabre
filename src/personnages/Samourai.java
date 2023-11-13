package personnages;

public class Samourai extends Ronin{
	private String seigneur;
	
	public Samourai(String nom, String boissonFav, int nbArgent,String seigneur) {
		super( nom,  boissonFav,  nbArgent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur);
	}

	public static void main(String[] args) {
		

	}

}
