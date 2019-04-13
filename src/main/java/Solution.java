// ////import java.io.*;
//////////////import java.math.*;
//////////////import java.security.*;
//////////////import java.text.*;
//////////////import java.util.*;
//////////////import java.util.concurrent.*;
//////////////import java.util.regex.*;
//////////////
//////////////public class Solution {
//////////////
//////////////
//////////////
//////////////    private static final Scanner scanner = new Scanner(System.in);
//////////////
//////////////    public static void main(String[] args) {
//////////////        int N = scanner.nextInt();
//////////////        if (N%2 == 1 || N<=20 && N>=6){
//////////////        System.out.println("Weird");}
//////////////        else {
//////////////            System.out.println("Not Weird");
//////////////        }
//////////////
//////////////
//////////////
//////////////        scanner.close();
//////////////    }
//////////////}
//////////
//////////import java.util.Locale;
//////////import java.util.Scanner;
//////////
//////////public class Solution {
//////////
//////////    public static void main(String[] args) {
//////////        Scanner scan = new Scanner(System.in);
//////////        scan.useLocale(Locale.US);
//////////        Integer i = scan.nextInt();
//////////        double d = scan.nextDouble();
//////////        String s= "";
//////////        while (scan.hasNext()) {
//////////            String next = scan.next();
//////////            s = s +" " +next;
//////////        }
//////////
//////////
//////////        System.out.println("String: " + s);
//////////        System.out.println("Double: " + d);
//////////        System.out.print("Int: " + i);
//////////    }
//////////}
//////////
////////
////////import java.util.Scanner;
////////
////////public class Solution {
////////
////////    public static void main(String[] args) {
////////        Scanner sc = new Scanner(System.in);
////////        System.out.println("================================");
////////        for (int i = 0; i < 3; i++) {
////////
////////            String s1 = sc.next();
////////            while (s1.length()<15){
////////                s1 = s1.concat(" ");
////////                            }
////////            System.out.print(s1);
////////
////////            int x = sc.nextInt();
////////            if (99<x && x<=999){
////////                System.out.println(x);
////////            }
////////            else if (9<x && x<100){
////////                System.out.println("0"+x);
////////            }
////////            else {
////////                System.out.println("00"+x);
////////            }
////////
////////        }
////////        System.out.println("================================");
////////
////////    }
////////}
//////
//////import java.io.*;
//////import java.math.*;
//////import java.security.*;
//////import java.text.*;
//////import java.util.*;
//////import java.util.concurrent.*;
//////import java.util.regex.*;
//////
//////public class Solution {
//////
//////
//////
//////    private static final Scanner scanner = new Scanner(System.in);
//////
//////    public static void main(String[] args) {
//////        int N = scanner.nextInt();
//////        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//////
//////        for (int i =1; i<=10; i++ ){
//////            int result = N*i;
//////            System.out.println(N +" x "+i+" = "+ result);
//////        }
//////
//////
//////        scanner.close();
//////    }
//////}
////
//////import java.util.*;
//////import java.io.*;
//////
//////class Solution {
//////    public static void main(String[] argh) {
//////        Scanner in = new Scanner(System.in);
//////        int t = in.nextInt();
//////        ArrayList<String> listaWynikow = new ArrayList<>();
//////        for (int i = 0; i < t; i++) {
//////            int a = in.nextInt();
//////            int b = in.nextInt();
//////            int n = in.nextInt();
//////
//////            int m = 1;
//////            Integer result = 0;
//////            String result2 =null;
//////
//////            for (int j = 0; j < n; j++) {
//////                if (j == 0) {
//////                    result = (a + b);
//////                    result2 = result.toString();
//////
//////                    listaWynikow.add(result2);
//////                }
//////                else {
//////                    m = m * 2;
//////
//////                    result = result+(m*b);
//////                    result2 = listaWynikow.get(i);
//////                    listaWynikow.remove(i);
//////                    result2 = result2 + " " + result.toString();
//////                    listaWynikow.add(result2);
//////                }
//////            }
//////
//////        }
//////
//////        for (int p = 0; p<listaWynikow.size(); p++) {
//////        System.out.println(listaWynikow.get(p));}
//////
//////
//////        in.close();
//////    }
//////}
//////import java.io.*;
//////import java.util.*;
//////
//////public class Solution {
//////
//////    public static void main(String[] args) {
//////        Scanner skaner = new Scanner(System.in);
//////        ArrayList <String> listaLinii = new ArrayList<>();
//////        String blabla = "";
//////        while (!blabla.contains("end-of-file.")) {
//////            blabla = skaner.nextLine();
//////            listaLinii.add(blabla);
//////        }
//////
//////            for (int p = 0; p<listaLinii.size(); p++){
//////                System.out.println( (p+1) + " " + listaLinii.get(p));
//////            }
//////
//////        skaner.close();
//////
//////    }
//////}
//////
////
//////import com.sun.xml.internal.fastinfoset.util.CharArray;
//////
//////import java.io.*;
//////import java.util.*;
//////
//////public class Solution {
//////
//////    public static void main(String[] args) {
//////
//////        Scanner sc=new Scanner(System.in);
//////        String A=sc.next();
//////        String B=sc.next();
//////
//////        int dlugosc = A.length() + B.length();
//////        int wynik = (A.compareTo(B));
//////        String ostatni = null;
//////        String wynik2 = null;
//////        if (wynik<=0){
//////            wynik2 = "No";
//////        }
//////        else {
//////            wynik2 = "Yes";
//////
//////        }
//////
//////        String pierwszaDuzaLitera = A.substring(0,1).toUpperCase();
//////        String drugaDuzaLitera = B.substring(0,1).toUpperCase();
//////
//////
//////        A = pierwszaDuzaLitera + A.substring(1);
//////        B = drugaDuzaLitera + B.substring(1);
//////        ostatni = A.concat(" " +B);
//////        System.out.println(dlugosc);
//////        System.out.println(wynik2);
//////        System.out.println(ostatni);
//////
//////    }
//////}
//////import java.io.*;
//////import java.util.*;
//////import java.text.*;
//////import java.math.*;
//////import java.util.regex.*;
//////
//////public class Solution {
//////
//////    public static void main(String[] args) {
//////        Scanner in = new Scanner(System.in);
//////        String S = in.next();
//////        int start = in.nextInt();
//////        int end = in.nextInt();
//////        S = S.substring(start,end);
//////        System.out.println(S);
//////    }
//////}
//////
//////import java.util.ArrayList;
//////import java.util.Scanner;
//////
//////public class Solution {
//////
//////    public static String getSmallestAndLargest(String s, int k) {
//////        String smallest = "";
//////        String largest = "";
//////
//////        ArrayList<String> listaSubStringow= new ArrayList<>();
//////
//////        for (int y = 0; y < s.length() - k+1; y++) {
//////            listaSubStringow.add(s.substring(y, y + k));
//////        }
//////
//////        for (int i = 0;i<listaSubStringow.size();i++){
//////            if(smallest.compareTo(listaSubStringow.get(i)) < 0 || smallest.isEmpty()){
//////                smallest = listaSubStringow.get(i);
//////            }
//////            if (largest.compareTo(listaSubStringow.get(i)) > 0 || largest.isEmpty()){
//////                largest  = listaSubStringow.get(i);
//////            }
//////        }
//////
//////
//////        return largest + "\n" + smallest;
//////    }
//////
//////
//////    public static void main(String[] args) {
//////        Scanner scan = new Scanner(System.in);
//////        String s = scan.next();
//////        int k = scan.nextInt();
//////        scan.close();
//////
//////        System.out.println(getSmallestAndLargest(s, k));
//////    }
//////}
//////import java.io.*;
//////import java.sql.SQLOutput;
//////import java.util.*;
//////
//////public class Solution {
//////
//////    public static void main(String[] args) {
//////
//////        Scanner sc=new Scanner(System.in);
//////        String A=sc.next();
//////        ArrayList<Character> tablicaLiter = new ArrayList<>();
//////        ArrayList <Character> tablicaLiterOdwrotna = new ArrayList<>();
//////
//////        for (int x = 0; x<A.length(); x++){
//////            tablicaLiter.add(A.charAt(x));
//////
//////        }
//////
//////        for (int y = tablicaLiter.size(); y>0; y--){
//////            tablicaLiterOdwrotna.add(A.charAt(y-1));
//////
//////        }
//////        String stringZTablicy = "";
//////
//////        for (int q=0; q<tablicaLiterOdwrotna.size();q++){
//////            String kolejneLitery = tablicaLiterOdwrotna.get(q).toString();
//////            stringZTablicy = stringZTablicy.concat(kolejneLitery);
//////
//////
//////        }
//////
//////        //System.out.println(A);
//////
//////        //System.out.println(stringZTablicy);
//////
//////        if (A.equals(stringZTablicy)){
//////            System.out.println("Yes");
//////        }
//////        else{
//////            System.out.println("No");
//////        }
//////
//////
//////
//////
//////
//////
//////    }
//////}
//////
//////
//////
//////import java.util.Scanner;
//////
//////public class Solution {
//////
//////
//////    static String noDuplicates(String str){
//////        StringBuilder sb = new StringBuilder();
//////        int idx;
//////        for (int i = 0; i < str.length(); i++) {
//////            char c = str.charAt(i);
//////            idx = str.indexOf(c, i + 1);
//////            if (idx == -1) {
//////                sb.append(c);
//////            }
//////        }
//////        return sb.toString();
//////    }
//////
//////
//////    static boolean isAnagram(String a, String b) {
//////        if (a == null || b == null || a.length() != b.length()) {
//////            return false;
//////        }
//////
//////        String aa = noDuplicates(a.toLowerCase());
//////        String bb = noDuplicates(b.toLowerCase());
//////        int suma = 0;
//////        int suma2 = 0;
//////
//////        char[] tablicaCharowAA = aa.toCharArray();
//////        for (int x = 0; x<aa.length();x++){
//////                suma = suma + tablicaCharowAA[x];
//////        }
//////
//////        char[] tablicaCharowAAA = a.toLowerCase().toCharArray();
//////        for (int x = 0; x<a.toLowerCase().length();x++){
//////            suma = suma + tablicaCharowAAA[x];
//////        }
//////
//////
//////        char[] tablicaCharowBB = bb.toCharArray();
//////        for (int x = 0; x<bb.length();x++){
//////            suma2 = suma2 + tablicaCharowBB[x];
//////        }
//////        char[] tablicaCharowBBB = b.toLowerCase().toCharArray();
//////        for (int x = 0; x<b.toLowerCase().length();x++){
//////            suma2 = suma2 + tablicaCharowBBB[x];
//////        }
//////
//////
//////        if (suma!=suma2){
//////                return false;
//////            }
//////            else {
//////                return true;
//////            }
//////
//////        }
//////
//////    public static void main(String[] args) {
//////
//////        Scanner scan = new Scanner(System.in);
//////        String a = scan.next();
//////        String b = scan.next();
//////        scan.close();
//////        boolean ret = isAnagram(a, b);
//////        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//////    }
////
//////
//////import java.io.*;
//////import java.util.*;
//////
//////public class Solution {
//////
//////    public static void main(String[] args) {
//////        Scanner scan = new Scanner(System.in);
//////        String s = scan.nextLine();
//////        String[] tablicaStringow;
//////        ArrayList<String> listaStringow = new ArrayList<>();
//////
//////
//////        tablicaStringow = s.split(" |!|\\?|_|'|\\.|,|@");
//////        //System.out.println(tablicaStringow.length);
//////
//////
//////        for (int x = 0; x < tablicaStringow.length; x++) {
//////            if (tablicaStringow[x].isEmpty()) {
//////
//////            } else {
//////                listaStringow.add(tablicaStringow[x]);
//////            }
//////        }
//////        System.out.println(listaStringow.size());
//////
//////        for (int y = 0; y < listaStringow.size(); y++) {
//////            System.out.println(listaStringow.get(y));
//////
//////        }
//////
//////        scan.close();
//////    }
//////}
//////import java.util.regex.Matcher;
//////import java.util.regex.Pattern;
//////import java.util.Scanner;
//////
//////class Solution{
//////
//////    public static void main(String[] args){
//////        Scanner in = new Scanner(System.in);
//////        while(in.hasNext()){
//////            String IP = in.next();
//////            System.out.println(IP.matches(new MyRegex().pattern));
//////        }
//////
//////    }
//////}
//////
//////class MyRegex {
//////    private String iP;
//////
//////    MyRegex(String ipKtoreNadamy){
//////        this.iP = ipKtoreNadamy;
//////        Pattern pattern = Pattern.compile("[0-225]\\.[0-225]\\.[0-225]\\.[0-225]");
//////       Matcher matcher = pattern.matcher (ipKtoreNadamy);
//////        boolean b =matcher.matches();
//////        System.out.println(b);
//////
//////
//////    }
//////
//////}
////
//////import java.util.Scanner;
//////import java.util.regex.Matcher;
//////import java.util.regex.Pattern;
//////
//////class UsernameValidator {
//////
//////
//////
//////
//////    public static final String regularExpression =("[a-zA-Z]{1}[a-zA-Z0-9_]{7,29}");
//////
//////
////// }
//////
//////
//////public class Solution {
//////    private static final Scanner scan = new Scanner(System.in);
//////
//////    public static void main(String[] args) {
//////        int n = Integer.parseInt(scan.nextLine());
//////        while (n-- != 0) {
//////            String userName = scan.nextLine();
//////
//////            if (userName.matches(UsernameValidator.regularExpression)) {
//////                System.out.println("Valid");
//////            } else {
//////                System.out.println("Invalid");
//////            }
//////        }
//////    }
//////}
////
//////
//////import java.io.*;
//////import java.math.*;
//////import java.security.*;
//////import java.text.*;
//////import java.util.*;
//////import java.util.concurrent.*;
//////import java.util.regex.*;
//////
//////public class Solution {
//////
//////
//////
//////    private static final Scanner scanner = new Scanner(System.in);
//////
//////    public static void main(String[] args) {
//////        String n = scanner.nextLine();
//////
//////
//////        BigInteger a = new BigInteger(n);
//////
//////
//////        boolean rozw = a.isProbablePrime(1);
//////        if (rozw==true){
//////            System.out.println("prime");
//////                    }
//////        else {
//////            System.out.println("not prime");
//////        }
//////
//////        scanner.close();
//////    }
//////}
////
////import java.util.*;
////import java.text.*;
////
////public class Solution {
////
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        double payment = scanner.nextDouble();
////        scanner.close();
////
////        Locale locale = new Locale ("en" , "IN");
////        NumberFormat india = NumberFormat.getCurrencyInstance(locale);
////
////        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
////
////
////        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
////
////        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
////
////
////
////        System.out.println("US: " + us.format(payment));
////        System.out.println("India: " + india.format(payment));
////        System.out.println("China: " + china.format(payment));
////        System.out.println("France: " + france.format(payment));
////    }
////}
//
////import java.io.*;
////import java.math.*;
////import java.security.*;
////import java.text.*;
////import java.util.*;
////import java.util.concurrent.*;
////import java.util.regex.*;
////
////class Result {
////
////
////
////
////
////    public static String findDay(int month, int day, int year) {
////
////
////        Calendar kalendarz = Calendar.getInstance();
////        kalendarz.set(year,month-1,day);
////        int o = kalendarz.get(Calendar.DAY_OF_WEEK);
////        switch (o) {
////            case 1:
////                return "SUNDAY";
////            case 2:
////                return "MONDAY";
////            case 3:
////                return  "TUESDAY";
////            case 4:
////                return "WEDNESDAY";
////            case 5:
////                return "THURSDAY";
////            case 6:
////                return "FRIDAY";
////            case 7:
////                return "SATURDAY";
////                default:
////                    return "blabla";
////        }
////    }
////
////}
////
////public class Solution {
////   public static void  main(String[] args){
////       System.out.println(Result.findDay(8,5,2015));
////   }
////}
////
////
////import java.util.*;
////
////public class Solution {
////
////    public static void main(String[] args) {
////
////        Scanner scan = new Scanner(System.in);
////        int n = scan.nextInt();
////        int[] a = new int[n];
////
////
////        for (int x = 0; x<n; x++){
////
////            int m = scan.nextInt();
////            a[x] = m;
////
////        }
////
////        scan.close();
////
////        // Prints each sequential element in array a
////        for (int i = 0; i < a.length; i++) {
////            System.out.println(a[i]);
////        }
////    }
////}
////
////import java.io.*;
////import java.math.*;
////import java.security.*;
////import java.text.*;
////import java.util.*;
////import java.util.concurrent.*;
////import java.util.regex.*;
////
////public class Solution {
////
////
////    private static final Scanner scanner = new Scanner(System.in);
////
////    public static void main(String[] args) {
////        int[][] arr = new int[6][6];
////        ArrayList<Integer> lista = new ArrayList<>();
////        for (int i = 0; i < 6; i++) {
////            String[] arrRowItems = scanner.nextLine().split(" ");
////            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
////
////            for (int j = 0; j < 6; j++) {
////                int arrItem = Integer.parseInt(arrRowItems[j]);
////                arr[i][j] = arrItem;
//////                System.out.println("x "+ i + "y "+ j +"="+arr[i][j]);
////            }
////        }
////        for (int x = 0; x < 4; x++) {
////            for (int y = 0; y < 4; y++) {
////                int sum = arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x + 1][y + 1] + arr[x+2][y] + arr[x +2][y + 1] + arr[x + 2][y+ 2];
////                lista.add(sum);
//////                System.out.println(sum);
////
////            }
////
////        }
//////        System.out.println(lista);
////        Collections.sort(lista);
////
////        System.out.println(lista.get(lista.size() - 1));
////
////        scanner.close();
////    }
////}
////
//
////import java.io.*;
////import java.util.*;
////import java.text.*;
////import java.math.*;
////import java.util.regex.*;
////
////public class Solution {
////
////    public static void main(String[] args) {
////        Scanner skan = new Scanner(System.in);
////
////        String o = skan.nextLine();
////        int u = Integer.parseInt(o);
////
////        String[] tablicaStringow = skan.nextLine().split(" ");
////
////        ArrayList<Integer> listaIntow = new ArrayList<>();
////
////
////        for (int x = 0; x < u; x++) {
////            int y = Integer.parseInt(tablicaStringow[x]);
////            listaIntow.add(y);
////        }
////
////        ArrayList<Integer> listaSum = new ArrayList<>();
////
////        for (int x = 0; x < listaIntow.size(); x++) {
////            int suma = listaIntow.get(x);
////            listaSum.add(suma);
////
////            for (int y = x + 1; y < listaIntow.size(); y++) {
////                suma = suma + listaIntow.get(y);
////                listaSum.add(suma);
////            }
////
////        }
////        System.out.println(listaSum);
////
////        ArrayList<Integer> listaujemnych = new ArrayList<>();
////        for (int x = 0; x < listaSum.size(); x++) {
////            if (listaSum.get(x) < 0) {
////                listaujemnych.add(listaSum.get(x));
////            }
////        }
////
////        System.out.println(listaujemnych.size());
////
////    }
////
////}
//
////
////import java.io.*;
////import java.util.*;
////import java.text.*;
////import java.math.*;
////import java.util.regex.*;
////
////public class Solution {
////
////    public static void main(String[] args) {
////
////        Scanner skaner = new Scanner(System.in);
////        int u = skaner.nextInt();
////
////        ArrayList<ArrayList<Integer>> arrayListy = new ArrayList<ArrayList<Integer>>();
////
////        for (int x=0; x<u; x++){
////            ArrayList<Integer> listaWczytanychIntowzLinii = new ArrayList<>();
////            int d = skaner.nextInt();
////            for (int y = 0; y<d;y++){
////                int z = skaner.nextInt();
////
////                listaWczytanychIntowzLinii.add(z);
////            }
////            arrayListy.add(listaWczytanychIntowzLinii);
////            }
////
////        int w = skaner.nextInt();
////
////        for (int v=0; v<w; v++){
////            int r = skaner.nextInt();
////            int y = skaner.nextInt();
////
////
////            if (y-1<arrayListy.get(r-1).size()){
////                System.out.println(arrayListy.get(r-1).get(y-1));
////            }
////            else {
////                System.out.println("ERROR !");
////            }
////
////            }
////
////        }
////
////        }
////
////import java.util.*;
////
////public class Solution {
////
////    public static boolean canWin(int leap, int[] game) {
////
////        ArrayList<Integer> listaKrokow = new ArrayList<>();
////
////
////        for (int x =0; x<game.length; x++){
////            if (game[x]==0 || game[x+leap]==game.length-1){
////                listaKrokow.add(game[x]);
////            }
////            else if (x+leap <game.length && game[x+leap]==0){
////                x = x+leap;
////                listaKrokow.add(game[x]);
////            }
////            else return false;
////
////            }
////        if (listaKrokow.get(listaKrokow.size()-1)!=0){
////            return false;
////                    }
////        else return true;
////
////
////        // Return true if you can win the game; otherwise, return false.
////    }
////
////    public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
////        int q = scan.nextInt();
////        while (q-- > 0) {
////            int n = scan.nextInt();
////            int leap = scan.nextInt();
////
////            int[] game = new int[n];
////            for (int i = 0; i < n; i++) {
////                game[i] = scan.nextInt();
////            }
////
////            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
////        }
////        scan.close();
////    }
////}
//
////import java.io.*;
////import java.util.*;
////import java.text.*;
////import java.math.*;
////import java.util.regex.*;
////
////public class Solution {
////
////    public static void main(String[] args) {
////        Scanner skaner = new Scanner(System.in);
////        int z = skaner.nextInt();
////
////
////        ArrayList<Integer> listaIntow = new ArrayList<>();
////
////
////        for (int x = 0; x < z; x++) {
////            listaIntow.add(skaner.nextInt());
////        }
////
////
////        int x = skaner.nextInt();
////        for (int y = 0; y < x; y++) {
////            String xx = skaner.next();
////            if (xx.startsWith("Insert")) {
////                listaIntow.add(skaner.nextInt(), skaner.nextInt());
////            } else {
////                listaIntow.remove(skaner.nextInt());
////            }
////        }
////        System.out.println(listaIntow);
////
////    }
////}
//
////import java.io.*;
////import java.util.*;
////import java.text.*;
////import java.math.*;
////import java.util.regex.*;
////
////class Animal{
////    void walk(){
////        System.out.println("I am walking");
////    }
////}
////
////class Bird extends Animal{
////    void fly(){
////        System.out.println("I am flying");
////    }
////    void sing (){
////        System.out.println("I am singing");
////    }
////}
////
////public class Solution{
////
////    public static void main(String args[]){
////
////        Bird bird = new Bird();
////        bird.walk();
////        bird.fly();
////        bird.sing();
////
////
////    }
////
////}
//
////import java.io.*;
////import java.util.*;
////import java.text.*;
////import java.math.*;
////import java.util.regex.*;
////
//// class Arithmetic {
////     static int add (int a, int b){
////       return a+b;
////     }
//// }
////
//// class Adder extends Arithmetic{}
////
////public class Solution{
////    public static void main(String []args){
////        // Create a new Adder object
////        Adder a = new Adder();
////
////        // Print the name of the superclass on a new line
////        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
////
////        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
////        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
////    }
////}
//
////import java.util.*;
////
////
////class Student{}
////class Rockstar{   }
////class Hacker{}
////
////
////public class InstanceOFTutorial{
////
////    static String count(ArrayList mylist){
////        int a = 0,b = 0,c = 0;
////        for(int i = 0; i < mylist.size(); i++){
////            Object element=mylist.get(i);
////            if(element instanceof Student)
////            a++;
////            if(element instanceof Rockstar)
////            b++;
////            if(element instanceof Hacker)
////            c++;
////        }
////        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
////        return ret;
////    }
////
////    public static void main(String []args){
////        ArrayList mylist = new ArrayList();
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        for(int i=0; i<t; i++){
////            String s=sc.next();
////            if(s.equals("Student"))mylist.add(new Student());
////            if(s.equals("Rockstar"))mylist.add(new Rockstar());
////            if(s.equals("Hacker"))mylist.add(new Hacker());
////        }
////        System.out.println(count(mylist));
////    }
////}
//
////
////import java.util.*;
////class Sports{
////
////    String getName(){
////        return "Generic Sports";
////    }
////
////    void getNumberOfTeamMembers(){
////        System.out.println( "Each team has n players in " + getName() );
////    }
////}
////
////class Soccer extends Sports{
////    @Override
////    String getName(){
////        return "Soccer Class";
////    }
////
////    @Override
////    void getNumberOfTeamMembers() {
////        System.out.println("Each tam has 11 players in " + getName());
////        }
////    }
////
////
////public class Solution{
////
////    public static void main(String []args){
////        Sports c1 = new Sports();
////        Soccer c2 = new Soccer();
////        System.out.println(c1.getName());
////        c1.getNumberOfTeamMembers();
////        System.out.println(c2.getName());
////        c2.getNumberOfTeamMembers();
////    }
////}
//
////import java.util.*;
////import java.io.*;
////
////class BiCycle{
////    String define_me(){
////        return "a vehicle with pedals.";
////    }
////}
////
////class MotorCycle extends BiCycle{
////    String define_me(){
////        return "a cycle with an engine.";
////    }
////
////    MotorCycle(){
////        System.out.println("Hello I am a motorcycle, I am "+ define_me());
////
////        String temp;
////        temp = super.define_me();
////
////        System.out.println("My ancestor is a cycle who is "+ temp );
////    }
////
////}
////class Solution{
////    public static void main(String []args){
////        MotorCycle M=new MotorCycle();
////    }
////}
//
////import java.io.*;
////import java.util.*;
////import java.text.*;
////import java.math.*;
////import java.util.regex.*;
////
////public class Solution {
////
////    public static void main(String[] args) {
////        Scanner skaner = new Scanner(System.in);
////
////        try {
////            int a = skaner.nextInt();
////            int b = skaner.nextInt();
////            int result = a / b;
////            System.out.println(result);
////
////        }
////        catch (InputMismatchException exception) {
////            System.out.println(exception.getClass().toString().replace("class ",""));
////        }
////        catch (ArithmeticException exception){
////            System.out.println(exception.toString());
////        }
////        catch (Exception e){
////            System.out.println(e.toString());
////        }
////
////
////    }
////
////}
//
//import java.util.Scanner;
//class MyCalculator {
//
//    public long power(int n, int p) throws Exception {
//        if (n>=0 && p>=0){
//            return (long) Math.pow(n,p);
//        }
//
//
//        else  if (n==0 && p==0){
//            throw new Exception("n and p should not be zero.");
//        }
//        else {
//            throw new Exception("n or p should not be negative.");
//        }
//
//    }
//}
//
//
//
//public class Solution {
//    public static final MyCalculator my_calculator = new MyCalculator();
//    public static final Scanner in = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        while (in .hasNextInt()) {
//            int n = in .nextInt();
//            int p = in .nextInt();
//
//            try {
//                System.out.println(my_calculator.power(n, p));
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
//}


//import java.util.*;
//
//abstract class Book{
//    String title;
//
//    abstract void setTitle(String s);
//
//    String getTitle(){
//        return title;
//    }
//
//}
//class MyBook extends Book {
//
//    @Override
//    void setTitle(String s) {
//       this.title = s;
//    }
//}
//
////Write MyBook class here
//
//public class Main{
//
//    public static void main(String []args){
//        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
//        Scanner sc=new Scanner(System.in);
//        String title=sc.nextLine();
//        MyBook new_novel=new MyBook();
//        new_novel.setTitle(title);
//        System.out.println("The title is: "+new_novel.getTitle());
//        sc.close();
//
//    }
//}

//import java.util.*;
//interface AdvancedArithmetic{
//    int divisor_sum(int n);
//}
//
//class MyCalculator implements AdvancedArithmetic{
//
//    @Override
//    public int divisor_sum(int n) {
//        int suma =0;
//        for (int x=1; x<=n; x++){
//            if (n%x!=0){
//            }
//            else suma=suma+x;
//
//        }
//        return suma;
//    }
//}
////Write your code here
//
//class Solution{
//    public static void main(String []args){
//        MyCalculator my_calculator = new MyCalculator();
//        System.out.print("I implemented: ");
//        ImplementedInterfaceNames(my_calculator);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.print(my_calculator.divisor_sum(n) + "\n");
//        sc.close();
//    }
//    /*
//     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
//     */
//    static void ImplementedInterfaceNames(Object o){
//        Class[] theInterfaces = o.getClass().getInterfaces();
//        for (int i = 0; i < theInterfaces.length; i++){
//            String interfaceName = theInterfaces[i].getName();
//            System.out.println(interfaceName);
//        }
//    }
//}

//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    // Complete the sockMerchant function below.
//
//    static int sockMerchant(int n, int[] ar) {
//               int liczbaPar = 0;
//        Set<Integer> hasze = new LinkedHashSet<>();
//        for (int x = 0; x < n; x++) {
//            hasze.add(ar[x]);
//        }
//        Iterator<Integer> iterator = hasze.iterator();
//        while (iterator.hasNext()){
//            Integer i = iterator.next();
//            int suma = 0;
//            for (int z = 0; z < ar.length; z++) {
//                if (i == ar[z]) {
//                    suma++;
//                }
//
//            }
//            liczbaPar += suma / 2;
//        }
//        return liczbaPar;
//
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//
//        int result = sockMerchant(n, ar);
//        System.out.println(result);
//
//        scanner.close();
//    }
//}

//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    // Complete the countingValleys function below.
//    static int countingValleys(int n, String s) {
//        int polozenieAktualne = 0;
//        int wynik = 0;
//        for (int x = 0; x < n; x++) {
//            if (s.charAt(x) == 'U') {
//                polozenieAktualne++;
//                if (polozenieAktualne == 0) {
//                    wynik += 1;
//                }
//            } else {
//                polozenieAktualne--;
//            }
//        }
//        return wynik;
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String s = scanner.nextLine();
//
//        int result = countingValleys(n, s);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
//}

//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    // Complete the jumpingOnClouds function below.
//    static int jumpingOnClouds(int[] c) {
//        int liczbaSkokow = 0;
//        for (int x = 0; x < c.length; x++) {
//            if (x+2<c.length && c[x + 2] == 0) {
//                liczbaSkokow++;
//                x++;
//            } else if (x+1<c.length){
//                liczbaSkokow++;
//            }
//
//
//        }
//        return liczbaSkokow;
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
////        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] c = new int[n];
//
//        String[] cItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int cItem = Integer.parseInt(cItems[i]);
//            c[i] = cItem;
//        }
//
//        int result = jumpingOnClouds(c);
//        System.out.println(result);
//
////        bufferedWriter.write(String.valueOf(result));
////        bufferedWriter.newLine();
////
////        bufferedWriter.close();
//
//        scanner.close();
//    }
//}
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    // Complete the repeatedString function below.
//    static long repeatedString(String s, long n) {
//        long ilePowtorzenDodatkowo = 0;
//        long ilePowtorzen = 0;
//        long ileRazy = n / s.length();
//        long ileDodac = (int)(n % s.length());
//        char c;
//        String dodany;
//
//        if (ileDodac != 0) {
//            c = s.charAt((int) ileDodac - 1);
//            dodany = s.substring(0, (int) ileDodac );
//            for (int x = 0; x < dodany.length(); x++) {
//                if (dodany.charAt(x) == c) {
//                    ilePowtorzenDodatkowo++;
//
//                }
//            }
//        } else {
//            c = s.charAt(s.length() - 1);
//        }
//
//
//        for (int x = 0; x < s.length(); x++) {
//            if (s.charAt(x) == c) {
//                ilePowtorzen++;
//            }
//        }
//
//
//
//
//
//
//        ilePowtorzen = ilePowtorzen * ileRazy + ilePowtorzenDodatkowo;
//
//
//        return ilePowtorzen;
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scanner.nextLine();
//
//        long n = scanner.nextLong();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        long result = repeatedString(s, n);
//        System.out.println(result);
//
////        bufferedWriter.write(String.valueOf(result));
////        bufferedWriter.newLine();
////
////        bufferedWriter.close();
//
//        scanner.close();
//    }
//}

//
//import java.util.*;
//public class Main{
//
//    static Iterator func(ArrayList mylist){
//        Iterator it=mylist.iterator();
//        while(it.hasNext()){
//            Object element = it.next();
//            if(element instanceof String)//Hints: use instanceof operator
//
//            break;
//        }
//        return it;
//
//    }
////    @SuppressWarnings({ "unchecked" })
//    public static void main(String []args){
//        ArrayList<Object> mylist = new ArrayList();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        for(int i = 0;i<n;i++){
//            mylist.add(sc.nextInt());
//        }
//
//        mylist.add("###");
//        for(int i=0;i<m;i++){
//            mylist.add(sc.next());
//        }
//
//        Iterator it=func(mylist);
//        while(it.hasNext()){
//            Object element = it.next();
//            System.out.println((String)element);
//        }
//    }
//}
//import java.util.*;
//
//class Student  implements Comparable<Student>{
//    private int id;
//    private String fname;
//    private double cgpa;
//    public Student(int id, String fname, double cgpa) {
//        super();
//        this.id = id;
//        this.fname = fname;
//        this.cgpa = cgpa;
//    }
//    public int getId() {
//        return id;
//    }
//    public String getFname() {
//        return fname;
//    }
//    public double getCgpa() {
//        return cgpa;
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        if (this.getCgpa() == o.getCgpa() && this.getFname().equals(o.getFname())) {
//            if (this.getId() < o.getId())
//                return 1;
//            else return -1;
//        }
//
//        else if (this.getCgpa() == o.getCgpa()){
//            if (this.getFname().compareTo(o.getFname())> 0)
//                return 1;
//                else return -1;
//
//            }
//        else if (this.getCgpa()<o.getCgpa())
//            return 1;
//        else return -1;
//        }
//}
//
//
////Complete the code
//public class Solution
//{
//
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//
//        TreeSet<Student> studentList = new TreeSet<>();
//        while(testCases>0){
//            int id = in.nextInt();
//            String fname = in.next();
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//
//            studentList.add(st);
//            testCases--;
//        }
//
//    Iterator<Student> it =studentList.iterator();
//        while (it.hasNext()){
//            Student student = it.next();
//            System.out.println(student.getFname());
//        }
//}
//}
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    // Complete the rotLeft function below.
//    static int[] rotLeft(int[] a, int d) {
//        for (int x = 0; x < d; x++) {
//
//
//            int b = a[0];
//            for (int y = 0; y < a.length-1; y++) {
//
//                a[y] = a[y + 1];
//
//            }
//            a[a.length-1]=b;
//        }
//        //for (int x=0; x<a.length;x++){
//          //  System.out.print(a[x]+" ");
//        //}
//        return a;
//
//    }
//
//        private static final Scanner scanner = new Scanner(System.in);
//
//        public static void main (String[]args) throws IOException {
//            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            String[] nd = scanner.nextLine().split(" ");
//
//            int n = Integer.parseInt(nd[0]);
//
//            int d = Integer.parseInt(nd[1]);
//
//            int[] a = new int[n];
//
//            String[] aItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int aItem = Integer.parseInt(aItems[i]);
//                a[i] = aItem;
//            }
//
//            int[] result = rotLeft(a, d);
//
////            for (int i = 0; i < result.length; i++) {
////                bufferedWriter.write(String.valueOf(result[i]));
////
////                if (i != result.length - 1) {
////                    bufferedWriter.write(" ");
////                }
////            }
////
////            bufferedWriter.newLine();
////
////            bufferedWriter.close();
//
//            scanner.close();
//        }
//    }
//
//import java.util.*;
//
//class Player {
//    String name;
//    int score;
//
//    Player(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//}
//
//class Checker implements Comparator<Player> {
//    // complete this method
//    public int compare(Player a, Player b) {
//        if (a.score == b.score) {
//            if (a.name.compareTo(b.name) > 0)
//                return 1;
//            else return -1;
//        } else {
//            if (a.score > b.score)
//                return -1;
//
//            else return 1;
//        }
//
//    }
//}
//
//
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//
//        Player[] player = new Player[n];
//        Checker checker = new Checker();
//
//        for (int i = 0; i < n; i++) {
//            player[i] = new Player(scan.next(), scan.nextInt());
//        }
//        scan.close();
//
//        Arrays.sort(player, checker);
//        for (int i = 0; i < player.length; i++) {
//            System.out.printf("%s %s\n", player[i].name, player[i].score);
//        }
//    }
//}


//import javax.management.openmbean.ArrayType;
//import java.io.IOException;
//import java.lang.reflect.Array;
//import java.lang.reflect.Method;
//
//class Printer
//{
//    public void printArray (Object[] blabla){
//        for (int x=0; x<blabla.length; x++){
//            System.out.println(blabla[x].toString());
//        }
//    }
//    //Write your code here
//
//}
//
//public class Solution {
//
//
//    public static void main( String[] args ) {
//        Printer myPrinter = new Printer();
//        Integer[] intArray = { 1, 2, 3 };
//        String[] stringArray = {"Hello", "World"};
//        myPrinter.printArray(intArray);
//        myPrinter.printArray(stringArray);
//        int count = 0;
//
//        for (Method method : Printer.class.getDeclaredMethods()) {
//            String name = method.getName();
//
//            if(name.equals("printArray"))
//                count++;
//        }
//
//        if(count > 1)System.out.println("Method overloading is not allowed!");
//
//    }
//}
//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//        String [] pair_left = new String[t];
//        String [] pair_right = new String[t];
//
//        for (int i = 0; i < t; i++) {
//            pair_left[i] = s.next();
//            pair_right[i] = s.next();
//        }
//
//        HashSet<String> haszset = new HashSet<>();
//
//        for(int x=0; x<t; x++) {
//            String para = pair_left[x] +" "+ pair_right[x];
//            haszset.add(para);
//            System.out.println(haszset.size());
//        }
//
////Write your code here
//
//    }
//}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
////Complete the classes below
//class Flower {
//    public String whatsYourName (){
//        return "I have many names and types";
//
//    }
//}
//
//class Jasmine extends Flower{
//    @Override
//    public String whatsYourName() {
//        return "Jasmine";
//    }
//}
//
//class Lily extends Flower{
//    @Override
//    public String whatsYourName() {
//       return "Lily";
//    }
//}
//
//class Region{
//    public Flower yourNationalFlower (){
//        return new Flower();
//    }
//}
//
//class WestBengal extends Region {
//    @Override
//    public Flower yourNationalFlower() {
//        return new Jasmine();
//    }
//}
//
//class AndhraPradesh extends Region {
//    @Override
//    public Flower yourNationalFlower() {
//        return new Lily();
//    }
//}
//
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine().trim();
//        Region region = null;
//        switch (s) {
//            case "WestBengal":
//                region = new WestBengal();
//                break;
//            case "AndhraPradesh":
//                region = new AndhraPradesh();
//                break;
//        }
//        Flower flower = region.yourNationalFlower();
//        System.out.println(flower.whatsYourName());
//    }
//}
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//    static int licznik =0;
//
//    static void swap (int[]a, int i, int j ){
//        int keep = a[i];
//        a[i]=a[j];
//        a[j]=keep;
//    }
//
//    // Complete the countSwaps function below.
//    static void countSwaps(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//
//            for (int j = 0; j < a.length - 1; j++) {
//                // Swap adjacent elements if they are in decreasing order
//                if (a[j] > a[j + 1]) {
//                    swap(a,j, j + 1);
//                    licznik++;
//                }
//            }
//
//        }
//
//
//
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] a = new int[n];
//
//        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
//            a[i] = aItem;
//        }
//
//        countSwaps(a);
//        System.out.println("Array is sorted in "+licznik+" swaps.");
//        System.out.println("First element: "+a[0]);
//        System.out.println("Last element: "+a[a.length-1]);
//
//        scanner.close();
//    }
//}
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    // Complete the minimumAbsoluteDifference function below.
//    static int minimumAbsoluteDifference(int[] arr) {
//        Arrays.sort(arr);
//        int result = Math.abs(arr[0] - arr[1]);
//
//        //najlepsze sortowanie = n * log n quick + n
//        // 1 27 28 30
//        for (int y = 0; y < arr.length - 1; y++) {
//            int abs = Math.abs((arr[y] - arr[y + 1]));
//            if (abs < result) {
//                result = abs;
//            }
//        }
//
//        return result;
//
//
//
//
//
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }
//
//        int result = minimumAbsoluteDifference(arr);
//        System.out.println(result);
//
//        bufferedWriter.write(String.valueOf(result));
//     bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
//}

