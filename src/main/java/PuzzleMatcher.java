/**
 * Matches an answer against a pre-determined hash.
 */
public class PuzzleMatcher {

    private String answerStart;
    private String answerEnd;

    public PuzzleMatcher(String start, String end){
        this.answerStart = start;
        this.answerEnd = end;
    }

    public boolean match(String candidate){
        return candidate.startsWith(answerStart) && candidate.endsWith(answerEnd);
    }
}
