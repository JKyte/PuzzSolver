package permutation;

import org.junit.Test;

public class TestPermute {

    @Test
    public void testPermute(){
        String searchSpace = "ABC";

        Permutation permutation = new Permutation("start", "end");
        permutation.permutation(searchSpace);
    }
}
