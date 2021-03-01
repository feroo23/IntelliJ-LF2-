public class Programm {
    public static void main(String[] args) {
        // Wir legen zwei unterschiedliche Objekte an (Instanzen) mit gleichen Attributen (Eigenschaften). Die Attributwerte

        Banane meineBananne = new Banane("Bananne");
        Apfel meineApfel = new Apfel("Apfel");
        Orange meineOrange = new Orange("Orange");
        Orange meineZweiteOrange = new Orange( "Orange");

        meineApfel.setGewicht(100);
        meineApfel.setReif(true);
        System.out.println(meineApfel.getName());
        System.out.println(meineApfel.getGewicht());
        System.out.println("Reif:" + meineApfel);
        System.out.println(meineApfel);

        meineBananne.setGewicht(100);
        meineBananne.setReif(true);
        System.out.println(meineBananne.getGewicht());
        System.out.println();

        System.out.println("Obstkorb");
        Obstkorb meinObstkorb = new Obstkorb();
        meinObstkorb.fuegeHinzu(meineApfel);
        meinObstkorb.fuegeHinzu(meineBananne);
        Obst obst = meinObstkorb.nehmeHerasu(meineBananne);
        System.out.println(obst);
        ((Banane) obst).setKruemungsgrad(25);

    }
}
