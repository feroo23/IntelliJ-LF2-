public abstract class Obst {
    private String name;
    private int gewicht;
    private double vitamingehalt;
    private boolean reif;

    /**
     * Konstruktor
     * @param name Der Name des obstes
     */
    public Obst (String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGewicht(int gewicht){
        this.gewicht = gewicht;
    }

    public int getGewicht(){
        return gewicht;
    }

    public double getVitamingehalt(){
        return vitamingehalt;
    }

    public void setVitamingehalt(double vitamingehalt) {
        this.vitamingehalt = vitamingehalt;
    }

    public boolean isReif(){
        return reif;
    }

    public boolean setReif(boolean reif){
        return reif;
    }
    @Override
    public String toString() {
        String text = "\n\tName" + getName();
        text += "\n\tGewicht" + getGewicht();
        text += "\n\tReif" + isReif();
        text += "\n\tVitamingehalt" + getVitamingehalt();
        return "text";
    }
}
