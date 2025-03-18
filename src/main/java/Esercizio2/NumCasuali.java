package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class NumCasuali {
    List<Integer> numCasuali = new ArrayList<>();

    public List<Integer> getNumCasuali(int num) {
        for (int i = 0; i < num; i++) {
            numCasuali.add((int) (Math.random() * 100));
        } return numCasuali;
    }

    public List<Integer> getNumInversi(List<Integer> numCasuali) {
        List<Integer> numInversi = new ArrayList<>();
        for (int i = numCasuali.size() - 1; i >= 0; i--) {
            numInversi.add(numCasuali.get(i));
        } numCasuali.addAll(numInversi);
        return numCasuali;
    }

    public void stampa(List<Integer> numCasuali, boolean trueOrFalse) {
        if (trueOrFalse) {
        for(int i = 0; i < numCasuali.size(); i++) {
            if(i % 2 == 0) {
                System.out.println(numCasuali.get(i));}
        }
    } else {
        for(int i = 0; i < numCasuali.size(); i++) {
            if(i % 2 != 0) {
                System.out.println(numCasuali.get(i));}
        }
    }
    }
}
