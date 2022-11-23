package histoire;

import personnages.Commercant;
import personnages.GrandMere;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("akimoto", "Akimoto", "saké", 80);
		Traitre masako = new Traitre("akimoto", "Masako", "whisky", 100);
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);

		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);

		akimoto.direBonjour();
		masako.direBonjour();

		masako.ranconner(kumi);
		masako.faireConnaissanceAvec(yaku);

		masako.faireLeGentil();
		masako.direBonjour();
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		akimoto.faireConnaissanceAvec(marco);

		marco.listerConnaissance();
		roro.listerConnaissance();
		akimoto.listerConnaissance();

		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.ragoter();
	}

}
