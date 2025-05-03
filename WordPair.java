import java.util.ArrayList;

public class WordPair {
    private ArrayList<String> words = new ArrayList<String>();

    /** Constructs a WordPair object. */
    public WordPair(String first, String second) {
        words.add(first);
        words.add(second);
    }

    /** Returns the first string of this WordPair object. */
    public String getFirst() {
        return words.get(0);
    }

    /** Returns the second string of this WordPair object. */
    public String getSecond() {
        return words.get(1);
    }
}