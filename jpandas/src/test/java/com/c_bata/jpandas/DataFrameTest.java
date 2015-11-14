package com.c_bata.jpandas;

import com.c_bata.DataFrame;
import com.c_bata.Series;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class DataFrameTest {
    @Test
    public void testDoubleMean () {
        Series<Double> series_a = new Series<Double>();
        series_a.add(0.0);
        series_a.add(1.0);

        DataFrame<String, Series> df = new DataFrame<String, Series>();
        df.put("feature_a", series_a);

        assertThat(df.mean().get("feature_a"), is(0.5));
    }

    @Test
    public void testDoubleStd () {
        Series<Double> series_a = new Series<Double>();
        series_a.add(0.0);
        series_a.add(1.0);

        DataFrame<String, Series> df = new DataFrame<String, Series>();
        df.put("feature_a", series_a);

        assertThat(df.std().get("feature_a"), is(0.25));
    }
}
