package com.c_bata;

import java.util.ArrayList;

import com.google.common.primitives.Doubles;

public class Series<E> extends ArrayList<E> {
    public double mean() {
        double sum = 0;
        for (E item : this) {
            if (Doubles.tryParse(item.toString()) != null ) {
                sum += Double.parseDouble(item.toString());
            }
        }
        return this.size() == 0 ? 0 : sum / this.size();
    }
}
