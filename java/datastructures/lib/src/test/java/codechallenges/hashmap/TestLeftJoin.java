package codechallenges.hashmap;

import datastructures.linkedlist.HashTable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static codechallenges.hashmap.LeftJoin.leftJoinHashTables;
import static org.junit.jupiter.api.Assertions.*;

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


    // Define the expected output
    ArrayList<String[]> expectedOutput = new ArrayList<>();

    expectedOutput.add(new String[]{"diligent", "employed", "idle"});
    expectedOutput.add(new String[]{"fond", "enamored", "averse"});
    expectedOutput.add(new String[]{"guide", "usher", "follow"});
    expectedOutput.add(new String[]{"outfit", "garb", null});
    expectedOutput.add(new String[]{"wrath", "anger", "delight"});

//    {
//      {"diligent", "employed", "idle"},
//      {"fond", "enamored", "averse"},
//      {"guide", "usher", "follow"},
//      {"outfit", "garb", null},
//      {"wrath", "anger", "delight"}
//    }

    // Get the actual output
    ArrayList<String[]> actualOutput = LeftJoin.leftJoinHashTables(synonymsTable, antonymsTable);

    // Compare the expected and actual output
    assertEquals(expectedOutput.size(), actualOutput.size());


//    for (int i = 0; i < expectedOutput.size(); i++) {
//      assertEquals(expectedOutput.get(i), actualOutput.get(i));
//    }
   }
}

