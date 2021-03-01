import java.util.Random ;

public class Gameplay extends Spiel{

    private static final int spielzeit = 90;
    private static final int maxNachspielzeit = 5;
    private static final int maxAktion = 10;

    public Gameplay(Mannschaft heim, Mannschaft gast) {
        super(heim, gast);
    }

    private static int ermittelMannschaftsWert(Mannschaft mannschaft){
        int wert =  mannschaft.getStaerke() * mannschaft.getMotivation() * mannschaft.getTrainer().getErfahrung();
        wert = Math.max(1, wert);
        return wert;
    }

    private static boolean erzieltTor(Spieler schuetze, Torwart torwart) {
        boolean tor;
        Random random = new Random();
        int schuss = schuetze.getTorschuss() + random.nextInt(5) - 2;
        schuss = Math.max(1, schuss);
        int abwehr = torwart.getreaktion() + random.nextInt(5) - 2;
        abwehr = Math.max(1, abwehr);
        if (schuss > abwehr){
            tor = true;
        }
        else{
            tor = false;
        }
        return tor;
    }

    public static void spielen(Spiel spiel){
        Random random = new Random();
        Mannschaft off;
        Mannschaft def;
        int spielDauer = spielzeit + random.nextInt(maxNachspielzeit + 1);
        int spielMin = 1 + random.nextInt(maxAktion + 1);

        do {
            int heimWert = ermittelMannschaftsWert(spiel.getHeim());
            int gastWert = ermittelMannschaftsWert(spiel.getGast());
            int sum = heimWert + gastWert;
            int zufall = random.nextInt(sum + 1);
            if (zufall <= heimWert) {
                off = spiel.getGast();
                def = spiel.getHeim();
            }
            else{
                off = spiel.getGast();
                def = spiel.getHeim();
            }
            int schuetzeNr = random.nextInt(off.getSpielerListe().size());
            Spieler schuetze = off.getSpielerListe().get(schuetzeNr);
            boolean getroffen = erzieltTor(schuetze, def.getTorwart());
            if (getroffen) {
                schuetze.addTore();
                if (off == spiel.getHeim()) {
                    spiel.getErgebnis().addToreHeim(heimWert);
                } else {
                    spiel.getErgebnis().addToreGast(gastWert);
                }
                spiel.getspielbericht().append(spielMin + ": Tor von " + schuetze.getName() + "!\n");
            } else {
                spiel.getspielbericht().append(spielMin + ": Schuss von " + schuetze.getName() + " gehalten.\n");
            }
            spielMin = spielMin + random.nextInt(maxAktion + 1);

        }while(spielMin <= spielDauer);
        spiel.getspielbericht().append(spiel.getErgebnis());

    }



}
