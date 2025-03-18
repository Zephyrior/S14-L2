package Esercizio1;

import java.util.*;

public class ParoleDuplicate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero e premi invio:");
        int num = scanner.nextInt();


        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for(int i = 0; i < num; i++) {
            System.out.println("Inserisci una parola:");
            String word = scanner.next();
   
            if (!uniqueWords.add(word)) {
                duplicateWords.add(word);
            }
        }
        System.out.println("Parole uniche: " + uniqueWords);
        System.out.println("Parole duplicate: " + duplicateWords);
        System.out.println("Numero di parole uniche: " + uniqueWords.size());
    }
}
