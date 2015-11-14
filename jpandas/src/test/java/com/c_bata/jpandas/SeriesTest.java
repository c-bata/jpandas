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
    public void testIntegerSeriesMean() {
        Series<Integer> series = new Series<Integer>();
        series.add(0);
        series.add(9);
        assertThat(series.mean(), is(4.5));
    }

    @Test
    public void testDoubleSeriesMean() {
        Series<Double> series = new Series<Double>();
        series.add(0.0);
        series.add(9.0);
        assertThat(series.mean(), is(4.5));
    }

    @Test
    public void testIntegerSeriesStd() {
        Series<Integer> series = new Series<Integer>();
        series.add(0);
        series.add(1);
        assertThat(series.std(), is(0.25));
    }

    @Test
    public void testDoubleSeriesStd() {
        Series<Double> series = new Series<Double>();
        series.add(0.0);
        series.add(1.0);
        assertThat(series.std(), is(0.25));
    }
}
