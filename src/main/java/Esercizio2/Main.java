package Esercizio2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero e premi invio:");
        int num = scanner.nextInt();
        NumCasuali numCasuali = new NumCasuali();
        List<Integer> numeriCasuali = numCasuali.getNumCasuali(num);
        System.out.println(numeriCasuali);

        NumCasuali numInversi = new NumCasuali();
        List<Integer> numeriInversi = numInversi.getNumInversi(numeriCasuali);
        System.out.println("Questi sono i numeri casuali + i numeri inversi:");
        System.out.println(numeriInversi);

        NumCasuali stampa = new NumCasuali();
        System.out.println("Numeri casuali in posizione pari:");
        stampa.stampa(numeriInversi, true);
        System.out.println("Numeri casuali in posizione dispari:");
        stampa.stampa(numeriInversi, false);
    }
}
