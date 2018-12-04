package combination;

import core.AlgorithmCore;

/**
 * Credit to https://www.geeksforgeeks.org/print-all-combinations-of-given-length/
 */
public class Combination extends AlgorithmCore {

    public Combination(String start, String end) {
        super(start, end);
    }

    /**
     * Convenience wrapper method
     *
     * @param searchSpace - String representing search space
     */
    public void combination(String searchSpace) {
        combination(searchSpace, searchSpace.length());
    }

    /**
     * Convenience wrapper method
     *
     * @param searchSpace - String representing search space
     * @param k           - length  of combinations to generate
     */
    public void combination(String searchSpace, int k) {
        combinationKLength(searchSpace.toCharArray(), k);
    }


    /**
     * The method that prints all possible strings of length k.
     * It is mainly a wrapper over recursive function combinationKLengthRecursive()
     *
     * @param searchSpace - character array representing search space
     * @param k           - the length of combinations to generate
     */
    private void combinationKLength(char[] searchSpace, int k) {
        int n = searchSpace.length;
        combinationKLengthRecursive(searchSpace, "", n, k);
    }

    /**
     * The main recursive method to print all possible strings of length k
     *
     * @param searchSpace - character array representing search space
     * @param prefix
     * @param n
     * @param k           - length of combinations to generate
     */
    private void combinationKLengthRecursive(char[] searchSpace, String prefix, int n, int k) {

        // Base case: k is 0, print prefix
        if (k == 0) {
            System.out.println(prefix);
            return;
        }

        // One by one add all characters from set and recursively call for k equals to k-1
        for (int i = 0; i < n; ++i) {

            // Next character of input added
            String newPrefix = prefix + searchSpace[i];

            // k is decreased, because we have added a new character
            combinationKLengthRecursive(searchSpace, newPrefix, n, k - 1);
        }
    }
}
