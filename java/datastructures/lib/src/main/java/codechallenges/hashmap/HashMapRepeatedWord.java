package codechallenges.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapRepeatedWord {
  public static String hashMapRepeatedWord(String string) {
    if (string == null)
      return null;

    String curatedString = string.toLowerCase();

    String[] words = curatedString.split(" ");

    Map<String, Integer> wordTable = new HashMap<>();

    for(String word : words) {
      wordTable.put(word, wordTable.getOrDefault(word,0) + 1 );

      if(wordTable.get(word) > 1)
        return word;
    }

    return null;
  }
}
