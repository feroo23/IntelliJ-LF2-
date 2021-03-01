import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private ArrayList<Spieler> spielerListe;
    private Trainer trainer;
    private Torwart torwart;

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerListe ) {
        this.name = name;
        this.spielerListe = spielerListe;
        this.torwart = torwart;
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }

    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

   public int getMotivation(){
        int motivation = torwart.getMotivation();
        /*
        for (int i = 0; i < spielerListe.size(); i++) {
            motivation = motivation + spielerListe.get(i).getMotivation();
        }
         */
       for (Spieler element : spielerListe){
//           motivation = motivation + element.getMotivation();
           motivation += element.getMotivation();
       }

        motivation = motivation / (spielerListe.size() + 1);
       return motivation;
   }

   public int getStaerke(){
        int staerke = torwart.getStaerke();
       for (Spieler element : spielerListe) {
           staerke += element.getStaerke();
       }
   }

    @Override
    public String toString() {
        String text = "Mannschaft: " + name;
        text += "\n" + trainer;
        text += "\n" + torwart;
        for (Spieler spieler: spielerListe){
            text = text + "\n" + spieler;
        }
        text += "\n";
        return text;
    }
}
