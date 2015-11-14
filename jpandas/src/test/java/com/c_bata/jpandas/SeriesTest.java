package com.c_bata.jpandas;

import com.c_bata.Series;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SeriesTest {
    @Test
    public void testSeriesIsEmpty() {
        Series series = new Series();
        assertThat(0, is(series.size()));
    }

    @Test
    public void testIntegerSeriesMeanEquals2() {
        Series<Integer> series = new Series<Integer>();
        assertThat(2, is(series.mean()));
    }
}
