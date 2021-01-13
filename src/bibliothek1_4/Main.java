package bibliothek1_4;

public class Main {

    public static void main(String[] args) {
        Buch java = new Buch("Das große Java-Lern-Buch", "Hans Wurst", "3894573926178376352", "Cornelsen", 542, 29.99F);
        Buch sql = new Buch("Das große SQL-Lern-Buch", "Hans Wurst", "4674589026178377643", "Cornelsen", 157, 19.99F);

        for(Buch buch : Buch.getBuecher()) {
            System.out.println(buch.toString());
        }
    }

}
