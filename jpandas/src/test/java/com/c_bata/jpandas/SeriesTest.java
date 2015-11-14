package com.c_bata.jpandas;

import com.c_bata.Series;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SeriesTest {
    @Test
    public void testSeriesIsEmpty() {
        Series series = new Series();
        series.add(0);
        assertThat(series.size(), is(1));
    }

    @Test
    public void testIntegerSeriesMeanEquals5() {
        Series<Integer> series = new Series<Integer>();
        series.add(0);
        series.add(10);
        assertThat(series.mean(), is(5));
    }
}
