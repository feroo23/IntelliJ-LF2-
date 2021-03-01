public class Torwart extends Spieler {

    private int reaktion;

    public Torwart (String name, int alter, int starke, int motivation , int reaktion){
       super(name,alter,starke,0,motivation,0);
        this.reaktion = reaktion;
    }

    public int getreaktion() {
        return reaktion;
    }

    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }

    @Override
    public String toString() {
        String text = "Torwart: " + getName();
        text = text + "\n\t" + "Reaktion: " + reaktion + " von 10";
        text += "\n\t ";
        return text;
    }
}
