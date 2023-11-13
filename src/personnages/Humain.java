package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int nbArgent;
	private int nbConnaissance = 0;
	private int nbConnaissancemax = 30;
	private Humain[] listConnaissance = new Humain[nbConnaissancemax];

	public Humain(String nom, String boissonFav, int nbArgent) {
		super();
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.nbArgent = nbArgent;
	}
	
	public String getNom() {
		return nom;
	}

	public int getNbArgent() {
		return nbArgent;
	}
	
	public void parler(String texte) {
		System.out.println(nom + ": \"" + texte + "\"");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + "  et j’aime boire du " + boissonFav + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + "! GLOUPS !");
	}
	
	public void gagnerArgent(int montant) {
		nbArgent += montant;
	}
	
	public void perdreArgent(int montant) {
		nbArgent -= montant;
	}
	
	public void  acheter(String bien, int prix) {
		if(nbArgent<prix) {
			parler("Je n'ai plus que " + nbArgent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix +" sous.");
		}else {
			parler("J'ai " + nbArgent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix +" sous.");
		perdreArgent(prix);
		}
	}
	
	public void connaitre(Humain humain) {
		if (nbConnaissance==nbConnaissancemax) {
			Humain[] nList = new Humain[nbConnaissancemax];
			for(int i=0;i<nbConnaissance-1;i++) {
				nList[i]=listConnaissance[i+1];
			}
			listConnaissance=nList;
		} else {
			nbConnaissance++;
		}
		listConnaissance[nbConnaissance-1]=humain;
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.direBonjour();
		connaitre(humain);
		humain.connaitre(this);
	}
	
	public void listerConnaissance() {
		System.out.println(" Je connais beaucoup de monde dont : ");
		for(int i=0;i<nbConnaissance;i++) {
			System.out.println( listConnaissance[i].getNom() + ", ");
		}
	}
	
	public static void main(String[] args) {
		
	}


}
