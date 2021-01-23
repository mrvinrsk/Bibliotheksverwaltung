package bibliothek5;

import java.util.ArrayList;

public class Buch {

    private static ArrayList<Buch> buecher = new ArrayList<>();
    private static int currentID = 0;

    private String title, autor, isbn, verlag;
    private int buchnummer, anzahlSeiten;
    private float preis;

    public static int nextFree() {
        return currentID + 1;
    }

    public static ArrayList<Buch> getBuecher() {
        return buecher;
    }


    public Buch(String title, String autor, String isbn, String verlag, int anzahlSeiten, float preis) {
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
        this.verlag = verlag;
        this.anzahlSeiten = anzahlSeiten;
        this.preis = preis;

        currentID++;
        this.buchnummer = currentID;

        buecher.add(this);
    }

    @Override
    public String toString() {
        return "Buch{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", verlag='" + verlag + '\'' +
                ", buchnummer=" + buchnummer +
                ", anzahlSeiten=" + anzahlSeiten +
                ", preis=" + preis + "€" +
                '}';
    }

    public static int getCurrentID() {
        return currentID;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getVerlag() {
        return verlag;
    }

    public int getBuchnummer() {
        return buchnummer;
    }

    public int getAnzahlSeiten() {
        return anzahlSeiten;
    }

    public float getPreis() {
        return preis;
    }

}
