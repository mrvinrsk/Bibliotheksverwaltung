import bibliothek.Buch;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Buch> buecher = new ArrayList<>();
        buecher.add(new Buch("Das große Java-Lern-Buch", "Hans Wurst", "3894573926178376352", "Cornelsen", 542, 29.99F));
        buecher.add(new Buch("Das große SQL-Lern-Buch", "Hans Wurst", "4674589026178377643", "Cornelsen", 157, 19.99F));

        for (Buch buch : Buch.getBuecher()) {
            System.out.println(buch.toString());
        }

        System.out.println("Die nächste freie Buchnummer ist: " + Buch.nextFree());
    }

}
