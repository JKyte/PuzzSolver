package permutation;

import core.AlgorithmCore;

/**
 * Credit to https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
 */
public class Permutation extends AlgorithmCore {

    public Permutation(String start, String end) {
        super(start, end);
    }

    public void permutation(String str) {
        permutation("", str);
    }

    private void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }
}