//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    static int maxSavedLuck = 0;
//
//    // Complete the luckBalance function below.
//    static int luckBalance(int k, int[][] contests) {
//
//        ArrayList<Integer> listOfImportant = new ArrayList<>();
//
//        int row = contests.length;
//        int sumOfRow = 0;
//        int sumOfImportantContests = 0;
//
//        for (int x = 0; x < row; x++) {
//            sumOfRow += contests[x][0];
//
//        }
//
//        for (int y = 0; y < row; y++) {
//            if (contests[y][1] == 1) {
//                sumOfImportantContests += 1;
//                listOfImportant.add(contests[y][0]);
//            }
//        }
//
//        int requiredImportantContests = sumOfImportantContests - k;
//        Collections.sort(listOfImportant);
//
//
//        maxSavedLuck = sumOfRow;
//
//        for (int x = 0; x < requiredImportantContests; x++) {
//            maxSavedLuck = maxSavedLuck - listOfImportant.get(x) - listOfImportant.get(x);
//        }
//        return maxSavedLuck;
//    }
//
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nk = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nk[0]);
//
//        int k = Integer.parseInt(nk[1]);
//
//        int[][] contests = new int[n][2];
//
//        for (int i = 0; i < n; i++) {
//            String[] contestsRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 2; j++) {
//                int contestsItem = Integer.parseInt(contestsRowItems[j]);
//                contests[i][j] = contestsItem;
//            }
//        }
//
//        int result = luckBalance(k, contests);
//        System.out.println(result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//        bufferedWriter.close();
//
//        scanner.close();
//    }
//}
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//    static int suma =0;
//    static int licznik =0;
//
//    // Complete the maximumToys function below.
//    static int maximumToys(int[] prices, int k) {
//
//        Arrays.sort(prices);
//        int x=0;
//        while(suma<=k && x<prices.length){
//            suma+=prices[x];
//            licznik++;
//            x++;
//        }
//        if (suma>k){
//            licznik-=1;
//        }
//
//        return licznik;
//
//
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nk = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nk[0]);
//
//        int k = Integer.parseInt(nk[1]);
//
//        int[] prices = new int[n];
//
//        String[] pricesItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int pricesItem = Integer.parseInt(pricesItems[i]);
//            prices[i] = pricesItem;
//        }
//
//        int result = maximumToys(prices, k);
//        System.out.println(result);
//
////       bufferedWriter.write(String.valueOf(result));
////        bufferedWriter.newLine();
////
////        bufferedWriter.close();
//
//        scanner.close();
//    }
//}

