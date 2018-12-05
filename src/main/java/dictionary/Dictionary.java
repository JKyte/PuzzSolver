package dictionary;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class that handles all dictionary interaction
 */
public class Dictionary {

    private String words = "words.txt";
    private String wordsAlpha = "words_alpha.txt";

    private Set<String> allWordsOrdered;
    private Set<String> allWordsUnordered;
    private Multimap<Integer, String> wordsByLength;

    public Dictionary() {
        allWordsOrdered = new TreeSet<>();
        allWordsUnordered = new HashSet<>();
        wordsByLength = HashMultimap.create();
    }

    /**
     * Load the dictionary from flat files
     */
    public void load(String filename) {
        try {
            File inFile = new File("data/staging/" + filename);
            BufferedReader br = new BufferedReader(new FileReader(inFile));
            String line = br.readLine();
            while (true) {
                if (line == null) break;

                allWordsOrdered.add(line);
                allWordsUnordered.add(line);
                wordsByLength.put(line.length(), line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Collection<String> getWordsByLength(int length) {
        return wordsByLength.get(length);
    }

    public Set<String> getAllWordsOrdered(){
        return allWordsOrdered;
    }

    public Set<String> getAllWordsUnordered(){
        return allWordsUnordered;
    }
}
