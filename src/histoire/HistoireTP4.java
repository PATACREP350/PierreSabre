package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		traire Akimoto = new traire("Akimoto", "saké",80,"Miyamoto");
		marco.faireConnaissanceAvec(Akimoto);
		Akimoto.listerConnaissance();
		Akimoto.rançonner(marco);
		Akimoto.rançonner(marco);
		Akimoto.rançonner(marco);
		Akimoto.rançonner(marco);
	}

}
