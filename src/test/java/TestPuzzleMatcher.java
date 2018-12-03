import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestPuzzleMatcher {

    @Test
    public void testMatch(){
        String start = "ABC";
        String end = "XYZ";

        String goodCandidate = "ABC123XYZ";
        String badCandidate = "123GHI890";

        PuzzleMatcher puzzleMatcher = new PuzzleMatcher(start, end);
        assertTrue(puzzleMatcher.match(goodCandidate));
        assertFalse(puzzleMatcher.match(badCandidate));
    }
}
