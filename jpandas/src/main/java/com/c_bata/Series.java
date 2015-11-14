package com.c_bata;

import java.util.ArrayList;

import com.google.common.primitives.Doubles;

public class Series<E> extends ArrayList<E> {
    public double mean() {
        double sum = 0;
        for (E item : this) {
            // TODO: Correspond missing value
            if (Doubles.tryParse(item.toString()) != null ) {
                sum += Double.parseDouble(item.toString());
            }
        }
        return this.size() == 0 ? 0 : sum / this.size();
    }

    public double std() {
        double sum = 0;
        double mean = this.mean();

        for (E item: this) {
            // TODO: Correspond missing value
            if (Doubles.tryParse(item.toString()) != null) {
                sum += Math.pow(Double.parseDouble(item.toString()) - mean, 2);
            }
        }

        return this.size() == 0 ? 0 : sum / this.size();
    }
}
