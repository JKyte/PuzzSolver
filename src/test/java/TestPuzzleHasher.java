import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPuzzleHasher {

    @Test
    public void testHash(){
        String candidate = "ABC";
        String expectedHash = "902fbdd2b1df0c4f70b4a5d23525e932".toUpperCase();

        PuzzleHasher puzzleHasher = new PuzzleHasher();
        String hashedCandidate = puzzleHasher.hash(candidate);

        assertEquals(expectedHash, hashedCandidate);
    }
}
