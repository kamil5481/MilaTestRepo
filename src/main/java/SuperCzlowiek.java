import java.util.ArrayList;

public class SuperCzlowiek extends Czlowiek {

    public static ArrayList<String> kolejnoscTworzeniaSuperCzlowiekow = new ArrayList<>();
    private ArrayList<String> nazwaSupersily;

    SuperCzlowiek() {

    }

    SuperCzlowiek(String imieKtoreNadamy) {
        super(imieKtoreNadamy);
    }

    public SuperCzlowiek(String imieKtoreNadamy, String nazwaSupersily, Integer wiekKtoryNadamy, Boolean plecKtoranadamy) {
        super(imieKtoreNadamy, wiekKtoryNadamy, plecKtoranadamy);

        SuperCzlowiek.kolejnoscTworzeniaSuperCzlowiekow.add(imieKtoreNadamy);

        String[] tablicaPrzejsciowa = nazwaSupersily.split(" ");
        this.nazwaSupersily = new ArrayList<>();
        for (int a = 0; a < tablicaPrzejsciowa.length; a++) {
            this.nazwaSupersily.add(tablicaPrzejsciowa[a]);
        }


    }

    public SuperCzlowiek(String imieKtoreNadamy, Integer wiekKtoryNadamy, Boolean plecKtoraNadamy) {
        super(imieKtoreNadamy, wiekKtoryNadamy, plecKtoraNadamy);
    }


    public String podajImieCzlowieka() {
        return "super " + super.podajImieCzlowieka();

    }

    public ArrayList<String> getNazwaSupersily() {
        return nazwaSupersily;
    }


    public String getImie() {
        return "SUPER " + super.podajImieCzlowieka();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}



