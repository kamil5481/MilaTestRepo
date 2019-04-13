//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.*;
//
//
//public class Solution2 {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        String liczbaBinarna = Integer.toBinaryString(in.nextInt());
//        System.out.println(liczbaBinarna);
//        char[] tablicaStringow;
//        tablicaStringow = liczbaBinarna.toCharArray();
//
//        ArrayList<Integer> ts = new ArrayList<>();
//        int licznikTymczasowy;
//
//        for (int x = 0; x < tablicaStringow.length; x++) {
//            licznikTymczasowy = 0;
//            while ((x + 2) < tablicaStringow.length && tablicaStringow[x + 1] == 0) {
//                licznikTymczasowy++;
//                if (tablicaStringow[x + 2] == '1') {
//                    ts.add(licznikTymczasowy);
//                }
//                x++;
//            }
//        }
//
//        if (ts.isEmpty()) {
//            System.out.println("0");
//        } else {
//            Collections.sort(ts);
//            System.out.println(ts.get(ts.size() - 1));
//        }
//    }
//}
