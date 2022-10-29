import java.util.Scanner;
import java.util.Random;

public class Plansza {

    public void tablica(String[][] args) {

        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++) {
                System.out.print(args[i][j] + " ");
            }
            System.out.println();

        }
    }

    void ruchgracza(String args[][], int pos, String znaczek) {
        Scanner scanner = new Scanner(System.in);
        switch (pos) {
            case 1:
                if (args[0][0] == "x" || args[0][0] == "o") {
                    System.out.println("pole zajete wybierz inne");
                    ruchgracza(args, scanner.nextInt(), znaczek);
                } else
                    args[0][0] = znaczek;
                break;
            case 2:
                if (args[0][2] == "x" || args[0][2] == "o") {
                    System.out.println("pole zajete wybierz inne");


                    ruchgracza(args, scanner.nextInt(), znaczek);

                } else
                    args[0][2] = znaczek;
                break;
            case 3:
                if (args[0][4] == "x" || args[0][4] == "o") {
                    System.out.println("pole zajete wybierz inne");
                    ruchgracza(args, scanner.nextInt(), znaczek);
                } else
                    args[0][4] = znaczek;
                break;
            case 4:
                if (args[2][0] == "x" || args[2][0] == "o") {
                    System.out.println("pole zajete wybierz inne");
                    ruchgracza(args, scanner.nextInt(), znaczek);
                } else
                    args[2][0] = znaczek;
                break;
            case 5:
                if (args[2][2] == "x" || args[2][2] == "o") {
                    System.out.println("pole zajete wybierz inne");
                    ruchgracza(args, scanner.nextInt(), znaczek);
                } else
                    args[2][2] = znaczek;
                break;
            case 6:
                if (args[2][4] == "x" || args[2][4] == "o") {
                    System.out.println("pole zajete wybierz inne");
                    ruchgracza(args, scanner.nextInt(), znaczek);
                } else
                    args[2][4] = znaczek;
                break;
            case 7:
                if (args[4][0] == "x" || args[4][0] == "o") {
                    System.out.println("pole zajete wybierz inne");
                    ruchgracza(args, scanner.nextInt(), znaczek);
                } else
                    args[4][0] = znaczek;
                break;
            case 8:
                if (args[4][2] == "x" || args[4][2] == "o") {
                    System.out.println("pole zajete wybierz inne");
                    ruchgracza(args, scanner.nextInt(), znaczek);
                } else
                    args[4][2] = znaczek;
                break;
            case 9:
                if (args[4][4] == "x" || args[4][4] == "o") {
                    System.out.println("pole zajete wybierz inne");
                    ruchgracza(args, scanner.nextInt(), znaczek);
                } else
                    args[4][4] = znaczek;
                break;
            default:
                System.out.println("wprowadzony numer jest poza skala wprowadz inny znak");
                ruchgracza(args, scanner.nextInt(), znaczek);

        }

    }

    void ruchbota(String args[][], int pos, String znaczek2) {
        Random losowa = new Random();
        switch (pos) {
            case 1:
                if (args[0][0] == "x" || args[0][0] == "o") {
                    ruchbota(args, losowa.nextInt(1, 9), znaczek2);
                } else
                    args[0][0] = znaczek2;
                break;
            case 2:
                if (args[0][2] == "x" || args[0][2] == "o") {
                    ruchbota(args, losowa.nextInt(1, 9), znaczek2);
                } else
                    args[0][2] = znaczek2;
                break;
            case 3:
                if (args[0][4] == "x" || args[0][4] == "o") {
                    ruchbota(args, losowa.nextInt(1, 9), znaczek2);
                } else
                    args[0][4] = znaczek2;
                break;
            case 4:
                if (args[2][0] == "x" || args[2][0] == "o") {
                    ruchbota(args, losowa.nextInt(1, 9), znaczek2);
                } else
                    args[2][0] = znaczek2;
                break;
            case 5:
                if (args[2][2] == "x" || args[2][2] == "o") {
                    ruchbota(args, losowa.nextInt(1, 9), znaczek2);
                } else
                    args[2][2] = znaczek2;
                break;
            case 6:
                if (args[2][4] == "x" || args[2][4] == "o") {
                    ruchbota(args, losowa.nextInt(1, 9), znaczek2);
                } else
                    args[2][4] = znaczek2;
                break;
            case 7:
                if (args[4][0] == "x" || args[4][0] == "o") {
                    ruchbota(args, losowa.nextInt(1, 9), znaczek2);
                } else
                    args[4][0] = znaczek2;
                break;
            case 8:
                if (args[4][2] == "x" || args[4][2] == "o") {
                    ruchbota(args, losowa.nextInt(1, 9), znaczek2);
                } else
                    args[4][2] = znaczek2;
                break;
            case 9:
                if (args[4][4] == "x" || args[4][4] == "o") {
                    ruchbota(args, losowa.nextInt(1, 9), znaczek2);
                } else
                    args[4][4] = znaczek2;
                break;


        }

    }

    public boolean check(String[][] a) {
        if (a[0][0] == a[0][2] && a[0][2] == a[0][4] && (a[0][0] == "x" || a[0][0] == "o")
                || (a[0][0] == a[2][0] && a[2][0] == a[4][0] && (a[0][0] == "x" || a[0][0] == "o"))
                || (a[2][0] == a[2][2] && a[2][2] == a[2][4] && (a[2][0] == "x" || a[2][0] == "o"))
                || (a[4][0] == a[4][2] && a[4][2] == a[4][4] && (a[4][0] == "x" || a[4][0] == "o"))
                || (a[0][2] == a[2][2] && a[2][2] == a[4][2] && (a[0][2] == "x" || a[0][2] == "o"))
                || (a[0][4] == a[2][4] && a[2][4] == a[4][4] && (a[0][4] == "x" || a[0][4] == "o"))
                || (a[0][0] == a[2][2] && a[2][2] == a[4][4] && (a[0][0] == "x" || a[0][0] == "o"))
                || (a[0][4] == a[2][2] && a[2][2] == a[4][0] && (a[0][4] == "x" || a[0][4] == "o"))) {

            return true;

        } else {

            return false;
        }
    }

    boolean remis(String[][] a) {
        if (a[0][0] != " " && a[0][2] != " " && a[0][4] != " " &&
                a[2][0] != " " && a[2][2] != " " && a[2][4] != " " &&
                a[4][0] != " " && a[4][2] != " " && a[4][4] != " ") {
            return true;
        }
        else {
            return false;
    }}


}
