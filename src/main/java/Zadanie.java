import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie {

    public static void main(String[] args) throws FileNotFoundException {
        File wskaznikNaDaneLudzi = new File("ludzie.txt");
        Scanner odczytDanych = new Scanner(wskaznikNaDaneLudzi);
        odczytDanych.useDelimiter(";");
        ArrayList<Czlowiek> listaLudzi = new ArrayList<>();

        while (odczytDanych.hasNext()) {
            String sprawdzenie = odczytDanych.next();

            if (sprawdzenie.equals("Czlowiek") || sprawdzenie.equals("\nCzlowiek")) {
                Integer wiek = odczytDanych.nextInt();
                String imie = odczytDanych.next();
                Integer plecInt = odczytDanych.nextInt();

                Czlowiek czlowiekZPliku = new Czlowiek(imie, wiek, plecBoolean(plecInt));

                if (listaLudzi.contains(czlowiekZPliku)){
                    System.out.println("zawiera juz tego czlowieka");
                }
                else {
                listaLudzi.add(czlowiekZPliku);
                }

                System.out.println("Imie: " +czlowiekZPliku.podajImieCzlowieka() +"\n" +"wiek: " +czlowiekZPliku.podajWiekCzlowieka() +"\n"+ "plec: " + czlowiekZPliku.podajPlecCzlowieka());
                // liczbaLudzi++;
            } else {
                Integer wiek = odczytDanych.nextInt();
                String imie = odczytDanych.next();
                Integer plec = odczytDanych.nextInt();
                String nazwaSupersily = odczytDanych.next();


                SuperCzlowiek czlowiekZPliku = new SuperCzlowiek(imie,nazwaSupersily, wiek, plecBoolean(plec));

                if (listaLudzi.contains(czlowiekZPliku)){
                    System.out.println("ten czlowiek juz istnieje");
                }
                else {
                    listaLudzi.add(czlowiekZPliku);
                }
                System.out.println("imie: "+ czlowiekZPliku.getImie());

                ArrayList<String> przypisanaKolejnosc = SuperCzlowiek.kolejnoscTworzeniaSuperCzlowiekow;
                ArrayList<String> przypisaneSupersily = czlowiekZPliku.getNazwaSupersily();
                for (int c = 0; c<przypisaneSupersily.size(); c++){
                    System.out.println("Supersila "+ (c+1) +": " + przypisaneSupersily.get(c));
                }

                System.out.println("wiek: "+ czlowiekZPliku.podajWiekCzlowieka() + "\n" +"plec: "+czlowiekZPliku.podajPlecCzlowieka());

                //liczbaLudzi++;
            }
            System.out.println();

        }
        //System.out.println(listaLudzi.size());

        int a = 0;
        Integer sumaWiekow = 0;
        while (a <= listaLudzi.size() - 1) {
            sumaWiekow = sumaWiekow + listaLudzi.get(a).podajWiekCzlowieka();
            a++;

        }
        System.out.println(sumaWiekow);
        double srednia = (double) sumaWiekow / (double) listaLudzi.size();
        System.out.println(srednia);



        Integer sumaWiekuCzlowiekow =0;
        Integer iloscCzlowiekow = 0;
        Integer iloscSuperCzlowiekow = 0;
        Integer sumaWiekuSuperCzlowiekow = 0;
        //todo dokocczyc by sie ladnie liczylo
        //pozniej przepisac rozwiazanie bez instance offa tak jak Ty sugerowalas

       for (int b=0; b<=listaLudzi.size()-1; b++) {
           Czlowiek pobranyCzlowiek = listaLudzi.get(b);
           String pobraneImie = pobranyCzlowiek.podajImieCzlowieka();
           if (pobraneImie.contains("super")) {
               iloscSuperCzlowiekow++;
               sumaWiekuSuperCzlowiekow += pobranyCzlowiek.podajWiekCzlowieka();
           } else {
               iloscCzlowiekow++;
               sumaWiekuCzlowiekow += pobranyCzlowiek.podajWiekCzlowieka();

           }

       }

       double sredniaWiekuCzlowiekow = (double) sumaWiekuCzlowiekow / (double) iloscCzlowiekow;
        System.out.println(sredniaWiekuCzlowiekow);
        double sredniaWiekuSuperCzowiekow = (double)sumaWiekuSuperCzlowiekow / (double) iloscSuperCzlowiekow;


        System.out.println(sredniaWiekuSuperCzowiekow);


        System.out.println();
        System.out.println(SuperCzlowiek.kolejnoscTworzeniaSuperCzlowiekow);
        System.out.println(SuperCzlowiek.kolejnoscTworzeniaSuperCzlowiekow.indexOf("Kamil Pe"));
        System.out.println(SuperCzlowiek.kolejnoscTworzeniaSuperCzlowiekow.indexOf("Mila"));

        Czlowiek pierwszyCzlowiek = listaLudzi.get(0);
        System.out.println(pierwszyCzlowiek.podajImieCzlowieka());
        System.out.println(listaLudzi.indexOf(pierwszyCzlowiek));

        Czlowiek drugiCzlowiek = listaLudzi.get(1);
        Czlowiek trzeciCzlowiek = listaLudzi.get(2);

        if (pierwszyCzlowiek.podajImieCzlowieka().equals(drugiCzlowiek.podajImieCzlowieka())){
            System.out.println("rowne");
        }

        if (pierwszyCzlowiek.equals(drugiCzlowiek)){
            System.out.println(" 1wszy == 2gi ");
        }

        if (pierwszyCzlowiek.equals(trzeciCzlowiek)){
            System.out.println(" 1wsszy == 3ci");
        }

        if (pierwszyCzlowiek.equals(pierwszyCzlowiek.podajImieCzlowieka())){
            System.out.println(" czlowiek == imie");
        }
        if ((pierwszyCzlowiek.podajImieCzlowieka()).equals(pierwszyCzlowiek)){
            System.out.println(" imie == czlowiek");
        }

        System.out.println("Wielkosc listy " + listaLudzi.size());
        System.out.println(listaLudzi.size());


        //for (int b = 0; b <= listaLudzi.size() - 1; b++) {
          //  Czlowiek pobranyCzlowiek = listaLudzi.get(b);
            //if (pobranyCzlowiek instanceof SuperCzlowiek) {
              //  iloscSuperCzlowiekow++;
              //  sumaWiekuSuperCzlowiekow = sumaWiekuSuperCzlowiekow + pobranyCzlowiek.podajWiekCzlowieka();


            //}else{
               // iloscCzlowiekow++;
              //  sumaWiekuCzlowiekow = sumaWiekuCzlowiekow + pobranyCzlowiek.podajWiekCzlowieka();

            //}
            //System.out.println(iloscCzlowiekow);
            //System.out.println(sumaWiekuCzlowiekow);

           // double sredniaWiekuCzlowiekow = (double) sumaWiekuCzlowiekow / (double) iloscCzlowiekow;
           // System.out.println(sredniaWiekuCzlowiekow);

            //System.out.println(sredniaWiekuSuperCzlowiekow);
            //System.out.println(iloscSuperCzlowiekow);
            //System.out.println(sumaWiekuSuperCzlowiekow);
            //double sredniaWiekuSuperCzlowiekow = (double) sumaWiekuSuperCzlowiekow / (double) iloscSuperCzlowiekow;




    }




    static Boolean plecBoolean(Integer plecInt) {
        if (plecInt.equals(0)) {
            return true;
        } else {
            return false;
        }
    }
    static String plecString(Boolean plecBoolean){
        if (plecBoolean.equals(true)) {
            return "mezczyzna";
        }else {
            return "kobieta";

            }
        }
    }





