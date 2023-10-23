package histoire;

import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 8);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 45, "suuuuuuu");
		Ronin roro = new Ronin("Roro", "shochu", 54);
		roro.provoquer(yaku);
	}

}
