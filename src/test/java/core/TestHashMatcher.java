package core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestHashMatcher {

    @Test
    public void testHash(){
        String candidate = "ABC";
        String expectedHash = "902fbdd2b1df0c4f70b4a5d23525e932".toUpperCase();
        String start = "902F";
        String end = "E932";

        HashMatcher hashMatcher = new HashMatcher(start, end);
        String hashedCandidate = hashMatcher.hash(candidate);

        assertEquals(expectedHash, hashedCandidate);
        assertTrue(hashMatcher.hashMatches(hashedCandidate));
    }

    @Test
    public void testMatch(){
        String start = "ABC";
        String end = "XYZ";

        String goodCandidate = "ABC123XYZ";
        String badCandidate = "123GHI890";

        HashMatcher puzzleMatcher = new HashMatcher(start, end);
        assertTrue(puzzleMatcher.hashMatches(goodCandidate));
        assertFalse(puzzleMatcher.hashMatches(badCandidate));
    }
}
