package bibliothek1_4;

import java.util.ArrayList;

public class Buch {

    private static ArrayList<Buch> buecher = new ArrayList<>();
    String title, autor, isbn, verlag;
    int buchnummer, anzahlSeiten;
    private static int currentID = 0;

    public Buch(String title, String autor, String isbn, String verlag, int anzahlSeiten) {
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
        this.verlag = verlag;
        this.anzahlSeiten = anzahlSeiten;

        this.buchnummer = currentID;
        currentID++;

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
                '}';
    }

    public static int nextFree() {
        return currentID + 1;
    }

    public static ArrayList<Buch> getBuecher() {
        return buecher;
    }

}
