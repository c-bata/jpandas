package com.c_bata;

import java.util.ArrayList;
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

    public String describe() {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> keys = new ArrayList<String>();
        for (K key : this.keySet()) {
            keys.add((String) key);
        }
        // TODO: Display actual value
        sb.append("Key"   + "\t\t" +    "a\t" + "b\n");
        sb.append("count" + "\t\t" +    "3\t" + "3\n");
        sb.append("mean"  + "\t\t" +  "0.5\t" + "3\n");
        sb.append("std"   + "\t\t" + "0.25\t" + "3\n");

        return new String(sb);
    }
}
