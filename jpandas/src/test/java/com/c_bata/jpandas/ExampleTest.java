package com.c_bata.jpandas;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ExampleTest {
    @Test
    public void testShouldFail() {
        assertThat(0, is(1));
    }
}
