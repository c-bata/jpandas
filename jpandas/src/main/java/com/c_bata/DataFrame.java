package com.c_bata;

import java.util.HashMap;

public class DataFrame<K, S> extends HashMap<K, S> {

    public DataFrame<K, S> mean () {
        DataFrame<K, S> meanDataFrame = new DataFrame<K, S>();
        for (K key : this.keySet()) {
            meanDataFrame.put(key, this.get(key));
        }
        return meanDataFrame;
    }
}
