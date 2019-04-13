//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class Main {
//  public static void main(String[] args) {
//
////      byte bajt = 127;
////
////      //System.out.println((byte) (bajt + 100));
////
////      int emila;
////      emila = 123;
////
////      int kamil = 123;
////
////      long kamil2 = 123;
////
////      //System.out.println(emila);
////
////      //System.out.println(kamil);
////
////      emila = emila + 2;
////
////      //System.out.println(emila);
////
////      emila = emila + kamil;
////
////      //System.out.println(emila);
////
////      //System.out.println(emila + kamil);
////
////      //System.out.println(emila);
////
////      double mlody;
////      mlody = 3.14321321323213213123132131231232131232131231231231223123123123211312;
////
////      //System.out.println((float) mlody);
////
////      float mlody2;
////      mlody2 = 3.14321321323213213123132131231232131232131231231231223123123123211312f;
////      //System.out.println(mlody2 + (float) mlody);
////      //System.out.println(mlody);
////      //System.out.println((double) mlody2);
////
////
////      boolean prawda = true;
////      boolean falsz = false;
////
////      //System.out.println(prawda);
////      //System.out.println(falsz);
////
////      //System.out.println(falsz || falsz);
////      //System.out.println((prawda && prawda) || falsz);
////      //System.out.println(prawda ^ prawda);
////
////
////      char znaczek = 37;
////      char znaczek2 = 'a';
////
////      //System.out.println(znaczek);
////      //System.out.print(znaczek2);
////      //System.out.print(znaczek2);
////      //System.out.println(znaczek2);
////
////      String ciagznakow = new String("bbbbb");
////
////      //System.out.println(ciagznakow + ciagznakow);
////
////      // int i = 5 % 3;
////
//////  if (i == 0) {
////      //System.out.println("pierwszy");
////      //} else if (i == 1){
////      //System.out.println("drugi");
////      // } else {
////      //System.out.println("trzeci");
//////  }
////
////      int[] mieszkanie = new int[3];
////
////      mieszkanie[0] = emila;
////      mieszkanie[1] = (int) mlody;
////      mieszkanie[2] = kamil;
////
////      //System.out.println(mieszkanie[1]  + mieszkanie[0]);
////
////      int[][][] mieszkanie2 = new int[9][9][9];
////
////      mieszkanie2[8][8][8] = 1;
////      Scanner czytnik = new Scanner(System.in);
////      //String Linia = czytnik.nextLine();
////      //System.out.println(Linia);
////
////      //for (int j=2; j<6; j++){
////      //String Linia = czytnik.nextLine();
////      //System.out.println(Linia);
////
////
////      //}
////
////
////      int k = 0;
////      //System.out.println(k);
////      //System.out.println(k++);
////      //System.out.println(k);
////      //System.out.println(++k);
////      //System.out.println(k--);
////      //System.out.println(--k);
////
////      int A = 0;
////      int B = 0;
////      int C = 0;
////      for (int a = 0; a < 10; a++) {
////          //A = czytnik.nextInt();
////          //B = czytnik.nextInt();
////          //C = czytnik.nextInt();
////          if (a == 0) {
////// A = czytnik.nextInt();
////
////          }
////          if (a == 1) {
////              //B = czytnik.nextInt();
////          } else if (a == 2) {
////              //C = czytnik.nextInt();
////          }
////      }
////
////      int[] tablica = new int[3];
////      tablica[0] = A;
////      tablica[1] = B;
////      tablica[2] = C;
////
////
////      int b = 0;
////      //while(b<3){
////      //System.out.print(tablica[b++]);
////      //}
//////
////
////
////      // while (k<3) {
////      //System.out.print(k++);
////
////
////      int[] arr = new int[]{4, 3, 8, 9, 2};
//////  int n = arr.length;
//////  for (int i = 0; i < n - 1; i++) {
//////
//////   for (int j = 0; j < n - i - 1; j++) {
//////
//////    if (arr[j] > arr[j + 1]) {
//////     int temp = arr[j];
//////      arr[j] = arr[j + 1];
//////     arr[j + 1] = temp;
//////    }
//////
//////   }
//////
//////  }
////
////      int n = arr.length;
////      for (int i = 1; i < n; i++) {
////          int key = arr[i];
////          int j = i - 1;
////
////          while (j >= 0 && arr[j] > key) {
////              arr[j + 1] = arr[j];
////              j = j - 1;
////          }
////          arr[j + 1] = key;
////      }
////      int c = 0;
////      while (c < 5) {
////          System.out.print(arr[c++]);
////      }
////
////      int E = funkcjapierwsza(2, 4);
////      System.out.println(E);
////
////      insertSort(arr);
////
//////
//////    while(E < 100) {
////
////      //  }
////      String ciąg = new String("Kamil");
////      System.out.println(ciąg);
////
////      String ciąg2 = new String("Kamil");
////      System.out.println(ciąg2);
////
////      if (ciąg.equals(ciąg2)) {
////          System.out.println("rowne");
////      }
////
////      String tekst = "ABC";
////      String tekst2 = "ABD";
////
////      if (tekst == tekst2) {
////          System.out.println(new String("SĄ RÓWNE"));
////      }
////
////      System.out.println(tekst.length());
////      System.out.println(tekst.charAt(2));
////      System.out.println(tekst.concat("DEF"));
////      System.out.println(tekst + "DEF");
////      System.out.println(tekst.contains("AB"));
////      System.out.println(tekst.replace("A", "D"));
////      System.out.println(tekst.split("C")[0]);
////
////
////      tekst.replace("C", "D");
////      if (tekst.equals(tekst2)) {
////          System.out.println("OSTATNIE ZADANIE");
////      }
////      tekst = tekst.replace("C", "D");
////      if (tekst.equals(tekst2)) {
////          System.out.println("OSTATNIE ZADANIE");
////      }
////      String blabla = new String("CBA");
////      Kamil(blabla);
////
////
////      int integer = 3;
////      String string = new String("Milu");
////      String[] albania = new String[2];
////      albania[0] = string;
////
////      String result = Mila(integer, string, albania);
////      System.out.println(result);
////      System.out.println(result+"ramciam");
////
////      //int g = 5;
////      //int h = 4;
////      //int i = 3;
////      //int j = 2;
////      //int m = 1;
////      //int wynik =g*h*i*j*m;
////      //System.out.println(wynik);
////
////
////    //  int z = czytnik.nextInt();
////    //  System.out.println(z);
////
////     // for(int y=1; y<=z; y++) {
////
////     //               System.out.println(y);
////      //}
////
////    //  int o = 1;
////      //int z = czytnik.nextInt();
////      //for(int y=1; y<=z; y++ ) {
////       //  o = y*o;
////
////        //  System.out.println(o);
////
////     // }
////
////      //long i= 50;
////      //long silnia = factorial(i);
////      //System.out.println(silnia);
////
////     // int z1 = czytnik.nextInt();
////      //int z2 = czytnik.nextInt();
////      //int z3 = czytnik.nextInt();
////      //int z4 = czytnik.nextInt();
////      //int z5 = czytnik.nextInt();
////      //int z6 = czytnik.nextInt();
////
////     // int z1 = 0;
////      //int z2 = 0;
////      //int z3 = 0;
////      //int z4 = 0;
////      //int z5 = 0;
////      //int z6 = 0;
////
////
////
////
////      //int[] tablicaz= new int[6];
////      //tablicaz [0] = z1;
////      //tablicaz [1]=z2;
////      //tablicaz [2]=z3;
////      //tablicaz [3]=z4;
////      //tablicaz [4]=z5;
////      //tablicaz [5]=z6;
////
////     // for(int y=0; y<=5; y++) {
////        //  int t = czytnik.nextInt();
////         // tablicaz[y] = t;
////
////
////   //   }
////  //    int suma = tablicaz[1] + tablicaz[3] + tablicaz[5];
////     // System.out.println(suma);
////
////
////      int x1 = 0;
////      int[] kolejnaTablica= new int[10];
////
////      int t = 0;
////      int v = 0;
////      int suma = 0;
////      int sumaWlasciwa = 0;
////
////
//////      while (t!=-1) {
//////          t = czytnik.nextInt();
//////
//////          kolejnaTablica[v]=t;
//////          v = v+1;
//////          suma = suma + t;
//////
//////         // if (t == -1) break;
//////
//////
//////      }
//////      sumaWlasciwa= suma + 1;
//////      double srednia = sumaWlasciwa/(v-1);
//////      System.out.println(v-1);
//////      System.out.println(sumaWlasciwa);
//////      System.out.println(srednia);
////
////
////
////     // File wskaznikNaPlik = new File("C:/Users/kubas/Desktop/b.txt");
////      //System.out.println("czy istnieje");
////      //System.out.println(wskaznikNaPlik.exists());
////      //Scanner in = null;
////        //try {
////       //     in = new Scanner(wskaznikNaPlik);
////       // } catch (FileNotFoundException e) {
////        //    System.out.println("ni ma");
////       // }
////      //System.out.println("czy ma linie");
////     // System.out.println(in.hasNextLine());
////     // System.out.println("czy ma inta");
////      //System.out.println(in.hasNextInt());
////       // String odczytZdania = in.nextLine();
////     // System.out.println(odczytZdania);
////     // System.out.println("czy ma linie " + in.hasNextLine());
////       // String odczytZdania2 = in.nextLine();
////      //System.out.println(odczytZdania2);
////      //System.out.println("czy ma linie " + in.hasNextLine());
////
////      //PrintWriter zapis = null;
////      //File file = new File("ludzie.txt");
////      //try {
////        //  zapis = new PrintWriter(file);
////      //} catch (FileNotFoundException e) {
////
////      //}
////
////
////
////      //zapis.print("Ala ma kota a kot ma Ale\n");
////      //zapis.print("Ala ma kota a kot ma Ale\n");
////
////      //zapis.close();
//////
//////
//////      File wskaznikNaPlik2 = new File("ludzie.txt");
//////      Scanner nowy = null;
//////      try {
//////          nowy = new Scanner(wskaznikNaPlik2);
//////      } catch (FileNotFoundException e) {
//////          System.out.println("ni ma");
//////      }
//////
//////      Integer odczytZA = nowy.nextInt();
//////      System.out.println(odczytZA);
//////
//////      PrintWriter zapis2 = null;
//////      File file2 = new File("ludzie.txt");
//////      try {
//////          zapis2 = new PrintWriter(file2);
//////      } catch (FileNotFoundException e) {
//////
//////
//////      }
//////
//////      zapis2.print(odczytZA + 1);
//////      zapis2.close();
////
////      Czlowiek Kamil = new Czlowiek("Kamil", 25, true);
////
////      System.out.println(Kamil.podajImieCzlowieka());
////      System.out.println(Kamil.podajPlecCzlowieka());
////      System.out.println(Kamil.podajWiekCzlowieka());
////
////
//////
////     //  SuperCzlowiek mila = new SuperCzlowiek("Mila");
//////      System.out.println(mila.nazwaSupersily);
////   //   System.out.println(mila.podajImieCzlowieka());
////   //   System.out.println("supersila: " + mila.nazwaSupersily);
////   //   System.out.println(mila.plec);
////   //  System.out.println(mila.wiek);
////
////   //  SuperCzlowiek mila2 = new SuperCzlowiek("Mila","superoburzanie sie", 24,false);
////     // System.out.println(mila2.podajImieCzlowieka());
////      //System.out.println(mila2.podajPlecCzlowieka());
////      //System.out.println(mila2.podajWiekCzlowieka());
////      //System.out.println("supersila: " + mila2.getNazwaSupersily());
////
//
//      Scanner czytnik =new Scanner(System.in);
//      Integer[] tablicaDoZadania=new Integer[9];
//      Integer m = 0;
//      int q =0;
//
//      while(m!=-1){
//          m=czytnik.nextInt();
//          tablicaDoZadania[q]= m;
//
//          q=q+1;
//      }
//
//      String polaczoneCyfry = new String();
//      for (int p=0; p<q-1;p++) {
//          polaczoneCyfry = polaczoneCyfry + tablicaDoZadania[p].toString();
//
//      }
//      System.out.println(polaczoneCyfry);
//      Integer wynik = new Integer(polaczoneCyfry);
//      wynik = wynik - 10;
//      System.out.println(wynik);
//
//
//      Integer[] tablicaIntow = new Integer[5];
//      tablicaIntow[0] = 1;
//      tablicaIntow[1] = 2;
//      tablicaIntow[2] = 3;
//
//      ArrayList<Integer> listaIntow = new ArrayList<>();
//      listaIntow.add(1);
//      listaIntow.add(2);
//      listaIntow.add(3);
//
//
//      LinkedList<Integer> integerLinkedList = new LinkedList<>();
//      integerLinkedList.add(1);
//      integerLinkedList.add(2);
//      integerLinkedList.add(3);
//
//
//      System.out.println(tablicaIntow[0]);
//      System.out.println(listaIntow.get(0));
//      System.out.println(integerLinkedList.get(0));
//
////        int pobranaWartosc = 0;
////        while (pobranaWartosc != -1) {
////            pobranaWartosc = czytnik.nextInt();
////            listaIntow.add(pobranaWartosc);
////            System.out.println(listaIntow.size());
////        }
//
//
//      ArrayList<SuperCzlowiek> listaSuperCzlowiekow = new ArrayList<>();
//      listaSuperCzlowiekow.add(kamil);
//      listaSuperCzlowiekow.add(mila);
//
//
//      System.out.println(listaSuperCzlowiekow.get(1).getNazwaSupersily());
//      System.out.println(listaSuperCzlowiekow.get(listaSuperCzlowiekow.size()-1).getImie());
//
//
//
//
//
//
//
//
//  }
//
//
//    static long factorial(long i) {
//        if (i == 1L) {
//            return 1L;
//        } else {
//            return i* factorial(--i);
//
//        }
//
//
//
//    }
//
//
//  static void Kamil(String jakisarumentdowypisania){
//      System.out.println(jakisarumentdowypisania);
//
//  }
//
//  static String Mila(int integer, String string, String[] ciamciaramciam){
//      return new String("ciamciam");
//  }
//
//
//
//
//
// static void insertSort(int[] arr) {
//  int n = arr.length;
//  for (int i = 1; i < n; i++) {
//   int key = arr[i];
//   int j = i - 1;
//
//   while (j >= 0 && arr[j] > key) {
//    arr[j + 1] = arr[j];
//    j--;
//   }
//   arr[j + 1] = key;
//  }
//
// }
//
//
// static int funkcjapierwsza(int A, int B){
//   int C = A+B;
//   return C;
// }
//
//
// int[] bubbleSort(int[] arr) {
//  int n = arr.length;
//  for (int i = 0; i < n - 1; i++) {
//
//   for (int j = 0; j < n - i - 1; j++)
//
//    if (arr[j] > arr[j + 1]) {
//     int temp = arr[j];
//     arr[j] = arr[j + 1];
//     arr[j + 1] = temp;
//    }
//  }
//  return arr;
// }
//
//
//
//}
//
//
