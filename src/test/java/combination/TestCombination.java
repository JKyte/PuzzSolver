package combination;

import org.junit.Test;

public class TestCombination {

    @Test
    public void testCombination(){
        String searchSpace = "AB";

        Combination combination = new Combination("start", "end");
        combination.combination(searchSpace);
    }
}
