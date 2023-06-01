package codechallenges.hashmap;

import datastructures.linkedlist.HashTable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static codechallenges.hashmap.LeftJoin.leftJoinHashTables;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestLeftJoin {
  @Test
  public void testLeftJoinHashTables() {
    // Create the first hash table
    HashTable<String, String> synonymsTable = new HashTable<>();
    synonymsTable.set("diligent", "employed");
    synonymsTable.set("fond", "enamored");
    synonymsTable.set("guide", "usher");
    synonymsTable.set("outfit", "garb");
    synonymsTable.set("wrath", "anger");

    // Create the second hash table
    HashTable<String, String> antonymsTable = new HashTable<>();
    antonymsTable.set("diligent", "idle");
    antonymsTable.set("fond", "averse");
    antonymsTable.set("guide", "follow");
    antonymsTable.set("flow", "jam");
    antonymsTable.set("wrath", "delight");

    //Result
    ArrayList<String[]> leftJoinResult = leftJoinHashTables(synonymsTable, antonymsTable);

    // Define the expected output
    String[][] expectedOutput = {
      {"diligent", "employed", "idle"},
      {"fond", "enamored", "averse"},
      {"guide", "usher", "follow"},
      {"outfit", "garb", null},
      {"wrath", "anger", "delight"}
    };


    // Compare the expected and actual output
    assertArrayEquals(expectedOutput, new ArrayList[]{leftJoinHashTables(synonymsTable, antonymsTable)});
  }
}

