package com.c_bata.jpandas;

import com.c_bata.DataFrame;
import com.c_bata.Series;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class DataFrameTest {
    @Test
    public void testMean () {
        Series<Double> series_a = new Series<Double>();
        series_a.add(3.0);
        series_a.add(5.0);
        Series<Double> series_b = new Series<Double>();
        series_b.add(9.0);
        series_b.add(20.0);

        DataFrame<String, Series> df = new DataFrame<String, Series>();
        df.put("feature_a", series_a);
        df.put("feature_b", series_b);

        //assertThat(df.mean().get("feature_a"), is(4.5));
    }
}
