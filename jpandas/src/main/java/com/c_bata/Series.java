package com.c_bata;

import java.util.ArrayList;

import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;

public class Series<E> extends ArrayList<E> {
    public int mean() {
        int sum = 0;
        for (E item : this) {
            if ( Ints.tryParse(item.toString()) != null) {
                sum += Integer.parseInt(item.toString());
            } else if (Doubles.tryParse(item.toString()) != null ) {
                sum += Double.parseDouble(item.toString());
            }
        }
        return this.size() == 0 ? 0 : sum / this.size();
    }
}
