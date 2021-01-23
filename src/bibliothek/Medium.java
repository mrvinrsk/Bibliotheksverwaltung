package bibliothek;

import java.util.ArrayList;

public class Medium {

    private static ArrayList<Medium> medien = new ArrayList<>();
    private static int currentID = 0;

    private String title, verlag;
    private float preis;
    private int mediennummer;

    public int getMediennummer() {
        return mediennummer;
    }

    public String getTitle() {
        return title;
    }

    public String getVerlag() {
        return verlag;
    }

    public float getPreis() {
        return preis;
    }

    public static ArrayList<Medium> getMedien() {
        return medien;
    }

    @Override
    public String toString() {
        return "Medium{" +
                "title='" + title + '\'' +
                ", verlag='" + verlag + '\'' +
                ", preis=" + preis +
                ", mediennummer=" + mediennummer +
                '}';
    }

}
