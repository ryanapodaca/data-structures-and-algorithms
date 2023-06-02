package codechallenges.hashmap;

import datastructures.linkedlist.HashTable;

import java.util.ArrayList;

public class LeftJoin {
  public static ArrayList<String[]> leftJoinHashTables (HashTable<String, String> HT1, HashTable<String, String> HT2) {
    ArrayList<String[]> leftJoinHT = new ArrayList<String[]>();

    ArrayList<String> keys = HT1.keys();

    for (String key : keys) {
      String[] complementArray = new String[3];
      complementArray[0] = key;
      complementArray[1] = HT1.get(key);
      complementArray[2] = HT2.get(key);
      leftJoinHT.add(complementArray);
    }

    return leftJoinHT;
  }

}
