import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        //Mannschaft 1
        System.out.println();
        Trainer trainer1 = new Trainer("Mauricio Pochettino ", 48, 8);
        Torwart torwart1 = new Torwart("Keylor Navas", 23,2,8,7);
        ArrayList<Spieler> spielerListe1 = new ArrayList<>();
        Spieler spieler1 = new Spieler("kylian Mbappe", 22, 9, 134, 8, 94);
        spielerListe1.add(spieler1);
        spieler1 = new Spieler("Nemar junior",29,8,80,9,60);
        spielerListe1.add(spieler1);
        Mannschaft mannschaft1 = new Mannschaft("PSG",trainer1,torwart1,spielerListe1);
        System.out.println(mannschaft1);


        //Mannschaft 2
        Trainer trainer2 = new Trainer("Fahtih Terim", 67, 8);
        Torwart torwart2 = new Torwart("Fernando Muslera", 34,2,5,7);
        ArrayList<Spieler> spielerListe2 = new ArrayList<>();
        Spieler spieler2= new Spieler("Arda Turan", 34, 9, 104, 8, 94);
        spielerListe1.add(spieler2);
        spieler1 = new Spieler("Radamel Falco",34,8,70,9,60);
        spielerListe1.add(spieler2);
        Mannschaft mannschaft2 = new Mannschaft("Gala",trainer2,torwart2,spielerListe2);
        System.out.println(mannschaft2);

        //Spiel
        Spiel spiel = new Spiel(mannschaft1,mannschaft2);
        System.out.println(spiel);
		Gameplay.spielen(spiel);
		System.out.println(spiel.getspielbericht());
		//System.out.println("Ergebnis " + spiel.getErgebnis().getToreHeim() + ":" + spiel.getErgebnis().getToreGast());

        //Spielbericht
        System.out.println(spiel.toString());
    }
}
