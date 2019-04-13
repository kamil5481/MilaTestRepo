//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.io.UncheckedIOException;
//import java.util.*;
//
//
//abstract class Zaba {
//
//    private final String imie;
//    private Integer wiek;
//
//    Zaba(String imieDoKlasy, Integer wiekDoKlasy) {
//        this.imie = imieDoKlasy;
//        this.wiek = wiekDoKlasy;
//    }
//
//    @Override
//    public String toString() {
//        return imie + " " + wiek;
//    }
//}
//
//
//class MlodaZabka extends Zaba {
//
//    MlodaZabka(String imieDoKlasy, Integer wiekDoKlasy) {
//        super(imieDoKlasy, wiekDoKlasy);
//    }
//
//    @Override
//    public String toString() {
//        return "Mloda Zabka" + " " + super.toString();
//    }
//}
//
//class Ropucha extends Zaba {
//
//    Ropucha(String imieDoKlasy, Integer wiekDoKlasy) {
//        super(imieDoKlasy, wiekDoKlasy);
//    }
//
//    @Override
//    public String toString() {
//        return "Ropucha" + " " + super.toString();
//    }
//}
//
//class Zabior extends Zaba {
//
//    Zabior(String imieDoKlasy, Integer wiekDoKlasy) {
//        super(imieDoKlasy, wiekDoKlasy);
//    }
//
//    @Override
//    public String toString() {
//        return "Zabior" + " " + super.toString();
//    }
//}
//
//
//public class Staw {
//    //pola klasy
//    static ArrayList<Zaba> staw = new ArrayList<>(3);
//    static int nadpisanaWielkoscStawu = 0;
//    static int licznikZabWStawie = 0;
//
//    //main
//    public static void main(String[] args) {
//
//        Scanner skaner = new Scanner(System.in);
//
//        int iloscZab = skaner.nextInt();
//        System.out.println(iloscZab);
//
//        final ArrayList<Zaba> listaZab = new ArrayList<>();
//
//        for (int x = 0; x < iloscZab; x++) {
//            String imie = skaner.next();
//            int wiek = skaner.nextInt();
//            System.out.println(imie);
//            System.out.println(wiek);
//
//            if (imie.endsWith("a") && wiek > 30) {
//                listaZab.add(new Ropucha(imie, wiek));
//            } else if (imie.endsWith("a")) {
//                listaZab.add(new MlodaZabka(imie, wiek));
//            } else {
//                listaZab.add(new Zabior(imie, wiek));
//            }
//        }
//
//        skaner.next();
//        nadpisanaWielkoscStawu = skaner.nextInt();
//        System.out.println(nadpisanaWielkoscStawu);
//
//
//        while (skaner.hasNext()) {
//
//            String polecenie = skaner.next();
//
//            switch (polecenie) {
//                case "JUMP":
//                    int ktoraZabaWskakuje = Integer.parseInt(skaner.next().replace("Z", ""));
//                    System.out.println(ktoraZabaWskakuje);
//
//                    if (staw.contains(listaZab.get(ktoraZabaWskakuje - 1))) ;
//                    else {
//                        wskocz(listaZab.get(ktoraZabaWskakuje - 1));
//                        licznikZabWStawie++;
//                        System.out.println(licznikZabWStawie);
//                    }
//                    break;
//
//                case "WYPISZ":
//                    wypiszZawartoscStawu();
//                    break;
//
//                case "ILOSC ROPUCH":
//                    System.out.println(podajIlośćRopuchWWstawie());
//                    break;
//
//                case "SHOW":
//                    System.out.println(show(skaner.nextInt()));
//                    break;
//
//                case "OUT":
//                    System.out.println(wyskoczPozycja(skaner.nextInt()));
//                    break;
//
//                case "OUT_FIRST":
//                    System.out.println(wyskoczPierwsza());
//                    break;
//
//                case "KONIEC":
//                    System.out.println("Koniec gry.");
//                    break;
//
//            }
//
//
//        }
//
//    }
//
//
//    //metody klasy
//    public static void wskocz(Zaba wskakujacaZaba) {
//        if (licznikZabWStawie + 1 <= nadpisanaWielkoscStawu) {
//            staw.add(wskakujacaZaba);
//        } else {
//            throw new RuntimeException("Staw jest pelny");
//        }
//    }
//
//    public static int podajIloscZabWStawie() {
//        return staw.size();
//    }
//
//    public static int podajIlośćRopuchWWstawie() {
//        int ilosc = 0;
//        for (int y = 0; y < staw.size(); y++) {
//            if (staw.get(y) instanceof Ropucha) {
//                ilosc++;
//            }
//        }
//        return ilosc;
//    }
//
//    public static Zaba wyskoczOstatnia() {
//        Zaba wyskoczylaOstatnia = staw.get(staw.size() - 1);
//        staw.remove(staw.size() - 1);
//        return wyskoczylaOstatnia;
//    }
//
//    public static Zaba wyskoczPierwsza() {
//        Zaba wyskoczylaPierwsza = staw.get(0);
//        staw.remove(0);
//        return wyskoczylaPierwsza;
//
//    }
//
//    public static Zaba wyskoczPozycja(int x) {
//        Zaba ktoraWyskoczyla = staw.get(x);
//        staw.remove(x);
//        return ktoraWyskoczyla;
//
//    }
//
//    public static void wypiszZawartoscStawu() {
//
//        System.out.println(staw);
//    }
//
//    public static String show(int pozycja) {
//        return staw.get(pozycja).toString();
//    }
//
//}
//
//
