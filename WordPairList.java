import java.util.ArrayList;

public class WordPairList {
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs = new ArrayList<WordPair>();

    /**
     * Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public WordPairList(String[] words) {
        for (int j=1;j<words.length;j++) {
            for (int i=0;i<j;i++) {
                allPairs.add(new WordPair(words[i],words[j]));
            }
        }
    }

    /**
     * Returns the number of matches as described in part (b).
     */
    public int numMatches() {
        int count = 0;
        for (int i=0;i<allPairs.size();i++) {
            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) count++;
        }
        return count;
    }

    public String toString() {
        String rtn = "";
        for (int i=0;i<allPairs.size();i++) {
            rtn += "(\""+allPairs.get(i).getFirst()+"\", \""+allPairs.get(i).getSecond()+"\"), ";
        }
        return rtn.substring(0,rtn.length()-2);
    }
}