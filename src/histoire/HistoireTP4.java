package histoire;

import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Samourai Akimoto = new Samourai("Akimoto", "saké",80,"Miyamoto");
		marco.faireConnaissanceAvec(Akimoto);
		Akimoto.listerConnaissance();

	}

}
