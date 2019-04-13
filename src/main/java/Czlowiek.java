
public class Czlowiek {

    private String imie;
    private Integer wiek;
    private Boolean plec;

    Czlowiek() {
        ///my second commit
    }

    Czlowiek(String imieKtoreNadamy) {
        this.imie = imieKtoreNadamy;

    }

    Czlowiek(String imieKtoreNadamy, Integer wiekKtoryNadamy, Boolean plecKtoraNadamy) {
        this.imie = imieKtoreNadamy;
        this.wiek = wiekKtoryNadamy;
        this.plec = plecKtoraNadamy;
    }

    public String podajImieCzlowieka() {
        return imie;

    }

    public Integer podajWiekCzlowieka() {
        return wiek;

    }

    public String podajPlecCzlowieka() {

        if (plec == true) {
            String plec = "mezczyzna";
            return plec;
        } else {
            String plec2 = "kobieta";
            return plec2;

        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Czlowiek) {
            Czlowiek czlowiekZktorymPorownojemy = (Czlowiek) obj;
            if (this.imie.equals(czlowiekZktorymPorownojemy.imie)
                    && (this.wiek.equals(czlowiekZktorymPorownojemy.wiek))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}


