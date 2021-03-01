public class Spieler extends Person{

    private int staerke;
    private int torschuss;
    private int motivation;
    private int tore;

    public Spieler(String name, int alter, int staerke, int torschuss, int motivation, int tore) {
        super(name, alter);
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.tore = tore;
        this.motivation = motivation;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setTorschuss(int torschuss) {
        torschuss = torschuss;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setTore(int tore) {
        this.tore = tore;
    }

    public int getTore() {
        return tore;
    }

    public int getreaktion(int reaktion) {
        return reaktion;
    }

    public void setReaktion(int reaktion) {
        reaktion = reaktion;
    }


    @Override
    public String toString() {
        String  text ="Spieler: " + getName();
        text += "\n\tAlter = " + getAlter();
        text += "\n\tStärke = " + getStaerke() + " von 10";
        text += "\n\tTorschuss = " + getTorschuss();
        text += "\n\tMotivation = " + getMotivation() + " von 10";
        text += "\n\tTore = " + getTore();
        text += "\n\t ";
        return text;

    }
}