//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//        // Complete the alternatingCharacters function below.
//        static int alternatingCharacters(String s) {
//
//
//            int x = 0;
//            int licznik =0;
//            while (x < s.length()-1){
//                if (s.charAt(x)==(s.charAt(x+1))){
//                    licznik++;
//                }
//                x++;
//
//            }
//            return licznik;
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//
//        int q = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//
//        for (int qItr = 0; qItr < q; qItr++) {
//            String s = scanner.next();
//
//            int result = alternatingCharacters(s);
//            System.out.println(result);
//
////            bufferedWriter.write(String.valueOf(result));
////            bufferedWriter.newLine();
//       }
////
////        bufferedWriter.close();
//
//        scanner.close();
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class Node {
//    Node left;
//    Node right;
//    int data;
//
//    Node(int data) {
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}
//
//class Solution {
//    static int maxHeight = 0;
//
//    public static int height(Node childNode, int currentHeight) {
//        if (childNode.right == null && childNode.left == null) {
//            if (maxHeight < currentHeight) {
//                maxHeight = currentHeight;
//            }
//        }
//        if (childNode.left != null) {
//             height(childNode.left, currentHeight+1);
//        } if (childNode.right != null){
//             height(childNode.right, currentHeight+1);
//        }
//        return currentHeight;
//    }
//
//    /*
//    class Node
//        int data;
//        Node left;
//        Node right;
//    */
//    public static int height(Node root) {
//        if (root.left != null) {
//            height(root.left, 1);
//        }
//        if (root.right != null) {
//            height(root.right, 1);
//        }
//        return maxHeight;
//        // Write your code here.
//    }
//
//    public static Node insert(Node root, int data) {
//        if (root == null) {
//            return new Node(data);
//        } else {
//            Node cur;
//            if (data <= root.data) {
//                cur = insert(root.left, data);
//                root.left = cur;
//            } else {
//                cur = insert(root.right, data);
//                root.right = cur;
//            }
//            return root;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        Node root = null;
//        while (t-- > 0) {
//            int data = scan.nextInt();
//            root = insert(root, data);
//        }
//        scan.close();
//        int height = height(root);
//        System.out.println(height);
//    }
//}
//
//import java.util.*;
//
//public class Solution {
//
//
//    public static int fibonacci(int n) {
//        int result=0;
//        //for (int x=0; x<=n; x++){
//            if (n==0){
//
//            }
//            else if (n==1 || n==2){
//                result++;
//            }
//            else {
//                result= fibonacci(n-1)+fibonacci(n-2);
//
//            }
//        //}
//        return result;
//    }
//
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.close();
//        System.out.println(fibonacci(n));
//    }
//}

