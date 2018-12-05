package core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestWordFilter {

    private WordFilter filter;

    @Before
    public void setup() {
        filter = new WordFilter();
    }

    @Test
    public void testDefaultFilter() {
        assertTrue(filter.retain("fox"));
    }

    @Test
    public void testExactLengthFilter() {
        filter.setExactWordLengthFilter(3);
        assertTrue(filter.retain("fox"));
        assertFalse(filter.retain("bear"));
        assertFalse(filter.retain("ox"));
    }

    @Test
    public void testMinimumLengthFilter(){
        filter.setMinWordLengthFilter(3);
        assertTrue(filter.retain("fox"));
        assertTrue(filter.retain("bear"));
        assertFalse(filter.retain("ox"));
    }

    @Test
    public void testMaximumLengthFilter(){
        filter.setMaxWordLengthFilter(3);
        assertTrue(filter.retain("fox"));
        assertFalse(filter.retain("bear"));
        assertTrue(filter.retain("ox"));
    }
}
