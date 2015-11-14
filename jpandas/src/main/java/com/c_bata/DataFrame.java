package com.c_bata;

import java.util.HashMap;

public class DataFrame<K, S> extends HashMap<K, S> {
    public HashMap<String, Double> mean () {
        HashMap<String, Double> meanDataFrame = new HashMap<String, Double>();
        for (K key : this.keySet()) {
            meanDataFrame.put((String) key, ((Series) this.get(key)).mean());
        }
        return meanDataFrame;
    }

    public HashMap<String, Double> std () {
        HashMap<String, Double> meanDataFrame = new HashMap<String, Double>();
        for (K key : this.keySet()) {
            meanDataFrame.put((String) key, ((Series) this.get(key)).std());
        }
        return meanDataFrame;
    }
}
