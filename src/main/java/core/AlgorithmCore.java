package core;

/**
 * Core class that abstracts away some finer details of hash matching.
 */
public class AlgorithmCore {

    private HashMatcher matcher;

    public AlgorithmCore() {

    }

    public AlgorithmCore(String start, String end) {
        matcher = new HashMatcher(start, end);
    }

    protected boolean isMatch(String candidate) {
        return matcher.hashMatches(matcher.hash(candidate));
    }
}
