
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[][] a = {
                {" ", "|", " ","|"," "},
                {"-","-","-","-","-"},
                {" ", "|", " ","|"," "},
                {"-","-","-","-","-"},
                {" ", "|", " ","|"," "}
        };
        Random komputer = new Random();
        Plansza plansza = new Plansza();
        Scanner scanner = new Scanner(System.in);
        String znaczek ="";
        String znaczek2 = "";
        int x = 0 ;
        System.out.println("Kolko i krzyzyk");
        System.out.println("Wybierz znaczek : (1) krzyzyk (2) kolko");
       while (x!=1&&x!=2) {
           x = scanner.nextInt();
           if (x == 1) {
               znaczek = "x";
               znaczek2 = "o";
           }
           if (x == 2) {
               znaczek = "o";
               znaczek2 = "x";
           }
       }


        int pos;
        int i = 1;
        while (i < 9) {
            plansza.tablica(a);
            plansza.ruchgracza(a, scanner.nextInt(),znaczek);
            if (plansza.check(a) == true){
                plansza.tablica(a);
                System.out.println("wygrywa gracz");
                break;
            }
           if (plansza.remis(a)==true) {
               System.out.println("remis");
               break;
           }
            plansza.ruchbota(a,komputer.nextInt(1,9),znaczek2 );
            if (plansza.check(a) == true) {
                plansza.tablica(a);
                System.out.println("Wygrywa AI");
                break;
            }
            if (plansza.remis(a)==true) {
                System.out.println("remis");
                break;
            }
        }
    }
}




