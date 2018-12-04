package dictionary;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Class that handles all dictionary interaction
 */
public class Dictionary {

    private Set<String> allWords;
    private Multimap<Integer, String> wordsByLength;

    public Dictionary(){
        allWords = new HashSet<>();
        wordsByLength = HashMultimap.create();
    }

    /**
     * Load the dictionary from flat files
     */
    public void load(){

    }

    public Collection<String> getWordsByLength(int length){
        return wordsByLength.get(length);
    }
}
